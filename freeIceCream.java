import java.util.Scanner;

public class freeIceCream {
    public static void packs() {
        Scanner sc = new Scanner(System.in);
        try {
            int n = sc.nextInt();
            long packs = sc.nextLong();
            int counter = 0;
            sc.nextLine();
            for (int i = 0; i < n; i++) {
                String line = sc.nextLine();
                String s = line.substring(2);

                if (line.charAt(0) == '+') {
                    packs += Integer.parseInt(s);
                } else if (line.charAt(0) == '-') {
                    if (packs - Integer.parseInt(s) >= 0) {
                        packs -= Integer.parseInt(s);
                    } else {
                        counter += 1;
                    }
                }
                
            }
            System.out.println(packs +" "+ counter);
        } finally {
            sc.close();
        }
    }

    public static void main(String[] args){
        packs();
    }
}