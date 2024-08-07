class Rocket{
	 String country= "india";
     double speed;
     double fuelCapacity;
     int noOfThrusters;
	 
	 public Rocket(int noOfThrusters){
		 this.noOfThrusters=noOfThrusters;
		 System.out.println("create Rocket");
	 }
	 public void setRocket(double fuelCapacity){
		 this.fuelCapacity=fuelCapacity;
	 }
	 public void details(){
		System.out.println("Rocket country :"+country);
		System.out.println("Rocket speed:"+speed);
		System.out.println("Rocket fuelCapacity:"+fuelCapacity);
		System.out.println("Rocket noOfThrusters:"+noOfThrusters);
		 
}
}

