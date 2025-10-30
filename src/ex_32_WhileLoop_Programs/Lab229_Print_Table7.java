package ex_32_WhileLoop_Programs;

public class Lab229_Print_Table7 {
    public static void main(String[] args) {
        int i=1;
        int table=7;

        while ( i <= 10)
        {
            int mul=table*i;
            System.out.println(table +"*"+i +"=" +mul);
            i++;
        }
    }
}
