class Test {
	public int add (int x, int y){
		return x+y+3; 
	}

	public static void main(String args[]){
		System.out.println("Running tests");

		Test my_test = new Test();

        //suite de test
		assert my_test.add(5,10) == 15 : "suppose retourner 15"; //on verifie ici si sum(5,10) == 15
		assert my_test.add(10,20) == 30: "suppose retourner 30" ;
		assert my_test.add(14,30) == 44: "suppose retourner 44";
	}
}
