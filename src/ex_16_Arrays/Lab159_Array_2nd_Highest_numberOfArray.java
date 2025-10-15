package ex_16_Arrays;

import java.util.Arrays;

public class Lab159_Array_2nd_Highest_numberOfArray {

    public static void main(String[] args) {
        int array[] = {12, 56, 43, 89};
//        Arrays.sort(numbers);
//        System.out.println(numbers[numbers.length-2]);
        int highest=0;
        int secondHighest=0;

        for(int num: array)
        {
            if(num > highest)
            {
                secondHighest=highest;
                highest=num;
            }
            else if(num > secondHighest && num !=highest)
            {
                secondHighest=num;
            }

            }
        System.out.println("Second Highest: " + secondHighest);
        System.out.println("Highest: " + highest);
        }
    }

