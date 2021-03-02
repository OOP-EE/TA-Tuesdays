import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Subsets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        boolean[] a = new boolean[n];
        /* instead of using int array and 0 1 as values, we
        use boolean array because it's much faster */

        findSubsets(a, 0);

    }

    public static void findSubsets(boolean[] a, int index) {
        if (index != a.length - 1) {
            a[index] = true;
            findSubsets(a, index + 1);
            a[index] = false;
            findSubsets(a, index + 1);

        } else {
            a[index] = true;
            printSubset(a);
            // System.out.println(Arrays.toString(a));

            a[index] = false;
            printSubset(a);
            // System.out.println(Arrays.toString(a));
        }
    }

    public static void printSubset(boolean[] b) {
        boolean first = true;

        System.out.print("[");
        for (int i = 0; i < b.length; i++) {
            if (b[i]) {
                if (!first) {
                    System.out.print(", " + (i + 1));
                } else {
                    System.out.print((i + 1));
                    first = false;
                }
            }
        }
        System.out.println("]");

    }

}
