import java.util.Scanner;

/**
 * Defines a class for a command line grocery management system 
 * which allows its user to (1) see inventory of items and (2) 
 * restock a specific item by a specified quantity.
 * 
 * @author Ananya Jaiswal
 * @author Abinash Ghimire
 * @author Isla Shih
 */
public class Grocery {
   static final int SIZE = 10; // array size constant

   /**
	 * Javadoc here.
    * 
    * @param names description
    * @param prices description
    * @param stocks description
	 */
   public static void printInventory(String[] names, double[] prices, 
      int[] stocks)
   {
      System.out.println("Test");
   }

  /**
 * Searches for an item in the names array and increases
 * its stock amount if found.
 *
 * @param names the array containing item names
 * @param stocks the array containing item stock quantities
 * @param target the name of the item to restock
 * @param amount the quantity to add to the stock
 */
   public static void restockItem(String[] names, int[] stocks, 
   String target, int amount)
{
   boolean found = false;

   for (int i = 0; i < names.length; i++)
   {
      if (names[i] != null && names[i].equalsIgnoreCase(target))
      {
         stocks[i] += amount;
         System.out.println("Updated stock for " + names[i] + 
                            ": " + stocks[i]);
         found = true;
         break;
      }
   }

   if (!found)
   {
      System.out.println("Item not found.");
   }
}

   /**
	 * Prints a user menu from which other methods can be invoked
    * and, if necessary, provided with inputs to be passed as arguments.
    * 
    * @param args not used
	 */
   public static void main(String[] args)
   {
      String[] itemNames = new String[SIZE];
      double[] itemPrices = new double[SIZE];
      int[] itemStocks = new int[SIZE];

      System.out.println("Grocery Management System");
      System.out.println("-------------------------");

      Scanner userInput = new Scanner(System.in);
      int userChoice = 0;
      String userTarget;
      int userAmount;
      while (userChoice != 3)
      {
         System.out.println("Options:");
         System.out.println("1. Display Inventory");
         System.out.println("2. Restock Inventory");
         System.out.println("3. Exit Program");
         System.out.print("Enter your choice: ");
         userChoice = userInput.nextInt();
         userInput.nextLine();

         if (userChoice == 1)
            printInventory(itemNames, itemPrices, itemStocks);

         else if (userChoice == 2)
         {
            System.out.print("Enter item name: ");
            userTarget = userInput.nextLine();
            System.out.print("Enter amount to stock: ");
            userAmount = userInput.nextInt();

            restockItem(itemNames, itemStocks, userTarget, userAmount);
         }

         else if (userChoice != 3)
            System.out.println("Choice is invalid. Please re-enter.");
      }

      userInput.close();
   }
}
