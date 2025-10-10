package ex_16_Arrays;

public class Lab154_ArrayPrint {
    public static void main(String[] args) {
        int []marks={91,92,93,94,95};
        System.out.println(marks.length);
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
        System.out.println(marks[3]);
        System.out.println(marks[4]);

        System.out.println("-------------------For Loop-----------------------");
        for (int i = 0; i < marks.length ; i++) {
            System.out.println(marks[i]);
        }


        System.out.println("--------------------For Each Loop------------------");
        for (int arr:marks)
        {
            System.out.println(arr);
        }
    }
}
