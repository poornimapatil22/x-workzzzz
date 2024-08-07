class Key{
	int weightinGm;
	String brand;
	
	Key(int weightinGm,String brand){
		this.weightinGm=weightinGm;
		this.brand=brand;
	}
	
	public void details(){
		System.out.println("weightinGm is:"+this.weightinGm);
		System.out.println("brand is:"+this.brand);
	}
	
	
}