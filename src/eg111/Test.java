package eg111;

import java.util.ArrayList;

/**
 * Created by ALemon on 2017/12/17.
 */
public class Test {
    public static void main(String[] args) {
        ArrayList<Fruit> arrayList=new ArrayList<>();
        arrayList.add(new Apple());
        arrayList.add(new Banana());

        arrayList.get(0).taste();
    }
}
