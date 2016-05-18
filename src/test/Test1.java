package test;

import java.util.Scanner;

/**
 * Created by Apple-NETwork on 15/12/14.
 */
public class Test1 {
    public static void main(String[] args) {
        int i = 0;
        while (true) {
            System.out.println("1:人民币转美元  2:美元转人民币");
            Scanner input1 = new Scanner(System.in);
            String xuanze = input1.next();
            while (true) {
                if (xuanze.equals("1")) {
                    try {
                        System.out.println("请输入人民币：");
                        Scanner input = new Scanner(System.in);
                        double centigrade = input.nextDouble();
                        double fahrenheit = centigrade * 6.3790;
                        System.out.println("转成美元是：" + "\n" + fahrenheit);
                    } catch (Exception e) {
                        System.out.println("请输入正确数字");
                        i = i + 1;
                    }
                }
                if (i == 0) {
                    break;
                }
                i = 0;
            }
            while (true) {
                if (xuanze.equals("2")) {
                    try {
                        System.out.println("请输入美元：");
                        Scanner input = new Scanner(System.in);
                        double fahrenheit = input.nextDouble();
                        double centigrade = fahrenheit / 6.3790;
                        System.out.println("转成人民币是：" + "\n" + centigrade);
                    } catch (Exception e) {
                        System.out.println("请输入正确数字");
                        i = i + 1;
                    }
                }
                if (i == 0) {
                    break;
                }
                i = 0;
            }
            if (!xuanze.equals("2") && !xuanze.equals("1")) {
                System.out.println("请输入正确编号");
                i = i + 1;
            }
            if (i == 0) {
                break;
            }
            i = 0;
        }
    }
}
