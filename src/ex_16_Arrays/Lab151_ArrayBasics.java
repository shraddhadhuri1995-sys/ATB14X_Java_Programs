package ex_16_Arrays;

public class Lab151_ArrayBasics {
    public static void main(String[] args) {
        int a=10;
        int marks[] = { 91,92,93,94 };
        boolean []is_married = { true,false,false };
        System.out.println(marks.length);
        System.out.println(marks[0]);
        System.out.println(marks[3]);
        //System.out.println(marks[-1]);

        String name="pramod";
        String[] str=name.split("");
        for(String ss:str)
        {
            System.out.println(ss);
        }
    }
}
