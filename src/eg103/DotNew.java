package eg103;

/**
 * Created by ALemon on 2017/10/23.
 */
public class DotNew {
    public class Inner{
        public Inner(){
            System.out.println("dd");
        }
    }

    public static void main(String[] args) {
        DotNew dn=new DotNew();
        DotNew.Inner dni=dn.new Inner();
    }
}
