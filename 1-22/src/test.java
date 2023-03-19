import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class test
{
	public static void main(String[] args) {
		String shinyaBirthday = "1998/03/19";
		String minamiBirthday = "2000/02/14";
		String furuyamaBirthday = "1998/09/12";
		//改行
		System.out.println("問１");
		//問題1:現在の時刻を出力してください
		System.out.println(LocalDateTime.now());
		//改行
		System.out.println("問２");
		//問題2:shinyaBirthdayとminamiBirthdayを日付型に変更し条件式で誕生日を比較し早い方の日付を文字列型で出力しなさい。
		LocalDate shinya = LocalDate.parse(shinyaBirthday, DateTimeFormatter.ofPattern("yyyy/MM/dd"));
		LocalDate minami = LocalDate.parse(minamiBirthday, DateTimeFormatter.ofPattern("yyyy/MM/dd"));
		String earlierBirthday = (shinya.isBefore(minami)) ? shinyaBirthday : minamiBirthday;
		System.out.println("早い方の誕生日: " + earlierBirthday);
		//改行
		System.out.println("問３");
		//問題3:furuyamaBirthdayに５年2ヶ月追加した値を文字列型で表示しなさい
		LocalDate furuyama = LocalDate.parse(furuyamaBirthday, DateTimeFormatter.ofPattern("yyyy/MM/dd"));
		LocalDate futureDate = furuyama.plusYears(5).plusMonths(2);
		System.out.println("追加後の誕生日: " + futureDate.format(DateTimeFormatter.ofPattern("yyyy/MM/dd")));
	}
}
