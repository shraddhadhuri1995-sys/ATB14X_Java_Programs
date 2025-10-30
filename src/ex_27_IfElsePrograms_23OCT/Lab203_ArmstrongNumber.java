package ex_27_IfElsePrograms_23OCT;

public class Lab203_ArmstrongNumber {
    public static void main(String[] args) {
        int num = 153; // Example number
        int original = num;
        int result = 0;
        int digits = String.valueOf(num).length();

        while (num != 0) {
            int digit = num % 10;
            result += Math.pow(digit, digits);
            num /= 10;
        }

        if (result == original) {
            System.out.println(original + " is an Armstrong number.");
        } else {
            System.out.println(original + " is not an Armstrong number.");
        }

    }
}
