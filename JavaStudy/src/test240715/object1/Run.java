package test240715.object1;

import java.util.Scanner;

public class Run {
	public static void main(String[] args) {
		// 정수 1,2,3를 입력받아 홀짝을 출력하라
		// 입력 : 6 4 7
		// 짝 짝 홀

		Scanner sc = new Scanner(System.in);
//		System.out.println("정수 3개를 입력하세요 : ");
//		int num1 = sc.nextInt();
//		int num2 = sc.nextInt();
//		int num3 = sc.nextInt();
//
//		if (num1 % 2 == 0) {
//			System.out.print("짝");
//		} else {
//			System.out.print("홀");
//		}
//		if (num2 % 2 == 0) {
//			System.out.print("짝");
//		} else {
//			System.out.print("홀");
//		}
//		if (num3 % 2 == 0) {
//			System.out.print("짝");
//		} else
//			System.out.print("홀");
		
//		System.out.print("정수 1~100 중 하나를 입력하세요 : ");
//		int n1 = sc.nextInt();
//		for(int i = 0; i <= n1; i++) {
//			System.out.print(i + " ");
//		}
	
		/*
		 번호를 입력한 횟수를 구하는 프로그램을 작성한다.
		 번호 (1~20)까지를 무작위로 10번 입력받는다.
		 입력받은 1~20까지의 숫자가 각각 몇번 입력되었는지를 출력한다.
		 입력 : 1 5 7 10 15 5 1 7 7 2
		 입력횟수 : 2 1 0 0 2 0 3 0 0 1 0 0 0 0 1 0 0 0 0 0 
		 */
//		int[] arr = new int[20];
//		
//		System.out.print("입력 : ");
//		for(int i = 0; i < 10; i++) {
//		 int num = sc.nextInt();
//		 arr[num -1]++;
//		 
//	 }
//		for(int i = 0; i < arr.length; i++) {
//			System.out.print(arr[i]+ " ");
//		}
//        
//        sc.close(); // Scanner 객체 닫기
		Student[] stArr = new Student[10];
		
		for(int i = 0; i<stArr.length; i++) {
			stArr[i] = new Student();
			System.out.print("이름 : ");
			stArr[i].setName(sc.next());
			
			System.out.print("반 :");
			stArr[i].setClassroom(sc.nextInt());
			
			stArr[i].reTest();
		}
		System.out.printf("%5s %3s %4s %4s %4s\n", "이름", "반", "자바", "sql", "실습" );
		for(int i = 0; i<stArr.length; i++) {
			Student st = stArr[i];
			System.out.printf("%5s %3s %4.2s %4.2s %4.2s\n", st.getName() + st.getClassroom() + sc.get);
		}
		}
	}
