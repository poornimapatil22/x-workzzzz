class Ananya{
	String mobileName;
	Knife knife;
	
	Ananya(String mobileName,Knife knife){
		this.mobileName=mobileName;
		this.knife=knife;
	}
	
	public void display(){
		System.out.println("Mobile name is:"+mobileName);
		knife.details();
	}
	
	
	public static void main(String[] args){
		Knife knife=new Knife(50,50);
		Ananya ananya=new Ananya("Samsung",knife);
		ananya.display();
	}
	
}