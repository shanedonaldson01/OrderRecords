import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

class OrderApp
   {
   public static void main(String[] args) throws IOException
      {
	   //object one variables
	   int productIDOne = 0;
	   
       //object two variables
	   int productIDTwo;
	   
	  //instantiate new node objects
      ProductNode product = new ProductNode();
      CustOrderNode order = new CustOrderNode();
      
      //insert values into object one
      product.insertObjOne(33333, "Bobblehead", 4.99, 8.99, 4150);
      product.insertObjOne(44444, "Shoe", 7.99, 105.99, 3250);
      product.insertObjOne(77777, "Wooden Horse", 6.89, 10.99, 50);
      product.insertObjOne(88888, "Tree", 4.99, 15.99, 765);
      product.insertObjOne(11111, "Yoyo", 4.99, 6.99, 786);
      product.insertObjOne(55555, "Watch", 10.99, 30.99, 333);
      product.insertObjOne(99999, "Mug", 4.99, 10.99, 545);

      //insert values into object two
      order.insertObjTwo(42445, 335433, 20, 150.99);
      order.insertObjTwo(52224, 444244, 250, 1000.99);
      order.insertObjTwo(42587, 757777, 280, 1340.99);
      order.insertObjTwo(42558, 888838, 2, 10.99);
      order.insertObjTwo(78878, 151111, 40, 40.99);
      order.insertObjTwo(45269, 552555, 43, 63.99);
      order.insertObjTwo(99999, 996999, 7, 89.99);
      
      //switch case to show trees or find values
      while(true)
         {
    	 System.out.print("Search files using model number. " + "\n");
         System.out.print("Enter the first letter of show or find: ");
         int choice = getChar();
         switch(choice)
            {
            case 's':
               System.out.println("Product Tree" + "\n");
               product.displayTree();
               System.out.println("Customer Order Tree" + "\n");
               order.displayTree();
               break;
            case 'f':
               System.out.print("Enter an integer to find: ");
               productIDOne = getInt();
               productIDTwo = productIDOne;
               Node found = product.find(productIDOne);
               Node alsoFound = order.find(productIDTwo);
               
               if(found != null)
                  {
                  System.out.print("\n" + "Found model number in item records: " + "\n");
                  found.displayObjOne();
                  System.out.print("\n");
                  }
               else
               {
                  System.out.print("\n" + "Could not find model number " + productIDOne + " in object one. " + "\n");
               }
               
               if(alsoFound != null)
               {
            	   System.out.print("\n" + "Found model number in customer order records: " + "\n");
            	   alsoFound.displayObjTwo();
            	   System.out.print("\n");
               }
               else
               {
            	   System.out.print("\n" + "Could not find model number " + productIDTwo + " in object two. " + "\n");
               }
               
            break;
            default:
               System.out.print("Invalid entry\n");
            }  // end switch
         }  // end while
      }  // end main()
// -------------------------------------------------------------
   public static String getString() throws IOException
      {
      InputStreamReader isr = new InputStreamReader(System.in);
      BufferedReader br = new BufferedReader(isr);
      String s = br.readLine();
      return s;
      }
// -------------------------------------------------------------
   public static char getChar() throws IOException
      {
      String s = getString();
      return s.charAt(0);
      }
//-------------------------------------------------------------
   public static int getInt() throws IOException
      {
      String s = getString();
      return Integer.parseInt(s);
      }
// -------------------------------------------------------------
   }  // end class OrderApp
