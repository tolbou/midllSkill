import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class test {
	public static void main(String[] args) {
		// 改行
		System.out.println("問１");
		// 問題1:下記条件になるようログの出力を行いなさい。

		// 条件１ 例外でヌルポが発生させヌルポをキャッチした場合のみログ出力がされるプログラムにする事
		// 条件２ "middleskill log"という名前のログのインスタンスを生成する事
		// 条件３ srcディレクトリ内に"middleskill.log"としてログ出力される設定にする事
		// 条件４ ログの内容はコンソールに出ている赤文字と同じ内容のものが表示される事
		// 条件５ 格納するログメッセージは"ミドルスキルログが発生しました。"という文言にする事
		try {
			String str = null;
			str.length();
		} catch (NullPointerException e) {

			Logger logger = Logger.getLogger("middleskill log");

			try {
				FileHandler fh = new FileHandler("src/middleskill.log", true);
				logger.addHandler(fh);
				SimpleFormatter sf = new SimpleFormatter();
				fh.setFormatter(sf);
			} catch (SecurityException | IOException e1) {
				e1.printStackTrace();
			}

			logger.setLevel(Level.SEVERE);

			logger.severe("ミドルスキルログが発生しました。");
		}

	}
}
