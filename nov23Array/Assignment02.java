package nov23Array;

public class Assignment02 {

	public static void main(String[] args) {
		String string="Program";
 boolean f=false;
		for(int i=0;i<string.length();i++) {// r
			f=false;
			for(int j=i+1;j<string.length();j++) {//rogram
				if(string.charAt(i)==string.charAt(j)) {
					f=true;
				}
			}
			if(f==false)
				System.out.println(string.charAt(i));
		}

	}

	

}
