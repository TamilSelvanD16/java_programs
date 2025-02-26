abstract class Tamil {
    abstract void t();
    
    void s() {
        System.out.println("Outer Non-Abstract method");
    }
    abstract class Das {
        abstract void l();
        
        void d() {
            System.out.println("Inner Non-Abstract method");
        }
    }
}
class o extends Tamil {
    void t() {
        System.out.println("Outer Abstract method");
    }
    class i extends Das {
        void l() {
            System.out.println("Inner Abstract method");
        }
    }
}
public class non_abstract {
    public static void main(String args[]) {
        o obj = new o();
        obj.s();
        obj.t();
        o.i innerObj = obj.new i();
        innerObj.d(); 
        innerObj.l();  
    }
}
