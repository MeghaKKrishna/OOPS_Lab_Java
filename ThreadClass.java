//16. Define 2 classes; one for generating a multiplication table of 5 and other for displaying first N prime numbers. Implement using threads. (Thread class)

import java.util.*;
class Multiplication extends Thread
{
public void run()
{
for(int i=1;i<=10;i++)
{
System.out.println("5 *"+ i +"="+(5*i));
}
}
}

class Prime extends Thread
{
public void run()
{
int i=2,n,j,flag,count=0;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the limit: ");
n=sc.nextInt();
while(count<n)
{
flag=0;
for(j=2;j<i;j++)
{
if(i%j==0)
{
flag=1;
break;
}
}
if(flag==0)
{
count++;
System.out.println(i);
}
i++;
}
}
}

public class ThreadClass
{
public static void main(String[] args)
{
Multiplication m=new Multiplication();
m.start();
Prime p=new Prime();
p.start(); 
}
}
