class Speaker{
	String brand="max";
	int size;
	int cost;
	String output;
	
	Speaker(int size){
		this.size=size;
		System.out.println("created speaker");
	}
	
	public void setOutput(String output){
		this.output=output;
	}
	
	public void details(){
		System.out.println("size is :"+size);
		System.out.println("brand is :"+brand);
		System.out.println("cost is :"+cost);
		System.out.println("output is :"+output);
	}
	
}