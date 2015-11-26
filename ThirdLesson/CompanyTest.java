package ThirdLesson;

import java.util.Scanner;

/**
 * Created by Yanilda on 9/29/2015.
 */
//Creating a Company object and calling its method
public class CompanyTest {

    public static  void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);

        //create the Company object and assign it to myCompany
        Company myCompany = new Company("Yani-Yan");
        //display initial value of companyName
        System.out.printf("The company name is: %s\n", myCompany.getCompanyName());

       /*
       * Set flag= true for while loop
       * Declare answer to save answer from user
       * declare name to store the name of company from user
       */
       boolean flag= true;
       String answer;
       String name;

        //Start while loop
       while (flag)
       {
           System.out.printf("Do you want to change the name of your company? \n\t");//prompts user for answer
           answer=scanner.nextLine();//gets a string answer from user
           /*
           * toLowercase() Turns answer to lowercase
           * if answer equals "yes" then prompts user for a name
           * after user enters name, the name is stored in the name variable, and set to the company by calling .setCompanyName()
           * prints a thank you message
           * displayMessage() called and flag set to false to stop while
           * if else then then don't change the name, set flag to false to stop the while
           */
           if (answer.toLowerCase().equals("yes"))
           {
               System.out.printf("Please enter name \n%s\t","-->");
               name=scanner.nextLine();
               myCompany.setCompanyName(name);
               System.out.println("Thank you! the company name has changed");
               myCompany.displayMessage();
               flag=false;
           }
           else
           {
               System.out.println("OK, the company name has not changed");
               flag=false;//flag  is better than break
           }
       }



    }//end main
}//end class
