public class Palendrome {
    public static void main(String[] args) {
        String str = "noon";
        boolean isPalendrome=true;
        for (int i = 0, j = str.length() - 1; i < j; i++, j--) {
            if (str.charAt(i) == str.charAt(j))
                continue;
            
            isPalendrome = false;
            // System.out.println("NP");
            break;
        }
        System.out.println(isPalendrome ?"P":"NP");

    }

}
