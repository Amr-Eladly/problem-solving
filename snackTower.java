// chat GPT solution

import java.util.Scanner;

public class snackTower {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            int n = sc.nextInt();
            int[] sizes = new int[n];
            for (int i = 0; i < n; i++) {
                sizes[i] = sc.nextInt();
            }

            boolean[] present = new boolean[n + 1]; // Tracks which numbers are available
            int currentSnack = n; // Start from the largest snack

            for (int i = 0; i < n; i++) {
                present[sizes[i]] = true; // Mark the snack as received
                while (currentSnack > 0 && present[currentSnack]) {
                    System.out.print(currentSnack + " ");
                    currentSnack--; // Move to the next expected snack
                }
                System.out.println(); // Move to the next line for the next day's output
            }
        } finally {
            sc.close();
        }
    }
}
