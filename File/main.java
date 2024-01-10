package File;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class main {
  public static void main(String[] args) throws FileNotFoundException {

    String myFile = "/Users/shristipandit/Desktop/JAVA/File/text";

    File file = new File(myFile);
    Scanner text = new Scanner(file);

    int value = text.nextInt();
    System.out.println("Value is: "+value);

    while(text.hasNextLine()){
      String line = text.nextLine();
      System.out.println(line);
    }




  }
}
