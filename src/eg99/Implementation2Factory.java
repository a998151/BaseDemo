package eg99;

/**
 * Created by ALemon on 2017/10/17.
 */
public class Implementation2Factory implements ServiceFactory {
    @Override
    public Service getService() {
        return new Implementation2();
    }
}
