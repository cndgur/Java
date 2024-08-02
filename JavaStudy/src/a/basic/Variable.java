package a.basic;

public class Variable {
	/*
	 *  변수 : 값을 기록하고 사용하기 위한 메모리 공간. 값을 보관하거나 가져와 사용할 수 있다.
	 *  
	 *  [표현법] 자료형 변수이름;
	 *  
	 *  자료형 : 변수의 크기 및 모양을 지정해주는 부분
	 *  변수이름: 변수를 식별하기 위해 붙여주는 이름
	 */
	public static void main(String[] args) {
		//정수형 변수 num을 선언
		int  num;
		
		//정수형 변수 num에 10이라는 값을 대입해라
		num = 10;
		System.out.println(num);
		
		//참과 거짓을 표현하는 자료형으로 isTrue라는 이름의 변수를 만들어줘
		boolean isTrue;
		isTrue = false;
		System.out.println(isTrue);
		
		//실수형 (소수점 6자리까지)
		float num2;
		num2 = 2.193847f;
		System.out.println(num2);
		
		/*
		 * 정수 자료형
		 * byte(1), short(2), int(4), long(8)
		 * 모두 정수를 저장하는 자료형, 각 자료형마다 표현할 수 있는 수의 번위가 다르다.
		 */
		
		byte by = 10;
		short sh = 10;
		int in = 10;
		long lo = 10;
		System.out.println("\n[정수 자료형]");
		System.out.println(by + "," + sh + "," + in + "," + lo);
		
		/*
		 * 실수 자료형
		 * float(4), double(8)
		 * 실수를 저장하는 자료형으로 float보다 double이 더 정밀한 수를 표현할 수 있다.
		 */
		float fl = 4.23f;
		double dou = 5.2938;
		System.out.println("\n[실수 자료형]");
		System.out.println(fl + "," + dou);
		
		/*
		 * 문자 자료형
		 * char(2)
		 * 문자 하나를 담을 수 있는 자료형
		 * 자바는 2바이트 유니코드로 표현한다.
		 */
		char ch1 = '김';
		char ch2 = '가';
		char ch3 = '영';
		System.out.println("\n[문자 자료형]");
		System.out.println(ch1 + "" + ch2 + "" + ch3);
		
		/*
		 * 논리 자료형
		 * boolean(1)
		 * true(참)와 false(거짓)을 저장하는 자료형
		 */
		boolean b1 = 10 > 5; //true
		boolean b2 = 20 == 10; //false
		System.out.println("\n[논리 자료형]");
		System.out.println(b1);
		System.out.println(b2 + "\n");
		
		/*
		 * 문자열
		 * String(========================객체=======================)
		 * 문자열 같은 경우 할당해야 할 메모리가 너무 가변적이므로 원시타입이 아닌 객체로 변수를 만들어준다.
		 */
		
		String str1 = "병아리";
		String str2;
		str2 = "반달곰";
		String str3 = "반달곰";
		
		//String str3 = new String("안녕하세요"); //객체생성방식으로 String 변수를 선언
		System.out.println(str1);
		System.out.println(str2);
		System.out.println("str2 == str3 : " + (str2.equals(str3)));
		
		/* 이스케이프 시퀀스
		 * 문자열 내에서 탭, 백슬래시, 작은따옴표 등을 코드로 사용하기 위한 방식
		 * 
		 * 탭문자 : \t
		 * 백슬래시 : \\
		 * 작은따옴표 : \'
		 * 큰 따옴표 : \"
		 * 개행문자 : \n
		 * 등등 다양하게 있음
		 */
		System.out.println("저는 이렇게 말했습니다. \"저는 집에 가고싶어요\"");
		System.out.println("저는\n지금\n집에가고싶\n어요");
		
		/*
		 * 상수
		 * 수학에서의 상수 = 변하지 않는 값
		 * 프로그래밍에서는 한 번만 값을 할당할 수 있는 메모리
		 * 
		 * [표현법] final 자료형 변수이름;
		 * 
		 * 상수의 이름을 모두 대문자로 짓는것이 관례
		 * 이름이 둘 이상의 단어로 이루어질 경우 언더바로 연결해준다.
		 */
		final int MY_AGE;
		MY_AGE = 90;
		//MY_AGE = 111; 값을 초기화하면 더이상 변경할 수 없다.
	}
}