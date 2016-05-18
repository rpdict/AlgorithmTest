package test;

/**
 * Created by Apple-NETwork on 15/12/18.
 */
public class splittest {
    public static void main(String[] args) {
        String str = "1|23|4|56|7";
        String[] arr = str.split("\\|");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
