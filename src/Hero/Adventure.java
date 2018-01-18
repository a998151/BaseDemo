package Hero;

/**
 * Created by ALemon on 2017/10/11.
 */
public class Adventure {
    public static void t(CanFight x){x.fight();}
    public static void u(CanSwim x){x.swim();}
    public static void v(CanFly x){x.fly();}
    public static void w(ActionCharacter x){x.fight();}

    public static void main(String[] args) {
        Hero hero=new Hero();
        t(hero);
        u(hero);
        v(hero);
        w(hero);
    }
}
