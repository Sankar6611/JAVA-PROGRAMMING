package java01;
import java.util.Scanner;
public class prime {
public static void main(String args[])
{
int i,n,c=0;
Scanner s1=new Scanner(System.in);
System.out.println("Enter the n value");
n=s1.nextInt();
for(i=1;i<=n;i++)
{
if(n%i==0)
{
c=c+1;
}
}
if(c==2)
{
System.out.println("The number"+n+ "is a prime number");
}
else
{
System.out.println("The number"+n+"is not a prime number");
}
}
}
