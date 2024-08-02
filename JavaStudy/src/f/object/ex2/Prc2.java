package f.object.ex2;

public class Prc2 {

	public static void main(String[] args) {
		int result;
		result = adder(4, 5);	//adder가 변화하는 값을 result에 저장
		System.out.println("4 + 5 = " + result);
		System.out.println("4.5 x 4.5 = " + square(4.5));
	}
	public static int adder(int num1, int num2) {
		int addResult = num1 + num2;
		return addResult; // addResult의 값을 변환
	}
	public static double square(double num) {
		return num * num; // num * num의 결과를 반환
	}
}
