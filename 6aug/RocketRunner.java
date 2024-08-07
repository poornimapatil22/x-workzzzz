class RocketRunner{
	public static void main(String[] args){
	Rocket rocket=new Rocket(2);
		double speed=1000;
		rocket.setRocket(5000);
		rocket.details();
		
		System.out.println("\n");
		Rocket rocket1=new Rocket(4);
		double speed1=2000;
		rocket.setRocket(6000);
		rocket.details();
		
		System.out.println("\n");
		Rocket rocket2=new Rocket(3);
		double speed2=3000;
		rocket.setRocket(6000);
		rocket.details();
}
}