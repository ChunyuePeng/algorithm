package sort.merge;

import java.util.Arrays;

/**
 * @description:归并排序
 * @author: 彭椿悦
 * @data: 2021/2/20 15:59
 */
public class Merge {
    private static void sort(int[] a, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;
            sort(a, left, mid);
            sort(a, mid + 1, right);
            merge(a, left, mid, right);
        }
    }

    private static void merge(int[] a, int left, int mid, int right) {
        int i = left;
        int j = mid + 1;
        int[] temp = new int[right - left + 1];
        int t = 0;
        while (i <= mid && j <= right) {
            if (a[i] <= a[j]) {
                temp[t++] = a[i++];
            } else {
                temp[t++] = a[j++];
            }
        }
        while (i <= mid) {
            temp[t++] = a[i++];
        }
        while (j <= right) {
            temp[t++] = a[j++];
        }
        t = 0;
        while (left <= right) {
            a[left++] = temp[t++];
        }
    }

    public static void main(String[] args) {
        int a[] = {3, 1, 5, 7, 2, 4, 9, 6, 11, 1, 3, 45, 2, 8};
        sort(a, 0, a.length - 1);
        System.out.println(Arrays.toString(a));
    }
}
