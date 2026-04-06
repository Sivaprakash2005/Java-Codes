import java.util.Scanner;
public class turnay {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter age: ");
        int n=sc.nextInt();
        String s1=(n>18)?"Eligible to vote":"Not eligible to vote";
        System.out.println(s1);
        sc.close();
    }
}
