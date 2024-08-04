class PerfumeRunner{

	public static void main(String[] args){
		Perfume perfume=new Perfume();
		
		Perfume perfume1=new Perfume("EVA",250);
		System.out.println(perfume1.perfumeBrand);
		System.out.println(perfume1.perfumeCost);
		
		Perfume perfume2=new Perfume("fog",500,1);
		System.out.println(perfume2.perfumeCost);
		System.out.println(perfume2.perfumeBrand);
		System.out.println(perfume2.perfumeQuantity);
		
		
		Perfume perfume3=new Perfume("fragrance and beyond",250,4,500);
		System.out.println(perfume3.perfumeCost);
		System.out.println(perfume3.perfumeBrand);
		System.out.println(perfume3.perfumeQuantity);
		System.out.println(perfume3.perfumeWeightingm);
		
	}
}
	
	
	
	

