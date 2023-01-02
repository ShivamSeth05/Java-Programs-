package dec26Exception;
class MyAutoclosable implements AutoCloseable{

	@Override
	public void close() throws Exception {
		// TODO Auto-generated method stub

	}
	public void display(String str){
		if (str.equals(null)){
			throw new RuntimeException();
		}
		else{
			System.out.println("Yeh,I don't have exception");
		}
	}

}
class StackOverFlowError{
	public void display(String str){
		if (str.equals(null)){
			throw new RuntimeException();
		}
		else{
			System.out.println("Yeh,I don't have exception");
		}
	}

}
public class StackOverFlowErrorM {

	public static void main(String[] args) {
		try (MyAutoclosable m=new MyAutoclosable()){
			m.dispaly(null);


	}

}
}
