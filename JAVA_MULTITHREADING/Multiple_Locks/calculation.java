package JAVA_MULTITHREADING.Multiple_Locks;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class calculation {
  private Random random = new Random();
  private Object firstLock = new Object();
	private Object secondLock = new Object();

	private List<Integer> firstList = new ArrayList<Integer>();
	private List<Integer> secondList = new ArrayList<Integer>();

	public void firstCalculation() {

		synchronized (firstLock) {
			try {
				Thread.sleep(1);
			} 
      catch (InterruptedException e) {
				e.printStackTrace();
			}
			firstList.add(random.nextInt(200));
		}

	}

	public void secondCalculation() { 

		synchronized (secondLock) {
			try {
				Thread.sleep(1);
			} 
      catch (InterruptedException e) {
				e.printStackTrace();
			}
			secondList.add(random.nextInt(200));
		}

	}

	public void calculating() {
		for (int i = 0; i < 1000; i++) {
			firstCalculation();
			secondCalculation();
		}

	}

public void main() {
		System.out.println("Started...");

		long started = System.currentTimeMillis();

		Thread thread1 = new Thread(new Runnable() {
			public void run() {
				calculating();
			}
		});

		Thread thread2 = new Thread(new Runnable() {
			public void run() {
				calculating();
			}
		});

		thread1.start();
		thread2.start();

		try {
			thread1.join();
			thread2.join();
		} catch (InterruptedException e) {
		
			e.printStackTrace();
		}

		long ended = System.currentTimeMillis();

		System.out.println("Duration: " + (ended - started));
		System.out.println("First List: " + firstList.size() + "; Second List: " + secondList.size());
	}
}


