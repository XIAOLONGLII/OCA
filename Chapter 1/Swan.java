class Swan {
	int numberEggs; // instance variables 
	public static void main(String[] args) {
		Swan mother = new Swan(); 
		mother.numberEggs = 1; // set variables
		System.out.println(mother.numberEggs);

		Egg(2);
	}
	private static void Egg(int a) {
		Swan mother2 = new Swan(); 
		mother2.numberEggs = a;
		System.out.println(mother2.numberEggs);
	}
}
