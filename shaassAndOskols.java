import java.util.ArrayList;
import java.util.Scanner;

public class shaassAndOskols {

    public static void birdsNumber() {
        Scanner scanner = new Scanner(System.in);
        try {
            int n = scanner.nextInt();
            ArrayList<Integer> freeSlots = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                freeSlots.add(scanner.nextInt());
            }
            int m = scanner.nextInt();
            for (int index = 0; index < m; index++) {
                int Xi = scanner.nextInt() - 1;
                int Yi = scanner.nextInt();
                if (Xi < 0 || Xi > n - 1) {
                    continue;
                }
                if (Xi > 0) {
                    freeSlots.set(Xi - 1, freeSlots.get(Xi - 1) + Yi - 1);

                }
                if (Xi < n - 1) {
                    freeSlots.set(Xi + 1, freeSlots.get(Xi + 1) + freeSlots.get(Xi) - Yi);
                }
                freeSlots.set(Xi, 0);
            }
            for (int index = 0; index < freeSlots.size(); index++) {
                System.out.println(freeSlots.get(index));
            }
        } finally {
            scanner.close();
        }
    }

    public static void main(String[] args) {
        birdsNumber();
    }
}