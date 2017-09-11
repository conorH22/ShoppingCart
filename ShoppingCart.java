// shopping cart for specific fruit shop
// import java.util for ArrayList to store store items
import java.util.ArrayList;

// shoppingCart class made public
public class ShoppingCart {
// ArrayList called items to store items for the shopping cart
ArrayList<String> items;
// shopping cart() constructor  where items is equal to new arraylist<string>()
public ShoppingCart(){
    items = new ArrayList<String>();
    
    
}
// add()add method to array list items use the add function
public void add(String item) {
    items.add(item);
    
}
// remove() add to array list items use the remove function
public void remove(String item)
{
	items.remove(item);
}
// getTotalItems made public int returns size of array list when called
public int getTotalItems() {
    return items.size();
}
// Boolen doesContain  returns  item name from array list items
public Boolean doesContain(String itemName) {
    return items.contains(itemName);
}
// checkout method total is initialized as 0. for loop checks array list items for shop items such 
// Apple,Orange and Pear.
//if value found , a double value is assigned, apples cost 1 euro, orange 60 cent and pear 40 cent.
// the total value is returned when called
public Double checkout() {
    double total = 0;
    for(String item: items){
        if(item.equals("Apple")){
            total += 1.0;
        }else if(item.equals("Orange")){
            total += 0.6;
        }else if(item.equals("Pear")){
            total += 0.4;
        }
    }
    return total;
}
// offers method  contains calls to getTotalItems and checkout methods in this class ShoppingCart
// the first if statement checks if the getTotalItems equals to 3 then the total value is subtracted from getTotalItems and 2.0(euro)
//the first if statement checks if the getTotalItems equals to 2 then the total value is subtracted from getTotalItems and 0.5(euro)
// total value is return when method is called
public double offers(){
	this.getTotalItems();
	this.checkout();
	  double total= 0; 
	  //double dealA = 1.0; // not used (testing)
	 // double dealB = 0.6;  // not used (testing)
	 
		if(getTotalItems()== 3){
			
			//dealA -1.0;
			total = getTotalItems()- 2.0; // 1 euro/pound off  
			
		}else if(getTotalItems()== 2){
			
			//dealA -1.0;
			total = getTotalItems()- 0.5; // 1 euro/pound off  
		}
		
	  
		
	return total;
}
//getTestApplication returns app working message when called in the application class in the main method
public String getTestApplication() {
	  return "App working!";
		 
	}
}