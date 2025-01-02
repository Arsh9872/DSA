package Bootcamp;

import java.util.Scanner;

public class FunctionSwap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter num: ");
        int n = sc.nextInt();
        int m = sc. nextInt();
        swap(n,m);
        // System.out.println(n+ " " + m);
    }

    static void swap(int a, int b){
        
        int temp = a;
        a = b;
        b = temp; // not changing but crATING a new object
        System.out.println(a+ " " + b);
        

        // this change will only be valid in this function's scope only

    }
    
}
