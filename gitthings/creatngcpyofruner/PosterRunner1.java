class PosterRunner1{
	public static void main(String[] args){
		System.out.println("running main in poster runner");
		Poster1 poster1=new Poster1();
		
		String typeOfPoster=poster1.posterType;
		String posterColouris=poster1.posterColour;
	
		
		System.out.println("default-values of typeOfPoster: "+typeOfPoster);
		System.out.println("default-values of posterColour: "+posterColouris);
		
		typeOfPoster="Rectangle";
		posterColouris="White";
		
		System.out.println("updated-values of typeOfPoster: "+typeOfPoster);
		System.out.println("updated-values of posterColour: "+posterColouris);
		
		System.out.println("ending main in poster runner");
		
	}
}