package test240708;

public class T_02 {

	public static void main(String[] args) {
		for(int i = 2; i < 6; i++) {
			for(int j = 1; j <10; j++ ) {
				int x = (i*j);
				if((i*j )% 2 ==1) {
					System.out.println(i + " * " + j + " = " + x);
				}
			}
		}
	}

}
