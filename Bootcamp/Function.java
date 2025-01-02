package Bootcamp;

import java.util.Scanner;

public class Function {
    public static void main(String[] args) {
    //    sum(); 
    // greeting();
    // greet();
    // int ans = sum2();
    // System.out.println(ans);
    String g = greet();
    System.out.println(g);
    }

    static void sum(){
        System.out.print("enter numbers: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int sum = n+m;
        System.out.println("Sum = "+ sum);
    }

    // changing return type
    static int sum2(){
        System.out.print("enter numbers: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int sum = n+m;
        return sum;
    }

    static void greeting(){
        System.out.println("Alpha to charlie !!");
    }
    
    static String greet(){
        String greeting = "Alpha to CHarlie";
        return greeting;
        // return "Alpha to CHarlie";
    }
    

    /*
     * static return_type name(){
     *   //body
     * }
     */
    
}
