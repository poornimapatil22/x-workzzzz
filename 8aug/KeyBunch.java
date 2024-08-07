class KeyBunch{
	String material;
	Key key;
	
	KeyBunch(String material,Key key){
		this.material=material;
		this.key=key;
	}
	
	public void data(){
		System.out.println("material is:"+this.material);
		key.details();
	}
}