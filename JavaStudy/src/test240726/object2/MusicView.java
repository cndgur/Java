package test240726.object2;

import java.util.List;
import java.util.Scanner;

public class MusicView {

	private Scanner sc = new Scanner(System.in);
	private MusicController mc = new MusicController();
	int choice = 0;
	public void mainMenu() {
		while(choice != 9) {
		System.out.println();
		System.out.println("******* 메인 메뉴 *******");
		System.out.println("1. 마지막 위치에 곡 추가");
		System.out.println("2. 첫 위치에 곡 추가");
		System.out.println("3. 전체 곡 목록 출력 ");
		System.out.println("4. 특정 곡 검색");
		System.out.println("5. 특정 곡 삭제");
		System.out.println("6. 특정 곡 정보 수정");
		System.out.println("7. 곡명 오름차순 정렬");
		System.out.println("8. 가수명 내림차순 정렬");
		System.out.println("9. 종료");
		System.out.print("메뉴 번호 선택 : ");
		choice = sc.nextInt();
		sc.nextLine();
		
		switch(choice) {
		case 1:
			addList();
			break;
		case 2:
			addAtZero();
			break;
		case 3:
			printAll();
			break;
		case 4:
			 searchMusic();
			 break;
		case 5:
			removeMusic();
			break;
		case 6:
			setMusic();
			break;
		case 7:
			ascTitle();
			break;
		case 8:
			descSinger();
			break;
		case 9:
			System.out.println("시스템을 종료합니다.");
			return;
		default:	
			System.out.println("잘 못 입력하였습니다. 다시입력하세요.");
			continue;
			}
		}
	}
	
	public void addList() {
		System.out.println("****** 마지막 위치에 곡 추가 ******");
		System.out.print("곡 명 : ");
		String title = sc.nextLine();
		
		System.out.print("가수 명 : ");
		String singer = sc.nextLine();
		
		int result = mc.addList(new Music(title, singer));
		if(result == 1) {
			System.out.println("추가 성공");
		}else {
			System.out.println("추가 실패");
		}
	}
	
	public void addAtZero() {
		System.out.println("****** 첫 위치에 곡 추가 ******");
		System.out.print("곡 명 : ");
		String title = sc.nextLine();
		
		System.out.print("가수 명 : ");
		String singer = sc.nextLine();
		
		int result = mc.addAtZero(new Music(title, singer));
		
		if(result == 1) {
			System.out.println("추가 성공");
		}else {
			System.out.println("추가 실패");
		}
	}
	
	public void printAll() {
		System.out.println("****** 전체 곡 목록 출력 ******");
		List list = mc.prinAll();
		System.out.println(list);
		
	}
	
	public void searchMusic() {
		System.out.println("****** 특정 곡 검색 ******");
		System.out.println("검색할 곡 명 : ");
		String title = sc.nextLine();
		Music m = mc.searchMusic(title);
		if(m == null) {
			System.out.println("검색한 곡이 없습니다.");
		}else {
			System.out.println(m);
		}
	}
	
	public void removeMusic() {
		System.out.println("****** 특정 곡 삭제 ******");
		System.out.print("곡 제목 : ");
		String title = sc.nextLine();
		Music m = mc.removeMusic(title);
		if(m == null) {
			System.out.println("삭제할 곡이 없습니다.");
		}else {
			System.out.println(m.toString() + "을 삭제했습니다.");
		}
	}
	
	public void setMusic() {
		System.out.println("****** 특정 곡 정보 수정 ******");
		System.out.print("수정 할 곡 입력 : ");
		String searchtitle = sc.nextLine();
		
		System.out.print("수정할 곡 명 : ");
		String title = sc.nextLine();
		System.out.print("수정할 가수 명 : ");
		String singer = sc.nextLine();
		
		Music m = mc.setMusic(searchtitle, new Music(title, singer));
		if(m == null) {
			System.out.println("수정할 곡이 없습니다.");
		}else {
			System.out.println("수정이 되었습니다.");
		}
	}
	
	public void ascTitle() {
		System.out.println("****** 곡 명 오른차순 정렬 *******");
		int res = mc.ascTitle();
		if(res == 1) {
			System.out.println("정렬 성공");
		}else {
			System.out.println("정렬 실패");
		}
	}
	
	public void descSinger() {
		System.out.println("****** 가수 명 내림차순 정렬 *******");
		int res = mc.descSinger();
		if(res == 1) {
			System.out.println("정렬 성공");
		}else {
			System.out.println("정렬 실패");
		}
	}
}
	

