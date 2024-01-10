package JAVA_MULTITHREADING.Starting_thread;

class StartThreads extends Thread{

  public void run() {
    for(int n=0; n<8; n++) {
      System.out.println("Hi there! " + n);
      try {
        Thread.sleep(200);
      }
      catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
  }
}

public class main1 {
  public static void main(String[] args) {
    
    StartThreads thread1 = new StartThreads();
    thread1.start();

    StartThreads thread2 = new StartThreads();
    thread2.start();
  }
}
