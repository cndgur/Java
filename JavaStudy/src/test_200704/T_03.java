package test_200704;

import java.util.Scanner;

public class T_03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a,b,max, min;
		System.out.print("첫 번째 숫자 : ");
		a = sc.nextInt();
		System.out.print("두 번째 숫자 : ");
		b = sc.nextInt();
		//둘 중 더 큰수 구하기
		max = (a>b)?a:b;
		min = (a>b)?b:a;
		
		if(min<1||max<1) {
			System.out.println("1이상의 숫자를 입력해주세요");
		}
		
			for (int i = min; i <= max; i++) {
				System.out.print(i + " ");
			}
	}
}
