import java.util.Scanner;

public class MainThree {
    public static void main(String[] args) {
        int value = new Scanner(System.in).nextInt();
        int mul = 1;
        System.out.print(value + "! = ");
        for (int i = 1; i <= value; i++) {
            mul *= i;
            if (i == value) System.out.print(i + " = " + mul);
            else System.out.print(i + " * ");
        }
    }
}
