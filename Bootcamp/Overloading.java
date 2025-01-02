package Bootcamp;

import java.util.Arrays;

public class Overloading {
    public static void main(String[] args) {
        // fun(67);
        // fun("AP Singh");

        // int ans = sum(5, 6, 7);
        // System.out.println(ans);
        demo(2,3,4,5,6);
        demo("ap","gkm","sv");
    }

    static void demo(int ...v){
        System.out.println(Arrays.toString(v));
    }

    static void demo(String ...v){
        System.out.println(Arrays.toString(v));
    }
    static int sum(int a,int b){
        return a+b;
    }

    static int sum(int a,int b, int c){
        return a+b+c;
    }
    static void fun(int a){
        System.out.println("1st One");
        System.out.println(a);
    }

    static void fun(String name){
        System.out.println("Second One");
        System.out.println(name);
    }
    
}
