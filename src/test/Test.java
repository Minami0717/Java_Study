package test;

import test.blackjack.Blackjack;

import java.time.LocalDate;
import java.time.YearMonth;
import java.util.Calendar;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH) + 1;
        System.out.println(String.format("%d-%02d", year, month));
    }
}
