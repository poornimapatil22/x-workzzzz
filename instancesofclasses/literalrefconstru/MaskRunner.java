class MaskRunner{
	public static void main(String[] args){
		Mask mask=new Mask(45,"white");
		
		System.out.println("mask price is:"+mask.maskPrice);
		System.out.println("mask colour is:"+mask.maskColour);
		System.out.println("mask type is:"+mask.maskType);
		mask.maskDate="20-04-2020";
		System.out.println("anklet carrots is:"+mask.maskDate);
		
		Mask mask1=new Mask(35,"black");
		
		System.out.println("mask1 price is:"+mask1.maskPrice);
		System.out.println("mask1 colour is:"+mask1.maskColour);
		System.out.println("mask1 type is:"+mask1.maskType);
		mask1.maskDate="20-04-2020";
		System.out.println("anklet carrots is:"+mask1.maskDate);
	}
}