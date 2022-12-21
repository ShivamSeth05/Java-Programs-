public class IsOrbetweenPrime{
    public static void main(String[] args) {

      
        System.out.println(  Isprime(8));
        IsBetweenPrime(2,100);
        
    }
    public static boolean Isprime(int num){
        for(int i=2;i<num/2;i++){
            if(num%i==0){
                return false;
            }
        }
        return true;
    }

    public static void IsBetweenPrime(int x,int y){
        for(int i=x;i<y;i++){

            if(Isprime(i))
                System.out.print( i+ " ,");
        
        }
    }
}