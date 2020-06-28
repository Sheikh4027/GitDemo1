package stepDefinations;



import org.junit.runner.RunWith;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)

public class stepD {
	

    @Given("^User neviatge to the landing page \"([^\"]*)\"$")
    public void user_neviatge_to_the_landing_page_something(String strArg1) throws Throwable {
      System.out.println(strArg1);  
    }

    @When("^User input username \"([^\"]*)\" and password \"([^\"]*)\"$")
    public void user_input_username_something_and_password_something(String strArg1, String strArg2) throws Throwable {
    	 System.out.println(strArg1);  
    	 System.out.println(strArg2);  
    }

    @Then("^User logged into his creditcard home page$")
    public void user_logged_into_his_creditcard_home_page() throws Throwable {
        
    }

    @And("^He can make payments$")
    public void he_can_make_payments() throws Throwable {
       
    }
	
}
