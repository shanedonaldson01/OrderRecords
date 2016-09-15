import java.text.DecimalFormat;

class Node{
	
	//data item (key)
	public int prodIDOne;
	//data items
	public int quantity;
	public String description;
	public double cost, price;
	
	//data item (key)
	public int prodIDTwo; 
	//data items
	public int customerID, quantityOrd;
	public double orderTot;
	
	//this node's left child
	public Node leftChild;  
	//this node's right child
	public Node rightChild;  
	
	//set formatter for monetary values
	DecimalFormat df = new DecimalFormat("#.00");
	
	//display formatted product data items
	public void displayObjOne()      
      {
		System.out.print("Product ID: " + prodIDOne + "\n");
		System.out.print("Item Description: " + description + "\n");
		System.out.print("Item Cost: " + "$" + df.format(cost) + "\n");
		System.out.print("Selling Price: " + "$" + df.format(price) + "\n");
		System.out.print("Quantity on Hand: " + quantity + "\n");
      }
	
	//display formatted order data items
	public void displayObjTwo()      // display ourself
    {
		System.out.print("Customer ID: " + customerID + "\n");
		System.out.print("Product ID: " + prodIDTwo + "\n");
		System.out.print("Quantity Ordered: " + quantityOrd + "\n");
		System.out.print("Order Total: " + "$" + df.format(orderTot) + "\n");
    }
}  // end class Node
