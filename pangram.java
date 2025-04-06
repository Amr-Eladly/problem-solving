import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;

public class pangram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int wordLength = sc.nextInt();
        sc.nextLine();
        String word = sc.nextLine();
        String copy = word.toLowerCase();
        if (wordLength < 26) {
            System.out.println("NO");
        } else {
            Set<Character> unique = new HashSet<>();
            for (int i = 0; i < wordLength; ++i) {
                unique.add(copy.charAt(i));
            }
            if (unique.size() >= 26) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        sc.close();
    }
}