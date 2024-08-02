package k.exception.ex3;

import java.util.Scanner;

public class NumberMenu {
	public void menu() throws NumRangeException {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수1 : ");
		int num1 = sc.nextInt();
		System.out.print("정수2 : ");
		int num2 = sc.nextInt();
		
		NumberController nc = new NumberController();
		boolean isDouble = nc.checkDouble();
		try {
			boolean num = nc.NumRangeException(num1, num2);
		}catch(NumRangeException e) {
			
		}
	}
}
