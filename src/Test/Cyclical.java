package Test;

/**
 * Created by ALemon on 2017/12/19.
 */
public class Cyclical {
    static int max(int []arr,int n){//方法重载
        return max(arr,0,n);
    }
    static int max(int []arr,int from,int n){//方法重载
        if(from==n-1){
            return arr[from];//终止语句
        }
        else{
            if (arr[n]>arr[from]) {
                arr[from]=arr[n];
                return max(arr,from,n-1);
            }else max(arr,from,n-1);
        }
        return arr[from];
    }


    static int max1(int[] arr,int height){
        if (height-1==0){
            return arr[0];
        }else if (arr[height]>arr[0]){
            arr[0]=arr[height];
            return max1(arr,height-1);
        }else {
            max1(arr,height-1);
        }
        return arr[0];
    }
}
