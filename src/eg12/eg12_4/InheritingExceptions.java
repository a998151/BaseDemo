package eg12.eg12_4;

/**
 * Created by ALemon on 2018/1/22.
 */
public class InheritingExceptions {
    public void f() throws SimpleException{
        System.out.println("Throw SimpleExcetion from f() ");
        throw new SimpleException();
    }

    public static void main(String[] args) {
        InheritingExceptions sed=new InheritingExceptions();
        try {
            sed.f();
        }catch (SimpleException e){
            System.out.println("Caught it !");
        }
    }
}
