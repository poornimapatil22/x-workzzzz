class Clip{
	String colour;
	String type;
	
	Clip(String colour,String type){
		this.colour=colour;
		this.type=type;
	}
	
	public void show(){
		System.out.println(" clip colour is :"+colour);
		System.out.println(" clip type is :"+type);
	}
	
}