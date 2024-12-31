package Bootcamp;

public class RevNum {
    public static void main(String[] args) {
        int n = 23597 ;
    while(n!=0){
        int temp = n%10;
        System.out.print(temp + " ");
        n/=10;
    }
    }
}
