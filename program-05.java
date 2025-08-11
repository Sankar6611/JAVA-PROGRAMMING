/*WAJP TO READ THE SIZE OF ARRAY AND ELEMENTS OF ARRAY,AND DISPLAY THE SAME IN 
SQUENCE ORDER AND REVERSE ORDER.*/
package java02;
import java.util.Scanner;
public class element {
public static void main(String[] args) {
int n,i;
Scanner s1=new Scanner(System.in);
System.out.println("enter the size an array");
n=s1.nextInt();
int a[]=new int[n];
System.out.println("enter the element of an Array");
for(i=0;i<n;i++) {
a[i]=s1.nextInt();
}
System.out.println("the element of an array is:");
for(i=0;i<n;i++) {
System.out.println(a[i]+" ");
}
System.out.println("the element of the array in reverse order:");
for(i=n-1;i>=0;i--) {
System.out.println(" "+a[i]);
}
}
}
