class Test {
	public int add (int x, int y){ //renvoie la somme de deux entiers
		return x+y; //erreur ici !
	}

	public static void main(String args[]){
		System.out.println("Running tests");

		Test my_test = new Test();

        //suite de test
		assert my_test.add(5,10) == 15 : "supposé retourner 15"; //on verifie ici si sum(5,10) == 15
		assert my_test.add(10,20) == 30: "supposé retourner 30";
		assert my_test.add(14,30) == 44: "supposé retourner 44";
	}
}
