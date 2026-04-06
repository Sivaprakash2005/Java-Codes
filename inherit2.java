class grand{
    void land(){
        System.out.println("Grand parent");
    }
}
class parent extends grand{
    void ru(){
        System.out.println("parent ");
    }
}
class child extends parent{
    void saw(){
        System.out.println("Child ");
    }
}
public class inherit2 {
    public static void main(String[] args) {
        child c=new child();
        c.saw();
        c.ru();
        c.land();

    }   
}