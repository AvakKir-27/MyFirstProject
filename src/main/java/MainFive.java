import java.util.Random;
import java.util.Scanner;

public class MainFive {
    public static void main(String[] args) {
        int value = new Random().nextInt(100);
        boolean flag = true;
        System.out.println(value);
        while(flag) {
        int user_input = new Scanner(System.in).nextInt();
        if (user_input < value) {
            System.out.println("Загаданое число больше");
        }
        else if (user_input > value) {
            System.out.println("Загаданое число меньше");
        }
        else {
            System.out.println("Вы угадали!");
            flag = false;
        }
        }
    }
}
