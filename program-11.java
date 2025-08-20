//WAJP TO SORT THE ORDER OF AN ARRAY IN ASCENDING AND DESCENDING ORDER
package java03;
package java03;
import java.util.Scanner;
public class SortArray {
 public static void main(String[] args) {
 int n, i, j, temp;
 Scanner s1 = new Scanner(System.in);
 System.out.print("Enter the size of the array: ");
 n = s1.nextInt();
 int[] a = new int[n];
 System.out.println("Enter the elements of the array:");
 for (i = 0; i < n; i++) {
 a[i] = s1.nextInt();
 }
 // Ascending Order (Bubble Sort)
 for (i = 0; i < n - 1; i++) {
 for (j = i + 1; j < n; j++) {
 if (a[i] > a[j]) {
 temp = a[i];
 a[i] = a[j];
 a[j] = temp;
 }
 }
 }
 System.out.print("Array in Ascending Order: ");
 for (i = 0; i < n; i++) {
 System.out.print(a[i] + " ");
 }
 System.out.println();
 // Descending Order
 for (i = 0; i < n - 1; i++) {
 for (j = i + 1; j < n; j++) {
 if (a[i] < a[j]) {
 temp = a[i];
 a[i] = a[j];
 a[j] = temp;
 }
 }
 }
 System.out.print("Array in Descending Order: ");
 for (i = 0; i < n; i++) {
 System.out.print(a[i] + " ");
 }
 }
}
