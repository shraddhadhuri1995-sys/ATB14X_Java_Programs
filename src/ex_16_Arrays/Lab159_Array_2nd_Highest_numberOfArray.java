package ex_16_Arrays;

import java.util.Arrays;

public class Lab159_Array_2nd_Highest_numberOfArray {

    public static void main(String[] args) {
        int array[]={ 12,56,43,89};
//        Arrays.sort(numbers);
//        System.out.println(numbers[numbers.length-2]);
        int max=array[0];
        for (int i = 0; i < array.length; i++) {
            if(array[i]>max)
            {
                max=array[i];
            }
        }
        System.out.println("Max number:"+ max);

    }
}
