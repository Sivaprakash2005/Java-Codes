package Question;
import java.util.*;

public class mrgearr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter arr1 size: ");
        int n = sc.nextInt();
        int[] a = new int[n];
        System.out.println("Enter array:");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        System.out.print("Enter arr2 size: ");
        int m = sc.nextInt();
        int[] b = new int[m]; 
        System.out.println("Enter array:");
        for (int i = 0; i < m; i++) {
            b[i] = sc.nextInt(); 
        }
        int[] c = new int[n + m];
        for (int i = 0; i < n; i++) {
            c[i] = a[i];
        }
        for (int i = 0; i < m; i++) {
            c[n + i] = b[i];
        }
        System.out.println("Merged array:");
        for (int num : c) {
            System.out.print(num + " ");
        }
        sc.close();
    }
}
