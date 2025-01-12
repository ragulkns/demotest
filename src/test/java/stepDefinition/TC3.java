package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TC3 {
 WebDriver driver = new ChromeDriver();
 
 @Given("User clicks on the checkout button")



 
 public void user_clicks_on_the_checkout_button() throws InterruptedException {

    driver.get("https://www.saucedemo.com/");
    driver.manage().window().maximize();
    WebElement emailField = driver.findElement(By.id("user-name"));
    emailField.sendKeys("standard_user"); 
    WebElement passwordField = driver.findElement(By.id("password"));
    passwordField.sendKeys("secret_sauce"); 
    WebElement loginButton = driver.findElement(By.name("login-button"));
    loginButton.click();
    WebElement firstProductAddToCartButton = driver.findElement(By.xpath("(//button[text()='Add to cart'])[1]"));
    WebElement secondProductAddToCartButton = driver.findElement(By.xpath("(//button[text()='Add to cart'])[2]"));
    firstProductAddToCartButton.click();
    Thread.sleep(1000);
    secondProductAddToCartButton.click();
    WebElement cartIcon = driver.findElement(By.className("shopping_cart_link"));
    cartIcon.click();    
    
 WebElement checkoutButton = driver.findElement(By.id("checkout"));
  checkoutButton.click();
}

@When("User enters the first name as {string}")
public void user_enters_the_first_name_as(String string) {
    WebElement firstNameField = driver.findElement(By.id("first-name"));
    firstNameField.sendKeys("Ragul");
}
@When("User enters the last name as {string}")
public void user_enters_the_last_name_as(String string) {
    WebElement lastNameField = driver.findElement(By.id("last-name"));
    lastNameField.sendKeys("Duraisamy");
   
}
@When("User enters the postal code as {string}")
public void user_enters_the_postal_code_as(String string) {
    WebElement postalCodeField = driver.findElement(By.id("postal-code"));
    postalCodeField.sendKeys("12345");
}
@Then("User should click on continue to see the checkout overview page")
public void user_should_see_the_checkout_overview_page() throws InterruptedException {
    WebElement continueButton = driver.findElement(By.id("continue"));
    continueButton.click();
    WebElement finishButton = driver.findElement(By.id("finish"));
    Thread.sleep(1000);
    finishButton.click();
    WebElement confirmationMessage = driver.findElement(By.className("complete-header"));
            System.out.println("Order Completed: " + confirmationMessage.getText());
            driver.quit();
}

    
}
