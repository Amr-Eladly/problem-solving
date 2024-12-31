import java.util.Scanner;

public class games {
    public static void awayKitAtHome(){
        Scanner scanner = new Scanner(System.in);
        int teamsNumber = scanner.nextInt();
        int[] homeKit = new int[teamsNumber];
        int[] awayKit = new int[teamsNumber];
        for (int index = 0; index < teamsNumber; index++) {
            homeKit[index]= scanner.nextInt();
            awayKit[index]= scanner.nextInt();
        }
        scanner.close();
        int counter = 0;
        for(int i = 0; i<teamsNumber; i++){
            for(int j = 0; j<teamsNumber; j++){
                if(awayKit[i]==homeKit[j]){
                    counter++;
                }
            }
        }
        System.out.println(counter);
    }

    public static void main(String[] args){
        awayKitAtHome();
    }
}