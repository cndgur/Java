package d.loop;

import java.util.Scanner;

public class B_while {
/*
 * while문
 * 
 * [표현식]
 * 
 * [초기식]
 * while(조건식){
 * 		반복할 코드
 * 		증감식;
 * }
 */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
//		for(int i=0; 1<5; i++) {
//			System.out.println("안녕하세요.");
//		}
	//사용자가 0을 입력할 때까지 반복해서 숫자를 입력받아 그래도 출력해라
//	while(true) {
//		int n = sc.nextInt();
//		if(n == 0) {
//			break;
//		} else {
//				System.out.println(n);
//			}
//		}
  
	//1에서부터 10000사이의 홀수만을 출력해라
//	int i = 1; 
//	while(i<=10000) {
//		if(i % 2 == 1){
//		 System.out.print(i + " ");
//		}	
//		i++;
//	}		
	
		//1부터 랜덤값(1~100사이)까지의 합계를 출력
		//1에서부터 xx까지의 총 합계 : xxxx
		
//		int i = 1;
//		int sum = 0;
//		int num = (int)Math.random()* 100  + 1;
//		while(i<=num) {
//			sum += i;
//			i++;
//			System.out.println("1부터" + num +" 까지의 총 합계" + sum);
//       }
		
//		int random = (int)(Math.random()*100)+1;
//		int sum = 0;
////		
////		for(int i = 1; i <= random; i++) {
////			sum += i;
////		}
////		
////		System.err.println("1에서부터" + random + "까지의 총 합계 :" + sum);
//		
//		int i = 1;
//		while(i <= random) {
//			sum += i;
//			i++;
//		}
//		System.out.println("1에서부터" + random + "까지의 총 합계 :" + sum);
	

	
	
	
	//사용자에게 문자열을 입력받아
	//해당 문자열의 짝수자리 글자만 출력
	//문자열 입력 : hello
	//el
	
//		String str;
//		System.out.println("문자열 입력 : ");
//		str = sc.next();
//		
////		int i = 0;
////		while(i<str.length()) {
////			if(i%2==1) {
////				System.out.println(str.charAt(i));
////			}
////				i++;
//		//}
//	
//	int i = 1;
//	while(i< str.length()) {
//		System.out.println(str.charAt(i));
//		i += 2;
//		
//	}
	/*구구단 1~9단을 출력해
	 * 
	 */
	for(int j = 2; j <10; j++)	{
		for(int i = 1; i < 10; i++) {
			System.out.println(j + "*" + i + "*" + "=" + (j*i));
			}
		}
	}
}
