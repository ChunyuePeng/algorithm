package sort.insert;

import java.util.Arrays;

/**
 * @description:shell插入排序
 * @author: 彭椿悦
 * @data: 2021/2/20 10:02
 */
public class ShellInsert {
    /**
     * 先把数组进行希尔排序
     *
     * @param a
     */
    static void shellSort(int a[]) {
        //增量gap，并逐步缩小增量
        for (int gap = a.length / 2; gap > 0; gap /= 2) {
            //从第gap个元素，逐个对其所在组进行直接插入排序
            for (int i = gap; i < a.length; i++) {
                int sameGroup = a[i - gap];
                if (a[i] < sameGroup) {
                    int temp = a[i];
                    a[i] = sameGroup;
                    a[i - gap] = temp;
                }
            }
        }
        //宏观调控后的数组
        System.out.println(Arrays.toString(a));
        //再使用直接插入法对数组进行微调
        DirectInsert.directInsert(a);
        System.out.println(Arrays.toString(a));
    }

    public static void main(String[] args) {
        int a[] = {3, 1, 5, 7, 2, 4, 9, 6, 11, 1, 3, 45, 2, 8};
        shellSort(a);
    }
}
