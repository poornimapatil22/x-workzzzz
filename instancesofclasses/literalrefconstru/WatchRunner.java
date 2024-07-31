class WatchRunner{
	public static void main(String[] args){
		
		Watch watch1=new Watch("Digital",true);
		watch1.price=5000;
		System.out.println("watch price:"+watch1.price);
		System.out.println("watch brand:"+watch1.brand);
		System.out.println("watch type:"+watch1.watchType);
		System.out.println("watch type:"+watch1.wantsToWatch);
		
		System.out.println("\n");
		Watch watch2=new Watch("Analog",false);
		watch2.price=1000;
		System.out.println("watch price:"+watch2.price);
		System.out.println("watch brand:"+watch2.brand);
		System.out.println("watch type:"+watch2.watchType);
		System.out.println("watch type:"+watch2.wantsToWatch);
		
	}
}