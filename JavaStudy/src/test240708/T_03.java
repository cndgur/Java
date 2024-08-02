package test240708;

public class T_03 {

	public static void main(String[] args) {
		int sum = 0;
//		for(int i = 1; i<101; i++) {
//			sum += i;
//			
//		}
//		System.out.println("합계 : " + sum);
//		System.out.println("평균 : " + sum/100.0);
		int i = 1;
		while(i<101) {
			sum += i;
			i++;
		}
		System.out.println("합계 : " + sum);
		System.out.println("평균 : " + sum/100.0);

	}

}
