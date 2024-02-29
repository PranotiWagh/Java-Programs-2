import java.io.*;
class Circle
{
public static void main(String args[]) throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
double rad;
System.out.println("enter radius of circle");
rad=Double.parseDouble(br.readLine());
MyClass ob=new MyClass();
ob.result(rad);
ob.show();
}
}

class MyClass
{
double a,c;
 
void result(double r)
{
a=3.14*r*r;
c=2*3.14*r;
}

void show()
{
System.out.println("Area="+a);
System.out.println("Circumferecne="+c);
}
}
