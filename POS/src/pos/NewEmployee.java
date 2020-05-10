package pos;
import java.text.SimpleDateFormat;  
import java.util.Date;
// Fig. 10.4: Employee.java
// Employee abstract superclass.

public class NewEmployee 
{
   private final String firstName;
   private final String lastName;
   private final String socialSecurityNumber;
   private Date birthday;
   private String password;

   // constructor
   public NewEmployee(String firstName, String lastName)
   {
      this.firstName = firstName;                                    
      this.lastName = lastName;                                    
      this.socialSecurityNumber = "N/I";
    } 
   
   public NewEmployee(String firstName, String lastName, String pass)
   {
      this.firstName = firstName;                                    
      this.lastName = lastName;                                    
      this.socialSecurityNumber = "N/I";
      this.password = pass;
    } 
   
   public NewEmployee(String firstName,String pass, String lastName, 
      String socialSecurityNumber)
   {
      this.firstName = firstName;                                    
      this.lastName = lastName;                                    
      this.socialSecurityNumber = socialSecurityNumber;
      this.password = pass;
       
   } 
   public NewEmployee(String firstName, String pass, String lastName, 
      String socialSecurityNumber, Date birth)
   {
      this.firstName = firstName;                                    
      this.lastName = lastName;                                    
      this.socialSecurityNumber = socialSecurityNumber;
      this.birthday = birth;
      this.password = pass;
   } 

   // return first name
   public String getFirstName()
   {
      return firstName;
   } 

   // return last name
   public String getLastName()
   {
      return lastName;
   } 

   // return social security number
   public String getSocialSecurityNumber()
   {
      return socialSecurityNumber;
   } 
   public void setBirthday(Date birth)
   {
       this.birthday = birth;
   }
   public Date getBirthday ()
   {
       return birthday;
   }
   public void setPassword(String pass)
   {
       this.password=pass;
   }
   public String getPassword()
   {
       return password;
   }

   // return String representation of Employee object

    /**
     *
     * @return
     */
   @Override
   public String toString()
   {
      return String.format("%s %s%nsocial security number: %s%nBirthday: %s", 
         getFirstName(), getLastName(), getSocialSecurityNumber(), getBirthday());
   } 

   // abstract method must be overridden by concrete subclasses
  // public abstract double earnings(); // no implementation here
} // end abstract class Employee


/**************************************************************************
 * (C) Copyright 1992-2014 by Deitel & Associates, Inc. and               *
 * Pearson Education, Inc. All Rights Reserved.                           *
 *                                                                        *
 * DISCLAIMER: The authors and publisher of this book have used their     *
 * best efforts in preparing the book. These efforts include the          *
 * development, research, and testing of the theories and programs        *
 * to determine their effectiveness. The authors and publisher make       *
 * no warranty of any kind, expressed or implied, with regard to these    *
 * programs or to the documentation contained in these books. The authors *
 * and publisher shall not be liable in any event for incidental or       *
 * consequential damages in connection with, or arising out of, the       *
 * furnishing, performance, or use of these programs.                     *
 *************************************************************************/
