// application class includes main method and a new instance of shopping cart and super market test class 
public class Application {
   // main method  calls shoppingCart and Supermarket_Test objects
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ShoppingCart test = new ShoppingCart();
		Supermarket_Test tests = new Supermarket_Test();
		System.out.println(test.getTestApplication());
		System.out.println(tests.getTestCasesMessage());
		

	}

}
