import java.io.*;
class Operations_Codes
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

void AO()
{
double n1=0,n2=0,a,s,m,d,chk1=0;
try
{
System.out.println("\n\n Enter two decimal numbers");
n1=Double.parseDouble(br.readLine());
n2=Double.parseDouble(br.readLine());
}
catch(IOException e3)
{
System.out.println("\n\n Problems are occured due to input/output devices,system");
chk1=1;
}
catch(NumberFormatException e4)
{
System.out.println("\n\nYou do not enter integer number in correct format,so problem.");
System.out.println("Please, reenter the input integer number in correct format");
try
{
System.out.println("\n\nOnce again,Enter one integer number");
n1=Double.parseDouble(br.readLine());
n2=Double.parseDouble(br.readLine());
}
catch(IOException e5)
{
System.out.println("\n\n Problems are occured due to input/output devices,system");
chk1=1;
}
catch(NumberFormatException e6)
{
System.out.println("\n\nYou again enter wrong input,so problem.");
chk1=1;
}
}
if(chk1==0)
{
a=n1+n2;
s=n1-n2;
m=n1*n2;
d=n1/n2;
System.out.println("Add="+a);
System.out.println("Sub="+s);
System.out.println("Mul="+m);
System.out.println("Div="+d);
}
}

void Rectangle()
{
double l=0,b=0,a1,p,chk2=0;
try
{
System.out.println("\n\n Enter length and breadth");
l=Double.parseDouble(br.readLine());
b=Double.parseDouble(br.readLine());
}
catch(IOException e7)
{
System.out.println("\n\n Problems are occured due to input/output devices,system");
chk2=1;
}
catch(NumberFormatException e8)
{
System.out.println("\n\nYou do not enter double number in correct format,so problem.");
System.out.println("Please, reenter the input double number in correct format");
try
{
System.out.println("\n\nOnce again,Enter length and breadth");
l=Double.parseDouble(br.readLine());
b=Double.parseDouble(br.readLine());
}
catch(IOException e9)
{
System.out.println("\n\n Problems are occured due to input/output devices,system");
chk2=1;
}
catch(NumberFormatException e10)
{
System.out.println("\n\nYou again enter wrong input,so problem.");
chk2=1;
}
}
if(chk2==0)
{
a1=l*b;
p=2*(l+b);
System.out.println("Area="+a1);
System.out.println("Perimeter="+p);
}

} 

void Circle()
{
double r=0,a2,c,chk3=0;
try
{
System.out.println("\n\n Enter radius");
r=Double.parseDouble(br.readLine());

}
catch(IOException e11)
{
System.out.println("\n\n Problems are occured due to input/output devices,system");
chk3=1;
}
catch(NumberFormatException e12)
{
System.out.println("\n\nYou do not enter double number in correct format,so problem.");
System.out.println("Please, reenter the input double number in correct format");
try
{
System.out.println("\n\nOnce again,Enter r");
r=Double.parseDouble(br.readLine());
}
catch(IOException e13)
{
System.out.println("\n\n Problems are occured due to input/output devices,system");
chk3=1;
}
catch(NumberFormatException e14)
{
System.out.println("\n\nYou again enter wrong input,so problem.");
chk3=1;
}
}
if(chk3==0)
{
a2=3.14*r*r;
c=2*3.14*r;
System.out.println("Area="+a2);
System.out.println("Cir="+c);
}
}

void RAT()
{
double b1=0,h=0,a3,d1,chk4=0;
try
{
System.out.println("\n\n Enter b and h");
b1=Double.parseDouble(br.readLine());
h=Double.parseDouble(br.readLine());
}
catch(IOException e15)
{
System.out.println("\n\n Problems are occured due to input/output devices,system");
chk4=1;
}
catch(NumberFormatException e16)
{
System.out.println("\n\nYou do not enter double number in correct format,so problem.");
System.out.println("Please, reenter the input double number in correct format");
try
{
System.out.println("\n\nOnce again,Enter b and hinteger number");
b1=Double.parseDouble(br.readLine());
h=Double.parseDouble(br.readLine());
}
catch(IOException e17)
{
System.out.println("\n\n Problems are occured due to input/output devices,system");
chk4=1;
}
catch(NumberFormatException e18)
{
System.out.println("\n\nYou again enter wrong input,so problem.");
chk4=1;
}
}
if(chk4==0)
{
a3=(float)1/2*b1*h;
d1=Math.pow(b1*b1+h*h,0.5);
System.out.println("Area="+a3);
System.out.println("diagonal="+d1);
}
}

void Cylinder()
{
double r1=0,h1=0,v,sa,chk5=0;
try
{
System.out.println("\n\n Enter two r1 and h1");
r1=Double.parseDouble(br.readLine());
h1=Double.parseDouble(br.readLine());
}
catch(IOException e19)
{
System.out.println("\n\n Problems are occured due to input/output devices,system");
chk5=1;
}
catch(NumberFormatException e20)
{
System.out.println("\n\nYou do not enter double number in correct format,so problem.");
System.out.println("Please, reenter the input double number in correct format");
try
{
System.out.println("\n\nOnce again,Enter r1 and h1");
r1=Double.parseDouble(br.readLine());
h1=Double.parseDouble(br.readLine());
}
catch(IOException e21)
{
System.out.println("\n\n Problems are occured due to input/output devices,system");
chk5=1;
}
catch(NumberFormatException e22)
{
System.out.println("\n\nYou again enter wrong input,so problem.");
chk5=1;
}
}
if(chk5==0)
{
v=3.14*r1*r1*h1;
sa=2*3.14*r1*h1+2*3.14*r1;
System.out.println("volume="+v);
System.out.println("Surface area="+sa);
}
}

void sc()
{
double P=0,N=0,R=0,SI,CI,chk6=0;
try
{
System.out.println("\n\n Enter P R N");
P=Double.parseDouble(br.readLine());
N=Double.parseDouble(br.readLine());
R=Double.parseDouble(br.readLine());

}
catch(IOException e21)
{
System.out.println("\n\n Problems are occured due to input/output devices,system");
chk6=1;
}
catch(NumberFormatException e22)
{
System.out.println("\n\nYou do not enter double number in correct format,so problem.");
System.out.println("Please, reenter the input double number in correct format");
try
{
System.out.println("\n\nOnce again,Enter values of P,N,R number");
P=Double.parseDouble(br.readLine());
N=Double.parseDouble(br.readLine());
R=Double.parseDouble(br.readLine());
}
catch(IOException e23)
{
System.out.println("\n\n Problems are occured due to input/output devices,system");
chk6=1;
}
catch(NumberFormatException e24)
{
System.out.println("\n\nYou again enter wrong input,so problem.");
chk6=1;
}
}
if(chk6==0)
{
SI=P*N*R/100;
CI=P*Math.pow(1+R/100,N);
System.out.println("SI="+SI);
System.out.println("CI="+CI);
}

}


void menu()
{
int ch=0,chk=0;
String x;
do
{
System.out.println("\n\n---------------------------------------------------------------------------------------------");
System.out.println("Menu Driven Program-Operations");
System.out.println("\n\n---------------------------------------------------------------------------------------------");
System.out.println("1. Arithmatic Operations");
System.out.println("2. Rectangle");
System.out.println("3. Circle");
System.out.println("4. Right Angle Triangle");
System.out.println("5. Cylinder");
System.out.println("6. Simple and compund intrest");
System.out.println("7. Exit");
System.out.println("\n\n---------------------------------------------------------------------------------------------");
System.out.println("Enter your choice(1-7)");
try
{
ch=Integer.parseInt(br.readLine());
}
catch(IOException e1)
{
System.out.println("\n\n Problems are occured due to input/output devices,system");
chk=1;
}
catch(NumberFormatException e2)
{
System.out.println("\n\nYou do not enter integer number as a choice,so problem.");
System.out.println("Please, reexecut the program and enter the correct choice (Integer number (1-5)");
chk=1;
}
if(chk==0)
{
switch(ch)
{
case 1: AO(); break;
case 2: Rectangle(); break;
case 3: Circle(); break;
case 4: RAT(); break;
case 5: Cylinder(); break;
case 6: sc(); break;
case 7: break;
default: System.out.println("\n\n Invalid");
break;
}
}
chk=0;
try
{
x=br.readLine();
}
catch(IOException e)
{
System.out.println("\n\n Problems are occured due to input/output devices,system");
}

}while(ch!=7);
}
}


class MenuDrivenProg2
{
public static void main(String args[])
{
Operations_Codes ob=new Operations_Codes();
ob.menu();
}
}