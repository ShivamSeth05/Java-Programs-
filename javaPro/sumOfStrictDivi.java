import java.util.Scanner;

public class sumOfStrictDivi {
    public static void main(String[] args) {
        int sum=0;
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        // int n=number/2;
        for( int i=1 ;i<=(number/2);i++){
            if(number%i==0){
                sum= sum+i;
                System.out.print(i+" ");
            }
        }
        System.out.println(sum);
    }
    
}
