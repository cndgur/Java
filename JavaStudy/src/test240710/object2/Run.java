package test240710.object2;

public class Run {

	public static void main(String[] args) {

		Book b1 = new Book("역행자", "몰라", "자청", 26000, 13.8);
		Book b2 = new Book("달러구트의 꿈 백화점", "콜라", "이미애", 12000, 8.2);
		Book b3 = new Book("the one thing", "둘리", "똥", 87000, 9.78);

		b1.information();
		System.out.println();
		b2.information();
		System.out.println();
		b3.information();
	}

}
