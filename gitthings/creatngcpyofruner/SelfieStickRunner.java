class SelfieStickRunner{
	public static void main(String[] poornima){
		System.out.println("running main in selfiestick runner");
		SelfieStick selfiestick=new SelfieStick();
		int amntofSelfiestick=selfiestick.selfiestickAmnt;
		double sizeofSelfiestick=selfiestick.selfiestickSizeinfeet;
		
		System.out.println("default-values of amntofSelfiestick:"+amntofSelfiestick);
		System.out.println("default-values of sizeofSelfiestick:"+sizeofSelfiestick);
		
		amntofSelfiestick=450;
		sizeofSelfiestick=80.55;
		System.out.println("updated-values:"+amntofSelfiestick);
		System.out.println("updated-values:"+sizeofSelfiestick);
		
		System.out.println("ending main in selfiestick runner");
		
	}
}