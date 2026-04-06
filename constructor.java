public class constructor
{
   public constructor(){
      System.out.println("constructer.....");
   }
   public constructor(int a,int b){
      System.out.println("constructer: "+a+" , "+b);
   }
   public constructor(int a,float b){
      System.out.println("constructer: "+a+" , "+b);
   }
   public constructor(float a,int b){
      System.out.println("constructer: "+a+" , "+b);
   }
	public static void main(String[] args) {
		constructor m=new constructor();
		constructor m1=new constructor(5,7);
		constructor m2=new constructor(5,(float)7.5);
		constructor m3=new constructor((float)6.3,4);
	}
}
