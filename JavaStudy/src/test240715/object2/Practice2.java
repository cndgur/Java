package test240715.object2;

public class Practice2 {
	public static void main(String[]args) {
		//for(자료형 변수명 : 배열) {
		//		변수명 -> 배열에 있는 모든 요소가 한번씩 들어와서 반복
		//}
		String str = "1.22, 4.12, 5.93, 8.71, 9.34";
		double data[] = new double[5];
		double sum = 0;
		
		String []st = str.split(",");
		
		for(int i = 0; i <st.length; i++) {
			data[i] = Double.parseDouble(st[i]);
			sum += data[i];
		}
		double avg = sum / data.length;
		
		System.out.printf("합계 : %.3f\n" , sum);
		System.out.printf("평균 : %.3f" , avg);
	}
}
