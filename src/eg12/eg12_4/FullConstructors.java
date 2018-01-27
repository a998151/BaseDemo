package eg12.eg12_4;

/**
 * Created by ALemon on 2018/1/23.
 */
public class FullConstructors {
    public static void f() throws MyException{
        System.out.println("Throwing MyException from f() ");
        throw new MyException();
    }
    public static void g() throws MyException{
        System.out.println("Throwing MyException from g() ");
        throw new MyException("Originated in g() ");
    }
    public static void main(String[] args){
        try {
            f();
        }catch (MyException e){
            e.printStackTrace(System.out);
        }

        try {
            g();
        }catch (MyException e){
            e.printStackTrace();
        }
    }
}
