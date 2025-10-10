package ex_16_Arrays;

public class Lab158_Array_SumOFArray {
    public static void main(String[] args) {
        int []numbers={12,56,20};
        int sum=0;
        for (int i = 0; i < numbers.length; i++) {
            sum=sum+numbers[i];
        }
        System.out.println(sum);
    }
}
