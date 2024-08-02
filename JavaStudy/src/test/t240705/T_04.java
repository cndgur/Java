package test.t240705;

import java.util.Scanner;

public class T_04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		/*
		 A, B, C 사원의 연봉을 입력 받고 각 사원의 연봉과 인센티브를 포함한 연봉을 계산하여 출력하고 
			인센티브 포함 급여가 3000만원 이상이면 “3000 이상”, 미만이면 “3000 미만”을 출력하세요.
			(A 사원의 인센티브는 0.4, B 사원의 인센티브는 없으며, C 사원의 인센티브는 0.15)
			
			ex.
			A사원의 연봉 : 2500
			B사원의 연봉 : 2900
			C사원의 연봉 : 2600
			
			A사원 연봉/연봉+a : 2500/3500.0
			3000 이상
			B사원 연봉/연봉+a : 2900/2900.0
			3000 미만
			C사원 연봉/연봉+a : 2600/2989.9999999999995
			3000 미만
		 */
			double a, b, c;
			System.out.print("A사원의 연봉 : ");
			a = sc.nextDouble();
			System.out.print("B사원의 연봉 : ");
			b = sc.nextDouble();
			System.out.print("C사원의 연봉 : ");
			c = sc.nextDouble();
			
			double ta, tb, tc;
			ta = (a * 0.4f)+a;
			tb = b;
			tc = (c * 0.15f)*c;
			
			
			System.out.printf("A사원 연봉/연봉+a : " + a + "/" + ta + "\n");
			System.out.println(ta >= 3000 ? "3000이상" : "3000미만");
			System.out.printf("B사원 연봉/연봉+a : " + b + "/" + tb + "\n");
			System.out.println(ta >= 3000 ? "3000이상" : "3000미만");
			System.out.printf("C사사원 연봉/연봉+a : " + c + "/" + tc+ "\n");
			System.out.println(ta >= 3000 ? "3000이상" : "3000미만");
		}
	}
