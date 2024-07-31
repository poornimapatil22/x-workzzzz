class MugRunner{
	public static void main(String[] args){
		Mug mug=new Mug("levender",35.0);
		
		System.out.println("mugColour is:"+mug.mugColour);
		System.out.println("mugCost is:"+mug.mugCost);
		System.out.println("brought from :"+mug.broughtFromWhr);
		mug.mugSize="large";
		System.out.println("mugSize is:"+mug.mugSize);
		
		
		Mug mug1=new Mug("pista",45.0);
		
		System.out.println("mug1Colour is:"+mug1.mugColour);
		System.out.println("mug1Cost is:"+mug1.mugCost);
		System.out.println("brought from :"+mug1.broughtFromWhr);
		mug1.mugSize="medium";
		System.out.println("mugSize is:"+mug1.mugSize);
		
		
	}
}