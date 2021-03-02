/**
 * ステータスを更新してる風コード
 */
public class DungStatusChange {
  public static void main(String[] args) {
    // 50文字まで#を表示する
    int x = 50;
    // カウントアップする変数
    int y = 0;
    while (true) {
      if (x != y) {
        // 上限まで#を足していく
        System.out.print("#");
      } else {
        // 50文字になったら「 done!! + 改行」を出力し
        // 何かが終わった感を演出
        System.out.println(" done!!");
        // カウントアップをリセット
        y = -1;
      }
      // カウントアップしていく
      y++;
      // 高速で出力すると素敵感が出ないので
      // 出力待ち時間を作成する
      int sleepTime = 10;
      // ランダム値にマッチすると待ち時間をさらに長くする。
      // 何か大きな処理をしているように見えること請け合い
      int osooso = (int)(Math.random() * 10);
      if (4 < osooso  && osooso <= 6) {
        sleepTime = 100;
      }
      try {
        // 待つ
        Thread.sleep(sleepTime);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
  }
}
