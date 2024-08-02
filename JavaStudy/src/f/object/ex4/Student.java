package f.object.ex4;

// 이름 나이 수학점수 영어점수 국어점수를 데이터로 가지고 있는 객체를 만들어라
// 데이터는 직접 접근을 허용하지 않고 모두 간접적으로 set/get을 해줄 수 있도록 작성해라
// 모든 데이터를 매개변수로 받아 초기화하면서 객체를 생성할 수 있는 생성자를 작성
public class Student {

	private String name;
	private int age;
	private int mathscore;
	private int engscore;
	private int korscore;
	
	public Student() {}
	
	public Student(String name, int age, int mathscore, int engscore, int korscore) {
		super();
		this.name = name;
		this.age = age;
		this.mathscore = mathscore;
		this.engscore = engscore;
		this.korscore = korscore;
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

	public int getMathscore() {
		return mathscore;
	}

	public void setMathscore(int mathscore) {
		this.mathscore = mathscore;
	}

	public int getEngscore() {
		return engscore;
	}

	public void setEngscore(int engscore) {
		this.engscore = engscore;
	}

	public int getKorscore() {
		return korscore;
	}

	public void setKorscore(int korscore) {
		this.korscore = korscore;
	}
	
	public double getEvg() {
		double evg = (this.korscore + this.engscore + this.mathscore) /3.0;
		return evg;
	}
	public void printEvg() {
		System.out.println(this.getName() + "님의 평균 : " + this.getEvg());
	}

	public void getGrade(int i) {
		// TODO Auto-generated method stub
		
	}
	
}