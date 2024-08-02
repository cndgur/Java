package test240715.object2;

public class BookArrayTest {

    public static void main(String[] args) {
        Book[] bArr = new Book[3];
        bArr[0] = new Book("자바의 정석", "남궁성", 30000, "도우출판", 0.1);
        bArr[1] = new Book("열혈강의 자바", "구정은", 29000, "프리렉", 0.1);
        bArr[2] = new Book("객체지향", "금영욱", 30000, "북스홈", 0.1);

        for (Book b : bArr) {
            // price 필드가 int 타입이므로 %d 포맷 지정자를 사용해야 함
            System.out.printf("%s, %s, %s, %d원, %.0f%%할인\n", b.getTitle(), b.getAuthor(), b.getPublisher(), b.getPrice(), b.getDiscountRate() * 100);
            System.out.println("할인된 가격 : " + (int) (b.getPrice() - (b.getPrice() * b.getDiscountRate())) + " 원");
        }
    }

}
