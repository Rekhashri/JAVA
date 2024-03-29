package JAVA_MULTITHREADING.Starting_thread;

class StartThreads implements Runnable{
  
  public void run() {
    for(int n=0; n<8; n++) {
      System.out.println("Hi there! "+ n);
      try {
        Thread.sleep(200);
      }
      catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
  }
}

public class main2 {
  public static void main(String[] args) {
     
    Thread thread1 = new Thread(new StartThreads());
    Thread thread2 = new Thread(new StartThreads());

    thread1.start();
    thread2.start();
  }
}
