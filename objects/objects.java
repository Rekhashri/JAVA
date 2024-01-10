class Methods{
  String animal;
  int value;
  int month;

  void run() {
    System.out.println("Running");
    System.out.println(" My " + animal + " is " + value + " years old.");
  }

  int calculateMonthsToBirthday(){
    int monthsleft = 12 - month;
    return monthsleft;
  }

  void talk(String text){
    System.out.println(text);
  }

  void walk(int speed){
    System.out.println("Walking " + speed + " km per hour ");
  }
  
  void timer(int minutes, double seconds){
    System.out.println("It took "+ minutes + " and " + seconds + " to get down the hill");
  }
}

public class objects {
  public static void main(String[] args) {
    Methods name = new Methods();
    name.animal = "Cat";
    name.value = 9;
    //name.run();
    name.month = 8;
    int months = name.calculateMonthsToBirthday();
    name.talk("Hi, I am shristi!");
    name.walk(7);
    name.timer(9,3.6);

    System.out.println("Months util birthday "+ months);
  }
}
