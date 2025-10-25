package ex_26_IfElsePrograms_24OCT;

import java.util.Scanner;

public class Lab200_WebsiteDomain {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the website URL:");
        String URL=scanner.next();

        if(URL.endsWith(".com"))
        {
            System.out.println("The website type is: Commercial website");
        }
        else if(URL.endsWith(".org"))
        {
            System.out.println("The website type is: Non-profit organization");
        }
        else if(URL.endsWith(".edu"))
        {
            System.out.println("The website type is: Educational institution");
        }
        else if(URL.endsWith(".gov"))
        {
            System.out.println("The website type is: Government website");
        }
        else if(URL.endsWith(".net"))
        {
            System.out.println("The website type is: Network-related website");
        }
        else if(URL.endsWith(".info"))
        {
            System.out.println("The website type is: Informational website");
        }
        else {
            System.out.println("The website type is: Unknown or other types of websites");
        }

    }
}
