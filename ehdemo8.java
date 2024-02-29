import java.io.*;
class number_opr
{
 int a=0,b=0,c=0,chk=0;
 void readdata() 
  {
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    try
    {
      System.out.println("Enter 3 integer numbers");
      a=Integer.parseInt(br.readLine());
      b=Integer.parseInt(br.readLine());
      c=Integer.parseInt(br.readLine());
    }
   catch(IOException e)
   {
     System.out.println("problem occured due to IO system");
   }
   catch(NumberFormatException e1)
   {
      System.out.println("input numbers are in incorrect format,not integer so problems");
 

      try
      {
      System.out.println("Enter 3 integer numbers once again");
      a=Integer.parseInt(br.readLine());
      b=Integer.parseInt(br.readLine());
      c=Integer.parseInt(br.readLine());

      }    
    
catch(IOException e2)
   {
     System.out.println("problem occured due to IO system");
   }
  
       

        catch(NumberFormatException e3)
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
class ehdemo8
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