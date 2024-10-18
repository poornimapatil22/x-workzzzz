class TrumpetRunner{
	public static void main(String[] args){
		Trumpet trumpet1=new Trumpet("Trumpet A",100);
		trumpet1.cost=5000;
		System.out.println("Trumpet cost:"+trumpet1.cost);
		System.out.println("Trumpet tune:"+trumpet1.isInTune);
		System.out.println("Trumpet type:"+trumpet1.Type);
		System.out.println("Trumpet weight:"+trumpet1.weightInkg);
		
		System.out.println("\n");
		Trumpet trumpet2=new Trumpet("Trumpet B",200);
		trumpet2.cost=10000;
		System.out.println("Trumpet cost:"+trumpet2.cost);
		System.out.println("Trumpet tune:"+trumpet2.isInTune);
		System.out.println("Trumpet type:"+trumpet2.Type);
		System.out.println("Trumpet weight:"+trumpet2.weightInkg);
	}
}