package Bootcamp;

import java.util.Scanner;

import javax.swing.undo.StateEdit;

public class FunctonParameters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter messasge: ");
        // int n = sc.nextInt();
        // int m = sc.nextInt();
        // int ans = sum3(n, m);
        // System.out.println(ans);
        String s = sc.nextLine();
        String msg = mygreet(s);
        System.out.println(msg);

    }

    // passing the value of numbers when you are calling the method
    // static int sum3(int a, int b){
    //     int sum = a+b;
    //     return sum;
    // }

    static String mygreet(String a){
        String mg = "Copy " + a +" !!"; 
        return mg;
    }
    
}
