import java.util.Scanner;

public class nightAtTheMuseum {
    public static void shortestDistance() {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        scanner.close();
        int start = 0;
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            int pointer = s.charAt(i) - 97; // to get the distance between the char and the beginning, which is a = 97 in ascii
            int distance = Math.abs(start - pointer);
            if (distance < 13) {
                sum += distance;
            } else {
                sum += 26 - distance;
            }
            start = pointer; // update the pointer position
        }
        System.out.println(sum);
    }

    public static void main(String[] args) {
        shortestDistance();
    }
}
