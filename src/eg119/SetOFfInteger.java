package eg119;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

/**
 * Created by ALemon on 2017/12/19.
 */
public class SetOFfInteger {
    public static void main(String[] args) {
        Random random=new Random(47);
        Set<Integer> intset=new HashSet<>();
        for (int i=0;i<1000;i++){
            intset.add(random.nextInt(30));
        }
        System.out.println(intset);
    }
}
