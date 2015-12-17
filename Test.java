class Test {

	//@brief return the sum of x and y;
	public int add (int x, int y){
		return x+y+1;
	}

	public static void main(String args[]){
		System.out.println("Running tests");

		Test my_test = new Test();

		assert my_test.add(5,10) == 15 : "suppose retourner 15";
		assert my_test.add(10,20) == 30: "suppose retourner 30" ;
		assert my_test.add(14,30) == 44: "suppose retourner 44";
	}
}
