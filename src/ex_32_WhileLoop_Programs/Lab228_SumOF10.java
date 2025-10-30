package ex_32_WhileLoop_Programs;

public class Lab228_SumOF10 {
    public static void main(String[] args) {
        int i=1;
        int sum=0;
        while (i<=10)
        {
            sum=sum+i;
            i++;
        }

        System.out.println("Sum of first ten natural number:"+sum);
    }
}
