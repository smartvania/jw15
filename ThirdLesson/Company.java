package ThirdLesson;

/**
 * Created by Yanilda on 9/29/2015.
 */

//Class with three methods, a constructor and an instance variable/attribute
public class Company
{
    private String companyName; //company name attribute

    //constructor initializes companyName with String argument
    public Company(String name)//constructor name is class nme
    {
        companyName=name;
    }

    //method to set the company name
    public void setCompanyName(String name)
    {
        companyName=name; //store the company name
    }

    //method  to retrieve company name
    public String getCompanyName()
    {
        return companyName;
    }

    //display a welcome message to the Company user
    public void displayMessage()
    {
        System.out.printf("Your company is: \n%s!!!\n", getCompanyName());
    }//end method displayMessage
}//end class Company
