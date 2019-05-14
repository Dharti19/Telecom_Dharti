package org.test.cucumbr;

import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Addcust {
	static WebDriver driver;
	@Given("The User is in add customer page")
	public void the_User_is_in_add_customer_page() {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\dhart_000\\Dharti\\TelecomTestCucumber\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/telecom/");
		WebElement addcust=driver.findElement(By.xpath("//a[text()='Add Customer']"));
		addcust.click();
		
	}
	//Scenarios for Valid customer Details
	
	@When("The user fill in the valid customer details")
	public void the_user_fill_in_the_valid_customer_details() {
		driver.findElement(By.xpath("//label[text()='Done']")).click();
		driver.findElement(By.id("fname")).sendKeys("Dharti");
		driver.findElement(By.id("lname")).sendKeys("Rai");
		driver.findElement(By.id("email")).sendKeys("dhartirai@gmail.com");
		driver.findElement(By.name("addr")).sendKeys("dhartiamit rai");
		driver.findElement(By.name("telephoneno")).sendKeys("1234567898");
	}
	@When("The user click the submit button")
	public void the_user_click_the_submit_button() {
		driver.findElement(By.name("submit")).click();
	}
	
	@Then("The user should see the customer id generated")
	public void the_user_should_see_the_customer_id_generated() {
	Assert.assertTrue(driver.findElement(By.tagName("h3")).isDisplayed());
	   }
	
	
	//Scenarios for reset Button
	@When("The user click the reset button")
	public void the_user_click_the_reset_button() {
		
		driver.findElement(By.xpath("//input[@value='Reset']")).click();
		
		}
		
	@Then("The user sould see the form blank")
	public void the_user_sould_see_the_form_blank() {
		Assert.assertTrue(driver.getCurrentUrl().contains("addcustomer"));
	 }
	
	//Scenarios for Blank customer Details
	
	@When("The user left the field blank")
	public void the_user_left_the_field_blank() {
		driver.findElement(By.xpath("//label[text()='Done']")).click();
		driver.findElement(By.id("fname")).sendKeys("");
		driver.findElement(By.id("lname")).sendKeys("");
		driver.findElement(By.id("email")).sendKeys("");
		driver.findElement(By.name("addr")).sendKeys("");
		driver.findElement(By.name("telephoneno")).sendKeys("");
		}

	@Then("The user sould see the error mesage")
	public void the_user_sould_see_the_error_mesage() {
	 driver.switchTo().alert().accept();  
		
	}

	//Scenarios for Wrong Input
	
	@When("The user fill in the invalid data")
	public void the_user_fill_in_the_invalid_data() {
		driver.findElement(By.xpath("//label[text()='Done']")).click();
		driver.findElement(By.id("fname")).sendKeys("Dharti");
		driver.findElement(By.id("lname")).sendKeys("Rai");
		driver.findElement(By.id("email")).sendKeys("dhartirai@gmail.com");
		driver.findElement(By.name("addr")).sendKeys("dhartiamit rai");
		driver.findElement(By.name("telephoneno")).sendKeys("abvgdjdj");
		}
	  	
	@Then("The user sould see the invalid data mesage")
	public void the_user_sould_see_the_invalid_data_mesage() {
		driver.switchTo().alert().accept();
		
	}

	//Scenarios outline for add tarrif plan
	
	
	@Given("The user should be on add tarrif plan page")
	public void the_user_should_be_on_add_tarrif_plan_page() {
	  
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\dhart_000\\Dharti\\TelecomTestCucumber\\Driver\\chromedriver.exe");
				driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.get("http://demo.guru99.com/telecom/");
				WebElement addtarrif=driver.findElement(By.xpath("//a[text()='Add Tariff Plan']"));
				addtarrif.click();
		}

	@When("The user fil in the valid plan detail detail{string},{string},{string},{string},{string},{string},{string}")
	public void the_user_fil_in_the_valid_plan_detail_detail(String MonthRent, String  FreeLocMinuts, String FreeIntMinuts, String FreeSMS, String localCharges, String IntCharges, String SMSCharges) {
	   
	  driver.findElement(By.id("rental1")).sendKeys(MonthRent); 
	  driver.findElement(By.id("local_minutes")).sendKeys(FreeLocMinuts);
	  driver.findElement(By.id("inter_minutes")).sendKeys(FreeIntMinuts);
	  driver.findElement(By.id("sms_pack")).sendKeys(FreeSMS);
	  driver.findElement(By.id("minutes_charges")).sendKeys(localCharges);
	  driver.findElement(By.id("inter_charges")).sendKeys(IntCharges);
	  driver.findElement(By.id("sms_charges")).sendKeys(SMSCharges);
		

	}

	@When("The user click on submit button")
	public void the_user_click_on_submit_button() {
	  driver.findElement(By.name("submit")).click();
	}

	@Then("The user shuld see the success message")
	public void the_user_shuld_see_the_success_message() {

		Assert.assertTrue(driver.findElement(By.tagName("h2")).isDisplayed());
		
	    }

//Scenarios for Reset Button
	
	@When("The user click on reset button")
	public void the_user_click_on_reset_button() {
	    driver.findElement(By.xpath("//input[@value='Reset']")).click();;
	   }

	@Then("The user shuld see the blank form")
	public void the_user_shuld_see_the_blank_form() {
		Assert.assertTrue(driver.getCurrentUrl().contains("addtariffplans"));
	}

	
//Scenarios for Invalid Data for add tarrif plan
	
	@When("The user enter invalid data {string},{string},{string},{string},{string},{string},{string}")
	public void the_user_enter_invalid_data(String MonthRent, String  FreeLocMinuts, String FreeIntMinuts, String FreeSMS, String localCharges, String IntCharges, String SMSCharges) {
	    
		  driver.findElement(By.id("rental1")).sendKeys(MonthRent); 
		  driver.findElement(By.id("local_minutes")).sendKeys(FreeLocMinuts);
		  driver.findElement(By.id("inter_minutes")).sendKeys(FreeIntMinuts);
		  driver.findElement(By.id("sms_pack")).sendKeys(FreeSMS);
		  driver.findElement(By.id("minutes_charges")).sendKeys(localCharges);
		  driver.findElement(By.id("inter_charges")).sendKeys(IntCharges);
		  driver.findElement(By.id("sms_charges")).sendKeys(SMSCharges);
			
	}

	@Then("The user shuld see the error message")
	public void the_user_shuld_see_the_error_message() {
	  
		Assert.assertTrue(driver.findElement(By.id("message4")).isDisplayed());
		//driver.switchTo().alert().accept();
	
	}

		
	//Scenarios for add tarrif to customer
	
	@Given("Customer should be on add tarrif to customer page")
	public void customer_should_be_on_add_tarrif_to_customer_page() {
	   
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\dhart_000\\Dharti\\TelecomTestCucumber\\Driver\\chromedriver.exe");
				driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.get("http://demo.guru99.com/telecom/");
				WebElement addtarif=driver.findElement(By.xpath("//a[text()='Add Tariff Plan to Customer']"));
				addtarif.click();
	}

	@When("Customer enter the valid customer id")
	public void customer_enter_the_valid_customer_id() {
	    driver.findElement(By.id("customer_id")).sendKeys("795166");
	   
	}

	@When("customer click on submit button")
	public void customer_click_on_submit_button() {
		 driver.findElement(By.xpath("//input[@value='submit']")).click();;
	    
	}

	@Then("customer should navigate to assign tarrif plan to customer")
	public void customer_should_navigate_to_assign_tarrif_plan_to_customer() {
	    Assert.assertTrue(driver.findElement(By.xpath("//h2[text()='Approved Tariff Plans']")).isDisplayed());
		
	  }

	//Scenarios for Invalid Customer Id
	
	@When("Customer enter the Invalid customer id")
	public void customer_enter_the_Invalid_customer_id() {
		 driver.findElement(By.id("customer_id")).sendKeys("795168");
		
	}

	@Then("Error message should show invalid customer id")
	public void error_message_should_show_invalid_customer_id() {
	    Assert.assertTrue(driver.findElement(By.xpath("//h4[text()='Please Input Your Correct Customer ID']")).isDisplayed());
	
	}
	
	
	//Scenarios for payBilling 
	
	@Given("Customer  should be on PayBilling page")
	public void customer_should_be_on_PayBilling_page() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\dhart_000\\Dharti\\TelecomTestCucumber\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/telecom/");
		WebElement paybill=driver.findElement(By.xpath("//a[text()='Pay Billing']"));
		paybill.click();
	
	 	}

	@When("Customer enter valid customer id")
	public void customer_enter_valid_customer_id() {
	    driver.findElement(By.id("customer_id")).sendKeys("795166");
	   
	}

	@Then("customer should see the pay billing page")
	public void customer_should_see_the_pay_billing_page() {
		 Assert.assertTrue(driver.findElement(By.xpath("//h1[text()='Pay Billing']")).isDisplayed());
		
	}

	@When("Customer enter Invalid customer id")
	public void customer_enter_Invalid_customer_id() {
	    driver.findElement(By.id("customer_id")).sendKeys("795169");
	    
	   
	}

	@Then("customer should see the Eroor message")
	public void customer_should_see_the_Eroor_message() {
		Assert.assertTrue(driver.findElement(By.xpath("//h4[text()='Please Input Your Correct Customer ID']")).isDisplayed());
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
	


	
	
	
	
	


