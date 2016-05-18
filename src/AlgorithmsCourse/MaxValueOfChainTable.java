package AlgorithmsCourse;

/**
 * Created by Apple-NETwork on 16/4/24.
 */
public class MaxValueOfChainTable {
    private static int N;
    private static Node first;
    private static Node last;

    private static class Node {
        int item;
        Node next;
    }

    public static void enquueu(int item) {
        Node oldlast = last;
        last = new Node();
        last.item = item;
        last.next = null;
        if (N == 0) {
            first = last;
        } else {
            oldlast.next = last;
        }
        N++;
    }

    //T27
    public static int max() {
        int temp = 0;
        for (Node x = first; x.next != null; x = x.next) {
            if (x.item > x.next.item) {
                temp = x.item;
                x.item = x.next.item;
                x.next.item = temp;
            }
        }
        if (N == 0) {
            return temp;
        } else {
            return last.item;
        }

    }

    //T28
    public static int maxGcd(){
        if (N==0) {
            return 0;
        }

        if (first.next!=null && first.item < first.next.item) {
            first=first.next;
            return maxGcd();
        }
        else if(first.next!=null && first.item > first.next.item) {
            first.next = first.next.next;
            return maxGcd();
        }else{
            return first.item;
        }

    }

    public static void main(String[] args) {
//        for (int i = 0; i < 5; i++) {
//            enquueu(i);
//        }

        enquueu(2431);
        enquueu(1234);
        enquueu(5467);
        enquueu(43652);
        enquueu(45);
        enquueu(2);

//        System.out.println(max());//4

        System.out.println(maxGcd());//4
    }
}
