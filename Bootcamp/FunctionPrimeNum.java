package Bootcamp;

import java.util.Scanner;

public class FunctionPrimeNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Num: ");
        int n = sc.nextInt();
        boolean ans = prime(n);
        System.out.println(ans);

    }

    static boolean prime(int a){
        
            if(a <= 1){
                return false;
            }
            int c=2;
            while (c*c <= a ) {
                if (a%c == 0){
                    return false;
                }
                c++;
            }
            // if (c*c >n){
            //     return true;
            // }
            // return false;

            return c*c > a;
    
    }
    
}
