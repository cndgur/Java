package test240719.object2;

public class Secretary extends Employee implements Bonus {

	public Secretary() {
		super();
	}

	public Secretary(String name, int number, String department, int salary) {
		super(name, number, department, salary);
	}
	

	@Override
	public void incentive(int pay) {
		super.setSalary((int)(pay * 1.8));
		
	}

	@Override
	public double tax() {
		// TODO Auto-generated method stub
		return this.getSalary() * 0.1;
	}
	
	
	
	
}
