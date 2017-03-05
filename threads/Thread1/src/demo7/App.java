package demo7;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

class Processor implements Runnable {

	private int id;

	public Processor(int id) {
		this.id = id;
	}

	@Override
	public void run() {
		System.out.println("Stating: " + id);

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println("Completed: " + id);
	}

}

public class App {
	public static void main(String[] args) {
		ExecutorService excuteor = Executors.newFixedThreadPool(20);

		for (int i = 0; i < 12500; i++) {
			excuteor.submit(new Processor(i));
		}
		
		excuteor.shutdown();
		
		System.out.println("all task submited.");
		
		try {
			excuteor.awaitTermination(1, TimeUnit.DAYS);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("All tasks complited.");

	}
}
