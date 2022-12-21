package dec17multitreadig;

class MyTRunable implements Runnable{

	@Override
	public void run() {
		while (true) {
			System.out.println("I am a thread 1");
		}
		
	}	
}
class MyTRunable1 implements Runnable{

	@Override
	public void run() {
		while (true) {
			System.out.println("I am a thread 2");
		}
		
	}	
}

public class ThreadingRunableI {

	public static void main(String[] args) {
		MyTRunable obMyTRunable = new MyTRunable();
		Thread obThread = new Thread(obMyTRunable);
		
		MyTRunable1 obMyTRunable1 = new MyTRunable1();
		Thread obThread1 = new Thread(obMyTRunable1);
		obThread.start();
		obThread1.start();

	}

}
