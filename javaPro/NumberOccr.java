import java.util.Scanner;

public class NumberOccr {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int sizeOfArr = sc.nextInt();
        int [] number = new int[sizeOfArr];
        for (int i = 0;i<number.length;i++){
            number[i]=sc.nextInt();
        }
        System.out.println(" enter the search num ");
        int se = sc.nextInt();
        
        System.out.println(getoccurence(number, se));
        
    }

    public static int getoccurence (int [] number, int se){
        int occ=0;
        for(int i=0;i<number.length;i++){
            if(number[i]==se)
            occ++;
        }
        return occ;
    }
}
