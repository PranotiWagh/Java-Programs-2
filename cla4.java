class cla4
{
public static void main(String args[])
{
int n=args.length;
try
{
System.out.println("ip passed");
for(int i=0; i<n; i++)
{
System.out.println(args[i]+"\t");
}
System.out.println("ip passed reverse");
for(int j=n-1; j>=0; j--)
{
System.out.println(args[j]+"\t");
}
}
catch(Exception e)
{
System.out.println("invalid ip");
}
}
}