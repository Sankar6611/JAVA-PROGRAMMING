/*WAJP TO READ THE SIZE OF A MATRIX AND DISPLAY THE ELEMENT OF A MATRIX,AND ALSO
DISPLAY UPPER, LOWER TRIANGLE AND DIAGONAL MATRIX ELEMENTS SEPARATELY AND 
DISPLAY THE SUM OF THE THEM (i.e., SUM OF UPPER TRIANGLE , LOWER TRIANGLE AND 
DIAGONAL ELEMENTS SUM)*/
package java02;
import java.util.Scanner;
public class matrix {
public static void main(String[] args) {
Scanner s1=new Scanner(System.in);
int i,j,m,n,usum=0,lsum=0,dsum=0;
System.out.println("enter the size of matrix");
m=s1.nextInt();
n=s1.nextInt();
int a[][]=new int[m][n];
System.out.println("enter the element of matrix");
for(i=0;i<m;i++) {
for(j=0;j<n;j++) {
a[i][j]=s1.nextInt();
}
}
System.out.println("the element of the matrix is:");
for(i=0;i<m;i++) {
for(j=0;j<n;j++) {
System.out.println(a[i][j]+" ");
}
System.out.println(" ");
}
System.out.println("the upper triangle matrix element are:");
for(i=0;i<m;i++) {
for(j=0;j<n;j++) {
if(j>=i) {
System.out.println(a[i][j]+" ");
usum=usum+a[i][j];
}
}
}
System.out.println(" ");
System.out.println("the Lower triangle matrix element are:");
for(i=0;i<m;i++) {
for(j=0;j<n;j++) {
if(i>=j) {
System.out.println(a[i][j]+" ");
lsum=lsum+a[i][j];
}
}
}
System.out.println(" ");
System.out.println("the diagonal element of a matrix are:");
for(i=0;i<m;i++) {
for(j=0;j<n;j++) {
if(j==i) {
System.out.println(a[i][j]+" ");
dsum=dsum+a[i][j];
}
}
}
System.out.println(" ");
System.out.println("the sum of upper triangle elements is:"+usum);
System.out.println("the sum of lower triangle elements is:"+lsum);
System.out.println("the sum of diagonal elements of a matrix 
is:"+dsum);
}
}
