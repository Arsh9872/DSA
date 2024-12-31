package Bootcamp;

public class Typecasting {
    public static void main(String[] args) {

        // //type casting
        // int num = (int) (67.56f);
        // System.out.println(num);

        // // automatic type promotion in expressiond
        // int a = 257;
        // byte b = (byte) (a);  // 257 % 256 = 1

        // System.out.println(b);

        // byte c= 40;
        // byte d= 50;
        // byte e = 100;
        // int f = (c * d )/e;
        // System.out.println(f);

        // int no = 'A';
        // System.out.println(no);


        // System.out.println("-------------------");


        byte b = 42;
        char c = 'a';
        short s = 1024;
        int i = 50000;
        float f = 5.67f;
        double d = 0.1234;
        double res = ( f * b) + (i / c) - (d - s);
        System.out.println(( f * b) + " " + (i / c) + " " + (d - s));
        System.out.println(res);
    }
    
}
