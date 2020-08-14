import java.util.Scanner;
import java.util.ArrayList;
public class LApril {
    static int sum = 0;
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws java.lang.Exception {
        int T = 0;
        if (sc.hasNextInt()) {
            T = sc.nextInt();
        }

        while (T > 0) {
            int N = sc.nextInt();

            int[] arr = new int[N];

            for (int i = 0; i < N; i++) {
                arr[i] = sc.nextInt();
            }

            // subs_void(arr);

            int[] temp = new int[N];
            int index = 0;
            solve(arr, index, temp);
            //sum = sum%998244353;
            System.out.println(sum);

            sum = 0;
            T--;
        }

    }

    // public static void subs_void(int[] arrInput){
    //         int [] temp = new int[arrInput.length];
    //         int index = 0;
    //         solve(arrInput, index, temp);
    // }

    public static void solve(int[] arrInput, int index, int[] temp) {
        if (index == arrInput.length) {
            ArrayList < Integer > subs = new ArrayList<>();
            for (int i = 0; i < temp.length; i++) {
                if (temp[i] == 1) {
                    subs.add(arrInput[i]);
                }
            }
            sum += (sumFunc(subs) % 998244353);
            //sum += genArr(arrInput,temp);
            return;
        }
        temp[index] = 1;
        solve(arrInput, index + 1, temp);
        temp[index] = 0;
        solve(arrInput, index + 1, temp);
    }

    // this is the sum function that returns the minimum positive integer 

    public static int sumFunc(ArrayList < Integer > A) {
        int n = A.size();

        boolean[] present = new boolean[n + 1];

        for (int i = 0; i < n; i++) {

            if (A.get(i) > 0 && A.get(i) <= n)
                present[A.get(i)] = true;
        }

        for (int i = 1; i <= n; i++)
            if (!present[i])
                return i;

        return n + 1;
    }
}