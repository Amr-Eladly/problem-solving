import java.util.Scanner;

public class buyAShovel {
    public static void shovelsNumber() {
        Scanner scanner = new Scanner(System.in);
        int price = scanner.nextInt();
        int coin = scanner.nextInt();
        scanner.close();

        for (int i = 1; i > 0; i++) {
            if (i * price % 10 == 0 || ((i * price % 10) - coin) == 0) {
                System.out.println(i);
                return;
            }
        }

    }

    public static void main(String[] args) {
        shovelsNumber();
    }
}
