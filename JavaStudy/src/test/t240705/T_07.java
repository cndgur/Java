package test.t240705;

import java.util.Scanner;

public class T_07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.print("첫 번째 숫자 : ");
			int n1 = sc.nextInt();
			System.out.print("두 번째 숫자 : ");
			int n2 = sc.nextInt();

			if (n1 <= 0 || n2 <= 0) {
				System.out.println("1 이상의 숫자를 입력해주세요.");
			} else {
				int max = (n1 > n2) ? n1 : n2;
				int min = (n1 > n2) ? n2 : n1;

				for (int i = min; i <= max; i++) {
					System.out.print(i + " ");
				}
				break; // 유효한 범위의 숫자를 입력했을 때 반복문 탈출
			}
		}
		sc.close();
	}

}
