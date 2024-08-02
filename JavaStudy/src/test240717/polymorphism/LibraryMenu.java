package test240717.polymorphism;

import java.util.Scanner;

public class LibraryMenu {
	private LibraryController lc;
	private Scanner sc;
	
	public LibraryMenu() {
		super();
		this.lc = new LibraryController();
		this.sc = new Scanner(System.in);
	}
	public void mainMenu() {
		System.out.print("이름 : ");
		String name = sc.next();
		System.out.print("나이 : ");
		int age = sc.nextInt();
		System.out.print("성별 : ");
		char gender = sc.next().charAt(0);
		
		Member mem = new Member(name,age,gender,0);
		lc.insertMember(mem);
		
		while(true) {
			System.out.println();
			System.out.println("==== 메뉴 ====");
			System.out.println("1. 마이페이지");
			System.out.println("2. 도서 전체 조회");
			System.out.println("3. 도서 검색");
			System.out.println("4. 도서 대여하기");
			System.out.println("9. 프로그램 종료하기");
			System.out.println("메뉴 번호 : ");
			int num =sc.nextInt();
			switch(num) {
			case 1 :
				lc.myInfo();
				System.out.println(mem);
				break;
			case 2 :
				lc.selectAll();
				break;
			case 3 :
				lc.searchBook(name);
				break;
			case 4 :
				lc.rentBook(0);
				break;
			case 9 :
				System.out.println("메뉴를 종료합니다.");
				break;
			default :
				System.out.println("메뉴를 잘 못 고르셨습니다.");
				return;
			}
		}
	}
	public void selectAll() {
		Book[] bList = lc.selectAll();
		for(int i = 0; i < bList.length; i++) {
			if(bList[i] == null) {
				break;
			}
			System.out.println(i + "번 도서" + bList[i].toString());
		}
	}
	public void searchBook() {
		
	}
	public void rentBook() {
		
	}
}
