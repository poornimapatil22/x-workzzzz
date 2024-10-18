class Syringe{
	double volumeinmilimtrs=10;
	String size;
	double needlesize;
	double cost;
	
	public Syringe(double needlesizeLocal, double costLocal){
		System.out.println("created Syringe");
		needlesize=needlesizeLocal;
		cost=costLocal;
	}
}