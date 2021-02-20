package sort.insert;

/**
 * @description:直接插入排序，时间复杂度：O（n^2）
 * @author: 彭椿悦
 * @data: 2021/2/19 18:59
 */
public class DirectInsert {
    /**
     * 待排序的数组
     *
     * @param a
     */
    static void directInsert(int[] a) {
        for (int i = 1; i < a.length; i++) {
            if (a[i] < a[i - 1]) {
                int x = a[i];
                int j = i - 1;
                while (j > -1 && x < a[j]) {
                    a[j + 1] = a[j];
                    j--;
                }
                a[j + 1] = x;
            }
        }
    }

    public static void main(String[] args) {
        int a[] = {3, 1, 5, 7, 2, 4, 9, 6};
        directInsert(a);
        for (int i : a) {
            System.out.println(i + " ");
        }
    }
}
