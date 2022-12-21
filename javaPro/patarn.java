import java.util.Scanner;

public class patarn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int givenNumber = sc.nextInt();
        if (givenNumber > 0) {
            for (int i = 1; i <= givenNumber; i++) {

                for (int j = 0; j < i; j++)
                    System.out.print(i);
                System.out.println();
            }
        }
    }
}
