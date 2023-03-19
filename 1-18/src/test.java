
public class test {
	//問題1:上記変数のgetterとsetterメソッドを作成してください。※IDE（Eclipse）で自動生成で作成すること
	public String getFirst_name() {
	    return first_name;
	}

	public void setFirst_name(String first_name) {
	    this.first_name = first_name;
	}

	public String getLast_name() {
	    return last_name;
	}

	public void setLast_name(String last_name) {
	    this.last_name = last_name;
	}

	public String getName() {
	    return name;
	}

	public void setName(String name) {
	    this.name = name;
	}

	public int getAge() {
	    return age;
	}

	public void setAge(int age) {
	    this.age = age;
	}

	public int getWeight() {
	    return weight;
	}

	public void setWeight(int weight) {
	    this.weight = weight;
	}
	
	//問題2:RTC終了後の個人またはチーム開発ではgetterメソッドとsetterメソッドを変数に対して作成していないと思われますがですがそれはなぜですか？
	//回答2「　springのアノテーションで@Dataを使用しているから。　」
	//問題3:getterメソッドとsetterメソッドをカプセル化しようとする時どのようなアクセス修飾子が適切ですか？
	//回答3「　getterとsetterメソッドのアクセス修飾子は、privateにすることが適切です。　」
	
	private String first_name;
	
	private String last_name;
	
	private String name;
	
	private int age;
	
	private int weight;
}
