package test240719.object2;

public class Company {
	public static void main(String[]args) {
		Employee[] employee = new Employee[2];
		employee[0] = new Secretary("Hilery", 1, "secretary",800);
		employee[0] = new Sales("Clinten", 2, "sales",1200);
		
		System.out.println("name\t department\t salary");
		System.out.println("-----------------------------------");
		for(Employee e : employee) {
			System.out.println(e.getName() + "\t" + e.getDepartment() + "\t" + e.getSalary());
		}
		
		System.out.println("인센티비 100지급");
		((Secretary)employee[0]).incentive(100);
		((Sales)employee[1]).incentive(100);
		
		System.out.println("name  \t department  \t salary");
		System.out.println("-----------------------------------");
		for(Employee e : employee) {
			System.out.println(e.getName() + "/t" + e.getDepartment() + "\t" + e.getSalary() + "\t" + e.tax());
		}
	}
}
