package sort.swap;

import java.util.Arrays;

/**
 * @description:冒泡排序
 * @author: 彭椿悦
 * @data: 2021/2/20 13:28
 */
public class Bubble {
    static void bubbleSort(int a[]){
        for (int i=0;i<a.length-1;i++){
            for (int j=0;j<a.length-i-1;j++){
                if (a[j]>a[j+1]){
                    int tmp = a[j+1];
                    a[j+1] = a[j];
                    a[j]=tmp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int a[] = {3, 1, 5, 7, 2, 4, 9, 6, 11, 1, 3, 45, 2, 8};
        bubbleSort(a);
        System.out.println(Arrays.toString(a));
    }
}
