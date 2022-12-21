import java.util.Scanner;

public class maxOrMin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number=1,max=1,min=1;
        while(number>0){
             number = sc.nextInt();
             if(max<number){
                max=number;
             }
             else if(min<number){
                min = number;
             }
        }
        System.out.println(max + " g " + min);
    }
}
