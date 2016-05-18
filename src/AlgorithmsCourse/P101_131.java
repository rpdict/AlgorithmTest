package AlgorithmsCourse;

import edu.princeton.cs.algs4.*;

/**
 * Created by Apple-NETwork on 16/4/20.
 */
public class P101_131 {
    public static void main(String[] args){
        FixedCapacityStackOfStrings s;
        s = new FixedCapacityStackOfStrings(100);
        while (!StdIn.isEmpty()){
            String item = StdIn.readString();
            if (!item.equals("-"))
                s.push(item);
            else if (!s.isEmpty()) StdOut.print(s.pop() + " ");
        }
//        StdOut.println("(" + s.size() + " life on stack)");
    }
}
