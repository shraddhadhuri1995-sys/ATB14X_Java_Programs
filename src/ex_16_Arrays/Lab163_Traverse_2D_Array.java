package ex_16_Arrays;

public class Lab163_Traverse_2D_Array {
    public static void main(String[] args) {
        int[][] matrix_3_3=  { { 10, 20,30 }, { 40, 50 ,60}, { 70, 80, 90 } };

        for (int i = 0; i < matrix_3_3.length; i++) {
            for (int j = 0; j < matrix_3_3[i].length; j++) {
//                System.out.print(matrix_3_3[i][j]);
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
