package test.t240705;

import java.util.Scanner;

public class T_09 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1;
		System.out.print("정수 : ");
		n1 = sc.nextInt();
		for (int i = 1; i <= n1; i++) {
			if (i % 2 == 0) {
				System.out.print("수");
			} else {
				System.out.print("박");
			}
		}
	}
}
