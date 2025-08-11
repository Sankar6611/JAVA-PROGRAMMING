package java01;
import java.util.Scanner;
public class prange {
public static void main(String args[])
{
int i,j,n,m;
Scanner s1=new Scanner(System.in);
System.out.println("Enter the Starting Range:");
n=s1.nextInt();
System.out.println("Enter the Ending Range:");
m=s1.nextInt();
System.out.println("List of prime number from " +n+ " to " +m+ " is:" );
for(i=n;i<=m;i++)
{int c=0;
for(j=1;j<=i;j++)
{
if(i%j==0)
{
c=c+1;
}
}
if(c==2)
{
System.out.println(" "+i);
}
}
}
}
