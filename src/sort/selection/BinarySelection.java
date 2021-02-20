package sort.selection;

import java.util.Arrays;

/**
 * @description:二元选择排序，每次循环确定两个元素（当前循环最大和最小记录）的位置
 * ，从而减少排序所需的循环次数。
 * @author: 彭椿悦
 * @data: 2021/2/20 11:15
 */
public class BinarySelection {
    static void binarySelectionSort(int a[]){
        for (int i = 0;i<a.length/2;i++){
            int max=i,min=i;
            for (int j = i;j<a.length-i;j++){
                if (a[j]>a[max]){
                    max = j;
                }
                if (a[j]<a[min]){
                    min = j;
                }
            }
            if (a[i]>a[min]){
                int tmp = a[i];
                a[i] = a[min];
                a[min] = tmp;
            }
            if (a[a.length-i-1]<a[max]){
                int tmp = a[a.length-i-1];
                a[a.length-i-1] = a[max];
                a[max] = tmp;
            }
        }
    }

    public static void main(String[] args) {
        int a[] = {3, 1, 5, 7, 2, 4, 9, 6, 11, 1, 3, 45, 2, 8};
        binarySelectionSort(a);
        System.out.println(Arrays.toString(a));
    }
}
