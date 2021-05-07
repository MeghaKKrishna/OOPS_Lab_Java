public class Student
 {
	int rollno,mark1,mark2,mark3;
	String name;
    public Student(String nme,int rn,int m1,int m2,int m3)
    {
    	rollno=rn;
        name=nme;
        mark1=m1;
        mark2=m2;
        mark3=m3;
        
    }
    public int total_mark()
    {
    	int total=0;
    	total=mark1+mark2+mark3;
    	return total;
    }
 
	public static void main(String[] args) 
    {
		Student obj1=new Student("Megha",01,46,47,48);
		Student obj2=new Student("Kavitha",02,40,39,36);
		Student obj3=new Student("Varsha",03,47,38,40);
        if(obj1.total_mark()>obj2.total_mark())
        {
        	System.out.println(obj1.name+" has the highest score with the total score "+obj1.total_mark());
        }
        else if(obj2.total_mark()>obj3.total_mark())
        {
        	System.out.println(obj2.name+" has the highest score with the total score "+obj2.total_mark());
        }
        else
        {
        	System.out.println(obj3.name+" has the highest score with the total score "+obj3.total_mark());
        }
        
    }
}