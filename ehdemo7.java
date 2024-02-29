import java.util.*;
class number_opr
{
 int a,b,c,chk=0;
 void readdata() 
  {
    Scanner s=new Scanner(System.in);
    try
    {
      System.out.println("Enter 3 integer numbers");
      a=s.nextInt();
      b=s.nextInt();
      c=s.nextInt();
    }
   catch(InputMismatchException e1)
   {

      System.out.println("input numbers are in incorrect format,not integer so problems");
      Scanner s1=new Scanner(System.in);

      try
      {
         System.out.println("enter 3 integer numbers once again");
         a=s1.nextInt();
         b=s1.nextInt();
         c=s1.nextInt();
      }
        catch(InputMismatchException e2)
        {
        
           System.out.println("you again enter wrong input so problem");
           chk=1;
        }
   }
}

void largest()
{
  if(a>b && a>c)
    System.out.println("Largest number="+a);
  else if(b>a &&b>c)
   System.out.println("Largest number="+b);
  else if(c>a && c>b)
    System.out.println("Largest number="+c);
  else
  System.out.println("All 3 input numbers are equal,no one is largest");
}

void smallest()
{
  if(a<b && a<c)
   System.out.println("Smallest number="+a);
else if(b<a &&b<c)
  System.out.println("Smallest number="+b);
else if(c<a && c<b)
  System.out.println("Smallest number="+c);
else
  System.out.println("All 3 input numbers are equal,no one is smallest");
}
} 
class ehdemo7
{
public static void main(String args[])
{
number_opr ob=new number_opr();
ob.readdata();
if(ob.chk==0)
{
ob.largest();
ob.smallest();
}
}
}