package l.io.ex3;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class FileByte {
	/*
	 * "바이트 스트림"을 통한 입출력해보기
	 * 
	 * - 바이트스트림 : 데이터를 1바이트 단위로 전송하는 통로(좁은통로 -> 한글깨짐)
	 * -기반스트림 : 외부매체와 직접적으로 연결하는 통로
	 * 
	 * xxxInputStream : xxx 매체로부터 데이터를 입력받는 통로(외부로부터 데이터를 읽어오겠다.)
	 * xxxOutputStream : xxx 매체로부터 데이터를 출력하는 통로(외부매체로 데이터를 내보내겠다.)
	 */
	
	//프로그램(자바) -> 외부매체(파일) 데이터를 출력(프로그램상의 데이터를 파일로 내보내보자)
	public void fileSave() {
		FileOutputStream fout = null;
		try {
			fout =new FileOutputStream("byte_test.txt");
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}finally {
			try {
			fout.close();
			}int value
		}
	}
}
