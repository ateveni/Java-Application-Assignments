import java.sql.*;   // Needed for JDBC classes

/**
 * This program demonstrates creates a Employee
 *  table in the Personnel database.
 */
 
//HAD ISSUES WITH GETTING THE JRE LIBRARY ON MY JAVA SO COULDN'T CONFIRM THE CONNECTION

public class Personnel
{
   public static void main(String[] args)
   {
            
      try
      {
         // Create a connection to the database.
         Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/Personnel", "root", "1234");

         
         // Get a Statement object.
         Statement stmt = conn.createStatement();
         
         // Make an SQL statement to create the table.
         String sql = "CREATE TABLE Peronnel" +
            "( EmployeeID CHAR(6) NOT NULL PRIMARY KEY, " +
            "  Name CHAR(20),"    +
            "  Position CHAR(20)," +
            "  Hourly Rate CHAR(6) )";

         // Execute the statement.
         stmt.execute(sql);
         
         // Add some rows to the new table.
         sql = "INSERT INTO Employee VALUES" +
               "('123456', 'Bruce Wayne', 'Cheif'," +
               " $22.50')";
         stmt.executeUpdate(sql);

         sql = "INSERT INTO Employee VALUES" +
               "('123457', 'Clark Kent'," +
               " 'Reporter'," +
               " '$14.75')";
         stmt.executeUpdate(sql);

         sql = "INSERT INTO Employee VALUES" +
               "('123458', 'Barry Allen', 'Investigator'," +
               " '$16.50')";
         stmt.executeUpdate(sql);
                  
         sql = "INSERT INTO Employee VALUES" +
         "('123459', 'Diana Prince', 'Photographer'," +
        		 " '$15.00')";
         stmt.executeUpdate(sql);
         
         sql = "INSERT INTO Employee VALUES" +
         "('123460', 'Oliver Queen', 'Editor', '$20.75')";
       
         stmt.executeUpdate(sql);
         

         // Close the connection.
         conn.close();
      }
      catch (Exception ex)
      {
         System.out.println("ERROR: " + ex.getMessage());
      }
   }
}
