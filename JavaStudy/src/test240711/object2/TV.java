package test240711.object2;

public class TV {
	private String brand;
	private int year;
	private int size;
	private int price;
	
	public TV() {
		super();
	}

	public TV(String brand, int year, int size, int price) {
		super();
		this.brand = brand;
		this.year = year;
		this.size = size;
		this.price = price;
	}
	

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	public void information() {
		System.out.println(brand + "에서 만든 " + year + "년형 " + size + "인치 " + "TV 가격 : " + price);
	
	}


}
