class Reversing{
	
	public static void main(String[] args){
		System.out.println("running main in reverse");
		String movie1= "James";
		String	movie2="Kabzaa";
		String	movie3= "Kantara";
		String	movie4= "Avatara Purusha";
		String	movie5= "modalasala";
		String	movie6= "Shivaji Suratkal";
		String	movie7= "Hoysala";
		String	movie8= "kalavida";
		String	movie9= "Rathnan Prapancha";
		String	movie10="mungaru male";
		String	movie11= "Gandhada Gudi";
		String	movie12= "Pogaru";
		String	movie13= "Gaalipata 2";
		String	movie14= "badava rascal";
		String	movie15= "Bhajarangi";
		String	movie16= "Bachchan";
		String	movie17= "KGF";
		String	movie18= "Sarkari Hi. Pra. Shaale, Kasaragod";
		String	movie19= "arasu";
		String	movie20= "kirataka";
				
		
		String movieNames[]={movie1,movie2,movie3,movie4,movie5,movie6,movie7,movie8,movie9,movie10,movie11,movie12,movie13,movie14,movie15,movie16,movie17,movie18,movie19,movie20};		
		int movielength=movieNames.length;
		System.out.println(movielength);
		
		for(int i= movielength-1;i>=0;i--){
			System.out.println("movies are:"+movieNames[i]);
		}
		
		System.out.println("////////////////////////");
		System.out.println("printing song names in reverse");
		
		String songNames[] = {
            "Ninna Gungalli", "Anisuthide yako indu", "naliva gulabi hoove", "Jotheyali jotheyalii", 
            "yeno yeno agide", "alochane aalapane", "Hrudayake Hedarike", 
            "Neene Neene", "Sanju Weds Geetha", "Onde Usirante"
        };

        System.out.println("Number of song names: " + songNames.length);

        for (int songs = songNames.length-1; songs >= 0; songs--) {
            System.out.println(songNames[songs]);
        }
		
		
		System.out.println("////////////////////////");
		
		
		
		System.out.println("printing indianStates in reverse");
		
		
        String indianStates[] = {
            "Andhra Pradesh", "Arunachal Pradesh", "Assam", "Bihar", 
            "Chhattisgarh", "Goa", "Gujarat", "Haryana", 
            "Himachal Pradesh", "Jharkhand", "Karnataka", "Kerala", 
            "Madhya Pradesh", "Maharashtra", "Manipur", "Meghalaya", 
            "Mizoram", "Nagaland", "Odisha", "Punjab", 
            "Rajasthan", "Sikkim", "Tamil Nadu", "Telangana", 
            "Tripura", "Uttar Pradesh", "Uttarakhand", "West Bengal"
        };

        
        System.out.println("Number of Indian states: " + indianStates.length);

        
        for (int states = indianStates.length-1; states >=0; states--) {
            System.out.println(indianStates[states]);
        }
		
		System.out.println("////////////////////////");
		
		
		System.out.println("printing game names in reverse");
		
		String gameNames[]= {
            "Chess", "Soccer", "Basketball", "Cricket", 
            "Tennis", "Badminton", "Hockey", "Volleyball", 
            "Baseball", "Table Tennis"
        };

        System.out.println("Number of game names: " + gameNames.length);

		int length=gameNames.length;
        for (int games = length-1; games >=0; games--) {
            System.out.println(gameNames[games]);
        }
		
		System.out.println("////////////////////////");
		
		
		
		
		System.out.println("printing car names in reverse");
		
		String[] carNames = {
            "Toyota", "Honda", "Ford Mustang", "suzuki", 
            "Tesla Model S", "BMW 3 Series", "Audi A4", "Mercedes-Benz C-Class", 
            "tata", "Hyundai", "maruti", "Volkswagen Passat", 
            "lamborghini", "rolls royce", "inova"
        };
        System.out.println("Number of car names: " + carNames.length);
		int carnamelength=carNames.length;
        for (int cars = carnamelength-1; cars >=0; cars--) {
            System.out.println(carNames[cars]);
        }
		
		System.out.println("////////////////////////");
		
		
		System.out.println("printing animals in reverse");
		
		 String[] animalNames = {
            "Lion", "Tiger", "Elephant", "Giraffe", 
            "Zebra", "Kangaroo", "Panda", "Leopard", 
            "Cheetah", "Rhinoceros", "Hippopotamus", "dog", 
            "Chimpanzee", "Orangutan", "Wolf", "Fox", 
            "Bear", "Deer", "Mouse", "cat"
        };

        
        System.out.println("Number of animal names: " + animalNames.length);

        
        for (int animals = animalNames.length-1; animals >=0; animals--) {
            System.out.println(animalNames[animals]);
        }
		
		System.out.println("////////////////////////");
		
		
		
		System.out.println("printing snack names in reverse");
		
		String[] snacks = {
            "misal", "pani puri", "samosa", "jamun",
            "talipattu", "vada paav", "pizza", "burger",
            "chips", "cakes", "chole", "nuggets",
            "french fries", "sandwich", "banana chips", "dosa",
            "parota", "idli", "rolls", "chivada",
            "Bhaji", "pohe", "Kachori", "Bhakri",
            "pav bhaji", "Pulao"
        };

        
        System.out.println("Number of  snacks: " + snacks.length);

        int snacklength=snacks.length;
        for (int snack = snacklength-1; snack >=0; snack--) {
            System.out.println(snacks[snack]);
        
        }
		
		System.out.println("////////////////////////");
		
		
		System.out.println("printing busNumbers in reverse");
		
		 String busNumbers[] = {
            "123A", "456B", "789C", "101D", "202E"
        };
		
		int lengthofbusno=busNumbers.length;

        for(int i=lengthofbusno-1;i>=0;i--){
			System.out.println(busNumbers[i]);
		}
        System.out.println("Number of bus numbers: " + busNumbers.length);

        
       System.out.println("ending main in an reverse");
	}
}