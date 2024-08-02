package test.t240705;

import java.util.Scanner;

public class T_02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/*
		 주민번호를 이용하여 남자인지 여자인지 구분하여 출력하세요.
			ex. 
			주민번호를 입력하세요(- 포함) : 132456-2123456
			
			여자
		 */
		
		System.out.print("주민번호를 입력하세요(- 포함) : ");
		String pn = sc.next();
		
		if(pn.charAt(7)=='3') { // char가 문자이니깐 '숫자'룰 입력해서 문자로 바꿔서 선언하기
			System.out.println("남자");
		} else if(pn.charAt(7)=='4') {
			System.out.println("여자");
		}
				
	}
	
}
