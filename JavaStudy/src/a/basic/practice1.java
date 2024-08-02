package a.basic;

import java.util.Scanner;

public class practice1 {
	public static void main(String[] agrs) {
		/*
		 * 키보드로 정수 두개를 입력받아 두수의 합,차,곱 나누기 한 값을 출력하세요.
		 */
		
		Scanner sc = new Scanner(System.in);
		
		int num1, num2;
		
		System.out.println("첫번째 정수:");
		num1 = sc.nextInt();
		sc.nextLine();
		
		System.out.println("두번째 정수:");
		num2 = sc.nextInt();
		sc.nextLine();
		
		System.out.println("합"+(num1+num2));
		System.out.println("차"+(num1-num2));
		System.out.println("곱"+(num1*num2));
		System.out.println("나누기"+(num1/num2));
		
		
	}
}
