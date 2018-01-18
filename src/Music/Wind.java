package Music;

/**
 * Created by ALemon on 2017/10/9.
 */
class Wind implements Instrument {
    public void play(Note n){
        System.out.println("Wind.play() "+ n);
    }
    public void adjust() {}
    public String what(){return "Wind";}
}
