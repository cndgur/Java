package test;

import java.util.Scanner;

public class Break {
	public static void main(String[] args) {
		//랜덤값(1~100) 발생시키고 그 랜덤값을 출력(이 과정을 계속 반복)
//		//단, 발생한 값이 3의 배수일 경우 반복문을 종료
		/*
		while(true) {
			int random = (int)(Math.random()*100)+1;
			System.out.println(random);
		if(random % 3 == 0) {
			break;
			}
		}
	*/
		//사용자에게 문자열을 입력받아 해당 문자열의 길이를 출력(과정 반복)
		//단, 사용자가 이력한 문자열이 "exit"일 경우 반목문을 탈출
		Scanner sc = new Scanner(System.in);
		
		String str;
		while(true) {
			System.out.println("문자열을 입력하시오 : ");
			str = sc.next();
			
			if(str.equals("exit")) {
				break;
				
			}System.out.println("길이 : " + str.length());
		}
	}
}
