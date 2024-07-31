class StraightenerRunner{
	
	public static void main(String[] args){
	Straightener straightener=new Straightener("ikonic",true);
	
		System.out.println("company of straightener is:"+straightener.companyOfStrghtner);
		System.out.println("is the straightener is good:"+straightener.isItGood);
		System.out.println("cost of straightener is:"+straightener.costOfStrghtner);
		straightener.multiFunctnality="yes";
		System.out.println("straightener multiFunctnality :"+straightener.multiFunctnality);
		System.out.println("cost of straightener is:"+straightener.costOfStrghtner);
		
		
		
		Straightener straightener1=new Straightener("dyson",false);
	
		System.out.println("company of straightener1 is:"+straightener1.companyOfStrghtner);
		System.out.println("is the straightener1 is good:"+straightener1.isItGood);
		System.out.println("cost of straightener1 is:"+straightener1.costOfStrghtner);
		straightener1.multiFunctnality="no";
		System.out.println("straightener1 multiFunctnality :"+straightener1.multiFunctnality);
		
}
}