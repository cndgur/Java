package i.polymorphism.ex3;

import java.util.Scanner;

public class LibraryMenu {
    private LibraryController lc; // LibraryController 객체 참조 변수
    private Scanner sc;

    public LibraryMenu() {
    	super();
        this.lc = new LibraryController(); 
        this.sc = new Scanner(System.in);// LibraryController 객체 초기화
    }

    public void mainMenu() {
        System.out.print("이름 : ");
        String name = sc.next();
        System.out.print("나이 : ");
        int age = sc.nextInt();
        System.out.print("성별 : ");
        char gender = sc.next().charAt(0);

        Member mem = new Member(name, age, gender, 0);
        lc.insertMember(mem); // LibraryController에 회원 추가
       
        while (true) {
        	System.out.println();
            System.out.println("==== 메뉴 ====");
            System.out.println("1. 마이페이지");
            System.out.println("2. 도서 전체 조회");
            System.out.println("3. 도서 검색");
            System.out.println("4. 도서 대여하기");
            System.out.println("9. 프로그램 종료하기");
            System.out.print("메뉴 번호 : ");
            
            int num = sc.nextInt();
            switch (num) {
                case 1:
                   Member m = lc.myInfo(); 
                    System.out.println(m);// 마이페이지 메뉴
                    break;
                case 2:
                    this.selectAll(); // 도서 전체 조회 메뉴
                    break;
                case 3:
                    this.searchBook(); // 도서 검색 메뉴
                    break;
                case 4:
                    this.rentBook(); // 도서 대여하기 메뉴
                    break;
                case 9:
                    System.out.println("프로그램을 종료합니다.");
                    break; // 프로그램 종료
                default:
                    System.out.println("잘못된 메뉴 번호입니다.");
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
		System.out.println("검색할 제목 키워드 : ");
		String keyword = sc.next();
		Book[] bookList = lc.searchBook(keyword);
		
		for(int i = 0; i<bookList.length; i++) {
			if(bookList[i] == null) {
				break;
			}
			System.out.println(i + "번 도서" + bookList[i].toString());
		}
	}
	
	public void rentBook() {
		this.selectAll();
		
		System.out.println("대여할 도서 번호 서택 : ");
		int index = sc.nextInt();
		int result = lc.rentBook(index);
		lc.rentBook(index);
		switch(result) {
		case 0 : 
			System.out.println("성공적으로 대여되었습니다.");
			break;
		case 1 :
			System.out.println("나이 제한으로 대여 불가능입니다.");
			break;
		case 2 :
			System.out.println("성공적으로 대여되었습니다. 요리학원 쿠폰이 발급되었으니 마이페이지에서 확인하세요.");
		}
	}
}
