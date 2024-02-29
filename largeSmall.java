import java.util.*;
class largeSmall
{
public static void main(String args[])
{
int n1=0,n2=0,n3=0;
Scanner s=new Scanner(System.in);
try
{
System.out.println("enter three numbers");
n1=s.nextInt();
n2=s.nextInt();
n3=s.nextInt();
if(n1==o)
throw new ArithmaticException();
else
{

MyResult ob=new MyResult();
int big,sm;
big=ob.largest(n1,n2,n3);
sm=ob.smallest(n1,n2,n3);
System.out.println("largest no="+big);
System.out.println("Smallest no="+sm);
}
}
catch(InputMismatchException e)
{
System.out.println("invalid ip");
}

}

}

class MyResult
{
int largest(int a,int b,int c)
{
int max;
if(a>b && a>c)
max=a;
else if(b>c)
max=b;
else 
max=c;
return(max);
}

int smallest(int x,int y,int z)
{
int min;
if(x<y && x<z)
min=x;
else if(y<z)
min=y;
else 
min=z;
return(min);
}
}