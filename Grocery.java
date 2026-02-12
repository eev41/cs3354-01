import java.util.Scanner;

public class Grocery {
   static final int SIZE = 10; // array size constant

   /**
	 * Javadoc here
	 */
   public static void printInventory(String[] names, double[] prices, 
      int[] stocks)
   {

   }

   /**
	 * Javadoc here
	 */
   public static void restockItem(String[] names, int[] stocks, 
      String target, int amount)
   {

   }

   /**
	 * Javadoc Here
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
   }
}
