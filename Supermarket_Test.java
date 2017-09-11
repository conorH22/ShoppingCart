// JUnit test[eclipse] suite 4 the shopping cart methods are checked against
// number of variables
import static org.junit.Assert.*;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.*;

import org.junit.Before;
//import org.junit.Test;
// supermarket_Test  constructor inits new instance of shoppingCart Object
public class Supermarket_Test {
	ShoppingCart cart;
  // before tests setUp method  cart  equals newshoppingCart() object
	@Before
	public void setUp(){
	    cart = new ShoppingCart();
	}

	// testing adding one item to cart apple item is  added to cart.
	// assertEquals checks cart  for apple item on list
	@Test
	public void addOneItemToCart() {
	    cart.add("Apple");
	    assertEquals(cart.doesContain("Apple"),(true));
	  
	}
	// testing adding two items to cart apple and Orange item is  added to cart.
	// assertEquals checks cart  for apple item on list and Orange item and total items are 2
	@Test
	public void addTwoItemsToCart(){
	    cart.add("Apple");
	    cart.add("Orange");
	    assertThat(cart.getTotalItems(), is(2));
	    assertEquals(cart.doesContain("Apple"),(true));
	    assertEquals(cart.doesContain("Orange"),(true));
	 
	}
	// testing adding three items to cart Apple, Orange and Pear items is  added to cart.
	// assertThat checks cart  for apple item on list,
	//pear item and Orange item and total items are 3
	@Test
	public void addThreeItemsToCart(){
	    cart.add("Apple");
	    cart.add("Orange");
	    cart.add("Pear");
	    assertThat(cart.getTotalItems(), is(3));
	    assertEquals(cart.doesContain("Apple"), (true));
	    assertEquals(cart.doesContain("Orange"), (true));
	    assertEquals(cart.doesContain("Pear"), (true));
	}
	// testing adding same  item  twice to cart Apple is added to cart.
	// assertThat checks cart  for apple item on list is 2

	@Test
	public void addAnItemTwice(){
	    cart.add("Apple");
	    cart.add("Apple");
	    assertThat(cart.getTotalItems(), is(2));
	   
	}
   // test case checks for apple item and cart contains specific price is  1.0
	@Test
	public void checkOutOneItem(){
	    cart.add("Apple");
	    assertThat(cart.checkout(),is(1.0));
	}
	 // test case checks for two items and cart contains specific  price is 1.60
	@Test
	public void checkoutTwoSeparateItems(){
	    cart.add("Apple");
	    cart.add("Orange");
	    assertThat(cart.checkout(),is (1.60));
	}
	 // test case checks for three item and cart contains specific  price is 2.0
	@Test
	public void checkoutThreeSeparateItems(){
	    cart.add("Apple");
	    cart.add("Orange");
	    cart.add("Pear");
	    assertThat(cart.checkout(), is(2.0));
	}
    // test case checks for two same items and cart contains specific  price is 2.0
	@Test
	public void checkoutTwoSameItems(){
	    cart.add("Apple");
	    cart.add("Apple");
	    assertThat(cart.checkout(), is(2.0));
	}
	 // test case checks for three same items and cart contains specific  price is 3.00
	@Test
	public void checkoutThreeItems(){
	    cart.add("Apple");
	    cart.add("Apple");
	    cart.add("Apple");
	    assertThat(cart.checkout(), is(3.0));
	}
	 // test case checks for several items and cart contains specific  price is 3.60
	@Test
	public void checkoutManyItems(){
	    cart.add("Apple");
	    cart.add("Apple");
	    cart.add("Orange");
	    cart.add("Orange");
	    cart.add("Pear");
	    assertThat(cart.checkout(), is(3.60));
	}
	 // test case checks for invalid item like carrot- not sold  in shop
	@Test 
	public void checkOutAnInvalidItem(){
	    cart.add("Carrot");
	    assertThat(cart.checkout(),is(0.0));
	}
	// test case checks removeItem method, addition of Apple and Orange, then Apple is removed
	// assertThat gets carts totalItems is 1
	@Test 
	public void removeItem(){
		cart.add("Apple");
		cart.add("Orange");
	    cart.remove("Apple");
	    assertThat(cart.getTotalItems(), is(1)); 
	}
	//Two tests below test for offers 3 items for 2 deal and buy 2 items deal
	@Test 
	public void offersCheckFor1(){
		cart.add("Apple");
		cart.add("Apple");
	    cart.add ("Apple");
	    assertThat(cart.offers(),is(1.0)); 
	}
	@Test 
	public void offersCheckFor2(){
		cart.add("Orange");
		cart.add("Orange");
	    assertThat(cart.offers(),is(1.5)); 
	}
	
	public String getTestCasesMessage() {
		  return "test cases working!";
			 
		}
	
}
