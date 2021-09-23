//To write into a file
import java.io.*;
import java.util.*;
public class filewrite
{  
  public static void main(String args[])
   {
   try{
    FileWriter fw =new FileWriter("newfile.txt");
    BufferedWriter bw=new BufferedWriter(fw);
    Scanner sc=new Scanner(System.in);
    String s="";
    System.out.println("Enter the string data");
    while(!s.equals("exit"))
   {
     s=sc.nextLine();
     bw.write(s);
     bw.newLine();
     bw.flush();
    }
    fw.close();
    bw.close();
   
  }//try
  catch(Exception e){}
}
}
