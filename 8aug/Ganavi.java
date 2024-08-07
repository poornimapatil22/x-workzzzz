class Ganavi{
	
	String email;
	Clip clip;
	
	Ganavi(String email,Clip clip){
		this.email=email;
		this.clip=clip;
	}
	public void details(){
		System.out.println("email is: "+this.email);
		clip.show();
	}
	
	public static void main(String[] args){
		Clip clip=new Clip("white","small");
		Ganavi ganavi=new Ganavi("ganavi123@gmail.com",clip);
		ganavi.details();
	}
}