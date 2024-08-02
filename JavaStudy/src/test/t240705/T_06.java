package test.t240705;

import java.util.Scanner;

public class T_06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("중간 고사 점수 : ");
		double n1 = sc.nextDouble();
		System.out.print("기말 고사 점수 : ");
		double n2 = sc.nextDouble();
		System.out.print("과제 점수 : ");
		double n3 = sc.nextDouble();
		System.out.print("출석 점수 : ");
		double n4 = sc.nextDouble();
		System.out.println("=============결과=============");
		double N1 = (n1 * 0.2);
		double N2 = (n2 * 0.3);
		double N3 = (n3 * 0.3);
		double N4 = (n4/20*20);
		System.out.println("중간 고사 점수(20) : " + N1);
		System.out.println("기말 고사 점수(30) : " + N2);
		System.out.println("출석 점수    (20) : " + N3);
		System.out.println("과제 점수    (20) : " + N4);
		double sum = (N1 + N2 + N3 + N4);
		System.out.println("총점 :" + sum);
		if (sum >= 70) {
			System.out.println("Pass [합격]");
		} else {
			System.out.println("Fail [점수미달]");
		}
	}

}
