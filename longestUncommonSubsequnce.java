import java.util.Scanner;

public class longestUncommonSubsequnce {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            String str1 = sc.nextLine();
            String str2 = sc.nextLine();
            if (str1.equals(str2)) {
                System.out.println("-1");
            } else {
                System.out.println(Math.max(str1.length(), str2.length()));
            }
        } finally {
            sc.close();
        }
    }
}