// /* package whatever; // don't place package name! */
// Partition The zoo

// Problem Statement

 

// There is a zoo with N animals of different kinds represented by the string A , each kind of animal is represented as a letter from the lower case english alphabet. You need to partition the zoo into two zoos at index k such that the first zoo contains the animals from A[1] to A[K], and the second zoo contains animals from A[k+1] till A[N], You want to partition such that the common number of distinct animals in both the zoos is maximized 

 

// Input Format 

// The first line contains an integer N denoting the total number of animals 

// The second line contains the string A

 

// Output Format

// Print an integer denoting the common number of distinct animals in both the zoos is maximized 

 

// Constraint

// 1<=N<=10^5

// ‘a’<=A[i]<=’z’

 

// Sample Input

// 6

// zzttcz

 

// Sample output

// 2

 

// Explantion

// If the partition of zoo is zzt and tcz , t and z are common distinct characters
// import java.util.*;
// import java.lang.*;
// import java.io.*;

// /* Name of the class has to be "Main" only if the class is public. */
// class test {
//     public static void main(String[] args) throws java.lang.Exception {
//         // your code goes here
//         int c = 0, c1 = 0;
//         Scanner sc = new Scanner(System.in);
//         System.out.println("enter the S");
//         // int num = sc.nextInt();
//         String str = sc.nextLine();
//         for (int i = 0; i < str.length(); i++) {
//             for (int j = 0; j < str.length(); j++) {
//                 if (str.charAt(i) == str.charAt(j))
//                     c++;

//             }
//             if (c > 1) {
//                 c1++;
//             }
//         }
//         System.out.println(c1);

//     }
// }
class test{
    public static void main(String[] args) {
       
    //    String s= "shivam";
    //    for (int i=0;i<s.length;i++){
    //     System.out.println(s.charAt(i));
    System.out.println("D")
       }

    }
