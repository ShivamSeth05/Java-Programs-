public class sumOfDigits {
    public static void main(String[] args) {
        int num =12345,sum=0;
        while(num>0){

             sum+=num%10;//
            //  sum1=sum1+sum;

            // sum=sum+sum;mn,
            // System.out.println(sum);
            num=num/10;  //10
        }
        System.out.print(sum);
    }
}
