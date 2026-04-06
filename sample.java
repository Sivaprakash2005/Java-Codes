import java.util.*;
public class sample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:");
        int n = sc.nextInt();
        int original = n; 
        int r=0;
        while(n>0) {
            int d= n % 10;
            r = r * 10 + d;
            n = n / 10;
        }
        if(r == original) {
            System.out.println(r+" The number is a palindrome.");
        } else {
            System.out.println(r+" The number is not a palindrome.");
        }
        sc.close();
    }
}
