import java.util.*;
interface area
{
   void area();
   void perimeter();
}
class circle implements area{
   float r;
   circle(float rad){
          r=rad;  
   }
   public void area(){  
          System.out.println("Area of circle is " +3.14*r*r);
   }  
   public void perimeter(){
          System.out.println("Perimeter of circle is :   " +2*3.14*r);
   }
    
}
class rectangle implements area{ 
  int l;
  int w;
  rectangle(int len,int wid){
           l=len;
           w=wid;
  }
  public void area(){
           System.out.println("Area of rectangle is " +(l*w));
  }
  public void perimeter(){
           System.out.println("Perimeter of rectangle is " +(2*(l+w)));
  }
}
public class Area_Perimeter{
          public static void main(String[] args){
               Scanner sc=new Scanner(System.in);
               int ch,n,n1;
               do
               {
               System.out.println("Enter your choice:\n1.Rectangle\n2.Circle\n3.Exit");
               ch=sc.nextInt();
               switch(ch){
                     case 1:
                          
                          System.out.println("Enter the length:");
                          int l=sc.nextInt();
                          sc.nextLine();
                          System.out.println("Enter the width:");
                          int w=sc.nextInt();
                          sc.nextLine();
                          rectangle r1=new rectangle(l,w);
                          do{
                          System.out.println("\n1.Area\n2.Perimeter\n3.Exit");
                          n=sc.nextInt();
                          switch(n){
                                 case 1:
                                    r1.area();
                                    break;
                                 case 2:
                                    r1.perimeter();
                                    break;
                                 case 3:
                                    System.out.println("Exit from rectangle:");
                                    break;
                                  default:
                                    System.out.println("Enter a valied choice");
                          }
                          }while(n!=3);
                          break;
     
                    case 2:
                          System.out.println("Enter the radius:");
                          float r=sc.nextFloat();
                          circle c=new circle(r);
                          do{        
                          System.out.println("\n1.Area\n2.Perimeter\n3.Exit");
                          n1=sc.nextInt();
                          switch(n1){
                                 case 1:
                                    c.area();
                                    break;
                                 case 2:
                                    c.perimeter();
                                    break;
                                 case 3:
                                    System.out.println("Exit from circle:");
                                    break;
                                  default:
                                    System.out.println("Enter a valied choice");
                          }
                          }while(n1!=3);
                          break;
                    case 3:
                           System.out.println("Exit");
                           break;
                    default:
                    System.out.println("Enter a valied choice");

                   
               }
            }while(ch!=3); 
          }
}