import java.util.*;
public class opeartions {
    public void Arithmetic(){
       System.out.print("Enter two numbers: ");
       int a=sc.nextInt();
       int b=sc.nextInt();
       System.out.println("Add:"+ a+b);
       System.out.println("Sub:"+ (a-b));
       System.out.println("Mul:"+ a*b);
       System.out.println("Div:"+ a/b);
    }
    public void relational(){
        System.out.print("Enter two numbers: ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("Equals:" + (a==b));
        System.out.println("Not Equals:" + (a!=b));
        System.out.println("Greater than:" + (a>b));
        System.out.println("lesser than:" + (a<b));
    }
    public void logical(){
        boolean a=true;
        boolean b=false;
        System.out.println("AND:" + (a && b));
        System.out.println("OR:" + (a || b));
        System.out.println("NOT a:" + (!a));
        System.out.println("NOT b:" + (!b));
    }
    public void bitwise(){
        System.out.print("Enter two numbers: ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("AND:" + (a & b));
        System.out.println("OR:" + (a | b));
        System.out.println("XOR:" + (a ^ b));
        System.out.println("Left Shift a:" + (a << 1));
        System.out.println("Right Shift a:" + (a >> 1));
    }
    public static void main(String[] args) {
        opeartions op = new opeartions();
        System.out.println("choose operation: 1.Arithmetic 2.Relational 3.Logical 4.Bitwise");
        int choice = sc.nextInt();
        switch(choice) {
            case 1:
                op.Arithmetic();
                break;
            case 2:
                op.relational();
                break;
            case 3:
                op.logical();
                break;
            case 4:
                op.bitwise();
                break;
            default:
                System.out.println("Invalid choice");
        }
    }
    static Scanner sc = new Scanner(System.in);
}
