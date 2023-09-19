package com.green.java.dao;

import com.green.java.dao.model.*;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class BoardDao {
    private final MyConnection mc;

    public BoardDao() {
        mc = new MyConnection();
    }
    public int insBoard(BoardEntity entity) {
        int result;
        String sql = "insert t_board set title = ?, ctnt = ?, iuser = ?";
        Connection con = null;
        PreparedStatement ps = null;

        try {
            con = mc.getConn();
            ps = con.prepareStatement(sql);
            ps.setString(1, entity.getTitle());
            ps.setString(2, entity.getCtnt());
            ps.setInt(3, entity.getIuser());
            result = ps.executeUpdate();

        } catch (SQLException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        } finally {
            if (ps != null) {
                try {
                    ps.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }

            if (con != null) {
                try {
                    con.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }

        return result;
    }

    public int updBoard(BoardUpdDto dto) {
        int result;
        String sql = "update t_board set title = ?, ctnt = ?, updated_at = current_timestamp " +
                "where iboard = ? and iuser = ?";
        Connection con = null;
        PreparedStatement ps = null;

        try {
            con = mc.getConn();
            ps = con.prepareStatement(sql);
            ps.setString(1, dto.getTitle());
            ps.setString(2, dto.getCtnt());
            ps.setInt(3, dto.getIboard());
            ps.setInt(4, dto.getIuser());
            result = ps.executeUpdate();

        } catch (SQLException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        } finally {
            if (ps != null) {
                try {
                    ps.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }

            if (con != null) {
                try {
                    con.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }

        return result;
    }

    public List<BoardVo> selBoard(BoardSelDto dto) {
        String sql = "select tb.iboard, tb.title, tu.nm writer, " +
                "tb.created_at createdAt, tu.main_pic writerMainPic " +
                "from t_board tb " +
                "inner join t_user tu on tb.iuser = tu.iuser " +
                "order by tb.iboard desc " +
                "limit ?, ?";

        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs;
        List<BoardVo> list = new ArrayList<>();

        try {
            con = mc.getConn();
            ps = con.prepareStatement(sql);
            ps.setInt(1, dto.getStartIdx());
            ps.setInt(2, dto.getRow());
            rs = ps.executeQuery();

            while (rs.next()) {
                BoardVo vo = new BoardVo(
                        rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getString(5));

                list.add(vo);
            }

        } catch (SQLException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        } finally {
            if (ps != null) {
                try {
                    ps.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }

            if (con != null) {
                try {
                    con.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }

        return list;
    }

    public BoardDetailVo selBoardById(BoardIdDto dto) {
        String sql = "select A.iboard, A.title, A.ctnt, B.nm writer,\n" +
                "        A.created_at createdAt, B.main_pic writerMainPic\n" +
                "        from t_board A\n" +
                "        inner join t_user B\n" +
                "        on A.iuser = B.iuser\n" +
                "        where iboard = ?";

        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs;
        BoardDetailVo vo = null;

        try {
            con = mc.getConn();
            ps = con.prepareStatement(sql);
            ps.setInt(1, dto.getIboard());
            rs = ps.executeQuery();

            if (rs.next()) {
                vo = new BoardDetailVo(
                        rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getString(5),
                        rs.getString(6));
            }

        } catch (SQLException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        } finally {
            if (ps != null) {
                try {
                    ps.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }

            if (con != null) {
                try {
                    con.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }

        return vo;
    }
}
