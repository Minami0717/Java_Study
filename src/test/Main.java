package test;

import java.io.*;
import java.util.Scanner;
import java.util.StringTokenizer;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int star = scanner.nextInt();

        for (int i = star; i > 0; i--) {
            for (int j = 0; j < star; j++) {
                if (j >= i-1) System.out.print("*");
                else System.out.print(" ");
            }
            System.out.println();
        }

    }
}