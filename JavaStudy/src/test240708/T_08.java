package test240708;

public class T_08 {

	public static void main(String[] args) {
		int [][] array = {{12, 41, 36, 56}, 
						  {82, 10, 12, 61}, 
						  {14, 16, 18, 78}, 
						  {45, 26, 72, 23}};

		double sum = 0, count = 0 ;
		for(int i = 0; i < array.length; i++) {
			for(int j = 0; j < array[i].length; j++) {
				sum += array[i][j];
				count++;
			}
		}
		System.out.println("합계 : " + sum);
		System.out.println("평균 : " + sum/count);
	}

}
