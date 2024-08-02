package test.t240705;

import java.util.Scanner;

public class T_08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1, n2;
		String str;
		int plus, minus, multi, div, ahrt;
		while (true) {
			System.out.print("연산자(+, -, *, /, %) : ");
			str = sc.next();

			if (str.equals("exit")) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
			System.out.print("정수 1 :");
			n1 = sc.nextInt();
			System.out.print("정수 2 :");
			n2 = sc.nextInt();

			switch (str) {
			case "+":
				plus = n1 + n2;
				System.out.print(n1 + " + " + n2 + " = " + plus);
				break;
			case "-":
				minus = n1 - n2;
				System.out.print(n1 + " - " + n2 + " = " + minus);
				break;
			case "*":
				multi = n1 * n2;
				System.out.print(n1 + " * " + n2 + " = " + multi);
				break;
			case "/":
				
				if (n2 == 0) {
					System.out.println("0으로 나눌 수 없습니다. 다시 입력해주세요.");
					break;
				}div = n1 / n2;
				System.out.print(n1 + " / " + n2 + " = " + div);
				break;
			case "%":
				ahrt = n1 % n2;
				System.out.print(n1 + " % " + n2 + " = " + ahrt);
				break;
			default:
				System.out.println("없는 연산자입니다. 다시 입력해주세요.");
			}
		}
	}

}
