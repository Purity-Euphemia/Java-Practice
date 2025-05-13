public class MulitiplicationTableFunction {

	public static int MulitiplicationTable (int a, int b) {

	int count;
		
	for (count = a; count <= b; count++) {
	
		for (int counter = a; counter <= b; counter++) {
		
	System.out.print("\t" + count * counter + " ");
	
}
	System.out.println();

}

	return count;
}

}