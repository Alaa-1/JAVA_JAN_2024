public class ShoppingCart {
// MEMBER VARIABLES
public ArrayList<String> items = new ArrayList<String>();
public String store;
public double total;

public void add_item(String item, double price){

this.items.add(item)
this.total += price;

}
}

// Class (BluePrint)
// Constructor (Make defaults)
// Member Variables