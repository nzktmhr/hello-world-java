package sumapp;

/**
 * Mainクラス.
 */
public class Main {
  /**
   * mainメソッド.
   *
   * @param args  コマンドライン引数
   */
  public static void main(String[] args) {
    // 各クラスのインスタンスを作成
    InputHandler inputHandler = new InputHandler();
    Calculator calculator = new Calculator();
    OutputHandler outputHandler = new OutputHandler();
    
    // ユーザに入力を求める
    int[] inputs = inputHandler.getInputs();
    // 値の計算
    int result = calculator.calculateSum(inputs[0], inputs[1]);
    // 結果の出力
    outputHandler.printResult(result);
  }
}