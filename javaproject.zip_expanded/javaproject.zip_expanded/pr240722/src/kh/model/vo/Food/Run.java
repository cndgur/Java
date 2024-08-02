package kh.model.vo.Food;

import java.nio.file.DirectoryStream.Filter;

public class Run {

	public static void main(String[] args) {
		Filter save = new Filter();
		Food apple = new Food("사과", 20);
        save.fileSave("food.dat", apple); // 파일명과 Food 객체 예시
    }
	}


