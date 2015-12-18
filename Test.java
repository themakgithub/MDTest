class Test {
    /*Nous voulons ici tester l'implementation de notre fonction sum.
     
     On se servira d'__ assert __ pour verifier que notre fonction renvoie bien
     ce qu'elle est supposee renvoyer.
    */

	//@brief renvoie la somme de x et y ?
	public int add (int x, int y){
		return x+y; //une erreur dans notre code. sum est suppose renvoyer x+y
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
