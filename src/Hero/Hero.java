package Hero;

/**
 * Created by ALemon on 2017/10/11.
 */
//Hero 继承 ActionCharacter 也就是说已经重写了fight方法了
public class Hero extends ActionCharacter implements CanFight,CanSwim,CanFly{
    @Override
    public void fly() {
        System.out.println("Fly~~~");
    }

    @Override
    public void swim() {
        System.out.println("Swim~~~");
    }
}
