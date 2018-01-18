package eg99;

/**
 * Created by ALemon on 2017/10/17.
 */
public class Factories {
    public static void serviceConsumer(ServiceFactory factory){
        Service s=factory.getService();
        s.method1();
        s.method2();
    }

    public static void main(String[] args) {
        serviceConsumer(new Implementation1Factory());
        serviceConsumer(new Implementation2Factory());
    }
}
