package Bootcamp;

import java.util.Scanner;

public class FuncArmstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 3 digit num: ");
        int a = sc.nextInt();
        boolean ans = arm(a);
        System.out.println(ans);
      

        // print all 3 digit armstrong number 
        for (int i = 100; i < 1000; i++) {
            if (arm(i)) {
                System.out.print( i + " ");
            }
        }
    }

    static boolean arm(int n){
        int org = n;
        int sum = 0;

        while(n>0){
            int rem = n%10;
            n = n/10;
            sum+= rem*rem*rem;
        }

        return sum == org;


    }
    
}
