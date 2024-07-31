class CableRunner{
	public static void main(String[] args){
		Cable cable1=new Cable("USB",400);
		cable1.length=5;
		System.out.println("Cable length:"+cable1.length);
		System.out.println("Cable cost:"+cable1.cost);
		System.out.println("Cable type:"+cable1.Type);
		System.out.println("Cable connecting:"+cable1.isConnected);
		
		System.out.println("\n");
		Cable cable2=new Cable("Ethernet",500);
		cable2.length=10;
		System.out.println("Cable length:"+cable2.length);
		System.out.println("Cable cost:"+cable2.cost);
		System.out.println("Cable type:"+cable2.Type);
		System.out.println("Cable connecting:"+cable2.isConnected);
	}
}