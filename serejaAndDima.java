import java.util.ArrayList;
import java.util.Scanner;

public class serejaAndDima {
    public static void sumOfCards() {
        Scanner scanner = new Scanner(System.in);
        int numberOfcards = scanner.nextInt();
        ArrayList<Integer> cards = new ArrayList<>();
        for (int index = 0; index < numberOfcards; index++) {
            cards.add(scanner.nextInt());
        }
        scanner.close();

        int serejaSum = 0;
        int dimaSum = 0;
        while (!(cards.isEmpty())) {
            if (cards.get(0) <= cards.get(cards.size() - 1)) {
                serejaSum += cards.get(cards.size() - 1);
                cards.remove(cards.size() - 1);
            } else {
                serejaSum += cards.get(0);
                cards.remove(0);
            }
            if (!(cards.isEmpty())) {
                if (cards.get(0) <= cards.get(cards.size() - 1)) {
                    dimaSum += cards.get(cards.size() - 1);
                    cards.remove(cards.size() - 1);
                } else {
                    dimaSum += cards.get(0);
                    cards.remove(0);
                }
            }
        }
        System.out.println(serejaSum + " " + dimaSum);
    }

    public static void main(String[] args) {
        sumOfCards();
    }

}