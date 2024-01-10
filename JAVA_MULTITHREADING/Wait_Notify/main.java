package JAVA_MULTITHREADING.Wait_Notify;

public class main {
  public static void main(String[] args) throws InterruptedException {

		final Engine engine = new Engine();

		Thread thread1 = new Thread(new Runnable() {
			public void run() {
				try {
					engine.releaseEnergy();
				} 
        catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});

		Thread thread2 = new Thread(new Runnable() {
			public void run() {
				try {
					engine.consumeFuel();
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
	}
}
