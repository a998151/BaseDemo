package Music;

/**
 * Created by ALemon on 2017/10/9.
 */
public class Music {
    public static void tune(Instrument i){
        i.play(Note.MIDDLE_C);
        System.out.println(i.what());
    }
    public static void tuneAll(Instrument[] e){
        for (Instrument i:e){
            tune(i);
        }
    }

    public static void main(String[] args) {
        Instrument[] orchestra={
                new Wind(),
                new Percussion()
        };
        tuneAll(orchestra);
    }
}
