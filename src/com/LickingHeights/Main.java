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
        String day;
        String poem;

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

            System.out.println(" ");
            System.out.println("What month were you born? (number value)");
            m = keyboard.nextInt();

            System.out.println("And what day of the month were you born?");
            q = keyboard.nextInt();

            System.out.println("And lastly, what year were you born?");
            year = keyboard.nextInt();

            System.out.println(" ");
            h = Equation(q,m,year);


            switch (h) {
                case 0:
                    day = "Saturday";
                    break;
                case 1:
                    day = "Sunday";
                    break;
                case 2:
                    day = "Monday";
                    break;
                case 3:
                    day = "Tuesday";
                    break;
                case 4:
                    day = "Wednesday";
                    break;
                case 5:
                    day = "Thursday";
                    break;
                case 6:
                    day = "Friday";
                    break;
                default:
                    day = "Error";
                    break;
            }
            if (day == "Saturday") {
                poem = "Therefore, You work hard for a living,";
            } else if (day == "Sunday") {
                poem = "You are fair and wise and good in every way.";
            } else if (day == "Monday") {
                poem = "You must be fair of face!";
            } else if (day == "Tuesday") {
                poem = "You must have been born full of grace";
            } else if (day == "Wednesday") {
                poem = "You must be full of woe...";
            } else if (day == "Thursday") {
                poem = "You have far to go!";
            } else if (day == "Friday") {
                poem = "You really are loving and giving.";
            } else {
                poem = "There seems to have been an error. Please try again!";
            }

            System.out.println("You were born on a " + day);
            System.out.println(poem);

        }
    }


    public static int Equation(int q, int m, int year) {
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






