import java.io.*;
class Checks
{
public static void main(String args[])
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int a;
try
{
System.out.println("enter one integer number");
a=s.nextInt();
Checkings c=new Checkings();
c.check_oe(a);
c.check_pnz(a);
c.check_leapyear(a);
}

catch(IOException e1)
{
System.out.println("io device problem");
}

catch(NumberFormatException e2)
{
System.out.println("invalid integer number");
}

}
}

class Checkings
{
void checl_oe(int n)
{
if(n%2==0)
 System.out.println("even number");
else
 System.out.println("odd number");
}

void check_pnz(int n) 
{
if(n>0)
 System.out.println("positive number");
else if(n<0)
 System.out.println("negative number");
else
 System.out.println("number is zero");
}

void check_leapyear(int y)
{
if((n%4==0 && n%100!=0)or(n%4==400==0))
 System.out.println("leap year");
else 
 System.out.println("not a leap year");
}
}


