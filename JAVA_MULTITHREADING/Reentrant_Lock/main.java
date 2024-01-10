package JAVA_MULTITHREADING.Reentrant_Lock;

public class main {
  public static void main(String[] args) throws Exception {

		final ReentrantLocksExample rl = new ReentrantLocksExample();

		Thread thread1 = new Thread(new Runnable() {
			public void run() {
				try {
					rl.threadOne();
				} 
        catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});

		Thread thread2 = new Thread(new Runnable() {
			public void run() {
				try {
					rl.threadTwo();
				} 
        catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});

		thread1.start();
		thread2.start();

		thread1.join();
		thread2.join();

		rl.finished();
	}
}


