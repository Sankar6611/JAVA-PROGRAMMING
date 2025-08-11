/*WAJP TO READ THE SIZE OF ARRAY AND ELEMENTS OF ARRAY,AND DISPLAY THE SUM OF 
THOSE ARRAY ELEMENTS.*/
package java02;
import java.util.Scanner;
public class arsum {
public static void main(String[] args) {
int n,i,sum=0;
Scanner s1=new Scanner(System.in);
System.out.println("enter the size an array");
n=s1.nextInt();
int a[]=new int[n];
System.out.println("enter the element of an Array");
for(i=0;i<n;i++) {
a[i]=s1.nextInt();
}
System.out.println("the sum of array elements is:");
for(i=0;i<n;i++) {
sum=sum+a[i];
}
System.out.println(sum);
}
}
