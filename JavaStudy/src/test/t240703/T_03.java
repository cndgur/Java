package test.t240703;

import java.util.Scanner;

public class T_03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("국어 점수를 입력하시오. : ");
		int num1 = sc.nextInt();
		System.out.print("영어 점수를 입력하시오. : ");
		int num2 = sc.nextInt();
		System.out.print("수학 점수를 입력하시오. : ");
		int num3 = sc.nextInt();

		int sum = num1 + num2 + num3;
		float avr = sum / 3.0f;
		if (num1 >= 40 || num2 >=40 || num3 >=40 || avr >= 60) {
			System.out.println("국어점수" + ":" + num1);
			System.out.println("영어점수" + ":" + num2);
			System.out.println("수학점수" + ":" + num3);
			System.out.println("합계" + ":" + sum);
			System.out.println("평균" + ":" + avr);
			System.out.println("축하합니다, 합격입니다!");
		} else  {
			System.out.println("국어점수" + ":" + num1);
			System.out.println("영어점수" + ":" + num2);
			System.out.println("수학점수" + ":" + num3);
			System.out.println("불합격입니다.");
		}

	}

}
