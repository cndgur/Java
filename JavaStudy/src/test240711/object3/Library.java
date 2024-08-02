package test240711.object3;

import java.util.Scanner;

//사용자와의 소통
//입력을 받고 응답을 출력하는 것
public class Library {
	private Scanner sc = new Scanner(System.in);
	
	public void menu(){

		int menu = 0;
		while(menu !=9) {
			System.out.println("===========도서관리 프로그램===========");
			System.out.println("1. 도서등록");
			System.out.println("2. 도서목록 출력");
			System.out.println("3. 도서 검색");
			System.out.println("4. 도서 삭제");
			System.out.println("9. 종료");
			System.out.print("메뉴선택 : ");
			menu = sc.nextInt();
			sc.nextLine();
			switch(menu) {
			case 1: //도서 등록
				this.addBook();
				break;
			case 2: // 도서목록 출력
				break;
			case 3: // 도서 검색
				break;
			case 4: //도서 삭제
				break;
			case 9: //종료
				System.out.println("프로그램을 종효삽니다.");
				break;
			default:	
				System.out.println("잘못 입력하였습니다.");
			}
		}
	}

	public void addBook() {
		
	String title;
		String genre;
		String author;
		int number;
		System.out.print("제목을 입력하세요 : ");
		title = sc.nextLine();
		System.out.print("장르를 입력하세요 : ");
		genre = sc.nextLine();
		System.out.print("저자를 입력하세요 : ");
		author = sc.nextLine();
		System.out.print("책 번호를 입력하세요 : ");
		number = sc.nextInt();
		
		
		for(int i = 0; i<bArr.length; i++) {
			if(bArr[i] == null) {
				bArr[i] = new Book(title, genre, author, number);
				System.out.println("책을 등록하였습니다");
				System.out.println(bArr[i].toString());
				break;
			}else if(i == (bArr.length -1)) {
				System.out.println("이미 등록할 수 있는 책이 가득 찼습니다.");
			}
			
		}
		
	}


	public void printBookList() {
		System.out.println("=================등록 도서목록===================");
		for(int i =0; i<bArr.length; i++) {
			if(bArr[i] == null) {
				break;
			}
			System.out.println(bArr[i].toString());
		}
	}


	public void searchBook() {
		 System.out.println("================도서검색=================");
		 System.out.print("검색할 책 이름을 입력 : ");
		 String target = sc.nextLine();
		 
		 for(int i = 0; i<bArr.length; i++) {
			
			 if(bArr[i] == null) {
				 break;
			 }else if(target.equals(bArr[i].getTitle())) {
				 System.out.println(bArr[i].toString());
				 break;
			 }
		 }
	}

	public void deleteBook() {
		
	}
}
