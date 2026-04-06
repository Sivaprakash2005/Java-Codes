import java.util.*;
class Main{
   public static void main(String[] args){
      Scanner sc=new Scanner(System.in);
      System.out.print("Enter two integers: ");
      int a=sc.nextInt();
      int b=sc.nextInt();
      System.out.println("Arithmetic Operations:");
      System.out.println("Addition:"+(a+b));
      System.out.println("Subtraction:"+(a-b));
      System.out.println("multiply:"+(a*b));
      if(b == 0) {
          System.out.println("Division: Cannot divide by zero");
      } else {
          System.out.println("Division:"+(a/b));
      }
      System.out.println("Modulus:"+(a%b));
      System.out.println("Logical Operations:");
      System.out.println("AND:"+(a&b));
      System.out.println("OR:"+(a|b));
      System.out.println("XOR:"+(a^b));
      System.out.println("Left Shift of a:"+(a<<1));
      System.out.println("Right Shift of a:"+(a>>1));
      System.out.println("Triple Shift of a:"+(a>>>1));
      System.out.println("Binary of -2:" + Integer.toBinaryString(-2));
      sc.close();  
   }
}