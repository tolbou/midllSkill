
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class test {
	public static void main(String[] args) {
		// 改行
		System.out.println("問１");
		// 問題1:下記の条件を使ってfor文と条件文を組み合わせ結果が同じになるよう出力しなさい。for文ネスト3回（3回forを書くこと）
		// strArray1でfor文を回し3文字目(k)以降のものをstrArray2に格納する(1個目のfor文)
		// strArray2でfor文を回しkとaとoの物だけでstrArray3に格納する(2個目のfor文)
		// strArray3でfor文を回し「kakao」となるようにstrArray4に格納しstrArray4を出力する。(3個目のfor文)
		List<String> strArray1 = new ArrayList(
				Arrays.asList("f", "u", "k", "u", "d", "a", "k", "a", "n", "e", "k", "o"));
		List<String> strArray2 = new ArrayList<String>();
		List<String> strArray3 = new ArrayList<String>();
		List<String> strArray4 = new ArrayList<String>();


        for (int i = 2; i < strArray1.size(); i++) {
            strArray2.add(strArray1.get(i));
        }

        for (int i = 0; i < strArray2.size(); i++) {
            if (strArray2.get(i).equals("k") || strArray2.get(i).equals("a") || strArray2.get(i).equals("o")) {
                strArray3.add(strArray2.get(i));
            }
        }

        outerLoop:
        for (int i = 0; i < strArray3.size(); i++) {
            if (strArray3.get(i).equals("k")) {
                for (int j = i + 1; j < strArray3.size(); j++) {
                    if (strArray3.get(j).equals("a")) {
                        for (int k = j + 1; k < strArray3.size(); k++) {
                            if (strArray3.get(k).equals("k")) {
                                for (int l = k + 1; l < strArray3.size(); l++) {
                                    if (strArray3.get(l).equals("a")) {
                                        for (int m = l + 1; m < strArray3.size(); m++) {
                                            if (strArray3.get(m).equals("o")) {
                                                strArray4.addAll(Arrays.asList(strArray3.get(i), strArray3.get(j), strArray3.get(k), strArray3.get(l), strArray3.get(m)));
                                                break outerLoop;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }

        System.out.println(strArray4);
    }

}
