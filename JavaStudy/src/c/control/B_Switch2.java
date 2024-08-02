package c.control;

import java.util.Scanner;

public class B_Switch2 {
	public static void main(String[] args) {
		//월을 입력받아 해당월에 말일이 며칠까지 있는지를 출력하는 프로그램 작성	
		//월을 입력하세요 : xx
				
		// 1,3,5,7,8,10,12 => 31
		// 4,6,9,11 => 30
		// 2 => 28
		Scanner sc = new Scanner(System.in);
		int month , day;
		System.out.println("월을 입력하세요 : ");
		month = sc.nextInt();
		
		switch(month) {
		case 1 :
		case 3 :
		case 5 :
		case 7 :
		case 8 :
		case 10 :
		case 12:
			day = 31;
			break;
		case 4 :
		case 6 :
		case 9 :
		case 11 :
			day = 30;
			break;
		case 2 :
			day = 28;
			break;
		default :
			System.out.println("잘못입력했습니다.");
			return;
		}
		System.err.println(month +"월은" + day + "일 까지입니다.");
	}
}
