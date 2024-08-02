package test_200704;

import java.util.Scanner;

public class T_02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("권한을 학인하고자하는 회원 등급 : ");
		String role = sc.next();
		
		if(role.equals("관리자")) {
			System.out.println("회원관리, 게시글 관리, 게시글 작성, 게시글 조회, 댓글 작성");
		}else if(role.equals("회원")) {
			System.out.println("게시글 작성, 게시글 조회, 댓글 작성");
		}else if(role.equals("비회원")) {
			System.out.println("게시글 조회");
		}else {
			System.out.println("잘못입력하셨습니다");
		}
		
		
//		final String 관리자 = "회원관리, 게시글 관리, 게시글 작성, 게시글 조회, 댓글 작성";
//		final String 회원 = "게시글 작성, 게시글 조회, 댓글 작성";
//		final String 비회원 = "게시글 조회";
		

	}

}
