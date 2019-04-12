package com.LickingHeights;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //Insert Scanner
        Scanner keyboard;
        keyboard = new Scanner(System.in);

        //Basic Variables
        boolean loop = true;
        int h; //Day of Week
        int q; //Day of Month
        int m; //Month
        int year;
        int K; //Mod100 of year for the two ending numbers
        int J; //Tells century born

        //Poem
        System.out.println("Monday's child is fair of face,");
        System.out.println("Tuesday's child is full of grace,");
        System.out.println("Wednesday's child is full of woe,");
        System.out.println("Thursday's child has far to go.");
        System.out.println("Friday's child is loving and giving,");
        System.out.println("Saturday's child works hard for a living,");
        System.out.println("But the child born on the Sabbath Day,");
        System.out.println("Is fair and wise and good in every way.");
        System.out.println(" ");

        while (loop) {

            System.out.println("What month were you born? (number value)");
            m = keyboard.nextInt();

            System.out.println("And what day of the month were you born?");
            q = keyboard.nextInt();

            System.out.println("And lastly, what year were you born?");
            year = keyboard.nextInt();

            System.out.println(Equations(q, m, year));
            System.out.println(" ");
            System.out.println(" ");


        }
    }

    public static int Equations(int q, int m, int year) {
        if (m == 1 || m == 2) {
            m += 12;
            year -= 1;
        }

        int K = year % 100;
        int J = year / 100;

        int h = (q + (13 * (m + 1) / 5) + K + (K / 4) + (J / 4) + (5 * J)) % 7;
        return h;
    }
}



