package AlgorithmsCourse;

import java.util.Arrays;

/**
 * Created by Apple-NETwork on 16/5/17.
 */
public class TwoSum {
    static int lo;
    static int hi;
    static int cnt = 0;
    public static void lohi(int[] a){
        Arrays.sort(a);
        lo = 0;
        hi = a.length - 1;
    }

    public static int count(int[] a){


        if(hi < lo){
            return cnt;
        }

        if(Math.abs(a[lo]) > Math.abs(a[hi])){
            lo++;
            return count(a);
        }else if (Math.abs(a[lo]) < Math.abs(a[hi])){
            hi--;
            return count(a);
        }else{
            cnt++;
            lo++;
            hi--;
            return count(a);
        }

    }

    public static void main(String[] args) {
        int[] a = {1,-5,12,5,12,3546,5665,3424,7667,-5665,-332,56432,-1233,-1233};
        lohi(a);
        System.out.println(count(a));
    }
}
