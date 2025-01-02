import java.util.Scanner;

public class dieRoll {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            int max = (x > y) ? x : y;
            int probability = 7 - max;
            
            if (probability <= 0) {
                System.out.println("0/1");
            } else {
                int remainder, a, b;
                a = probability;
                b = 6;
                while (b != 0) {
                    remainder = a % b;
                    a = b;
                    b = remainder;
                }
                System.out.println((probability / a) + "/" + (6 / a));
            }
        } finally {
            scanner.close();
        }
    }
}
