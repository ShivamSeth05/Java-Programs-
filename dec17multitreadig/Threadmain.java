package dec17multitreadig;


class Mythread extends Thread{
	@Override
	public void run() {
		while (true) {
			System.out.println("First one Mythread");
			System.out.println("Second one");
		}
	}
}
class Mythread1 extends Thread{
	@Override
	public void run() {
		while (true) {
			System.out.println("Mythread1 First one");
			System.out.println("Second one");
		}
	}
}

public class Threadmain {
	public static void main(String[] args) {
		Mythread obMythread  = new Mythread();
		Mythread1 obMythread1  = new Mythread1();
		obMythread.start();
		obMythread1.start();
				

	}

}
