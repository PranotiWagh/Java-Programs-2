import java.util.*;
class AROP
{
  public static void main(String args[])
    {
      Scanner s=new Scanner(System.in);
      System.out.println("Enter two numbers");
      ArathmaticOperation ao = new ArathmaticOperation();
      ao.n1=s.nextInt();
      ao.n2=s.nextInt();
      ao.addition();
      ao.substraction();
      ao.multiplication();
      ao.division();
    }
}
class ArathmaticOperation
{
  int n1,n2;
  
void addition()
  {
    int a;
    a=n1+n2;
    System.out.println("Addition="+a);
  }
void substraction()
  {
    int s;
    s=n1-n2;
    System.out.println("Substraction=="+s);
  }
void multiplication()
  {
    int m;
    m=n1*n2;
    System.out.println("Multiplication="+m);
  }
void division()
  {
    int d;
    d=n1%n2;
    System.out.println("Division="+d);
  }
}
  