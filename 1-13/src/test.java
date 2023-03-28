import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class test {
	public static void main(String[] args) {
		// 改行
		System.out.println("問1");

		// strArray1でfor文を回し3文字目(k)以降のものをstrArray2に格納する(1個目のfor文)
		// strArray2でfor文を回しkとaとoの物だけでstrArray3に格納する(2個目のfor文)
		// strArray3でfor文を回し「kakao」となるようにstrArray4に格納しstrArray4を出力する。(3個目のfor文)

		List<String> strArray1 = new ArrayList(
				Arrays.asList("f", "u", "k", "u", "d", "a", "k", "a", "n", "e", "k", "o"));
		List<String> strArray2 = new ArrayList<>();
		List<String> strArray3 = new ArrayList<>();
		List<String> strArray4 = new ArrayList<>();

		outerLoop:
		for (int i = 2; i < strArray1.size(); i++) {
			strArray2.add(strArray1.get(i));
			for (int j = 0; j < strArray2.size(); j++) {
				if (strArray2.get(j).equals("k") || strArray2.get(j).equals("a") || strArray2.get(j).equals("o")) {
					strArray3.add(strArray2.get(j));
					for (int k = 0; k < strArray3.size(); k++) {
						if (strArray3.get(k).equals("k") && strArray4.size() == 0) {
							strArray4.add(strArray3.get(k));
						} else if (strArray3.get(k).equals("a") && (strArray4.size() == 1 || strArray4.size() == 3)) {
							strArray4.add(strArray3.get(k));
						} else if (strArray3.get(k).equals("k") && strArray4.size() == 2) {
							strArray4.add(strArray3.get(k));
						} else if (strArray3.get(k).equals("a") && strArray4.size() == 4) {
							strArray4.add(strArray3.get(k));
						} else if (strArray3.get(k).equals("o") && strArray4.size() == 5) {
							strArray4.add(strArray3.get(k));
							break outerLoop;
						}
					}
				}
			}
			strArray3.clear();
			strArray4.clear();
		}

		if (!strArray4.isEmpty() && strArray4.size() == 6) {
			strArray4.remove(4);
		}

		if (strArray4.isEmpty()) {
			System.out.println("Not found");
		} else {
			System.out.println(strArray4);
		}

	}
}