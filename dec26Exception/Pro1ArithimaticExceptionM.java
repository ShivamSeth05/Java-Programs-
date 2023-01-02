package dec26Exception;


class Pro1ArithimaticException {
	public void checkException(){
		try{
			int num1=30,num2=0;
			int operation=num1/num2;
			System.out.println("Result:"+ operation);
		}
		catch(ArithmeticException e){
			e.printStackTrace();
			System.out.println(e);
		}
	}
	
	
}
 class Pro1ArithimaticExceptionM{
	public static void main(String[] args) {
		Pro1ArithimaticException ob= new Pro1ArithimaticException();
//		System.out.println("Shivam");
		ob.checkException();
		
		
	}
}
