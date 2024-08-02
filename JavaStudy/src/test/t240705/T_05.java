package test.t240705;

import java.util.Scanner;

public class T_05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("키(m)를 입력해 주세요 : ");
		double height = sc.nextDouble();
		System.out.println("몸무게(kg)를 입력해 주세요 : ");
		double weight = sc.nextDouble();
		
		double BMI;
		BMI = weight / (height*height);
		System.out.println("BMI 지수 : " + BMI);
	
		if(BMI < 18.5) {
			System.out.println("저체중");
		}else if(BMI<23) {
			System.out.println("정상체중");
		}else if(BMI<25) {
			System.err.println("과체중");
		}else if(BMI<30) {
			System.out.println("비만");
		}else {
			System.out.println("고도비만");
		}
	}

}
