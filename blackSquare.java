import java.util.ArrayList;
import java.util.Scanner;

public class blackSquare {
    public static void caloriesSum() {
        ArrayList<Integer> calories = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        for (int index = 0; index < 4; index++) {
            calories.add(scanner.nextInt());
        }
        String sequence = scanner.next();
        scanner.close();

        int sum = 0;
        for (int index = 0; index < sequence.length(); index++) {
            if(sequence.charAt(index)=='1'){sum += calories.get(0);}
            if(sequence.charAt(index)=='2'){sum += calories.get(1);}
            if(sequence.charAt(index)=='3'){sum += calories.get(2);}
            if(sequence.charAt(index)=='4'){sum += calories.get(3);}
        }
        System.out.println(sum);

    }

    public static void main(String[] args){
        caloriesSum();
    }
}
