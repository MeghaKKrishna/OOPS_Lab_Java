//Creating a new file
import java.io.*;
public class filepgm
{  
  public static void main(String args[])
   { 
      try{
      File f1=new File("newfile.txt");
      if(f1.createNewFile())
      { 
         System.out.println("File created"+f1.getName()); 
       }
      else
       { 
          System.out.println("File already exists");
        }
       }//try
     catch(Exception e){}
      
    }
}
