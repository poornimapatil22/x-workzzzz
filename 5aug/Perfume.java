class Perfume{
	String perfumeBrand;
	int perfumeCost;
	int perfumeQuantity;
	int perfumeWeightingm;
	
	
	Perfume(){
		System.out.println("created perfume");
	}
	
	Perfume(String perfumeBrand,int perfumeCost){
		this.perfumeCost=perfumeCost;
		this.perfumeBrand=perfumeBrand;
		System.out.println("created perfume");
		}
		
		
		Perfume(String perfumeBrand,int perfumeCost,int perfumeQuantity){
		this.perfumeCost=perfumeCost;
		this.perfumeBrand=perfumeBrand;
		this.perfumeQuantity=perfumeQuantity;
		System.out.println("created perfume");
		}
		
	Perfume(String perfumeBrand,int perfumeCost,int perfumeQuantity,int perfumeWeightingm){
		this.perfumeCost=perfumeCost;
		this.perfumeBrand=perfumeBrand;
		this.perfumeWeightingm=perfumeWeightingm;
		this.perfumeQuantity= perfumeQuantity;
		System.out.println("created perfume");
		}
	
	
	
}