package h.inherit.ex2;

public class Desktop extends Product {
	
    	private boolean allinOne;

		public Desktop() {
			super();
		}

		public Desktop(String brand, String pCode, String pName, int price,boolean allinOne) {
			super(brand, pCode, pName, price);
			this.allinOne = allinOne;
		}

		@Override
		public String information() {
			return super.information() + " 올인원:" + this.allinOne;
		}
    	
	
	
    	
    

}

