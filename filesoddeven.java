//Enter odd and even in seperate files
import java.io.*;
public class filesoddeven
{
public static void main(String[] args)
{
try
{
FileReader fr=new FileReader("numbers.txt");
BufferedReader br=new BufferedReader(fr);
FileWriter fw1=new FileWriter("even.txt");
BufferedWriter bw1=new BufferedWriter(fw1);
FileWriter fw2=new FileWriter("odd.txt");
BufferedWriter bw2=new BufferedWriter(fw2);
String s="";
int a=0;
while((s=br.readLine())!=null)
{
a=Integer.parseInt(s);
System.out.println(a);
if(a%2==0)
{
bw1.write(Integer.toString(a));
bw1.newLine();
bw1.flush();
}
else
{
bw2.write(Integer.toString(a));
bw2.newLine();
bw2.flush();
}
}
bw1.close();
bw2.close();
fw1.close();
fw2.close();
br.close();
fr.close();
}//try
catch(Exception e)
{
System.out.println(e);
}//catch
}
}

