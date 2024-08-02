package Z.Practice;

import java.util.Scanner;

public class E_Array01 {

	public static void main(String[] args) {

		/*
		 * 4. 사용자에게 배열의 길이를 입력받아 해당크기의 문자열배열을 생성해라. 길이 입력 : x
		 */
		int size;
		Scanner sc = new Scanner(System.in);
		System.out.println("길이 입력 : ");
		size = sc.nextInt();
		String[] strArr = new String[size];
		for (int i = 0; i < strArr.length; i++) {
			System.out.print(strArr[i] + " ");
		}
		String str;
	}

}