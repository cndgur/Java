package test240708;

import java.util.Scanner;

public class T_01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n1;
		
		System.out.print("정수를 입력하세요 : ");
		n1 = sc.nextInt();
		
		if(n1 >= 1 && n1 <=100) {
			if(n1 % 2 ==0) {
				System.out.print("2의 배수입니다.");
			}else {
				System.out.print("2의 배수가 아닙니다.");
			}
		}

	}

}
