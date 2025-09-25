package ex_05_TypeCasting;

public class Lab0061_TypeCasting_Used {
    public static void main(String[] args) {
        int course=100;
        float GST=18.45f;
        int total= (int) (course+GST); //narrowing conversion
        System.out.println(total);

        float total1=course+GST;
        System.out.println(total1);//Widening conversion


    }
}
