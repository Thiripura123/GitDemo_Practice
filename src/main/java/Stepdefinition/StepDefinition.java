package Stepdefinition;

import java.util.List;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition {

	@Given("^user is on netbanking landing page$")
	    public void user_is_on_netbanking_landing_page() throws Throwable {
		 System.out.println("user is on netbanking landing page");
	      
	    }

	 @When("^User login into application with \"([^\"]*)\" and \"([^\"]*)\"$")
	    public void user_login_into_application_with_something_and_something(String strArg1, String strArg2) throws Throwable 
	 
	 {
		 System.out.println(strArg1);
		 System.out.println(strArg2);
		 
	 }
	 
	 @When("^User login into application with following details$")
	    public void user_login_into_application_with_following_details(DataTable data) throws Throwable {
	       
		List<List<String>> obj =data.asLists();
		 
		 System.out.println(obj.get(0).get(0));
		 System.out.println(obj.get(0).get(1));
		 System.out.println(obj.get(0).get(2));
		 System.out.println(obj.get(0).get(3));
		
	    }
	 
	  @When("^User login into application with (.+) and password (.+)$")
	    public void user_login_into_application_with_and_password(String username, String password) throws Throwable {
		  System.out.println(username);
		  System.out.println(password);
	  }
	        
	    @Then("^Home page is displayed$")
	    public void home_page_is_displayed() throws Throwable {
	    	 System.out.println("Home page is displayed"); 
	    }

	    @And("^cards displayed are \"([^\"]*)\"$")
	    public void cards_displayed_are_something(String strArg1) throws Throwable {
	    	System.out.println(strArg1);
	    } 
	    

	    @Given("^Validate the browser$")
	    public void validate_the_browser() throws Throwable {
	      System.out.println("Browser is validated");
	    }

	    @When("^Browser is triggered$")
	    public void browser_is_triggered() throws Throwable {
	    	 System.out.println("Browser is triggered");
	    }

	    @Then("^check if browser is started$")
	    public void check_if_browser_is_started() throws Throwable {
	    	 System.out.println("Browser is Started");
	    }
	    
	    }
