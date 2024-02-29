import java.io.*;
class dis
{
public static void main(String args[]) throws IOException
{
DataInputStream ob=new DataInputStream(System.in);
double r,h,v,sa;
System.out.println("enter radius and height");
r=Double.parseDouble(ob.readLine());
h=Double.parseDouble(ob.readLine());
v=3.14*r*r*h;
sa=2*3.14*r*r+2*3.14*r;
System.out.println("volume="+v);
System.out.println("surface area="+sa);

}
}