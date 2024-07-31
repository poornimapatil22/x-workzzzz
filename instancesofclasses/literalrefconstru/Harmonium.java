class Harmonium{
	
	String brand="Bina Harmonium";
	String color;
	double price;
	boolean isElectric;
	
	public Harmonium(double priceLocal, boolean isElectricLocal){
		System.out.println("create Harmonium");
	    price=priceLocal;
		isElectric=isElectricLocal;
	}
}