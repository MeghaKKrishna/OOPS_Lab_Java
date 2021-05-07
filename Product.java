class Product
{
 public static void main(String args[])
 {
	 Productdetails obj1=new Productdetails(1,"abc",500);
	 Productdetails obj2=new Productdetails(2,"pqr",1000);
	 Productdetails obj3=new Productdetails(3,"xyz",1500);
	 System.out.println("The Product details are:");
	 obj1.display();
	 obj2.display();
	 obj3.display();
	 if(obj1.price>obj2.price && obj1.price>obj3.price)
	 {
		 System.out.println("Product 1 has the highest price");
	 }
	 else if(obj2.price>obj3.price)
	 {
		System.out.println("Product 2 has the highest price"); 
	 }
	 else
	 {
		 System.out.println("Product 3 has the highest price");
	 }
	 
 }
}
class Productdetails
{
 int pcode,price;
 String pname;
 public Productdetails(int c,String n,int p)
 {
	 pcode=c;
	 pname=n;
	 price=p;
 }
 public int price()
 {
	 return price;
 }
 public void display()
 {
	 System.out.println("Product Name:"+pname);
	 System.out.println("Product Code:"+pcode);
	 System.out.println("Price:"+price);
 }
}