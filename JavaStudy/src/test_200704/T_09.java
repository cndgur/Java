package test_200704;

public class T_09 {

	public static void main(String[] args) {
		
		String[][] strArr = new String [4][4];
	for(int i = 0; i<strArr[0].length; i++) {
			strArr[0][i] = "(0행" + i + "열)";
		}
		for(int i = 0; i<strArr[0].length; i++) {
			strArr[1][i] = "(0행" + i + "열)";
		}
		for(int i = 0; i<strArr[0].length; i++) {
			strArr[2][i] = "(0행" + i + "열)";
		}
		for(int i = 0; i<strArr[0].length; i++) {
			strArr[3][i] = "(0행" + i + "열)";
		}
		for(int j =0 ; j<strArr.length; j++) {
			for(int i=0; i<strArr[j].length; i++) {
				strArr[j][i] = "(" + j + "행" + i + "열")"; 
			}
		}		
		
		for(int j =0 ; j<strArr.length; j++)
			for(int i=0; i<strArr[j].length; i++) {
				System.out.print(strArr [j][i] + " ");
			}
			System.out.println();
	}

}
