package f.object.ex2;

public class Prc3 {
	public static void main(String[] args) {
		divide(5, 2);
		divide(35, 5);
		divide(9, 0);
	}
	public static void divide(double num1, double num2) {
		if(num2 == 0) {
			System.out.println("0으로 나눌 수 없습니다.");
			return;
		}
		System.out.println("나눗셈 결과 : " + num1/num2);
	}
}
