package MultipleEXCEPTION;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;

public class main {
  public static void main(String[] args) {

    MultipleException me = new MultipleException();

   /*  try{
      me.start();
    } 
    catch(IOException e){
      e.printStackTrace();
    }
    catch( ParseException e){
     System.out.println("Incorrect Format");
    }
*/
    /*try{
     me.start();
    } catch (IOException | ParseException e){
      e.printStackTrace();
    }
*/
 
   try{
    me.start();
   } catch( Exception e){
    e.printStackTrace();
   }
   
   try{
    me.example();
   } catch (FileNotFoundException e){
    e.printStackTrace();
   } catch (IOException e){
    e.printStackTrace();
   }

  }
}
