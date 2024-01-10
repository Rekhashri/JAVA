package EqualMethod;

class Laptop{
  private int id;
  private String Brand;

  public Laptop(int id, String Brand){
    this.id = id;
    this.Brand = Brand;

  }
  public String toString(){
    return ("ID: " + id + " - " + "Name: " + Brand);
}

  public int hashCode(){
    final int prime = 31;
    int result = 1;
    result = prime * result + ((Brand == null) ? 0: Brand.hashCode());
    result = prime * result + id;
    return result;
  }
    public boolean equals(Object obj){
      if (this == obj)
         return true;
      if(obj == null)
          return false; 
      if (getClass() != obj.getClass())
			    return false;

		Laptop other = (Laptop) obj;
		if (Brand == null) 
    {
			if (other.Brand != null)
				return false;
		} 
    else if (!Brand.equals(other.Brand))
			return false;
		if (id != other.id)
			return false;
		return true;  
    }
  }

public class main {
  public static void main(String[] args) {

    Laptop laptop1 = new Laptop(221, "Hp");
    Laptop laptop2 = new Laptop(221, "Hp");

    System.out.println(laptop1.equals(laptop2));

    int Firstnumber = 5;
    int Secondnumber = 5;
    System.out.println(Firstnumber == Secondnumber);

    String a = "Yes";
    String b = "Yesopss".substring(0,3);
    System.out.println(a.equals(b));
    System.out.println(b);
  }
}
