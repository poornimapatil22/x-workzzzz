class SpeakerRunner{
	public static void main(String[] args){
		
		Speaker speaker=new Speaker(50);
		
		speaker.setOutput("maximum");
		
		speaker.cost=100;
		
		speaker.details();
		
		System.out.println(".....................");
		
		
		Speaker speaker1=new Speaker(60);
		
		speaker1.setOutput("minimum");
		
		speaker1.cost=150;
		
		speaker1.details();
		
		
		System.out.println(".....................");
		
		
		Speaker speaker2=new Speaker(70);
		
		speaker2.setOutput("medium");
		
		speaker2.cost=200;
		
		speaker2.details();
	}
	
	
}