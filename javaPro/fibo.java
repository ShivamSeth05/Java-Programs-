import java.util.Scanner;

public class fibo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int var1 = 1, var2 = 1;
        for (int i = 1; i <= (n - 2); i++) {
            int temp = var2;
            var2 = var1 + var2;
            // System.out.println(var2);
            var1=temp;
        }
        System.out.println(var2);
    }
}
