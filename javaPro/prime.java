import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        
        int flag =0;
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        for(int i=2;i<(n/2);i++){
            if(n%i==0 )
            flag=flag+1;
            
        }
        // if()
        System.out.print(flag==0?"ppring":"Not Prime");
        System.out.print(flag);
    }
}


