import java.util.Scanner;

public class colorfulStones {
    public static void position() {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        String t = scanner.next();
        scanner.close();
        int position = 0;
        for (int index = 0; index < t.length(); index++) {
            if (t.charAt(index) == s.charAt(position)) {
                position += 1;
            }
        }
        System.out.println(position + 1);
    }

    public static void main(String[] args) {
        position();
    }
}
