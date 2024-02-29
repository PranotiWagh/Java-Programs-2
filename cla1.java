class cla1
{
public static void main(String args[])
{
double l,b;
l=Double.parseDouble(args[0]);
b=Double.parseDouble(args[1]);
double a=l*b;
double p=2*(l+b);
System.out.println("area="+a);
System.out.println("perimeter="+p);
}
}