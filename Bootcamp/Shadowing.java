package Bootcamp;

public class Shadowing {
    static int x= 90;   // this will be shadowed at line 8
    public static void main(String[] args) {
        System.out.println(x); //90
        // int x = 40; // the class variable at line 4 is shadowed by htis
        int x;
        // System.out.println(x);  // it says as x has not been declared and assigned
        x=40;  // scope will begin when the value is being initialized
        System.out.println(x); //40
        fun();
    }
    
    static void fun(){
        System.out.println(x); //90
    }
}
