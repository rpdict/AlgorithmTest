package test;

/**
 * Created by Apple-NETwork on 15/12/18.
 */
public class Suanshu {
    public static void main(String[] args) {
//        int a = 0;
//        int b = 1;
//        System.out.println((a+b) / 2);
        int data[] = new int[5];
        data[0] = 1;
        data[1] = 1;
        data[2] = 1;
        data[3] = 1;
        data[4] = 1;
        System.out.println(data.length);
        for (int i = data.length -1; i > -1; i--) {
            System.out.print(data[i] + "\t");
        }
    }
}
