package class1;

import java.util.Scanner;

/**
 * Created by Apple-NETwork on 15/12/17.
 */
public class Guibingpaixu {
    public static void main(String[] args) {
        System.out.println("请输入数字，用空格分开，回车结束输入");
        int num = 0;
        double[] data = {};
        while (true) {
            try {
                Scanner input = new Scanner(System.in);
                String[] str = input.nextLine().split(" ");
                data = new double[str.length];
                for (int i = 0; i < str.length; i++) {
                    data[i] = Double.parseDouble(str[i]);
                }
            } catch (Exception e) {
                System.out.println("请按规则输入数组");
                num += 1;
            }
            if (num == 0){
                break;
            }
            num = 0;
        }
        while (true) {
            System.out.println("1.升序  2.降序");
            Scanner input1 = new Scanner(System.in);
            String xuanze = input1.next();
            if (xuanze.equals("1")) {
                print(data);
                mergeSort(data);
                System.out.println("排序后的数组：");
                print(data);
            } else if (xuanze.equals("2")) {
                reprint(data);
                mergeSort(data);
                System.out.println("排序后的数组：");
                reprint(data);
            } else {
                System.out.println("好好选");
                num += 1;
            }
            if (num == 0){
                break;
            }
            num = 0;
        }

    }

    public static void mergeSort(double[] data) {
        gb_sort(data, 0, data.length - 1);
    }


    public static void gb_sort(double[] data, int left, int right) {
        if (left >= right)
            return;
        // 找出中间索引
        int center = (left + right) / 2;
        // 对左边数组进行递归
        gb_sort(data, left, center);
        // 对右边数组进行递归
        gb_sort(data, center + 1, right);
        // 合并
        merge(data, left, center, right);
//        print(data);
    }
    /**
     * 将两个数组进行归并，归并前面2个数组已有序，归并后依然有序
     *
     * @param data
     *            数组对象
     * @param left
     *            左数组的第一个元素的索引
     * @param center
     *            左数组的最后一个元素的索引，center+1是右数组第一个元素的索引
     * @param right
     *            右数组最后一个元素的索引

     */
    public static void merge(double[] data, int left, int center, int right) {
        // 临时数组
        double[] tmpArr = new double[data.length];
        // 右数组第一个元素索引
        int mid = center + 1;
        // third 记录临时数组的索引
        int third = left;
        // 缓存左数组第一个元素的索引
        int tmp = left;
        while (left <= center && mid <= right) {
            // 从两个数组中取出最小的放入临时数组
            if (data[left] <= data[mid]) {
                tmpArr[third++] = data[left++];
            } else {
                tmpArr[third++] = data[mid++];
            }
        }
        // 剩余部分依次放入临时数组（实际上两个while只会执行其中一个）
        while (mid <= right) {
            tmpArr[third++] = data[mid++];
        }
        while (left <= center) {
            tmpArr[third++] = data[left++];
        }
        // 将临时数组中的内容拷贝回原数组中
        // （原left-right范围的内容被复制回原数组）
        while (tmp <= right) {
            data[tmp] = tmpArr[tmp++];
        }
    }

    public static void print(double[] data) {
        for (int i = 0; i < data.length; i++) {
            double num = data[i];
            if(Math.round(num)-num==0){
                System.out.print(String.valueOf((long) num) + "\t");
            }else{
                System.out.print(String.valueOf(num) + "\t");
            }
        }
        System.out.println();
    }
    public static void reprint(double[] data) {
        for (int i = data.length - 1; i > -1; i--) {
            double num = data[i];
            if(Math.round(num)-num==0){
                System.out.print(String.valueOf((long)num) + "\t");
            }else{
                System.out.print(String.valueOf(num) + "\t");
            }
        }
        System.out.println();
    }
}