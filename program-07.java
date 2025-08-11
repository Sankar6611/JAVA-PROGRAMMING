/*WAJP TO READ THE SIZE OF ARRAY AND ELEMENTS OF ARRAY,AND DISPLAY THE MINIMUM 
AND MAXIMUM OF THOSE ARRAY ELEMENTS.*/
package java02;
import java.util.Scanner;
public class minmax {
 public static void main(String[] args) {
 int n, i;
 Scanner s1 = new Scanner(System.in);
 System.out.println("enter the size an array");
 n = s1.nextInt();
 int a[] = new int[n];
 System.out.println("enter the element of an Array");
 for (i = 0; i < n; i++) {
 a[i] = s1.nextInt();
 }
 int min = a[0];
 int max = a[0];
 System.out.println("the minimum value element from array elements is:");
 for (i = 0; i < n; i++) {
 if (a[i] < min) {
 min = a[i];
 }
 }
 System.out.println(min);
 System.out.println("the maximum value element from array elements is:");
 for (i = 0; i < n; i++) {
 if (a[i] > max) {
 max = a[i];
 }
 }
 System.out.println(max);
 }
}
