interface Interface1{
    static void t1(){
        System.out.println("Static in Interface1");
        
    }
    void t2();
    abstract void t3();
}
interface Interface2 extends Interface1{
    static void t1(){
        System.out.println("Static in Interface2");
    }
    void t2();
    abstract void t3();
}
class Inherit implements Interface2{
    public void t2(){
        System.out.println("Default in Inherit");
    }
    public void t3(){
        System.out.println("Abstract in Inherit");
    }
}
public class Interface
{
    public static void main(String args[])
    {
        Inherit obj=new Inherit();
        obj.t2();
        obj.t3();
        Interface1.t1();
        Interface2.t1();
        
    }
}