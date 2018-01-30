package eg12.eg12_4;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.logging.Logger;

/**
 * Created by ALemon on 2018/1/23.
 */
public class LoggingException extends Exception {
    private static Logger logger=Logger.getLogger("LoggingException");
    public LoggingException(){
        StringWriter trace=new StringWriter();
        printStackTrace(new PrintWriter(trace));
        logger.severe(trace.toString());
    }
}
class LoggingExceptions{
    public static void main(String[] args){
        int a=0,b=0;
        try {
            a=1;
            throw new LoggingException();
        } catch (LoggingException e) {
            System.err.print("Caught "+e);
        }finally {
            System.out.println("get me ");
        }
        System.out.println("此处得到了执行----"+a);

        try {
            throw new RuntimeException();
        }catch (RuntimeException e){
            System.err.print("Caught "+e);
        }
        System.out.println("此处得到了执行----"+b);
    }
}
