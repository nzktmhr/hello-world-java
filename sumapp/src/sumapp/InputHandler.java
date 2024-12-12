package sumapp;

import java.util.Scanner;

/**
 * 入力クラス.
 */
public class InputHandler {
  
  /**
   * 入力メソッド.
   *
   * @return  １つ目と２つ目の数値
   */
  public int[] getInputs() {
    // scannerをインスタンス化
    Scanner scanner = new Scanner(System.in);
    // 一つ目の数値をユーザが入力
    System.out.print("Enter the first number: ");
    int numFirst = scanner.nextInt();
    // 二つ目の数値をユーザが入力
    System.out.println("Enter the second number: ");
    int numSecond = scanner.nextInt();
    
    // scannerを閉じる
    scanner.close();
    
    return new int[] { numFirst, numSecond };
  }

}
