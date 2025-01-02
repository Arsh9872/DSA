package Bootcamp;

import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
        fun(1, 2, 3, 4, 5, 6, 7, 8);  // we can store any number of arguments as an array 
        multiple(1, 3, "Arsh", "Siya", "Neeraj");
    }

    // mix elements i.e. int char etc..
    static void multiple(int a, int b, String ...v) {
        // Print the integers and the array of strings
        System.out.println("Integers: " + a + ", " + b + ", Strings: " + Arrays.toString(v));
    }

    static void fun(int ...v) {
        System.out.println(Arrays.toString(v));
    }
}