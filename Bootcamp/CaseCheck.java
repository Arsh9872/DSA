package Bootcamp;

import java.util.Scanner;

public class CaseCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter: ");
        char ch = sc.next().trim().charAt(0);
        if (ch >='a' && ch<='z') {
            System.out.println("Lower Case");   
        }
        else if(ch>='A' && ch<='Z'){
            System.out.println("Upper Case");
        }
        else if (ch>='0' && ch<='9') {
            System.out.println("Number");
        }
        else{
            System.out.println("character");
        }
        // System.out.println();
    }
}
