class ProjectorRunner{
	public static void main(String[] args){
		Projector projector=new Projector("DLP");
		projector.company="HP";
		projector.setColour("black");
	    projector.details();
		
		System.out.println("\n");
		Projector projector1=new Projector("LCD");
		projector.company="Samsung";
		projector.setColour("White");
	    projector.details();
		
		System.out.println("\n");
		Projector projector2=new Projector("LCOS");
		projector2.company="black";
		projector.setColour("White");
	    projector.details();
	}
}