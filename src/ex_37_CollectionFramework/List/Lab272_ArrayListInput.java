package ex_37_CollectionFramework.List;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Lab272_ArrayListInput {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String continueInput="Y";
        List<String> names=new ArrayList<String>();
        while(continueInput.equalsIgnoreCase("Y"))
        {
            System.out.println("Enter the name");
            String name=scanner.next();
            names.add(name);
            scanner.nextLine();

            System.out.println("Do you want to enter another name Y/N");
            continueInput=scanner.nextLine();
        }

        for(String name:names)
        {
            System.out.println(name);
        }
    }
}
