package classAssignment;
class A {
	String str="";
	String getNaturalNumbers(int start_val ,int end_val) {
		if(start_val<0 || end_val<0)return "-1";
		if(start_val==0||end_val==0)return "-2";
		str=str+start_val+" ";
		if(start_val==end_val)return str;
		start_val++;
		return getNaturalNumbers(start_val, end_val);
	}
}

class B {
	String getNumberInRange(int start_val,int end_val) {
		String string="";
		if(start_val<0 || end_val<0)return "-1";
		if(start_val==end_val)return "-2";
		if(start_val<end_val)return "-3";
		if(start_val-end_val==1)return "-4";
		start_val--;
		for(int i =start_val; i > end_val;i--) 
			string=string+i+" ";
		return string;
	}
}

class C {
	String getNumberInRange(int start_val,int end_val,int step) {
		String string="";
		if(start_val<0 || end_val<0)return "-1";
		if(start_val==end_val)return "-2";
		if(start_val>end_val)return "-3";
		start_val++;
		for(int i =start_val; i < end_val;i=i+step) 
			string=string+i+" ";
		return string;
	}
}
class D {
	String getFourPairLine(int end_val) {
		String string="";
		if( end_val<0)return "-1";
		if(end_val==0)return "-2";
		if(end_val>99)return "-3";
		int perLine=0;
		for(int i =1; i <=end_val;i++) {
			perLine++;
		string=string+i+" ";
		
		if(perLine==4) {
			string=string+"\n";
			perLine=0;
		}
		
	}return string;
}
}

public class LabProg {

	public static void main(String[] args) {
		System.out.println("=============== GetNaturalNumbers ================\n");
		A ob1 = new A();
		System.out.println(ob1.getNaturalNumbers(1, 5));
		System.out.println("\n=============== GetNumberInRange ================\n");
		B ob2 = new B();
		System.out.println(ob2.getNumberInRange(3, 2));
		System.out.println("\n=============== GetNumberInRange ================\n");
		C ob3 = new C();
		System.out.println(ob3.getNumberInRange(1, 8, 2));
		System.out.println("\n================ GetFourPairLine ===============\n");
		D ob4 = new D();
		System.out.println(ob4.getFourPairLine(15));
		

	}

}
