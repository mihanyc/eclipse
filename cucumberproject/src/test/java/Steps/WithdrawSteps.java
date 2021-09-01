package Steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumberproject.cucumberproject.Bank;
import junit.framework.Assert;

public class WithdrawSteps {
	Bank bank;
	@Given("^I have  \"([^\"]*)\" amount in a Account$")
	public void i_have_amount_in_a_Account(String init) throws Throwable {
		int value=Integer.parseInt(init);
		bank = new Bank(value);
	    
	}

	@When("^I withdraw \"([^\"]*)\" amount in  exit account$")
	public void i_withdraw_amount_in_exit_account(String withd) throws Throwable {
		int value = Integer.parseInt(withd);
		bank.withdraw(value);
		
	    
	}

	@Then("^I  expect \"([^\"]*)\"  amount will have in the account$")
	public void i_expect_amount_will_have_in_the_account(String exp) throws Throwable {
		int expectedAmount = Integer.parseInt(exp);
		int actualAmount = bank.getBalance();
		Assert.assertEquals(expectedAmount, actualAmount);
	
	  
	}

}
