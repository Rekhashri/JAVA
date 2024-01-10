package inheritance.src;

public class main {
  public static void main(String[] args) {

    //access modifiers: public, protected, default(lack of access modifier), private
    
    factory factory1 = new factory();
    factory1.design();
    factory1.build();

    car car1 = new car();
    car1.design();
    car1.build();
    car1.brand();
  }
}
