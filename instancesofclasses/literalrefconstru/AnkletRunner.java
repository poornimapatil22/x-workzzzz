class AnkletRunner{
	
	public static void main(String[] args){
		
		Anklet anklet=new Anklet("belgaum",50000);
		System.out.println("anklet brought from:"+anklet.ankletBroughtFrom);
		System.out.println("anklet price is:"+anklet.ankletPrice);
		System.out.println("anklet name is:"+anklet.ankletName);
		anklet.ankletCarrots="22-carrots";
		System.out.println("anklet carrots is:"+anklet.ankletCarrots);
		System.out.println("anklet price is:"+anklet.ankletPrice);
		
		
		Anklet anklet1=new Anklet("chikkodi",30000);
		System.out.println("anklet brought from:"+anklet1.ankletBroughtFrom);
		System.out.println("anklet price is:"+anklet1.ankletPrice);
		System.out.println("anklet name is:"+anklet1.ankletName);
		anklet1.ankletCarrots="24-carrots";
		System.out.println("anklet carrots is:"+anklet1.ankletCarrots);
		
	}
	
	
	
}