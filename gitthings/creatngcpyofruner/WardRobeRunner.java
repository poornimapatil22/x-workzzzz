class  WardRobeRunner{
	public static void main(String[] values){
	System.out.println("running main in copyrunner");
	
	WardRobe wardrobe=new WardRobe();
	String colour=wardrobe.wardrobecolour;
	int price=wardrobe.wardrobeprice;
	
	
	
	System.out.println("default-values of wardrobeprice are:"+price);
	System.out.println("default-values of wardrobecolour are:"+colour);
	
	price=15000;
	System.out.println("updated-values of wardrobeprice:"+price);
	
	wardrobe.wardrobeprice=10000;
	System.out.println("updated-values of wardrobeprice:"+wardrobe.wardrobeprice);
	
	colour="sky-blue";
	System.out.println("updated-values of wardrobecolour:"+colour);
	
	System.out.println("ending main in copyrunner");
}
}