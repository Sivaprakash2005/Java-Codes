import java.util.*;
public class Stringop {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s1="Siva";
        String s2="siva";
        String s3=new String(s1);
        String s4=new String(s2);
        System.out.println(s1.charAt(1));
        System.out.println(s1==s2);
        System.out.println(s1.equals(s2));
        System.out.println(s1.equalsIgnoreCase(s2));
        int result=s1.compareTo(s2);
        if(result==0){
            System.out.println("String are equal");
        }
        else if(result>0){
            System.out.println("String 1 is grt");
        }
        else{
            System.out.println("String 2 is grt");
        }
        System.out.println(s1.toLowerCase());
        System.out.println(s2.toUpperCase());
        String a="Siva prakash";
        String e="prakash";
        System.out.println(a.startsWith(s1));
        System.out.println(a.endsWith(e));
        System.out.println(s3.getBytes());
        String b="   Siva   ";
        System.out.println(b.length());
        System.out.println(b.trim());
        System.out.println(a.replace('S','c'));
        System.out.println(b.indexOf('v'));
        System.out.println(a.substring(0,5));
        String c="abc";
        String d="def";
        System.out.println(c.concat(d));
        System.out.print("Enter string(with spaces):");
        String u1=sc.next();
        System.out.println("String:"+u1);
        System.out.print("Enter string(with spaces):");
        String u2=sc.nextLine();
        System.out.println("String:"+u2);
        System.out.print("Add:"+6+8);
        sc.close();
    }
}
