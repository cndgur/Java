package test240708;

import java.util.Scanner;

public class T_06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		System.out.print("1부터 5까지의 숫자를 입력해주세요 : ");
		num = sc.nextInt();
		
		switch(num) {
		case 1 :
			System.out.println(" **입력이 정상적으로 되었습니다!**");
			break;
		case 2 :
			System.out.println("** 조회가 시작되었습니다! **");
			break;
		case 3 :
			System.out.println("** 수정이 정상적으로 되었습니다! **");
			break;
		case 4 :
			System.out.println("** 삭제가 정상적으로 되었습니다! **");
			break;
		case 5 :
			System.out.println("** 정상적으로 종료 되었습니다! **");
			break;
			
		
			
		}
	}

}
