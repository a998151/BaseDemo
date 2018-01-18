package Test;

/**
 * Created by ALemon on 2017/12/19.
 */
public class Test {
    public static void main(String[] args) {
        int[] arr=new int[]{1,2,3,4,5,8,6,2,4,78,8,54,9};
        int i=Cyclical.max1(arr,arr.length-1);
        System.out.println(i);
    }
}
