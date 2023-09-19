package com.green.java.dao.model;

public class BoardVo {
    private int iboard;
    private String title;
    private String writer;
    private String createdAt;
    private String writerMainPic;

    public BoardVo(int iboard, String title, String writer, String createdAt, String writerMainPic) {
        this.iboard = iboard;
        this.title = title;
        this.writer = writer;
        this.createdAt = createdAt;
        this.writerMainPic = writerMainPic;
    }

    public int getIboard() {
        return iboard;
    }

    public String getTitle() {
        return title;
    }

    public String getWriter() {
        return writer;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public String getWriterMainPic() {
        return writerMainPic;
    }

    @Override
    public String toString() {
        return String.format("iboard: %d, title: %s, writer: %s, createdAt: %s, writerMainPic: %s",
                iboard, title, writer, createdAt, writerMainPic);
    }
}
