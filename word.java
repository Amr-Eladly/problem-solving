import java.util.Scanner;

public class word {
    public static void extention(){
        Scanner scanner = new Scanner(System.in);
        String word;
        word = scanner.next();
        scanner.close();

        int capsCounter = 0;
        for(char ch: word.toCharArray()){
            if(Character.isUpperCase(ch)){
                capsCounter++;
            }
        }

        if(capsCounter > word.length()-capsCounter){
            word = word.toUpperCase();
        } else {
            word = word.toLowerCase();
        }
        System.out.println(word);
    }

    public static void main(String[] args){
        extention();
    }
}