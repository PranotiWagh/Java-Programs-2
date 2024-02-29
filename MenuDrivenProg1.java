import java.io.*;
class Operational_Codes
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
void Odd_Even()
{
int n=0,chk1=0;
try
{
System.out.println("\n\nEnter one integer number ");
n=Integer.parseInt(br.readLine());
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
n=Integer.parseInt(br.readLine());
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
if(n%2==0)
System.out.println("Input number is EVEN");
else
System.out.println("Input number is ODD");
}
}
 
void Pos_Neg_Zero()
{
int n=0,chk2=0;
try
{
System.out.println("\n\nEnter one integer number ");
n=Integer.parseInt(br.readLine());
}
catch(IOException e7)
{
System.out.println("\n\n Problems are occured due to input/output devices,system");
chk2=1;
}
catch(NumberFormatException e8)
{
System.out.println("\n\nYou do not enter integer number in correct format,so problem.");
System.out.println("Please, reenter the input integer number in correct format");
try
{
System.out.println("\n\nOnce again,Enter one integer number");
n=Integer.parseInt(br.readLine());
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
if(n>0)
System.out.println("Input number is POSITIVE");
else if(n<0)
System.out.println("Input number is NEGATIVE");
else
System.out.println("Input number is ZERO");
}
}

void Leap_Year()
{
int n=0,chk3=0;
try
{
System.out.println("\n\nEnter one integer number ");
n=Integer.parseInt(br.readLine());
}
catch(IOException e11)
{
System.out.println("\n\n Problems are occured due to input/output devices,system");
chk3=1;
}
catch(NumberFormatException e12)
{
System.out.println("\n\nYou do not enter integer number in correct format,so problem.");
System.out.println("Please, reenter the input integer number in correct format");
try
{
System.out.println("\n\nOnce again,Enter one integer number");
n=Integer.parseInt(br.readLine());
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
if((n%4==0 && n%100!=0 )|| n%400==0)
System.out.println("Input number is LEAP YEAR");
else
System.out.println("Input number is NOT LEAP YEAR");
}
}

void Digits_Count()
{
int n=0,chk4=0;
try
{
System.out.println("\n\nEnter one integer number ");
n=Integer.parseInt(br.readLine());
}
catch(IOException e15)
{
System.out.println("\n\n Problems are occured due to input/output devices,system");
chk4=1;
}
catch(NumberFormatException e16)
{
System.out.println("\n\nYou do not enter integer number in correct format,so problem.");
System.out.println("Please, reenter the input integer number in correct format");
try
{
System.out.println("\n\nOnce again,Enter one integer number");
n=Integer.parseInt(br.readLine());
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
if(n>=0 && n<9)
System.out.println("Number of digits= ONE");
else if(n>=10 && n<=99)
System.out.println("Number of digits= TWO");
else if(n>=100 && n<=999)
System.out.println("Number of digits= THREE");
else if(n>=1000 && n<=9999)
System.out.println("Number of digits= FOUR");
else
System.out.println("Number of digits= more than four");
}
}

void menu()
{
int ch=0,chk=0;
String x;
do
{
System.out.println("\n\n\n--------------------------------------------------------------------------------------------------------------------------------------------------------------------");
System.out.println("Menu Driven Program- Primary Operations");
System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------------");
System.out.println("1. Read a number and cheak odd or even");
System.out.println("2. Read a number and cheak positive,negative or zero");
System.out.println("3. Read a number and cheak leap year");
System.out.println("4. Read a number and count the digits");
System.out.println("5. Exit");
System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------------");
System.out.println("Enter your choice (1-5):");
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
case 1: Odd_Even(); break;
case 2: Pos_Neg_Zero(); break;
case 3: Leap_Year(); break;
case 4: Digits_Count(); break;
case 5: break;
default: System.out.println("\n\nInvalid choice,not between 1-5");
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

}while(ch!=5);
}
}


class MenuDrivenProg1
{
public static void main(String args[])
{
Operational_Codes oc =new Operational_Codes();
oc.menu();
}
}
