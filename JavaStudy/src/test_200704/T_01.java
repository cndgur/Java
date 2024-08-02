package test_200704;

import java.util.Scanner;

public class T_01 {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		
		final String ID = "myId";
		final String PWD = "myPassword12";
		String id,pwd;
		
		System.out.print("아이디 : ");
		id = sc.next();
		
		System.out.print("비밀번호 : ");
		pwd = sc.next();
		
		if(ID.equals(id)) {
			if(PWD.equals(pwd)) {
				System.out.println("로그인 성공");
			}else {
				System.out.println("비밀번호가 틀렸습니다.");
			}
		} else {
			System.out.println("아이디가 일치하지 않습니다");
		}
		
	
		

			
		}
	}

