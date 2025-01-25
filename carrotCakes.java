import java.util.Scanner;
import java.lang.Math;

public class carrotCakes {
    public static void newOven() {
        Scanner scanner = new Scanner(System.in);
        try {
            int n, t, k, d;
            n = scanner.nextInt();
            t = scanner.nextInt();
            k = scanner.nextInt();
            d = scanner.nextInt();
            int oneOvenTime = (int) Math.ceil((double) n / k) * t;
            int cakesBakedBeforeSecondOven = (d / t) * k;
            int remainingCakes = n - cakesBakedBeforeSecondOven;
            int twoOvenTime = d + (int) Math.ceil((double) remainingCakes / (2 * k)) * t;
            if (oneOvenTime > twoOvenTime) {
                System.out.println("YES");
                return;
            }
            System.out.println("NO");

        } finally {
            scanner.close();
        }
    }

    public static void main(String[] args) {
        newOven();
    }
}
