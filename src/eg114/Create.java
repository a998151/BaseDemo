package eg114;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by ALemon on 2017/12/18.
 */
public class Create {
    private String str,newStr="";
    private List<Character> list;
    private int i;
    public Create(){}
    public Create(String str){
        this.str=str;
        cc();
    }
    public void cc(){
        char[] chars=str.toCharArray();
        list=new ArrayList<>();
        for (char i:chars){
            list.add(i);
        }
    }
    public void next1(){
        Random random=new Random();
        i=random.nextInt(list.size());
        System.out.print(list.get(i));
        newStr+=list.get(i);
        list.remove(i);
    }
    public String getStr(){
        return newStr;
    }

    public void next(){
        for (int i=0;i<str.length();i++){
            next1();
        }
    }
}
