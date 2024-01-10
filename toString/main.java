package toString;

class employee{
  private int id;
  private String Name;

  public employee(int id, String Name){
    this.id = id;
    this.Name = Name;

  }
  public String toString(){
    return ("ID: " + id + " - " + "Name: " + Name);
}
}
public class main {
  public static void main(String[] args) {

    employee employee1 = new employee(101, "Shristi");
    employee employee2 = new employee(102, "Vijay");

    System.out.println(employee1);
    System.out.println(employee2);

  }
}
