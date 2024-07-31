class Radio{
	boolean isOn=true;
	int Frequency;
	String Brand;
	double volumeLevel;
	
	public Radio(String BrandLocal, double volumeLevelLocal){
		System.out.println("create Radio");
		Brand=BrandLocal;
		volumeLevel= volumeLevelLocal;
	}
}