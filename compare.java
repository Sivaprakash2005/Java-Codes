import java.util.Scanner;
public class compare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter three numbers: ");
        int n=sc.nextInt();
        int m=sc.nextInt();
        int o=sc.nextInt();
        if(n > m && n > o) {
            System.out.println(n + " is greater ");
        }
        if(n < m && m > o) {
            System.out.println(m + " is greater ");
        } else {
            System.out.println(o + " is greater ");
        }
        sc.close();
    }
}
