package test240708;

import java.util.Scanner;

public class T_05 {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 
		 System.out.print("입력 : ");
		 int n1 = sc.nextInt();
		 int n2 = sc.nextInt();
		 if(n1 >=1 && n1 <10 && n2 >= 1 && n2 <10) {
		 }
			 
			 if((n1*n2) >= 10) {
			 System.out.print("두자리 수 입니다.");
		 }else if((n1*n2) < 10) {
			 System.out.print("한자리 수 입니다.+");
		 }else {
			 System.out.print("1부터 9까지의 정수를 입력하세요");
		 }
	
	}
}
