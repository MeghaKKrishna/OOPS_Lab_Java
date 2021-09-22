import Graphics.*;
import java.util.*;
public class Graphics_pack implements Square,Triangle
{
public int area_sq(int s)
{
return (s*s);
}
public double area_tri(int base,int h)
{
return (0.5*base*h);
}
public static void main(String[] args)
{
int choice;
int l,b,base,h,s;
double r;

System.out.println("----------MENU----------");
System.out.println("1.Rectangle\n2.Triangle\n3.Square\n4.Circle\n5.Exit");

Graphics_pack obj=new Graphics_pack();
Scanner sc=new Scanner(System.in);

System.out.println("Enter your choice:");
choice=sc.nextInt();

switch(choice)
{
case 1:
Rectangle rec=new Rectangle();
System.out.println("Enter the length:"); 
l=sc.nextInt();
System.out.println("Enter the breadth");
b=sc.nextInt();
System.out.println("Area of Rectangle is "+rec.area(l,b));
break;

case 2:
System.out.println("Enter the base:");
base=sc.nextInt();
System.out.println("Enter the height:");
h=sc.nextInt();
System.out.println("Area of Triangle is "+obj.area_tri(base,h));
break;  

case 3:
System.out.println("Enter the side:");
s=sc.nextInt();
System.out.println("Area of Square is "+obj.area_sq(s));
break;  

case 4:
Circle cir=new Circle();
System.out.println("Enter the radius: ");
r=sc.nextDouble();
System.out.println("Area of Circle is "+cir.area(r));
break;

case 5:
System.exit(0);
break;

default:
System.out.println("Invalid Entry!!!");
}
}
}
