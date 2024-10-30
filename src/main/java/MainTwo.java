import java.util.Scanner;

public class MainTwo {
    public static void main(String[] args) {
        System.out.println("Введите число: ");
        int number = new Scanner(System.in).nextInt();

        for (int i = 1; i <= number; i++) {
            for (int j = number; j >= 1; j--) {
                if((i * j) == number) {
                    System.out.println(i + " * " + j + " = " + number);
                }
            }
        }
    }
}
