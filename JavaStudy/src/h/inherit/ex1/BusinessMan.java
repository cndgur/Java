package h.inherit.ex1;

public class BusinessMan extends Man{
		private String company;
		private String position;
		
		


		public BusinessMan(String name, String company, String posittion) {
			super(name);
			this.company = company;
			this.position = posittion;
		}
		
		public void tellYourInfo() {
			System.out.println("My company is " + this.company);
			System.out.println("My position is " + this.position);
		}
		
}
