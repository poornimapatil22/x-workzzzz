class Syringe{
	double volumeinmilimtrs=10;
	String size;
	double needlesize;
	double cost;
	
	public Syringe(double needlesizeLocal, double costLocal){
		System.out.println("create Syringe");
		needlesize=needlesizeLocal;
		cost=costLocal;
	}
}