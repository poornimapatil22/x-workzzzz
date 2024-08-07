class ChocolateRunner{
	public static void main(String[] args){
		
	Chocolate chocolate=new Chocolate("parle-g");
	chocolate.setFlavour("creamy");
	chocolate.size="small";
	chocolate.aboutChocolate();
	
	System.out.println("...............");
	
	Chocolate chocolate1=new Chocolate("eclairs");
	chocolate1.setFlavour("creamy");
	chocolate1.size="medium";
	chocolate1.aboutChocolate();
	
	System.out.println("...............");
	
	Chocolate chocolate2=new Chocolate("elaichi");
	chocolate2.setFlavour("cardamon");
	chocolate2.size="small";
	chocolate2.aboutChocolate();
	
}
}