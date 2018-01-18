package Music;

/**
 * Created by ALemon on 2017/10/10.
 */
class Percussion implements Instrument{
    public void play(Note n) {
        System.out.println("Percussion "+ n);
    }

    public String what(){return "Percussion";}
    public void adjust() {

    }
}
