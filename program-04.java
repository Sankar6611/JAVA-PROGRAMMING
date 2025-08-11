package java01;
import java.util.Scanner; 
public class prange {
 public static void main(String[] args) {
 Scanner sc = new Scanner(System.in); /
 int n1 = sc.nextInt();
 int n2 = sc.nextInt();
 for (int i = n1; i <= n2; i++) {
 boolean isPrime = true;
 if (i < 2) {
 isPrime = false;
 } else {
 for (int j = 2; j <= Math.sqrt(i); j++) {
 if (i % j == 0) {
 isPrime = false;
 break;
 }
 }
 }
 if (isPrime) {
 System.out.println(i);
 }
 }
 sc.close();
 }
}
