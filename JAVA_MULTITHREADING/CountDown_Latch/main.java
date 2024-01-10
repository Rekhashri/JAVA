package JAVA_MULTITHREADING.CountDown_Latch;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Task implements Runnable {
	private CountDownLatch cdl;

	public Task(CountDownLatch cdl) {
		this.cdl = cdl;
	}

	public void run() {
		System.out.println("Thread started.");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		cdl.countDown();
	}
}
public class main {
  public static void main(String[] args) {

		CountDownLatch cdl = new CountDownLatch(6);

		ExecutorService executor = Executors.newFixedThreadPool(6);

		for (int i = 0; i < 6; i++) {
			executor.submit(new Task(cdl));
		}

		try {
			cdl.await();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("Threads are completed.");
	}
}
