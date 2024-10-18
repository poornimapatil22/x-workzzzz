class HarmoniumRunner{
	public static void main(String[] args){
		Harmonium harmonium1=new Harmonium(1000,true);
		harmonium1.color="Brown";
		System.out.println("Harmonium color:"+harmonium1.color);
		System.out.println("Harmonium brand:"+harmonium1.brand);
		System.out.println("Harmonium type:"+harmonium1.price);
		System.out.println("Harmonium weight:"+harmonium1.isElectric);
		
		System.out.println("\n");
		Harmonium harmonium2=new Harmonium(3000,false);
		harmonium2.color="Red";
		System.out.println("Harmonium color:"+harmonium2.color);
		System.out.println("Harmonium brand:"+harmonium2.brand);
		System.out.println("Harmonium type:"+harmonium2.price);
		System.out.println("Harmonium weight:"+harmonium2.isElectric);
	}
}