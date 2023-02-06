package com.stepdefiniton;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.base.util.BaseClass;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Stelpdefenision extends BaseClass {

	@Given("Open the Browser")
	public void open_the_browser() {
		try {
			browserOpen("chrome");
			windowMaximize();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	@Given("Launch the Bobcat URL")
	public void launch_the_bobcat_url() {
		try {
			loadUrl("https://www.bobcat.com/in/en");
			impWait(5);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	@When("Click to Accept the cookies")
	public void click_to_accept_the_cookies() {
		//WebElement cook = driver.findElement(By.id("onetrust-button-group"));
		//driver.switchTo().frame(cook);
		WebElement cookies = driver.findElement(By.id("onetrust-accept-btn-handler"));
		cookies.click();

	}

	@When("Click on the Search Box & Enter Loaders {string}")
	public void click_on_the_search_box_enter_loaders(String string) {
		try {
			WebElement search = driver.findElement(By.xpath("//*[@name='q']"));
			dataSend(search, string);
			search.submit();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	@When("Click on the First source")
	public void click_on_the_first_source() {
		try {
			driver.findElement(By.linkText("B900 Backhoe Loader")).click();;
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

	@Then("Get the Tittle of the first source")
	public void get_the_tittle_of_the_first_source() {
		try {
		driver.findElement(By.xpath("//*[@data-test-id='model-pricing-title__desktop']")).click();
			//if (tittle.isDisplayed()) {
				System.out.println("Tittle : " + driver.getTitle());

			//} //else {
				//System.out.println("NOT Working Properly");
			//}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
