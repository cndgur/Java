package test240711.object1;

import java.util.Scanner;

public class T_02 {
	public static void main(String[] args) {
		//정수 num을 입력받아 크기가 num인 정수형 배열을 만들고 1~100사이의 랜덤값으로 모든 배열의 인덱스 값을 대입합니다
		//이후 모든 배열의 값을 출력하고 홀수인덱스의 값을 더한 값을 출력하세요.
		
		// 5 42 3 10 5
		// 홀수 index의 합 : 52
		
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		System.out.print("정수를 입력하시오 : ");
		int num = sc.nextInt();
		
		int [] arr = new int [num];
		
		for(int i=0; i < arr.length; i++) {
			arr[i] = (int)(Math.random()*100)+1;
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		System.out.print("홀수 index의 합 : ");
		for(int i=1; i < arr.length; i += 2) {
			sum += arr[i];
	}
	System.out.println(sum);
	}
}
