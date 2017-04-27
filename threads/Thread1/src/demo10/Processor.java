package demo10;

import java.util.LinkedList;
import java.util.Random;
// https://www.youtube.com/watch?v=wm1O8EE0X8k&list=PLBB24CFB073F1048E&index=9
public class Processor {

	private LinkedList<Integer> list = new LinkedList<Integer>();
	private final int LIMIT = 10;
	private Object lock = new Object();

	public void produce() throws InterruptedException {
		int value = 0;

		while (true) {
			synchronized (lock) {
				while (list.size() == LIMIT) {
					lock.wait();
				}

			}
			list.add(value++);
			lock.notify();
		}
	}

	public void consume() throws InterruptedException {

		Random random = new Random();
		while (true) {
			synchronized (lock) {
				while (list.size() == 0) {
					lock.wait();
				}

				System.out.print("List size is: " + list.size());
				int value = list.removeFirst();
				System.out.println("; value is: " + value);
				lock.notify();
			}
			Thread.sleep(random.nextInt(1000));
		}
	}

}
