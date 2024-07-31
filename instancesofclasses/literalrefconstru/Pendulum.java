class Pendulum{
	String Type="bifilar pendulum";
	int lengthIncm;
	String Angle;
	double cost;
	
	public Pendulum(String AngleLocal, double costLocal){
		System.out.println("create Pendulum");
		Angle=AngleLocal;
		cost=costLocal;
	}
}