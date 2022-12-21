import java.util.Arrays;
import java.util.Scanner;

/**
 * displaySumProAvg
 */
public class displaySumProAvg {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        // int sum;
        int[] arr = new int[n];
        fiilvalau(arr);
        calSum(arr);
        calPro(arr);
        calAvg(arr);
        // printresult(arr);
    }

    // Fill the array from user
    private static void fiilvalau(int[] arr) {
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();
        }
        System.out.println(Arrays.toString(arr));
    }

    // calculate the sum and print
    public static void calSum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        System.out.println("SUM Is " + sum);

    }

    // calculate the Product and print
    public static void calPro(int[] arr) {
        int mul = 1;
        for (int i = 0; i < arr.length; i++) {
            mul = mul * arr[i];
        }
        System.out.println("PRODUCT Is " + mul);

    }

    // calculate the average and print
    public static void calAvg(int[] arr) {
        double avg = 1, sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
            avg = (double)sum / arr.length;

        }
        System.out.println("Average Is " + avg);

    }
}