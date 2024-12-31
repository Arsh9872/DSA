package Bootcamp;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Take input from user does not press X or x
        int ans = 0;
        
        while (true) {
            // take operator as input
            System.out.println();
            System.out.print("Enter Operator: ");
            char op = sc.next().trim().charAt(0);
            
            if (op== '+' || op == '-' || op == '*' || op == '/' || op == '%') {
                System.out.print("Enter numbers: ");
                int n1 = sc.nextInt();
                int n2 = sc.nextInt();

                if (op == '+') {
                    ans = n1 + n2;
                }
                if (op == '-') {
                    ans = n1 - n2;
                }
                if (op == '*') {
                    ans = n1*n2;
                }
                if (op == '/') {
                    if (n2 != 0) {
                        ans = n1/n2;
                    }
                    else{
                        System.out.println("invalid");
                    }
                    
                }
                if (op == '%') {
                    ans = n1%n2;
                }
            }
            else if (op == 'x' || op == 'X') {
                break;
            }
            else{
                System.out.println("Invalid Operation");
                break;
                
            }

            System.out.println("Answer: " + ans);
        }
        
    }
    
}
