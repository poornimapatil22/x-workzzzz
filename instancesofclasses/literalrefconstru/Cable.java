class Cable{
	boolean isConnected=true;
	int length;
	String Type;
	double cost;
	
	public Cable(String TypeLocal, double costLocal){
		System.out.println("create Cable");
		Type=TypeLocal;
		cost=costLocal;
	}
}