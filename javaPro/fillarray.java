import java.util.Arrays;
import java.util.Scanner;

public class fillarray {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n > 20 || n <= 0)
        {
            System.out.println("Invalid Try Again");
            n = sc.nextInt();
        }

        int [] number = new int [n];
        fillArrayInterger(number);
        printArray(number);

    }

    private static void printArray(int[] number) {
        System.out.println("elements are");
        System.out.println(Arrays.toString(number));
    }

    private static void fillArrayInterger(int[] number) {
        Scanner input = new Scanner(System.in);

        for (int i=0;i<number.length;i++){
            number[i]=input.nextInt();
            
        }
       
    }

}
