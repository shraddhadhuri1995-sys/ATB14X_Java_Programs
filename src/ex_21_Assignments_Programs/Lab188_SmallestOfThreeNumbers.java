package ex_21_Assignments_Programs;

public class Lab188_SmallestOfThreeNumbers {
    public static void main(String[] args) {
        int i=67;
        int j=88;
        int k=90;

        if(i < j && i < k)
        {
            System.out.println("Smallest Number:" +i);
        }
        else if(j < k && j < i)
        {
            System.out.println("Smallest Number:"+j);
        }
        else {
            System.out.println("Smallest Number:"+k);
        }
    }
}
