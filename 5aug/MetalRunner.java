class MetalRunner{
	public static void main(String[] args){
		Metal metal=new Metal();
		System.out.println(metal.metalName);
		System.out.println(metal.metalCost);
		
		Metal metal1=new Metal("copper");
		System.out.println(metal1.metalName);
		
		Metal metal2=new Metal(500);
		System.out.println(metal2.metalCost);
		
		Metal metal3=new Metal("Bronze",1000);
		System.out.println("metalname is: "+metal3.metalName+"metalcost is :"+metal3.metalCost);
	}
	
	
	
	
	
}