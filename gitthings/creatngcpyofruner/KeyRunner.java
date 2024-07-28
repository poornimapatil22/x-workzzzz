class KeyRunner{
	public static void main(String[] args){
		System.out.println("running main in key runner");
		Key key=new Key();
		String keyType=key.typeofKey;
	    int priceofkey=key.keyPrice;
		
		System.out.println("default-values of keytype:"+keyType);
		System.out.println("default-values of keyprice:"+priceofkey);
		
		keyType="master-key";
		priceofkey=45;
		System.out.println("updated-values:"+keyType);
		System.out.println("updated-values:"+priceofkey);
		
		System.out.println("ending main in key runner");
		
	}
}