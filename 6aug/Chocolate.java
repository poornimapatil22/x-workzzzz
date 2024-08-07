class Chocolate{
	String brand;
	double price=10;
	String flavour;
	String size;
	
	
	Chocolate(String brand){
		this.brand=brand;
		System.out.println("chocolate is ready");
	}
	
	public void setFlavour(String flavour){
		this.flavour=flavour;
	}
	
	public void aboutChocolate(){
		System.out.println("brand is :"+brand);
		System.out.println("price is :"+price);
		System.out.println("flavour is :"+flavour);
		System.out.println("size is :"+size);
	}
}