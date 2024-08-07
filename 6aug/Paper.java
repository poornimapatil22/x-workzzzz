class Paper
{
	int thickness=45;
	String size;
	boolean quality;
	String colour;
	
	public Paper()
	{
		
	}
	public Paper(String size)
	{
		this.size=size;
	}
	
	public void setQuality(boolean quality)
	{
		this.quality=quality;
	}
	public void details(){
		System.out.println("Paper  thickness:"+thickness);
		System.out.println("Paper colour:"+colour);
		System.out.println("Paper quality:"+quality);
		System.out.println("Paper size:"+size);
		
	}
	
}