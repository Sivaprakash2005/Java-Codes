import java.util.*;
public class stringbuff {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string s1: ");
        String s1 = sc.nextLine();
        System.out.print("Enter string s2: ");
        String s2 = sc.nextLine();
        StringBuffer s = new StringBuffer(s1);
        System.out.println("String buffer: " + s);
        s.append(s2);
        System.out.println("After appending: " + s);
        System.out.print("Enter index to insert s2: ");
        int n = sc.nextInt();
        s.insert(n,"xyz");
        System.out.println("After inserting:" + s);
        System.out.print("Enter start index to replace: ");
        int st= sc.nextInt();
        System.out.print("Enter end index to replace: ");
        int end= sc.nextInt();
        s.replace(st,end,"abc");
        System.out.println("After replacing from index:" + s);
        System.out.print("Enter start index to delete: ");
        int std = sc.nextInt();
        System.out.print("Enter end index to delete: ");
        int endd = sc.nextInt();
        s.delete(std, endd);
        System.out.println("After deleting from index " +std+ " to " +endd+ ": " + s);
        System.out.println("reverse:"+s.reverse());
        System.out.println("Capacity of buffer:"+s.capacity());
        sc.close();
    }
}
