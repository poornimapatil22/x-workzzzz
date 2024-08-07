class KeyBunchRunner{
	public static void main(String[] args){
		Key key=new Key(20,"maxi");
		KeyBunch keybunch=new KeyBunch("silver",key);
		
		keybunch.data();
		
		Key key1=new Key(30,"icon");
		KeyBunch keybunch1=new KeyBunch("gold",key1);
		
		keybunch1.data();
	}
}