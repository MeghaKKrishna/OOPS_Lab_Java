//Reading a file
import java.io.*;
public class Fileread
{
public static void main(String[] args)
{
try
{
FileReader fr=new FileReader("newfile.txt");
BufferedReader br=new BufferedReader(fr);
String s="";
while((s=br.readLine())!=null)
{
System.out.println(s);
}
fr.close();
br.close();
}//try
catch(Exception e){}//catch
}
}
