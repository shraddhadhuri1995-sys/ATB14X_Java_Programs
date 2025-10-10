package ex_16_Arrays;

public class Lab153_ArrayBasics_2 {
    public static void main(String[] args) {
        String names[]= {"Pramod","Vaibhav","neeta"};
        System.out.println(names.length);
        System.out.println(names[2]);
        System.out.println(names[1]);
        System.out.println(names[0]);


        System.out.println("_________________________");
        String []nameATBX=new String[3];
        nameATBX[0]="Nayan";
        nameATBX[1]="Shweta";
        nameATBX[2]="Shanti";

        System.out.println(nameATBX.length);
        System.out.println(nameATBX[0]);
        System.out.println(nameATBX[2]);
        System.out.println(nameATBX[1]);

        boolean[] is_male_data=new boolean[2];
        is_male_data[0]=true;
        is_male_data[1]=false;

    }
}
