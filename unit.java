import java.util.*;
class Unit {
    public static void main(String[] args) {
        System.out.print("Enter your unit: ");
        float unit= sc.nextFloat();
        if(unit<=100){
            System.out.printf("Your bill is: %.2f%n", unit);
        }
        else if(unit>100 && unit<=200){
            System.out.printf("Your bill is: %.2f%n", (unit*0.8));
        }
        else if(unit>200 && unit<=300){
            System.out.printf("Your bill is: %.2f%n", (unit*1.5));
        }
        else{
            System.out.printf("Your bill is: %.2f%n", (unit*3));
        }
    }
    static Scanner sc = new Scanner(System.in);
}