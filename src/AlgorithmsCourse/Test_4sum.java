package AlgorithmsCourse;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

/**
 * Created by Apple-NETwork on 16/5/8.
 */
public class Test_4sum {
    public ArrayList<ArrayList<Integer>> fourSum(int[] num, int target) {
        Arrays.sort(num);

        HashSet<ArrayList<Integer>> hashSet = new HashSet<ArrayList<Integer>>();
        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();

        for (int i = 0; i < num.length; i++) {
            for (int j = i + 1; j < num.length; j++) {
                int k = j + 1;
                int l = num.length - 1;

                while (k < l) {
                    int sum = num[i] + num[j] + num[k] + num[l];

                    if (sum > target) {
                        l--;
                    } else if (sum < target) {
                        k++;
                    } else if (sum == target) {
                        ArrayList<Integer> temp = new ArrayList<Integer>();
                        temp.add(num[i]);
                        temp.add(num[j]);
                        temp.add(num[k]);
                        temp.add(num[l]);

                        if (!hashSet.contains(temp)) {
                            hashSet.add(temp);
                            result.add(temp);
                        }

                        k++;
                        l--;
                    }
                }
            }
        }

        return result;
    }

    public static void main(String[] args){
        int[] a = {1,2,5,-5,12,3546,5665,3424,7667,-332,56432,-1233};
        Test_4sum FourSumTest = new Test_4sum();
        System.out.println(FourSumTest.fourSum(a, 0));
    }
}
