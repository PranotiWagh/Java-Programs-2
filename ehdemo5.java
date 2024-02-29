import java.util.*;
class ehdemo5
{
  public static void main(String args[])
    {
      Scanner s=new Scanner(System.in);
      int n=0,chk=0,n1;
      try
      {
        System.out.println("enter one number");
        n=s.nextInt();
      }
      catch(InputMismatchException e1)
      {
        System.out.println("input numbers are not integer");
        Scanner s1=new Scanner(System.in);
        try
        {
           System.out.println("\n\n once again enter integer numbers");
           n1=s1.nextInt();
        }
        catch(InputMismatchException e2)
        {
          chk=1;
          System.out.println("you again enter wrong input");
        }
      }
      if(chk==0)
      {
        if(n%2==0)
          System.out.println("number is even");
        else
          System.out.println("number is odd");
      }
   }
}