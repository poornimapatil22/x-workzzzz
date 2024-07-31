class RadioRunner{
	public static void main(String[] args){Radio radio1=new Radio("Philips",100);
		radio1.Frequency=5;
		System.out.println("Radio frequency:"+radio1.Frequency);
		System.out.println("Radio on:"+radio1.isOn);
		System.out.println("Radio type:"+radio1.Brand);
		System.out.println("Radio volume:"+radio1.volumeLevel);
		
		System.out.println("\n");
		Radio radio2=new Radio("Sony",100);
		radio2.Frequency=10;
		System.out.println("Radio frequency:"+radio2.Frequency);
		System.out.println("Radio on:"+radio2.isOn);
		System.out.println("Radio type:"+radio2.Brand);
		System.out.println("Radio volume:"+radio2.volumeLevel);
	}
}