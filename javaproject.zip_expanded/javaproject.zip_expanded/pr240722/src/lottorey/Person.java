package lottorey;

public class Person {

	private String name;
	private String id;
	private String pwd;
	private int year;
	private int month;
	private int day;

	public Person() {
		super();
	}

	public Person(String name, String id, String pwd, int year, int month, int day) {
		super();
		this.name = name;
		this.id = id;
		this.pwd = pwd;
		this.year = year;
		this.month = month;
		this.day = day;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	@Override
	public String toString() {
		return "이름 : " + name +"\n"+ "아이디 : " + id+"\n" + "비밀번호 : " + pwd +"\n"+ "태어난 연도 : " + year + "년 "+"\n" + "태어난 월 : " + month + "월 "+"\n" + "태어날 날 : "
				+ day + "일";
	}

}
