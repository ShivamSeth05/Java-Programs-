package oct27;

public class Pro_12getNaturalNumbers {
	public String getNaturalNumbers(int num1,int num2)//6  5 
	{
		String result="";
		
		if(num1<0||num2<0)// neg
			return "-1";
		if(num1==0||num2==0)// 0 
			return "-2";
		else if(num1<=num2) {// 6 5
			if(num1!=num2) //5 5
			result += num1+" "; //1_2_3_4_5
			else 
				result += num1+"";
			
			return result+=getNaturalNumbers(++num1,num2);
		}
		return result;
	}
	public static void main(String[] args) {

		Pro_12getNaturalNumbers sd1 = new Pro_12getNaturalNumbers();
		System.out.println( sd1.getNaturalNumbers(1,5));
	}

}
