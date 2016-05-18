package test;

/**
 * Created by Apple-NETwork on 15/12/22.
 */

import java.util.Scanner;

public class Lizih {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choose;
        while (true) {
            System.out.println("请输入排序的规则: 1从大到小  2从小到大");
            System.out.print("请输入你的选择:");
            try {
                choose = Integer.parseInt(sc.nextLine());
            } catch (Exception e) {
                System.out.println("选择错误! 请重新输入!");
                continue;
            }
            if (choose == 1 || choose == 2) {
                int[] ary;//数组
                while (true) {
                    System.out.println("请输入一组数组（数组之间请用空格格开）:");
                    try {
                        String[] ss = sc.nextLine().split("\\s+");
                        ary = new int[ss.length];
                        for (int i = 0; i < ss.length; i++) {
                            ary[i] = Integer.parseInt(ss[i]);
                        }
                        if (choose == 1) {
                            sortH2L(ary);
                        } else {
                            sortL2H(ary);
                        }
                        System.out.print("排序完成:");
                        for (int i = 0; i < ary.length; i++) {
                            System.out.print(ary[i] + " ");
                        }
                        System.out.println();
                        break;

                    } catch (Exception e) {
                        System.out.println("输入错误! 请重新输入!");
                        continue;
                    }

                }
               break;
            } else {
                System.out.println("选择错误! 请重新输入!");
                continue;
            }

        }

    }

    public static void sortL2H(int[] ary) {
        for (int i = 0; i < ary.length - 1; i++) {
            for (int j = i + 1; j < ary.length; j++) {
                int temp;
                if (ary[i] > ary[j]) {
                    temp = ary[j];
                    ary[j] = ary[i];
                    ary[i] = temp;
                }
            }
        }
    }

    public static void sortH2L(int[] ary) {
        for (int i = 0; i < ary.length - 1; i++) {
            for (int j = i + 1; j < ary.length; j++) {
                int temp;
                if (ary[i] < ary[j]) {
                    temp = ary[j];
                    ary[j] = ary[i];
                    ary[i] = temp;
                }
            }
        }
    }
}