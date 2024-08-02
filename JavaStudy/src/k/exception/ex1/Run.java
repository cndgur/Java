package k.exception.ex1;

import java.io.IOException;

public class Run {
	public static void main(String[] args) {
		RunException ex = new RunException();
		
		//ex.method01();
		//ex.method02();
		try {
			ex.methodA();
		} catch (IOException e) {
			System.out.println("main에서 해결");
			e.printStackTrace();
		} 
			
	

	}
}
