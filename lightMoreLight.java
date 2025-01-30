import java.util.ArrayList;
import java.util.Scanner;

public class lightMoreLight {
    public static void bulbStatus() {
        Scanner sc = new Scanner(System.in);
        try {
            ArrayList<Long> bulbSerial = new ArrayList<>();
            while (true) {
                long x = sc.nextLong();
                if (x != 0) {
                    bulbSerial.add(x);
                } else {
                    break;
                }
            }

            for(long i : bulbSerial){
                long root = (long) Math.sqrt(i);
                if(root*root == i){
                    System.out.println("yes");
                } else{
                    System.out.println("no");
                }
            }
            //Alternative solution

            // int counter;
            // for (int x : bulbSerial) {
            //     counter = 0;
            //     for (int i = 1; i <= x / 2; i++) {
            //         if (x % i == 0) {
            //             counter++;
            //         }
            //     }
            //     // the number is divisible by itself that's why the condition is gonna be
            //     // flipped in the code block right below this comment.
            //     if (counter % 2 == 0) {
            //         System.out.println("yes");
            //     } else {
            //         System.out.println("no");
            //     }
            // }

        } finally {
            sc.close();
        }
    }

    public static void main(String[] args) {
        bulbStatus();
    }
}