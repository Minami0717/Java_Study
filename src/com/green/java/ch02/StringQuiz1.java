package com.green.java.ch02;

public class StringQuiz1 {
    public static void main(String[] args) {
        String fullFileNm = "newjeans.poster.jpg";
        String fileNm, ext;

        int idx = fullFileNm.lastIndexOf(".");
        fileNm = fullFileNm.substring(0, idx);
        ext = fullFileNm.substring(idx+1);

        System.out.println("fileNm = " + fileNm);
        System.out.println("ext = " + ext);
    }
}
