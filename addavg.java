import java.io.*;
class addavg
{
double n1,n2,n3;
addavg()
{
n1=1;
n2=2;
n3=3;
System.out.println("1st no="+n1);
System.out.println("2st no="+n2);
System.out.println("3st no="+n3);
}
void result()
{
double add,avg;
add=n1+n2+n3;
avg=add/3;
System.out.println("addition="+add);
System.out.println("average="+avg);
}
}
class addavgdemo
{
public static void main(String args[])
{
System.out.println("addition and average program using constructor");
addavg ob=new addavg();
ob.result();
}
} 