import java.util.Scanner;
public class datatypes {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        long b=sc.nextLong();
        String c=sc.next();
        float d=sc.nextFloat();
        boolean e=sc.nextBoolean();
        double f=sc.nextDouble();
        char g=sc.next().charAt(0);
        System.out.println("Integer: " + a);
        System.out.println("Long: " + b);
        System.out.println("String: " + c);
        System.out.printf("Float: %.2f%n", d);
        System.out.println("Boolean: " + e);
        System.out.println("Double: " + f);
        System.out.println("Character: " + g);
        sc.close();       
    }
}
