
import java.util.Scanner;

public class PrimeFromDwhile {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    int count = 0;
    for (int i = 2; i < num; i++) {
      if (num % i == 0) {
        count++;
      }
    }
    // prime or not
    if (count == 0) {
      System.out.println("the number is prime number");
    } else {
      System.out.println("number is not prime number");

    }
  }
}
