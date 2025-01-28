import java.util.ArrayList;
import java.util.Scanner;

public class teamOlympiad {
    public static void combinations() {
        Scanner sc = new Scanner(System.in);
        try {
            int n = sc.nextInt();
            ArrayList<Integer> math = new ArrayList<>();
            ArrayList<Integer> prog = new ArrayList<>();
            ArrayList<Integer> pe = new ArrayList<>();
            int m = 0, p = 0, s = 0;
            for (int index = 1; index <= n; index++) {
                int temp = sc.nextInt();
                if (temp == 1) {
                    p++;
                    prog.add(index);
                } else if (temp == 2) {
                    m++;
                    math.add(index);
                } else {
                    s++;
                    pe.add(index);
                }
            }
            int w = (p>s)? s : p;
            w = (w>m)? m: w;
            System.out.println(w );
            for (int i = 0; i < w; i++) {
             System.out.println(math.get(i)+" "+ prog.get(i)+" "+ pe.get(i));   
            }
        } finally {
            sc.close();
        }
    }
    public static void main(String[] args){
        combinations();
    }
}
