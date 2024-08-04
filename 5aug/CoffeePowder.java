class CoffeePowder{
	String companyName;
	int cost;
	int weight;
	String manfDate;
	
	CoffeePowder(){
		System.out.println("created coffeepowder");
		
	}
	
	CoffeePowder(String companyName){
		this.companyName=companyName;
		System.out.println("created coffeepowder");
		}
	
	CoffeePowder(String companyName,int cost,int weight,String manfDate){
		this.companyName=companyName;
		this.cost=cost;
		this.weight=weight;
		this.manfDate=manfDate;
		System.out.println("created coffeepowder");
		}
		
		
		CoffeePowder(String companyName,String manfDate){
		this.companyName=companyName;
		this.manfDate=manfDate;
		System.out.println("created coffeepowder");
		}
		
		
		CoffeePowder(int weight){
		this.weight=weight;
		System.out.println("created coffeepowder");
		}
		
		
	
	
}