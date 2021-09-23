import java.util.*;
public class AvgExp
{
public static void main(String[] args)
{
int n,i,l,a=0,s=0;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the limit: ");
n=sc.nextInt();
for(i=0;i<n;i++)
{
System.out.println("Enter the digits: ");
l=sc.nextInt();
try
{
if(l<0)
{
n++;
throw new Exception("Negative numbers not allowed!!!");
}
else
{
s+=l;
}
}
catch(Exception e)
{
System.out.println(e);
}
}
a=s/n;
System.out.println("The Average is "+a);
}
}


