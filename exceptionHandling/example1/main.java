package exceptionHandling.example1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class main {
  public static void main(String[] args) throws FileNotFoundException {
    File file = new File("Example.txt");
    Scanner readFile = new Scanner(file);
  }
  
}
