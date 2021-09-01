
import java.util.*;
class overload
{
    float area(float l,float  b)
    {
        return(l*b);
    }
    double area(double r)
    {
        return(3.14*r*r);
    }
    float area(float s)
    {
        return(s*s);
    }
}
class Method_Overloading
{
	public static void main(String[] args) 
	{
	    overload obj=new overload();
	    Scanner ar=new Scanner(System.in);
		System.out.println("Enter the length of rectangle:");
		float l=ar.nextFloat();
		System.out.println("Enter the breadth of rectangle:");
		float b=ar.nextFloat();
		System.out.println("The area of rectangle is:"+obj.area(l,b));
		
		System.out.println("Enter the radius of circle:");
		double r=ar.nextDouble();
		System.out.println("The area of circle is:"+obj.area(r));
		
		System.out.println("Enter the side of square:");
		float s=ar.nextFloat();
		System.out.println("The area of square is:"+obj.area(s));
	}
}

