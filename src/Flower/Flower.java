package Flower;

/**
 * Created by ALemon on 2017/9/30.
 */
class Flower {
    int petalCount=0;
    String s="initial value";
    Flower(int petals){
        petalCount=petals;
        System.out.println("Constructor w/ int arg only ,petalCount= "+petalCount);
    }
    Flower(String ss){
        System.out.println("Constructor w/ String arg only, s ="+ss);
        s=ss;
    }
    Flower(String s,int petals){
        this(petals);
        this.s=s;
        System.out.println("String & int args");
    }
    Flower(){
        this("hi",47);
        System.out.println("default constructor (no args)");
    }
    protected void printPetalCount(){
        System.out.println("petalCount = "+petalCount+" s = "+ s);
    }
}
