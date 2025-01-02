package Bootcamp;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter fruit: ");
        String fruit = sc.next();
        switch(fruit){
            // case "Mango":
            //   System.out.println("King of fruit");
            //   break;
            // case "Apple":
            //   System.out.println("red fruit");
            //   break;
            // case "Grapes":
            //   System.out.println("small fruit");
            //   break;
            // case "Orange":
            //   System.out.println("round fruit");
            //   break;

            // default:
            //   System.out.println("ENter legit value");


            //-------- 2nd method---------

            case "Mango" -> System.out.println("King of fruit");
            case "Apple" -> System.out.println("Sweet red fruit");
            case "Grapes" -> System.out.println("Small fruit");
            case "Orange" -> System.out.println("ROund fruit");
            default -> System.out.println("ENter  legit value");
              
        }
    }
    
}
