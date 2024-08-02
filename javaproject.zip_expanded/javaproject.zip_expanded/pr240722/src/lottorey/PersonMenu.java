package lottorey;

import java.util.Scanner;

public class PersonMenu {
	Scanner sc = new Scanner(System.in);
	Controller co = new Controller();
	
	public void mainmenu() {
		System.out.println(
		   	" \n\n ##        ####    ######   ######   ######   #####    ##  ##  \r\n"
				+ " ##       ##  ##     ##       ##     ##       ##  ##   ##  ##  \r\n"
				+ " ##       ##  ##     ##       ##     #####    #####    ###### \r\n"
				+ " ##       ##  ##     ##       ##     ##       ## ##      ##    \r\n"
				+ " ######    ####      ##       ##     ######   ##  ##     ##");
		
		System.out.println("\t=========동행복권에 오신 것을 환영합니다.=========");
		System.out.println("\t     ======회원가입을 진행하겠습니다.=======");
		System.out.print("이름을 입력하세요 : ");
		String name = sc.next();
		System.out.print("사용하실 아이디를 입력하세요 : ");
		String id = sc.next();
		System.out.print("사용하실 비밀번호를 입력하세요 : ");
		String pwd = sc.next();
		System.out.print("회원가입이 완료되었습니다."+ "\n"+ "인적사항을 등록하시려면 [1] 그만하시려면 [2]를 입력하세요 : ");
		String answer = sc.next();
		if(answer.equals("2")) {
			System.out.println("시스템을 종료합니다.");
			return;
		}else {
			System.out.println();
			System.out.println("======인적사항등록======");
		}
		System.out.print("태어난 년도를 입력하세요 : ");
		int year = sc.nextInt();
		System.out.print("태어난 월을 입력하세요 : ");
		int month = sc.nextInt();
		System.out.print("태어난 날을 입력하세요 : ");
		int day = sc.nextInt();
		if(year > 2005) {
			System.out.println("미성년자는 복권을 구매할 수 없습니다.");
		}else {
			System.out.println("인적사항이 정상적으로 등록되었습니다.");
		}
		co.insertPerson(name, id, pwd, year, month, day);
		while (true) {
			System.out.println();
			System.out.println("인적사항 확인을 원하시면 [1] 계속 진행은 [2] 프로그램 종료는 [3]을 입력하세요 : ");
		
          
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    co.printPerson();
                    break;
                case 2:
                    insertLottoNumber();
                    break;
                case 3:
                    System.out.println("시스템을 종료합니다.");
                    return;
                default:
                    System.out.println("잘못된 입력입니다. 다시 선택해주세요.");
            }
        }
	}
		public void printPerson() {
			Person[] prArr = co.printPerson();
			for(Person p : prArr) {
				if(p == null) {
					break;
				}	
				System.out.println(p.toString());
			}
		}
		public void insertLottoNumber() {
			System.out.println();
			System.out.println("======추첨 번호======");
			System.out.print("첫번째 번호를 입력하세요(1~10중에서 고르세요) : ");
			int num1 = sc.nextInt();
			System.out.print("두번째 번호를 입력하세요(1~10중에서 고르세요) : ");
			int num2 = sc.nextInt();
			System.out.print("세번째 번호를 입력하세요(1~10중에서 고르세요) : ");
			int num3 = sc.nextInt();
			System.out.print("네번째 번호를 입력하세요(1~10중에서 고르세요) : ");
			int num4 = sc.nextInt();
			System.out.print("다섯번째 번호를 입력하세요(1~10중에서 고르세요) : ");
			int num5 = sc.nextInt();
			System.out.print("여섯번째 번호를 입력하세요(1~10중에서 고르세요) : ");
			int num6 = sc.nextInt();
			
			System.out.println("고르신 번호가 저장되었습니다.");
			co.insertLottoNumber(num1, num2, num3, num4, num5, num6);
			while(true) {
				System.out.println();
			System.out.print("저장된 번호를 확인하시려면 [1] 계속 진행은 [2]을 입력하세요 : ");
		
			int choice = sc.nextInt();
			switch(choice) {
			case 1 :
				co.printLottoNumber();
				break;
			case 2 :
				searchPerson();
			default : 
				System.out.print("잘못입력하셨습니다 다시 입력하세요 : ");
				continue;
			}
		}
		}
		
		
		public void searchPerson() {
			String name;
			System.out.println("========회원 찾기========");
			System.out.print("검색할 이름 : ");
			name = sc.next();
			
			Person [] prArr = co.searchName(name);
			if(prArr[0] == null) {
				System.out.println("검색 결과가 없습니다.");
			}else {
				for(int i = 0; i < prArr.length; i++) {
					if(prArr[i] == null) {
						break;
					}
					String str = prArr[i].toString();
					System.out.println(str);
				}
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
}
