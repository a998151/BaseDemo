package eg111;

/**
 * Created by ALemon on 2017/12/17.
 */
public class Banana  implements Fruit{
    @Override
    public void taste() {
        System.out.println("味道甜的");
    }

    @Override
    public void color() {
        System.out.println("颜色为黄色");
    }
}
