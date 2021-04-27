package ru.geekbrains.lesson2;

import java.util.GregorianCalendar;

public class home2 {
public static void main(String[] args) {
    boolean res1 = isSumBetween( 3, 2 );
    System.out.println("res1 = "+res1);

    printUnit( -6 );


 boolean res2;
 res2 = isNegative(-4);
    System.out.println("res2 = "+res2);
String ark1;
ark1 = "hello";

    printText(ark1, 5);




    boolean res3;
    res3 = isLeap(2021);
    System.out.println("res3 = "+res3);

}
    public static boolean isSumBetween(int a, int b){
        int sum;
        sum = (a + b);
        return ( sum >= 10 && sum <= 20 );

    }

    public static void printUnit(int value){

        if (value >= 0) {
            System.out.println("Positive");
        } else {
            System.out.println("Negative");
        }

    }


    public static boolean isNegative(int value){
        if (value > 0){
            return false;
        }
        return true;
    }


    public static void printText (String str,int n){
        for (int i = 0; i < n; i++) {
            System.out.println(str);
        }
    }

    public static boolean isLeap(int year){

        return new GregorianCalendar().isLeapYear(year);
    }


}


