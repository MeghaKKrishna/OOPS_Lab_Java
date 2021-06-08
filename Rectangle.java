public class Rectangle
{
     double length,width,area;
     String color;
		public Rectangle(double l,double w,String c)
		{
			length=l;
			width=w;
			color=c;	
		}
		public double area()
		{
			area=length*width;
			return area;
		}

	public static void main(String[] args) 
	{
        Rectangle obj1=new Rectangle(3,4,"Red");
        Rectangle obj2=new Rectangle(4,2,"Red");
        if(obj1.color==obj2.color && obj1.area()==obj2.area())
        {
        	System.out.println("Matching rectangles");
        }
        else
        {
        	System.out.println("Non Matching rectangles");
        }

	}

}