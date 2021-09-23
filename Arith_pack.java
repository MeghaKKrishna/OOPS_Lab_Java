import Arithmetic.*;
import java.util.*;
public class Arith_pack
{
public static void main(String[] args)
{
int a,b;
Scanner sc=new Scanner(System.in);
System.out.println("Enter first number:");
int x=sc.nextInt();
System.out.println("Enter second number:");
int y=sc.nextInt();
Sum s=new Sum();
Difference d=new Difference();
Product pro=new Product();
Division div=new Division();
System.out.println("The Sum is "+s.add(x,y));
System.out.println("The difference is "+d.sub(x,y));
System.out.println("Product is "+pro.multiply(x,y));
System.out.println("After division: "+div.divide(x,y));
}
}