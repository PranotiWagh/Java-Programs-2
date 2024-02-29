class cla3
{
public static void main(String args[])
{
int n=args.length;
System.out.println("ip nos passed from command line are");
int s=0;
double avg;
for(int i=0; i<n; i++)
{
System.out.println(args[i]+"\t");
s=s+Integer.parseInt(args[i]);
}
System.out.print("addition="+s);
avg=(double)s/n;
System.out.println("average="+avg);
}
}