class MugRunner{
	public static void main(String[] args){
		Mug mug=new Mug("levender",35.0);
		
		System.out.println("mugColour is:"+mug.mugColour);
		System.out.println("mugCost is:"+mug.mugCost);
		System.out.println("brought from :"+mug.broughtFromWhr);
		mug.mugSize="large";
		System.out.println("mugSize is:"+mug.mugSize);
		
		
		Mug mug1=new Mug("pista",45.0);
		
		System.out.println("mug1Colour is:"+mug1.mug1Colour);
		System.out.println("mug1Cost is:"+mug1.mug1Cost);
		System.out.println("brought from :"+mug1.broughtFromWhr);
		mug1.mug1Size="medium";
		System.out.println("mug1Size is:"+mug1.mug1Size);
		
		
	}
}