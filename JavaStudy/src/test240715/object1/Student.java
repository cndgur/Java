package test240715.object1;

public class Student {
	private String name;
	private int classroom;
	private double javaScore;
	private double sqlScore;
	private double practiceScore;
	
	public Student() {
		super();
	}

	public Student(String name, int classroom, double javaScore, double sqlScore, double practiceScore) {
		super();
		this.name = name;
		this.classroom = classroom;
		this.javaScore = javaScore;
		this.sqlScore = sqlScore;
		this.practiceScore = practiceScore;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getClassroom() {
		return classroom;
	}

	public void setClassroom(int classroom) {
		this.classroom = classroom;
	}

	public double getJavaScore() {
		return javaScore;
	}

	public void setJavaScore(double javaScore) {
		this.javaScore = javaScore;
	}

	public double getSqlScore() {
		return sqlScore;
	}

	public void setSqlScore(double sqlScore) {
		this.sqlScore = sqlScore;
	}

	public double getPracticeScore() {
		return practiceScore;
	}

	public void setPracticeScore(double practiceScore) {
		this.practiceScore = practiceScore;
	}
	public String toString() {
		return this.classroom + "반 " + this.name + "학생 " + this.javaScore + "점 " + this.sqlScore + "점 " + this.practiceScore + "점 ";
	}
	
	public double getEvg() {
		double sum = this.javaScore + this.sqlScore + this.practiceScore;
		return sum/3;
	}
	public boolean isPassd() {
		if(javaScore >= 50 && sqlScore >= 50 && practiceScore >= 50 && this.getEvg() >= 60) {
			return true;
		} 
			return false;
		
		
	}
	public void reTest() {
		this.setJavaScore(Math.random()*101);
		this.setPracticeScore(Math.random()*101);
		this.setSqlScore (Math.random()*101);
		
	}
}
