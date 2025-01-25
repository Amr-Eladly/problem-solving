import java.nio.channels.Pipe.SourceChannel;
import java.util.ArrayList;
import java.util.Scanner;

public class juicer {
    public static void overflows() {
        Scanner scanner = new Scanner(System.in);
        try {
            int orangesNumber = scanner.nextInt();
            int maxSize = scanner.nextInt();
            int wasteSectionCapacity = scanner.nextInt();
            // ArrayList<Integer> oragnes = new ArrayList<>();
            int sum = 0;
            int counter = 0;
            for (int index = 0; index < orangesNumber; index++) {
                int x = scanner.nextInt();
                if (x <= maxSize) {
                    sum += x;
                    if (sum > wasteSectionCapacity) {
                        counter += 1;
                        sum = 0;
                    }
                    // oragnes.add(scanner.nextInt());
                } else {
                    continue;
                }
            }

            System.out.println(counter);
        } finally {
            scanner.close();
        }
    }

    public static void main(String[] args) {
        overflows();
    }
}
