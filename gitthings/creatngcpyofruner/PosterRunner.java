class PosterRunner{
	public static void main(String[] args){
		System.out.println("running main in poster runner");
		Poster poster=new Poster();
		String typeOfPoster=poster.posterType;
		String posterColouris=poster.posterColour;
	
		
		System.out.println("default-values of typeOfPoster: "+typeOfPoster);
		System.out.println("default-values of posterColour"+posterColouris);
		
		typeOfPoster="Rectangle";
		posterColouris="White";
		
		System.out.println("updated-values of typeOfPoster: "+typeOfPoster);
		System.out.println("updated-values of posterColour"+posterColouris);
		
		System.out.println("ending main in poster runner");
		
	}
}