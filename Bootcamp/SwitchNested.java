package Bootcamp;

import java.util.Scanner;

public class SwitchNested {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter EmpID: ");
        int empId = sc.nextInt();
        System.out.print("Enter dept: ");
        String dept = sc.next();

        switch (empId) {
            case 1:
            System.out.println("AP Singh");
                break;
            case 2:
                System.out.println("Arsh");
                break;
            case 3:
                System.out.println("Emp Number 3");
                switch (dept) {
                    case "IT":
                        System.out.println("IT dept");
                        break;
                    case "Management":
                        System.out.println("Management dept");
                        break;
                    default:
                        System.out.println("Not Valid");

                }
                break;

        
            default:
                System.out.println("Enter correct EmpID");
                break;
        }
    }
    
}
