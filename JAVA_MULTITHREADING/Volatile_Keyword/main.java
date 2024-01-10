package JAVA_MULTITHREADING.Volatile_Keyword;

import java.util.Scanner;

class engine extends Thread {

  private volatile boolean on = true;

    public void run() {
      while(on) {
        System.out.println("The engine is on...");
        try{
          Thread.sleep(100);
        }
        catch (InterruptedException e) {
          e.printStackTrace();
        }
      }
    }

  public void off() {
     on = false;
  }
}

public class main {
  public static void main(String[] args) {
    
    engine en1 = new engine();
    en1.start();

    System.out.println("Press enter to stop...");
    Scanner scanner = new Scanner(System.in);
    scanner.nextLine();

    en1.off();
  }
}
