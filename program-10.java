//WAJP TO FIND THE FACTORIAL OF THE GIVE NUMBER
package java03;
import java.util.Scanner;
public class factorial {
public static void main(String[] args) {
 int n, i,fact=1;
 Scanner s1 = new Scanner(System.in);
 System.out.println("Enter the Number: ");
 n=s1.nextInt();
 for(i=1;i<=n;i++) {
 fact=fact*i;
 }
 System.out.println("the factorial value of the entered number:");
 System.out.println(fact);
}
}
