class PostBoxRunner{
	public static void main(String[] args){
		System.out.println("running main in postbox runner");
		PostBox postbox=new PostBox();
		String areaofpostbox= postbox.postBoxarea;
		int capacityofpb=postbox.postBoxCapacity;
	
		
		System.out.println("default-values of postboxarea: "+areaofpostbox);
		System.out.println("default-values of capacityofpb: "+capacityofpb);
		
		areaofpostbox="kagwad-Belgavi";
		capacityofpb=224;
		
		System.out.println("updated-values of areaofpostbox:"+areaofpostbox);
		System.out.println("updated-values of capacityofpb:"+capacityofpb);
		
		System.out.println("ending main in postbox runner");
		
	}
}