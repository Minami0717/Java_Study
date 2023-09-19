package com.green.java.dao;

import com.green.java.dao.model.*;

import java.util.List;

public class MyConnTest {
    public static void main(String[] args) {
        BoardDao dao = new BoardDao();

//        System.out.println(insBoard(dao));
//        System.out.println(updBoard(dao));
//        System.out.println(selBoardById(dao));

        List<BoardVo> list = selBoard(dao, Integer.parseInt(args[0]), Integer.parseInt(args[1]));
//        for (BoardVo vo : list) {
//            System.out.println(vo);
//        }
        list.forEach(System.out::println);
    }

    static int insBoard(BoardDao dao) {
        BoardEntity entity = new BoardEntity();
        entity.setTitle("title1");
        entity.setCtnt("content1");
        entity.setIuser(7);

        return dao.insBoard(entity);
    }

    static int updBoard(BoardDao dao) {
        BoardUpdDto dto = new BoardUpdDto();
        dto.setTitle("updtitle1");
        dto.setCtnt("updctnt1");
        dto.setIboard(1026);
        dto.setIuser(6);

        return dao.updBoard(dto);
    }

    static List<BoardVo> selBoard(BoardDao dao, int page, int row) {
        BoardSelDto dto = new BoardSelDto();
        dto.setPage(page);
        dto.setRow(row);
        dto.setStartIdx((dto.getPage() - 1) * dto.getRow());

        return dao.selBoard(dto);
    }

    static BoardDetailVo selBoardById(BoardDao dao) {
        BoardIdDto dto = new BoardIdDto();
        dto.setIboard(3);

        return dao.selBoardById(dto);
    }
}
