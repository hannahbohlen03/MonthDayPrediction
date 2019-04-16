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
        int N; //Number of days in a given month
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


            //Asking User
            System.out.println(" ");
            System.out.println("What month were you born? (number value)");
            m = keyboard.nextInt();

            System.out.println("And what day of the month were you born?");
            q = keyboard.nextInt();

            System.out.println("And lastly, what year were you born?");
            year = keyboard.nextInt();


            //Equation
            System.out.println(" ");
            h = Equation(q,m,year);
            N = dayNumber(m, year);


            //Ifs and Switches
            if(h == 0){
                day = "Saturday";
            }
            else if(h==1){
                day = "Sunday";
            }
            else if(h==2){
                day = "Monday";
            }
            else if(h==3){
                day = "Tuesday";
            }
            else if(h==4){
                day = "Wednesday";
            }
            else if(h==5){
                day = "Thursday";
            }
            else if(h==6){
                day = "Friday";
            }
            else{
                day = "ERROR";
            }

            switch (h) {
                case 0:
                    poem = "work hard for a living.";
                    break;
                case 1:
                    poem = "be fair and wise and good in every way.";
                    break;
                case 2:
                    poem = "be fair of face!";
                    break;
                case 3:
                    poem = "have been born full of grace.";
                    break;
                case 4:
                    poem = "be full of woe...";
                    break;
                case 5:
                    poem = "have far to go!";
                    break;
                case 6:
                    poem = "be very loving and giving.";
                    break;
                default:
                    poem = "ERROR";
                    break; }


                //"You were born on a..!"
            System.out.println("In " + year + ", " + );
            System.out.println("You were born on a " + day + ".");
            System.out.println("You must " + poem);
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
    public static int dayNumber(int m, int year){
        int N;

        if (m==13 || m==3 || m==5 || m==7|| m==8 || m==10 || m==12){
            return N = 31;
        }
        else if(m==4 || m==6 || m==9 || m== 11){
            return N = 30;
        }
        else{
            int leap;
            leap = year%400;
            if (leap==0){
                return N = 29;
            }
            else{
                return N = 28;
            }
        }
    }
}







