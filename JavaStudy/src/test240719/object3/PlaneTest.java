package test240719.object3;

public class PlaneTest {

	public static void main(String[] args) {
		Airplane a = new Airplane("L747\t\t",1000);
		Cargoplane c = new Cargoplane("C40",1000);
		
		System.out.println("Plane\t\t\t"+ "fuelSize");
		System.out.println("---------------------------------");
		System.out.println(a);
		System.out.println(c);
		System.out.println("100 운항");
		System.out.println("Plane\t\t\t"+ "fuelSize");
		System.out.println("---------------------------------");
		System.out.println(a);
		System.out.println(c);
	}

}
