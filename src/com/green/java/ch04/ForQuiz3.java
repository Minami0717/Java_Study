package com.green.java.ch04;

public class ForQuiz3 {
    public static void main(String[] args) {
        int star = 5;

//        for (int i = 0; i < star; i++) {
//            for (int j = 0; j < star; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//        System.out.println();

//        /*
//            *
//           ***
//          *****
//         *******
//        *********
//       */
        int n = 1;
        for (int i = star; i > 0; i--) {
            for (int j = i-1; j > 0; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j < n; j++) {
                System.out.print("*");
            }
            System.out.println();
            n += 2;
        }

        /*
        *****
         ****
          ***
           **
            *
         */
//        int n = 5;
//        for (int i = 0; i < star; i++) {
//            for (int k = 0; k < i; k++) {
//                System.out.print(" ");
//            }
//            for (int j = n; j > 0; j--) {
//                System.out.print("*");
//            }
//            System.out.println();
//            n--;
//        }
    }
}
