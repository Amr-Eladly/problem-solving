import java.util.Scanner;

public class dieRoll {
    public static void gcd() {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        scanner.close();
        int max = (x > y) ? x : y;
        // formula for finding the gcd using Euclidean algorithm
        // A = x B + remainder1 --> B = y C + remainder2, till remainder = 0
        int probability = 6 + 1 - max;
        if (probability == 6) {
            System.out.println("1/1");
        } else {
            int remainder = 6 - probability;
            int b = probability;
            int A;
            while (true) {
                if(remainder == 0){ break;}
                A = b;
                b = remainder;
                remainder = A - ((int)A/b)*b;
            }
            System.out.println(probability/b +"/"+ 6/b);
        }
    }

    public static void main(String[] args){
        gcd();
    }
}
