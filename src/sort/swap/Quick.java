package sort.swap;

import java.util.Arrays;

/**
 * @description:快速排序
 * @author: 彭椿悦
 * @data: 2021/2/20 14:04
 */
public class Quick {

    public static void quickSort(int a[], int low, int high) {
        if (low < high) {
            int index = getStandardValueIndex(a, low, high);
            quickSort(a, low, index - 1);
            quickSort(a, index + 1, high);
        }
    }

    public static void main(String[] args) {
        int a[] = {3, 1, 5, 7, 2, 4, 9, 6, 11, 1, 3, 45, 2, 8};
        quickSort(a, 0, a.length - 1);
        System.out.println(Arrays.toString(a));
    }
    /**
     * 找寻基准数据的正确索引，并将基准值移动至正确的位置
     *
     * @param a
     * @param low
     * @param high
     * @return
     */
    static int getStandardValueIndex(int a[], int low, int high) {
        int standardValue = a[low];
        while (low < high) {
            //先从队尾开始寻找，当高位指针的值小于基准值的时候，停止寻找,之后将该值赋值给低位指针位置
            while (low < high && a[high] >= standardValue) {
                high--;
            }
            a[low] = a[high];
            //之后冲队尾开始寻找，当低位指针的值大于基准值时，停止寻找，之后将该该值赋值给高位指针的位置
            while (low < high && a[low] <= standardValue) {
                low++;
            }
            a[high] = a[low];
        }
        //跳出循环的条件为找到了正确的基准值位置，也就是low等于high
        //将基准值赋值给基准值索引处
        a[high] = standardValue;
        return high;
    }
}
