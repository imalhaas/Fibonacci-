import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);

      System.out.print("Digite um número: ");
      int num = input.nextInt();

      int fib1 = 0, fib2 = 1, fib = 0;
      boolean pertence = false;

      while (fib <= num) {
      if (fib == num) {
      pertence = true;
          break;
      }

      fib = fib1 + fib2;
      fib1 = fib2;
      fib2 = fib;
      }

      if (pertence) {
      System.out.println(num + " pertence à sequência de Fibonacci.");
      } else {
          System.out.println(num + " não pertence à sequência de Fibonacci.");
      }
     }
    }
