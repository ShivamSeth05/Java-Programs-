import java.util.Scanner;
class readSequence {
    public static void main(String[] args) {
        int n=0; 
        Scanner input = new Scanner(System.in);
        while(n<100){
            n=n+input.nextInt();
        }
        System.out.println(n+ " exceeds");
    }
}
