package test.t240705;

import java.util.Scanner;

public class T_11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int random = (int)(Math.random()*100)+1;
		//System.out.println(random);
		
		int count = 0;
		
		while(true) {
			System.out.println("1 ~ 100 사이의 임의의 난수를 맞춰보세요 : ");
			int i = sc.nextInt();	
			if(!(i >= 1 && i<=100)) {
				System.out.println("1~100 사이의 숫자를 입력하세요. ");
				continue;
			}
			count++;
			if(random == i){
				System.out.println("정답입니다.");
				System.out.println(count + "회만에 맞추셨습니다.");
			}else if(random < i) {
				System.out.println("Down !!");
			}else{
				System.out.print("UP !!");
			}
		}
	}

}
