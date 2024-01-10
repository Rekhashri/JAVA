package INNERclass;

public class machine {
  private int id;

  class AI {
    public void activate(){
      System.out.println("Machine "+ id + " is activated.");
    }
  }

  static class tire{
    public void repair(){
      System.out.println("Tires are repaired" );
    }
  }

  public machine(int id){
    this.id = id;
  }

  public void run(){
    System.out.println("Run machine"+ " " + id);
    AI ai = new AI();
    ai.activate();

    final String type = "Electric";

    class test{
      public void example(){

        System.out.println("id is "+ id);
        System.out.println("type is"+ type);
      }
    }
    test test1 = new test();
    test1.example();
  }
}
