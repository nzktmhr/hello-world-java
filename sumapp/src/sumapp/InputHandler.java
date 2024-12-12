package sumapp;

import java.util.Scanner;

public class InputHandler {
  
  public int[] getInputs() {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter the first number: ");
    int num_first = scanner.nextInt();
    System.out.println("Enter the second number: ");
    int num_second = scanner.nextInt();
    return new int[] { num_first, num_second };
  }

}
