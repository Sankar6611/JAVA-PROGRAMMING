//WAJP TO SEARCH A KEY ELEMENT FROM THE GIVE ARRAY OF ELEMENT.
package java02;
import java.util.Scanner;
public class demo {
 public static void main(String[] args) {
 int n, i, key, f = 0;
 Scanner s1 = new Scanner(System.in);
 System.out.print("Enter the size of the array: ");
 n = s1.nextInt();
 int a[] = new int[n];
 System.out.println("Enter the elements of the array:");
 for (i = 0; i < n; i++) {
 a[i] = s1.nextInt();
 }
 System.out.println("The array elements are:");
 for (i = 0; i < n; i++) {
 System.out.print(a[i] + " ");
 }
 System.out.println();
 System.out.print("Enter the element you want to search: ");
 key = s1.nextInt();
 for (i = 0; i < n; i++) {
 if (key == a[i]) {
 f = 1;
 break;
 }
 }
 if (f == 1) {
 System.out.println("The element is present in the list at position "
+ (i + 1));
 } else {
 System.out.println("The element is not present in the list.");
 }
 }
}
