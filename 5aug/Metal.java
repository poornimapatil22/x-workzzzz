class Metal{
	String metalName;
	int metalCost;
	
	
	
	Metal(){
		 
		System.out.println("created metal");
	}
	
	Metal(String metalName){
		 this.metalName=metalName;
		System.out.println("created metal");
	}
	
	
	Metal(int metalCost){
		 this.metalCost=metalCost;
		System.out.println("created metal");
	}
	
	
	Metal(String metalName,int metalCost){
		 this.metalName=metalName;
		this.metalCost=metalCost;
		System.out.println("created metal");
	}
}