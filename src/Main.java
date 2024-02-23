import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Yılı girin: ");
        int yil = scanner.nextInt();

        boolean artikyil = artikYilMi(yil);

        if (artikyil) {
            System.out.println(yil + " bir artık yıldır.");
        } else {
            System.out.println(yil + " bir artık yıl değildir.");
        }

        scanner.close();
    }

    public static boolean artikYilMi(int yil) {
        return (yil % 4 == 0 && yil % 100 != 0) || (yil % 400 == 0);
    }
}