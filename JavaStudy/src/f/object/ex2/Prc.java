package f.object.ex2;

public class Prc {
	public static void main(String[] args) {
		double hei = 179.5;
		hiEvr(25, hei);
		byEvr();
	}
	public static void hiEvr(int age, double hei) {
		System.out.println("제 나이는 " + age + "이고, " + "제 키는 " + hei + "입니다.");
	}
	public static void byEvr(){
		System.out.println("다음에 또 봐요.");
	}
}
