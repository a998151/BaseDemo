package eg12.eg12_4;

/**
 * Created by ALemon on 2018/1/30.
 */
public class Practice1 {
    public static void main(String[] args) {
        try {
            throw new Exception("Hello Exception !");
        }catch (Exception e){
            e.printStackTrace(System.out);
        }finally {
            System.out.println("Here executed");
        }
    }
}
