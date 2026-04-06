import java.util.*;
public class nonstatic {
    private static float sum(int a, int b) {
        return (float)a+(float)b; 
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter num1: ");
        int a=sc.nextInt();
        System.out.print("Enter num2: ");
        int b=sc.nextInt();
        float result=sum(a, b); 
        System.out.println("Addition: " + result);
        sc.close();
    }
}