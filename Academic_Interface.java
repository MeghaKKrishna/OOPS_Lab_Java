interface Student
{
    String name="Megha";
    String Dept="Computer Application";
    void disp();
}
interface Sports
{
    String item="Basket Ball";
    int score=50;
    void disp();
}
class Result implements Student,Sports
{
    public void disp()
    {
        System.out.println("Name is "+name);
        System.out.println("Department is "+Dept);
        System.out.println("Sports item is "+item);
        System.out.println("Sports score is "+score);
    }
}
public class Academic_Interface
{
    public static void main(String[] args)
    {
        Result obj=new Result();
        obj.disp();
    }
}