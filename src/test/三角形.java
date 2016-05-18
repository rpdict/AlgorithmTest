package test;

/**
 * Created by Apple-NETwork on 16/3/17.
 */
public class 三角形 {
    public static void main(String[] args) {
//        for(int i = 0; i <= 5; i++) {
//            for(int j=1; j<=i; j++){
//                System.out.print(i);
//            }
//            System.out.println();
//        }
        for (int i = 1; i < 6; i++) {
            for (int j = 0; j < 5 - i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < i; k++) {
                System.out.print(" *");
            }
            System.out.println();
        }
    }
}
