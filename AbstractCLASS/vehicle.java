package AbstractCLASS;

public abstract class vehicle {
  private String engine;

  public String getEngine(){
   return engine;
  }

  public void setEngine(String engine){
    this.engine = engine;
  }

  public abstract void drive();
}
