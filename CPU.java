public class CPU
{
	int price;
	class Processor
	{
		int no_cores=10;
		String manufacturer="abc";
		public void display()
		{
			System.out.println("Processor information:");
			System.out.println("Number of cores:"+no_cores );
			System.out.println("Manufacturer:"+ manufacturer);
		}
	}
	static class RAM
	{
		int memory=4;
	    String manufacturer="cd";
		public void display()
		{
			System.out.println();
			System.out.println("RAM information:");
			System.out.println("Memory:"+memory );
			System.out.println("Manufacturer:"+ manufacturer);
			
		}
	}

	public static void main(String[] args) 
	{
		CPU obj=new CPU();
	    CPU.Processor obj1=obj.new Processor();
	    obj1.display();
	    CPU.RAM obj2=new CPU.RAM();
	    obj2.display();

	}

}