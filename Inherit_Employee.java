class Employee
{
    int EmpId;
    String name;
    int salary;
    String address;
    Employee(int eno,String nm,int sal,String ad)
    {
        EmpId=eno;
        name=nm;
        salary=sal;
        address=ad;
    }
    void disp()
    {
        System.out.println(EmpId+" "+name+" "+salary+" "+address);
    }
}
class Teacher extends Employee
{
    String Dept;
    String Sub;
    Teacher(int eno,String nm,int sal,String ad,String dpt,String sjt)
    {
        super(eno,nm,sal,ad);
        Dept=dpt;
        Sub=sjt;
    }
    void disp()
    {
        super.disp();
        System.out.println(Dept+" "+Sub);
    }
}
class Inherit_Employee
{
    public static void main(String[] args)
    {
        Teacher t[]=new Teacher[3];
        t[0]=new Teacher(1,"abc",20000,"Tvm","MCA","java");
		t[1]=new Teacher(2,"xyz",25000,"Klm","CS","dbms");
		t[2]=new Teacher(3,"pqr",30000,"Ekm","Mtech","java");
		System.out.println("Details of Employees");
		for(Teacher i:t)
		{
        i.disp();
		}
    }
}