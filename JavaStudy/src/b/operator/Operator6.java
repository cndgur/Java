package b.operator;

import java.util.Scanner;

public class Operator6 {
	/*
	 * 삼항연산자 [표현식] 조건식 ? 조건식이 참일 경우 결과값 : 조건식이 거짓일 경우 결과값
	 * 
	 * 이 때, 조건식은 반드시 true 또는 false가 나오는 논리값이여야한다. 
	 * 주로 비교, 논리연산자를 통해서 작성
	 */

	public static void main(String[] args) {
//		int num = (3 > 10) ? 10 : 20; //참이면 물음표 뒤에 값이 num으로 들어감, 
//		거짓이면 그 다음에 있는 숫자가 num으로 들어감
//		System.out.println(num);

		// 입력받은 정수값이 양수인지 아닌지 판별 후 출력해라
		// 정수 값 입력 :
		// 양수 인지 음수 인지

		Scanner sc = new Scanner(System.in);

		int num;
		System.out.println("정수 값 입력 :");
		num = sc.nextInt();

		String str = (num > 0) ? "양수" : "음수";
		System.out.println(str);
		
		if(num > 0) {
			str = "양수";
		}else if(num == 0) {
			str = "0이다";
		} else {
			str = "음수";
		}
	}
}
