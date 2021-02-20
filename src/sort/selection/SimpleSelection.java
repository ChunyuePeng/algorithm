package sort.selection;

import java.util.Arrays;

/**
 * @description:简单选择排序，要在排序的一组数中，选出最小（或者最大）
 * 与第一个位置交换，然后再依次选出第i大（或者第i小）的数与第i个数交换
 * @author: 彭椿悦
 * @data: 2021/2/20 10:51
 */
public class SimpleSelection {
    static void simpleSelectionSort(int a[]){
        for (int i = 0; i < a.length; i++) {
            int minIndex = getMinFromIndex(a, i);
            if (a[i]>a[minIndex]){
                int tmp = a[i];
                a[i] = a[minIndex];
                a[minIndex]= tmp;
            }
        }
    }

    /**
     * 找出@param index之后的所有数中最小的数
     * @param a
     * @param index
     * @return
     */
    static int getMinFromIndex(int a[],int index){
        int minIndex = index;
        for (int i = index+1;i<a.length;i++){
            if (a[i]<a[minIndex]){
                minIndex = i;
            }
        }
        return minIndex;
    }

    public static void main(String[] args) {
        int a[] = {3, 1, 5, 7, 2, 4, 9, 6, 11, 1, 3, 45, 2, 8};
        simpleSelectionSort(a);
        System.out.println(Arrays.toString(a));
    }
}
