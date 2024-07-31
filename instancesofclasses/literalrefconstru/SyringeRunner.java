class SyringeRunner{
	public static void main(String[] args){Syringe Syringe1=new Syringe(3.5,400);
		Syringe1.size="S";
		System.out.println("Syringe volume:"+Syringe1.volumeinmilimtrs);
		System.out.println("Syringe size:"+Syringe1.size);
		System.out.println("Syringe needlesize:"+Syringe1.needlesize);
		System.out.println("Syringe cost:"+Syringe1.cost);
		
		System.out.println("\n");
		Syringe Syringe2=new Syringe(4.5,300);
		Syringe2.size="M";
		System.out.println("Syringe volume:"+Syringe2.volumeinmilimtrs);
		System.out.println("Syringe size:"+Syringe2.size);
		System.out.println("Syringe needlesize:"+Syringe2.needlesize);
		System.out.println("Syringe cost:"+Syringe2.cost);
	}
}