package Flower;

/**
 * Created by ALemon on 2017/10/7.
 */
public class Rose extends Flower {
    private Rose(){}
    public static Rose makeRose(){
        return new Rose();
    }

    private static Rose rose1=new Rose();
    public static Rose access(){
        return rose1;
    }
    public void color(){
        System.out.println("Rose'color is red.");
    }
}
