import java.io.*;
class inputs
{
int a,b,c;
int chk;
void read_numbers()
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
chk=0;
try
{
System.out.println("enter 3 integer numbers");
a=Integer.parseInt(br.readLine());
b=Integer.parseInt(br.readLine());
c=Integer.parseInt(br.readLine());
}

catch(IOException e1)
{
System.out.println("problem due to ip op devices");
chk=1;
}

catch(NumberFormatException e2)
{
System.out.println("ip are not in integer format");
chk=1;
}
}

class findings extends inputs
{
int min,max;

void largest()
{
if(a>b && a>c)
max=a;
else if(b>c)
max=b;
else 
max=c;
System.out.println("largest no="+max);
}


void smallest()
{
if(a<b && a<c)
min=a;
else if(b<c)
min=b;
else 
min=c;
System.out.println("smallest no="+min);
}
}
class result extends findings
{
void display()
{
read_numbers();
if(chk==0)
{
largest();
smallest();
int d=max-min;
System.out.println("difference="+d);
}
}
}
class mlidemo
{
public static void main(String args[])
{
result ob=new result();
ob.display();
}
}


