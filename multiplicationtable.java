import java.util.*;
public class multiplicationtable {
    public static void main(String[] args) {
        System.out.print("Enter a number for the Multiplication table: ");
        int n=sc.nextInt();
        for(int i=1;i<=10;i++) {
            System.out.println(n+" * "+i+" = "+(n*i));
        }
    }
    static Scanner sc = new Scanner(System.in);
}
