package Homework4_Inheritance;

import java.util.Scanner;

public class PersonMenu {
    private Scanner sc = new Scanner(System.in);
    private PersonController pc = new PersonController();
    
    public void mainMenu() {
    	 while(true) { 
        int[] countArr = pc.personCount();
        int studentCount = countArr[0]; // 현재 저장된 학생 수
        int employeeCount = countArr[1]; // 현재 저장된 직원 수
        
        System.out.println("학생은 최대 3명까지 저장할 수 있습니다.");
        System.out.println("현재 저장된 학생은 " + countArr[0] + " 명입니다.");
        System.out.println("사원은 최대 10명까지 저장할 수 있습니다.");
        System.out.println("현재 저장된 사원은 " + countArr[1] + " 명입니다.");
        
      
	        System.out.println("1.학생메뉴");
			System.out.println("2.사원메뉴");
			System.out.println("9.끝내기");
			System.out.print("메뉴 번호 : ");
			int num = sc.nextInt();
			switch(num) {
			case 1:
				studentMenu();
				break;
			case 2:
				employeeMenu();
				break;
			case 9:
				System.out.println("종료합니다");
				return;
			default :
				System.out.println("잘못입력하셨습니다 다시 입력해주세요");
				
			}
	    }
    }
    // 나머지 메서드는 필요에 따라 구현
	
	public void studentMenu() {
			while(true) {
			System.out.println("\n1. 학생 추가");
			System.out.println("2. 학생 보기");
			System.out.println("9. 메인으로");
			System.out.println("메뉴 번호 : ");
			int num = sc.nextInt();
			switch(num) {
			case 1:
				insertStudent();
				break;
			case 2:
				printStudent();
				break;
			case 9:
				System.out.println("메인으로 돌아갑니다.");
				mainMenu();
				break;
			default :
				System.out.println("잘못입력하셨습니다 다시 입력해주세요");
				studentMenu();
			}
		}
	}
	public void employeeMenu() {
		while(true) {
			System.out.println("1. 사원 추가");
			System.out.println("2. 사원 보기");
			System.out.println("9. 메인으로");
			System.out.println("메뉴 번호 : ");
			int num = sc.nextInt();
			switch(num) {
			case 1:
				insertEmployee();
				break;
			case 2:
				printEmployee();
				break;
			case 9:
				System.out.println("메인으로 돌아갑니다.");
				mainMenu();
				break;
			default :
				System.out.println("잘못입력하셨습니다 다시 입력해주세요");
				employeeMenu();
	}
		}}
	public void insertStudent() {
		
		while(true) {
			System.out.print("학생 이름 : ");
			String name = sc.next();
			System.out.print("학생 나이 : ");
			int age = sc.nextInt();
			System.out.print("학생 키 : ");
			double height = sc.nextDouble();
			System.out.print("학생 몸무게 : ");
			double weight = sc.nextDouble();
			System.out.print("학생 학년 : ");
			int grade = sc.nextInt();
			System.out.print("학생 전공 : ");
			String major = sc.next();
			
			int[]personCount = pc.personCount();
			if(personCount[0] == 3) {
				System.out.println("학생을 담을 수 있는 공간이 꽉 찼기 떄문에 학생 추가를 종료하고 학생메뉴로 돌아갑니다.");
				return;
			}else {
				pc.insertStudent(name, age, height, weight, grade, major);
				System.out.println("그만하시려면 N(또는 n), 이어하시려면 아무 키나 누르세요 : ");
				char ch = sc.next().charAt(0);
				if(ch == 'n' || ch =='N') {
					return;
				}
			}
			
		}
	}	
	public void printStudent() {
		Student[] sArr = pc.printStudent();
		for(Student s : sArr) {
			if(s == null) {
				break;
			}
			System.out.println(s.toString());
		}
	}
	
	public void insertEmployee() {
		
	}
	
	public void printEmployee() {
		
	}
}
