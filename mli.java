import java.io.*;
class inputs
{
int a,b,c;


void read_numbers() throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("enter 3 integer numbers");
a=Integer.parseInt(br.readLine());
b=Integer.parseInt(br.readLine());
c=Integer.parseInt(br.readLine());
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
largest();
smallest();
int d=max-min;
System.out.println("difference="+d);
}
}
class mlidemo
{
public static void main(String args[]) throws IOException
{
result ob=new result();
ob.display();
}
}
}

