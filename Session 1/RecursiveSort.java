import java.util.Arrays;
import java.util.Scanner;

public class RecursiveSort {
    public static void main(String[] args) {
        int[] a = {21, 17, 4, 9, 6, - 3, 7};
        int n = a.length;

        System.out.println(Arrays.toString(a));
        sort(a, 0, n - 1);
        System.out.println(Arrays.toString(a));
    }

    public static void sort(int[] a, int leftIndex, int rightIndex) {
        /* Note that int array passed to the method is
           the original array (it's the same object) and
           the changes are applied to the original array */

        if (leftIndex < rightIndex) {
            int middleIndex = leftIndex + (rightIndex - leftIndex) / 2;

            sort(a, leftIndex, middleIndex);
            sort(a, middleIndex + 1, rightIndex);

            merge(a, leftIndex, middleIndex, rightIndex);
        }

        /* feel free to print the array at any line
           to become familiar with the program's flow */

    }

    public static void merge(int[] a, int leftIndex, int middleIndex, int rightIndex) {
        int n1 = middleIndex - leftIndex + 1;
        int n2 = rightIndex - middleIndex;

        int[] a1 = new int[n1];
        int[] a2 = new int[n2];
        // both of the arrays are ascending

        for (int i = 0; i < n1; i++) {
            a1[i] = a[leftIndex + i];
        }

        for (int i = 0; i < n2; i++) {
            a2[i] = a[middleIndex + 1 + i];
        }

        int i = 0, j = 0;

        int k = leftIndex;

        while (i < n1 && j < n2) {
            /* the only loop breaks when
               one of the arrays reaches to the end */
            if (a1[i] < a2[j]) {
                a[k] = a1[i];
                ++i;
                // you can also write a[k++]=a1[i++]
            } else {
                a[k] = a2[j];
                ++j;
                // a[k++]=a2[j++] also does the same thing
            }
            ++k;
        }

        if (i == n1) {
            while (j < n2) {
                a[k] = a2[j];
                ++j;
                ++k;
            }
        } else {
            while (i < n1) {
                a[k] = a1[i];
                ++i;
                ++k;
            }
        }

        // System.out.println(Arrays.toString(a));

        /* uncomment of you want to see the
           changes in the original array */

    }
}
