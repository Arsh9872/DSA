package Bootcamp;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        int c = a+b;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter num: ");
        int n = sc.nextInt();
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        
        for (int i = 0; i <= n-3; i++) {
            a = b;
            b = c;
            c = a+b;
            System.out.println(c);
        }
        System.out.println("Output: " + c);
    }
    
}
