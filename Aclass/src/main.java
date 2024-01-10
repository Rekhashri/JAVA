package Aclass.src;

class computer{
    public void shutDown(){
      System.out.println("Computer is shutting down");
    }
  }
  
  interface phone {
    public void call();
  }
  
  public class main {
    public static void main(String[] args) {
      {
        computer computer1 = new computer(){
          public void shutDown(){
            System.out.println("MacBook is shutting down");
          }
        };
        computer1.shutDown();
  
        phone phone1 = new phone(){
          public void call(){
            System.out.println("calling...");
          }
        };
        phone1.call();
      }
  
    }
  }
  

