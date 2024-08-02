package testalone;
import testalone.Book;
public class Run {

	public static void main(String[] args) {
		
		Book b1 = new Book();
		
		b1.setTitle("에이트");
		b1.setPublisher("한빛아카데미");
		b1.setAuthor("이충혁");
		b1.setPrice(32000);
		b1.setDiscountRate(10.26);
		
		b1.information();
	}

}
