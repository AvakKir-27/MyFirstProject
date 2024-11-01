public class MainFour {
    public static void main(String[] args) {
        int volume = 1200;
        int volume_2 = 0;
        int fillingSpeed = 30;
        int devastationSpeed = 10;
        boolean flag = true;
        int count = 0;
        while (flag) {
            volume_2 += (fillingSpeed - devastationSpeed);
            count++;
            if (volume_2 == volume) flag = false;
        }
        System.out.println("Столько минут потребуется: " + count);
    }
}
