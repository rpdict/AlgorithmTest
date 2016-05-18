package test;

/**
 * Created by Apple-NETwork on 16/3/24.
 */
public class huihuanbianwei {
    public static void main(String[] arg){
        System.out.println(func("ACTGACG", "TGACGAC"));
    }
    public static boolean func(String str1, String str2) {

        if((str1.length() == str2.length()) && ((str1+str1).indexOf(str2) >= 0)){
            return true;
        }
        return false;
    }
}
