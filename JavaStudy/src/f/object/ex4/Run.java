package f.object.ex4;

import java.util.Scanner;

public class Run {

	public static void main(String[] args) {
		// choi객체 생성 최지원, 15살, 영어 : 60, 수학 : 70, 국어 : 80
		// kim객체 생성 김도한 , 18살, 영어 :95 50 70
//
//		Student choi = new Student("최지원",15,60,70,80);
//		Student kim = new Student("김수민",18,95,50,70);
//		
//		//choi의 모든 과목의 평균을 출력
//		System.out.println(choi.getName() + "님의 평균 : " + choi.getEvg());
//		System.out.println(kim.getName() + "님의 평균 : " + kim.getEvg());
		
		//사용자로부터 이름, 나이, 영어점수, 수학점수, 국어점수를 입력받아
		//평균을 구하고 출력하는 프로그램 작성
		// ex) 이름 : 최지원
		//	   나이 : 15
		//	   영어점수 : 80
		//	   수학점수 : 100
		//	   국어점수 : 75
		
		
//		Student choi = new Student("최지원",15,80,100,75);
//		System.out.println("이름 : " + choi.getName() + "\n나이 : " + choi.getAge() + "\n영어점수 : " + choi.getEngscore()
//				+ "\n수학점수 : " + choi.getMathscore() + "\n국어점수 : " + choi.getKorscore());
//		System.out.println(choi.getName() + "님의 평균 : " + choi.getEvg());
		Scanner sc = new Scanner(System.in);
		System.out.print("이름 : ");
		String name = sc.next();
		
		System.out.print("나이 : ");
		int age = sc.nextInt();
		
		System.out.print("영어점수 : ");
		int engscore = sc.nextInt();
		
		System.out.print("수학점수 : ");
		int mathscore = sc.nextInt();
		
		System.out.print("국어점수 : ");
		int korscore = sc.nextInt();
		
		Student choi = new Student(name, age, mathscore, engscore, korscore);
		choi.printEvg();
	
	}

}
