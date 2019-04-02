package com.LickingHeights;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //Insert Scanner
        Scanner keyboard;
        keyboard = new Scanner(System.in);

        //Basic Variables

        int h; //Day of Week
        int q; //Day of Month
        int m; //Month
        int year;

        while(true){

            System.out.println("What month were you born? (number value)");
            m = keyboard.nextInt();
            mModifier(m);
            System.out.println();

        }
    }




    public static int mModifier(int m){
        if(m == 1){
            return m = 13;
        }
        else if(m == 2){
            return m = 14;
        }
        else return m;
    }
}

