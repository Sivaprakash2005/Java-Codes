import java.util.*;
public class funparam4 {
    public static int sum(int a,int b){
        int c=a+b;
        return c;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int r=sum(a,b);
        System.out.println("Addition:"+r);
        sc.close();
    }
}