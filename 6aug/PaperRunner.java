class PaperRunner{
	public static void main(String[] args){
		Paper paper=new Paper("A4");
		paper.colour="white";
		paper.setQuality(true);
	    paper.details();
		
		System.out.println("\n");
		Paper paper1=new Paper("A3");
		paper.colour="black";
		paper.setQuality(false);
	    paper.details();
		
		System.out.println("\n");
		Paper paper2=new Paper("A5");
		paper.colour="Blue";
		paper.setQuality(false);
	    paper.details();
	}
}