package stepDefinitions;

import org.junit.runner.RunWith;

import co.uk.staTravel.Test.HomeImplementation;
import co.uk.staTravel.Test.TestBase;
import co.uk.staTravel.Test.ToursImplementation;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
public class TestCaseDefinitions extends TestBase {
	ToursImplementation Tour = new ToursImplementation();
	HomeImplementation Home = new HomeImplementation();

	@Given("^User Access STATravel URL")
    public void user_access_stattravel_URL() throws Throwable {
        main();
        openUrl();
        Thread.sleep(1000);
        Tour.acceptCookies();
        Home.HomePageAssertions();
    }

    @When("^Select country “India” from the AJAX$")
    public void select_country_india_from_the_ajax() throws Throwable {
    	Thread.sleep(2000);
        Tour.selectDestination("India");
        Thread.sleep(1000);     
    }
    
    @And("^Click on “Find a Tour” button$")
    public void click_on_find_a_tour_button() throws Throwable {
    	//a
    	   Tour.submitDestination();
    }
    

    @Then("^Change the sort order on the search results on price Low to High$")
    public void change_the_sort_order_on_the_search_results_on_price_low_to_high() throws Throwable {
    	Thread.sleep(1000);
        Tour.sortOrderOnSearch("Price (Low-High)");
    }
    
    @And("^Click on “View More” button on the page to display more results$")
    public void click_on_view_more_button_on_the_page_to_display_more_results() throws Throwable {
    	Tour.selectViewMore();
    }

    @Then("^Verify if the “X matches found” text is equal to the actual number of results displayed$")
    public void verify_if_the_x_matches_found_text_is_equal_to_the_actual_number_of_results_displayed() throws Throwable {
        Thread.sleep(2000);
        Tour.verifyResultCount();
        quitDriver();
        
    }

    

   
	
}
