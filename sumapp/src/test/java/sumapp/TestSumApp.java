package test.java.sumapp;

import main.java.sumapp.Calculator;

/**
 * SumAppのテストクラス.
 */
public class TestSumApp {
  
  /**
   * テストメインメソッド.
   *
   * @param args  コマンドライン引数
   */
  public static void main(String[] args) {
    // テスト用の固定入力値
    int numFirst = 5;
    int numSecond = 3;
    
    // 入力処理をシミュレート
    int[] inputs = new int[] { numFirst, numSecond };
    
    // Calculatorインスタンス作成
    Calculator calculator = new Calculator();
    
    // 足し算処理
    int result = calculator.calculateSum(inputs[0], inputs[1]);
    
    // 結果の確認
    if (result == 8) {
      System.out.println("Test passed: " + numFirst + " + " + numSecond + " = " + result);
    } else {
      System.out.println("Test failed: " + numFirst + " + " + numSecond + " = " + result);
    }
  }
}