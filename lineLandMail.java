import java.util.Scanner;

public class lineLandMail {
    public static void min_max() {
        Scanner sc = new Scanner(System.in);
        try {
            int citiesNumber = sc.nextInt();
            int[] cities = new int[citiesNumber];
            for (int i = 0; i < citiesNumber; i++) {
                cities[i] = sc.nextInt();
            }
            int min, max;
            for (int i = 0; i < citiesNumber; i++) {
                if (i == 0) {
                    min = cities[1] - cities[0];
                    max = cities[citiesNumber - 1] - cities[0];
                    System.out.println(min +" "+ max);
                } else if (i > 0 && i < citiesNumber - 1) {
                    min = Math.min(cities[i + 1] - cities[i], cities[i] - cities[i - 1]);
                    max = Math.max(cities[citiesNumber - 1] - cities[i], cities[i] - cities[0]);
                    System.out.println(min +" "+ max);
                } else {
                    min = cities[citiesNumber - 1] - cities[citiesNumber - 2];
                    max = cities[citiesNumber - 1] - cities[0];
                    System.out.println(min +" "+ max);
                }
            }
        } finally {
            sc.close();
        }
    }

    public static void main(String[] argds) {
        min_max();
    }
}