// To copy a file from one to another
import java.io.*;
public class filescopy
{
public static void main(String[] args)
{
try
{
FileReader fr=new FileReader("file.txt");
BufferedReader br=new BufferedReader(fr);
String s="";
FileWriter fw=new FileWriter("file2.txt");
BufferedWriter bw=new BufferedWriter(fw);
while((s=br.readLine())!=null)
{
System.out.println(s);
bw.write(s);
bw.newLine();
bw.flush();
}
}//try
catch(Exception e)
{
}//catch
}
}
