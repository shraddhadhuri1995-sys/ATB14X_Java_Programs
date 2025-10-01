package ex_09_SwitchCase;

import java.util.Scanner;

public class Lab0083_SwitchCase_Real_Automation {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the Browser:");
        String browser=scanner.next();

        switch(browser) {
            case "chrome":
                System.out.println("Starting on the chrome");
                break;

            case "edge":
                System.out.println("Starting on the edge");
                break;

            case "safari":
                System.out.println("starting on safari");
                break;

            default:
                System.out.println("I have no idea which browser is this");
                break;

        }


    }
}
