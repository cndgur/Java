package test240711.object2;

public class Run {

	public static void main(String[] args) {
		//다음과 같은 코드를 실행했을 때 예시와 같은 결과가 출력되도록 TV 클래스를 작성하세요.
		/*
		 	TV myTv = new TV("삼성", 2020, 65, 100000);
		 	myTV.show();
		 	TV myTv2 = new TV("LG", 2024, 85, 500000);
		 	myTV2.show();
		 	
		 	
		 	삼성에서 만든 2020년형 65인치 TV 가격 : 100000
		 	LG에서 만든 2024년형 85인치 TV 가격 : 500000
		 */
		
		TV myTv = new TV("삼성", 2020, 65, 100000);
	 	myTv.information();
	 	TV myTv2 = new TV("LG", 2024, 85, 500000);
	 	myTv2.information();

	 	Human one = new Human("최지원", 100000);
		int num = 0;
	 	one.buy(myTv);
	 
	 	
	
	/*
	one이라는 Human 객체를 생성하고 해당 객체를 이용해서 myTV와 myTV2를 구매 가능한지 확인하는 
	코드를 작성하고자 한다.
	
	Human one = new Human("최지원", 100000);
	one.buy(myTV);
	
	 "최지원님 구매 내역"
	 "삼성에서 만든 2020년형 65인치 TV 가격 : 100000"
	 남은 잔액 : xxx
	 or
	 "최지원님이 잔액이 부족하여 구매하실 수 없습니다"
	 */
	}

}
