class ClothRunner{
	public static void main(String[] args){
		System.out.println("running main in cloth runner");
		Cloth cloth=new Cloth();
		int amntOfCloth=cloth.clothAmnt;
		String sizeofCloth=cloth.clothSize;
		
		System.out.println("default-values of amntOfCloth:"+amntOfCloth);
		System.out.println("default-values of sizeofCloth:"+cloth.clothSize);
		
		cloth.clothAmnt=500;
		sizeofCloth="XL";
		System.out.println("updated-values:"+cloth.clothAmnt);
		System.out.println("updated-values:"+sizeofCloth);
		
		System.out.println("ending main in cloth runner");
		
	}
}