Feature: USD not for profit product page

Scenario: USD not for profit product page validation
Given Initialize the browser with chrome
Given Navigate to "https://www.td.com/ca/en/business-banking/small-business/bank-accounts/"
When USD not for profit product page is populated
Then Product page is validated
And Close browsers

# parameterisation illustration
# change Scenario to Scenario Outline so that multiple scenarios will be executed as per the test data
# when user enters <username> and <password> column name has to match and it will run as many times as there are rows
# |username				|password	|
# |abc@gmail.com		|jhdjhdjhd	|
# |def@gmail.com		|hdhgdhgd	|

# In step definitions
#  @When("^User enters (.+) and (.+) and logs in$") ------>This can be generated through eclipse console or tidy gherkin app
#	    public void user_enters_and_and_logs_in(String username, String password) throws Throwable {
#		 LoginPage lp=new LoginPage(driver);
#			lp.getEmail().sendKeys(username);
#			lp.getPassword().sendKeys(password);
#	        lp.getLogin().click();
