class TreeRunner{
	public static void main(String[] args){
		System.out.println("running main in tree runner");
		Tree tree=new Tree();
		double treeheight=tree.treeHeightinfeet;
		String nameoftree=tree.treeName;
		
		System.out.println("default-values of tree height:"+treeheight);
		System.out.println("default-values of tree name:"+nameoftree);
		
		treeheight=80;
		nameoftree="neem";
		System.out.println("updated-values of tree height:"+treeheight);
		System.out.println("updated-values of tree name:"+nameoftree);
		
		System.out.println("ending main in tree runner");
		
	}
}