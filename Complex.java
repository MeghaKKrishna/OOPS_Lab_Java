public class Complex 
{
	int real,imaginary;
	int complex_sum=0,image_sum=0;
	public Complex(int r,int i)
	{
		real=r;
		imaginary=i;	
	}
	public void display()
	{
       System.out.println(real+"+"+imaginary+"i"); 
	}

	public static void main(String args[])
	{
		Complex obj1=new Complex(2,4);
		Complex obj2=new Complex(3,2);
		System.out.print("First Complex number: ");
		obj1.display();
		System.out.print("Second Complex number: ");
		obj2.display();
		
		System.out.println("Sum is:"+(obj1.real+obj2.real)+"+"+(obj1.imaginary+obj2.imaginary)+"i ");
		
	}
}