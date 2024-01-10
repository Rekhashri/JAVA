package JAVA_MULTITHREADING.Synchronized_Keyword;

public class main {
  private int number = 0;
  private synchronized void numberIncrementation() {
     number++;
  }
  public static void main(String[] args) {
    
    main app = new main();
    app.multiThreads();
  }

  public void multiThreads() {
    Thread firstThread = new Thread(new Runnable() {
      public void run() {
        for(int n=0; n<20000; n++) {
          numberIncrementation();
        }
      }
    });

    Thread secondThread = new Thread(new Runnable() {
      public void run() {
        for(int n=0; n<20000; n++) {
          numberIncrementation();
        }
      }
    });

    firstThread.start();
    secondThread.start();

    try {
      firstThread.join();
      secondThread.join();
    }
    catch (InterruptedException e) {
      e.printStackTrace();
    }
  System.out.println("Number is : " + number);
  }

}
