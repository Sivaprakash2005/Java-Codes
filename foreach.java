import java.util.Scanner;
public class foreach {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size:");
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            System.out.print("Enter element:");
            a[i]=sc.nextInt();
        }
        for(int num:a){
            System.out.println("Element:"+num);
        }
        sc.close();
    }
}
