package ex_31_ForLoop_Programs;

public class Lab224_Table5 {
    public static void main(String[] args) {
        int table=5;
        int mul=1;

        for (int i = 1; i <=10 ; i++) {
            mul=table*i;
            System.out.println(table+"*"+i+"="+mul);
        }
    }
}
