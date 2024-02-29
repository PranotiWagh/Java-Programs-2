class test
{

int a,b;
test(int x,int y) 
{
System.out.println("initilizing the class variable");
a=x;
b=y;
}

void display()
{
System.out.println("initial values of a and b are");
System.out.println("a="+a+"\t"+"b="+b);
}

void result()
{
int add= a+b;
int sub= b-a;
System.out.println("addition="+add);
System.out.println("substraction="+sub);
}
}

class ConDemo
{
public static void main(String Args[])
{
System.out.println("understing parameritized constructors in java");
test ob=new test(100,200);

ob.display();
ob.result();
}
}

