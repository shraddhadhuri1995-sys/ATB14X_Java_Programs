package ex_16_Arrays;

public class Lab173_3DArray {
    public static void main(String[] args) {
        int [][][] arr_3d=
                {
                {
                        {1, 2, 3},
                        {4, 5, 6}
                },
                {
                        {7, 8, 9},
                        {10, 11, 12}
                }
        };
        System.out.println("elements at arr[1][0][2]:" + arr_3d[1][0][2]);
    }
}
