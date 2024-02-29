import java.io.*;
class br1
{
  public static void main(String args[]) throws IOException
  {
    BufferedReader br =new BufferedReader(new InputStreamReadder(System.in));
    double r,a,c;
    System.out.println("Enter radius of circle");
    r=Integer.parseInt(br.readLine());
    a=3.14*r*r;
    c=2*3.14*r;
    System.out.println("Area="+a);
    System.out.println("Circumference="+c);
    
  }
}