package eg111;

/**
 * Created by ALemon on 2017/12/17.
 */
public class Apple implements Fruit {
    @Override
    public void taste() {
        System.out.println("苹果味道有点酸");
    }

    @Override
    public void color() {
        System.out.println("苹果颜色为红色");
    }
}
