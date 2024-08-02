package test.t240705;

import java.util.Scanner;

public class T_01 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		/*
		 실수형으로 국어, 영어, 수학 세 과목의 점수를 입력 받아 총점과 평균을 출력하세요.
			이 때 총점과 평균은 정수형으로 처리하세요.
			
			ex.
			국어 : 90.0
			영어 : 90.0
			수학 : 90.0
			
			총점 : 270
			평균 : 90
		 */
		double n1, n2, n3;
		double total;
		double avr;
		System.out.print("국어 : ");
		n1 = sc.nextDouble();
		System.out.print("영어 : ");
		n2 = sc.nextDouble();
		System.out.print("수학 : ");
		n3 = sc.nextDouble();
		
		total = (double)(n1 + n2 + n3);
		avr = total/3;
		
		System.out.println("총점 : " + total);
		System.out.println("평균 : " + avr);
	}
}