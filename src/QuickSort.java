import java.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class QuickSort {
    public static void main(String[] args){
        ArrayList<Integer> num = new ArrayList<Integer>();
        List list = Arrays.asList(0, 1, 3, 4, 4, 67, -23, 12, 56, -23, 78, 24, 14, 67, 128, 909, 354, 67);
        num.addAll(list);
        System.out.println(num);
        System.out.println(QS(num));
    }
    public static ArrayList<Integer> QS(ArrayList<Integer> num) {
        if (num.size() < 2) {
            //重复元素堆积导致本应该结束的递归数组长度大于2
            //哎,早该想到的
            return num;
        }
        else {
            int middle = num.get(0);
            ArrayList<Integer> less = new ArrayList<Integer>();
            ArrayList<Integer> greater = new ArrayList<Integer>();
            ArrayList<Integer> equal = new ArrayList<Integer>();
            ArrayList<Integer> result = new ArrayList<Integer>();
            for (int numbers : num) {
                if (numbers > middle) {
                    greater.add(numbers);
                } else if (numbers < middle) {
                    less.add(numbers);
                } else if (numbers == middle) {
                    equal.add(numbers);
                }
            }
            result.addAll(QS(less));
            result.addAll(equal);
            result.addAll(QS(greater));
            return result;
        }


    }
}
