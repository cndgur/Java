package test.t240703;

import java.util.Scanner;

public class T_01 {
	public static void main(String[] args) {
		/*
		 * 아래 예시와 같이 메뉴를 출력하고 
		 * 메뉴 번호를 누르면 "00메뉴입니다"를 종료번호를 누르면 "프로그램이 종료됩니다."를 출력하세요
		 * ex)
		 * 1.입력
		 * 2.수정
		 * 3.조회
		 * 4.삭제
		 * 7.종료
		 * 메뉴번호를 입력하세요 :
		 * 조회 메뉴입니다
		 */
	Scanner sc = new Scanner(System.in);
	System.out.println("메뉴를 입력하세요 : ");
	System.out.println("1.입력");
	System.out.println("2.수정");
	System.out.println("3.조회");
	System.out.println("4.삭제");
	System.out.println("7.종료");
	
	int num = sc.nextInt();
	
	switch(num) {
	case 1 :
		System.out.println("입력 메뉴입니다");
		break;
	case 2 :
		System.out.println("수정 메뉴입니다");
		break;
	case 3 :
		System.out.println("조회 메뉴입니다");
		break;
	case 4 :
		System.out.println("삭제 메뉴입니다");
		break;
	case 7 :
		System.out.println("종료 메뉴입니다");
		break;
	default :
		System.out.println("잘못입력하였습니다");
	}
	
	
	
	
	
	
	
	
	}
}
