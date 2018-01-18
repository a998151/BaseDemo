package eg103;

/**
 * Created by ALemon on 2017/10/23.
 */
public class DotThis {
    void f(){
        System.out.println("DotThis.f()");
    }
    public class Inner{
        public DotThis outer(){
            return DotThis.this;
        }
    }
    public Inner inner(){
        return new Inner();
    }

    public static void main(String[] args) {
        Inner dti=new DotThis().inner();
        dti.outer().f();
    }
}
