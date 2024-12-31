package Bootcamp;

import java.util.Scanner;

public class OccuranceCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter num: ");
        int n = sc.nextInt();
        int temp = n;
        int count = 0;
        while (n != 0) {
            temp = n%10;
            if(temp==7){
                count++;
            }
            n = n/10;
            // System.out.println(count);
        }
        System.out.println(count);
    }
}
