public class Account 
{
 int accno,balance=1000;
 String name;
 public Account(int num,String nme,int bal)
 {
	 accno=num;
	 name=nme;;
	 balance=balance+bal;
	 
 }
 public void credit(int cramt)
 {
	 int credit_amount=cramt;
	 balance=balance+credit_amount;
	 System.out.println("Amount credited");
 }
 public void debit(int dbamt)
 {
	 int debit_amount=dbamt;
	 balance=balance-debit_amount;
	 System.out.println("Amount debited");
	
 }
 public void check_balance()
 {
	 System.out.println("Balance is:"+balance);
 }
 public void display()
 {   
	 System.out.println();
	 System.out.println("Account detials are:");
	 System.out.println("Account num:"+accno+" "+"Holders name:"+name+" "+"Balance:"+balance);
	 System.out.println();
 }
 public static void main(String args[])
 {
	 Account obj1=new Account(11111,"Megha",500);
	 Account obj2=new Account(22222,"Varsha",900);
	 obj1.credit(500);
	 obj1.check_balance();
	 obj1.debit(1000);
	 obj1.check_balance();
	 obj1.display();
}
}
