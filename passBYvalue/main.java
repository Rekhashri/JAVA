package passBYvalue;

public class main {
  public static void main(String[] args) {

    main main1 = new main();
    // Passing primitive types
    int number = 10;
    System.out.println("1: Number = "+number);

    main1.display(number);
    System.out.println("4: Number = "+number);

    //Passing non-primitive types
    System.out.println();
    Cat cat = new Cat("Bilu");
    System.out.println("1: "+cat);

    main1.display(cat);
    System.out.println("4: "+cat);
  }

  public void display(int number){
    System.out.println("2: Number = "+number);
    number = 15;
    System.out.println("3: Number = "+number);
  }

  public void display(Cat cat){
   System.out.println("2: "+cat);
   
   cat.setName("johhnny");
   cat = new Cat("Sunshine");
   System.out.println("3: "+cat);
  }
}
