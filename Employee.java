public class Employee
{
	int empid,salary;
	String name;
	public void read(int id,String nme,int sal)
	{
		empid=id;
		name=nme;
		salary=12*sal;
	}
   public void display()
   {
	   System.out.println("Employee Id:"+empid+" ,"+"Name of Employee:"+name+" ,"+"Yearly Salary:"+salary);
	   System.out.println();
	   
   }
   public static void main(String args[])
   {
	  Employee obj1=new Employee();
	  Employee obj2=new Employee();
	  obj1.read(1,"Megha",20000 );
	  obj2.read(2,"Anil",15000 );
	  obj1.display();
	  obj2.display();
   }
}