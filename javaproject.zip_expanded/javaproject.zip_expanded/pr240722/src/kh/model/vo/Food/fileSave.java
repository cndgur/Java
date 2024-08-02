package kh.model.vo.Food;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class fileSave {
	public void output() {
		FileWriter fw = null;
		
		try {
			
			fw = new FileWriter("test.txt", true);
			fw.write(97);
			fw.write(65);
		} catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}
	}

		
	
}
