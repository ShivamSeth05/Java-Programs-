 package nov22;

import java.util.Scanner;

public class Pro_01 {

	public static void main(String[] args) {
		  Scanner s=new Scanner(System.in);
		  System.out.println("enter array size");
	      int n=Integer.parseInt(s.nextLine()); // -> ambiguity problem  
	      String ob[]= new String[n];
	      System.out.println("enter adding elements");
	     // System.out.println(ob.length);
	      for(int i=0;i<ob.length;i++)//--> if len = 3 then 0 1 2 
	      {
	    	  ob[i]=s.nextLine();
	      }
	      for(int i=0;i<ob.length;i++)//--> if len = 3 then 0 1 2 
	      {
	          	if(ob[i].charAt(0)=='a'||ob[i].charAt(0)=='e'||ob[i].charAt(0)=='i'||ob[i].charAt(0)=='o'||ob[i].charAt(0)=='u')
	          		continue;
	    	  System.out.println(ob[i]);
	// 	
	      }
	      

	}

}
