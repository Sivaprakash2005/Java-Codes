import java.util.*;
public class b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                System.out.println("Break at: " + i);
                break; 
            }
            System.out.println("Number: " + i);
        }
        for (int j = 1; j <= 10; j++) {
            if (j == 5) {
                continue;
            }
            System.out.println("Number: " + j);
        }
        sc.close();
    }
}
