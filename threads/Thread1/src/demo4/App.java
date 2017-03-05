package demo4;

import java.util.Scanner;

class Processor extends Thread {

	private volatile boolean running = true;

	@Override
	public void run() {
		while (running) {

			System.out.println("Hello");

			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public void shutDown() {
		this.running = false;
	}
}

public class App {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Processor proc = new Processor();
		proc.start();
		
		Scanner scan = new Scanner(System.in);
		scan.nextLine();
		proc.shutDown();
		
	}
}
