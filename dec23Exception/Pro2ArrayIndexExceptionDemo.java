package dec23Exception;

public class Pro2ArrayIndexExceptionDemo {

	public static void main(String[] args) {
		int a[] = new int[2];
		a[0]= 1;
		a[1]=2;
		try {
			for (int i = 0; i <= a.length; i++) {
				System.out.println(a[i]);
			}
		} catch (IndexOutOfBoundsException e) {
			System.out.println("size must be "+a.length+" Only");
		}
		finally {
			System.out.println(a[1]);
		}

	}

}
