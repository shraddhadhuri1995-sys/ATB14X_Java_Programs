package ex_16_Arrays;

import java.util.Arrays;

public class Lab155_Array_min_Max {
    public static void main(String[] args) {
        int array[]={23,89,77,23,90,10};
//        Arrays.sort(array);
//        System.out.println(array[array.length-1]);

        int max=array[0];
        for (int i = 0; i < array.length; i++) {
            if(array[i]>max)
            {
                max=array[i];
            }
        }
        System.out.println("Max number:"+ max);


        int min=array[0];
        for (int i = 0; i < array.length; i++) {
            if(array[i]<min)
            {
                min=array[i];
            }
        }
        System.out.println("Min number:"+ min);
    }
}
