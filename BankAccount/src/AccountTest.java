/**
   This program demonstrates how the BankAccount
   class constructor throws custom exceptions.
*/

public class AccountTest extends BankAccount
{
   public static void main(String [] args)
   {
	  // Force a NegativeStartingBalance exception.
      try
      {
         BankAccount account = new BankAccount(-100.0);
         
        /* throw new Exception("Negative balance");*/
         throw new NegativeStartingBalance("Negative balance");
                  
      }
      catch(NegativeStartingBalance e)
      {
         System.out.println(e.getMessage());
      }
   }
}