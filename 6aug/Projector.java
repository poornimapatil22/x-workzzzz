class Projector{
	String company;
	String type;
	String colour;
	int weight=6;
	
	public Projector()
	{
		
	}
	public Projector(String type)
	{
		this.type=type;
	}
	
	public void setColour(String colour)
	{
		this.colour=colour;
	}
	public void details(){
		System.out.println("Projector company :"+company);
		System.out.println("Projector type:"+type);
		System.out.println("Projector colour:"+colour);
		System.out.println("Projector weight:"+weight);
	
}
}