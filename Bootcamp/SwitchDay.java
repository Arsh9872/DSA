package Bootcamp;

import java.util.Scanner;

public class SwitchDay {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("ENter Value: ");
        int day = sc.nextInt();
        switch (day) {

            // day of week
            // case 1 -> System.out.println("Monday");
            // case 2 -> System.out.println("Tuesday");
            // case 3 -> System.out.println("wednesday");
            // case 4 -> System.out.println("Thursday");
            // case 5 -> System.out.println("Friday");
            // case 6 -> System.out.println("Saturday");
            // case 7 -> System.out.println("sunday");
            // default -> System.out.println("enter from 1 to 7");

            // ---- weekday or weekend
            case 1,2,3,4,5 -> System.out.println("Weekday");
            case 6,7 -> System.out.println("Weekend");

        }
    }
}
