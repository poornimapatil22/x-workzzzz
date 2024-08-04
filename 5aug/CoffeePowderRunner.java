class CoffeePowderRunner{
	public static void main(String[] args){
		CoffeePowder coffeepowder=new CoffeePowder();
		
		CoffeePowder coffeepowder1=new CoffeePowder("levista");
		System.out.println("name is: "+coffeepowder1.companyName);
		
		CoffeePowder coffeepowder2=new CoffeePowder("bru",50,500,"16/3/2024");
		System.out.println("name is: "+coffeepowder2.companyName);
		System.out.println("cost is: "+coffeepowder2.cost);
		System.out.println("weight is: "+coffeepowder2.weight);
		System.out.println("manfDate: "+coffeepowder2.manfDate);
		
		CoffeePowder coffeepowder3=new CoffeePowder("espresso","16/8/2024");
		System.out.println("companyname is: "+coffeepowder3.companyName);
		System.out.println("manfDate: "+coffeepowder3.manfDate);
	
		CoffeePowder coffeepowder4=new CoffeePowder(250);
		System.out.println("weight is: "+coffeepowder4.weight);
	
	
	}
	
}