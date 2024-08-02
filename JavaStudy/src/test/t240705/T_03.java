package test.t240705;

import java.util.Scanner;

public class T_03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		/*
		 3개의 수를 키보드로 입력 받아 입력 받은 수가 모두 같으면 true, 아니면 false를 출력하세요.
			ex.
			입력1 : 5
			입력2 : -8
			입력3 : 5
			
			false
		 */
		int n1, n2, n3;
		
		System.out.print("입력1 : ");
		n1 = sc.nextInt();
		System.out.print("입력2 : ");
		n2 = sc.nextInt();
		System.out.print("입력3 : ");
		n3 = sc.nextInt();
		
		if(n1 == n2 && n2 == n3) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}
	}

}
