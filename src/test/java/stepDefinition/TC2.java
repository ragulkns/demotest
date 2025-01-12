package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TC2 {
WebDriver driver = new ChromeDriver();

@Given("User is on the product page")
public void user_is_on_the_product_page() {
    
    driver.get("https://www.saucedemo.com/");
    driver.manage().window().maximize();
    WebElement emailField = driver.findElement(By.id("user-name"));
    emailField.sendKeys("standard_user"); 
    WebElement passwordField = driver.findElement(By.id("password"));
    passwordField.sendKeys("secret_sauce"); 
    WebElement loginButton = driver.findElement(By.name("login-button"));
    loginButton.click();

 WebElement logo = driver.findElement(By.className("app_logo"));
 System.out.println("homepage: " + logo.getText());   
}
@When("User adds {string} to the cart")
public void user_adds_to_the_cart(String string) throws InterruptedException {
    WebElement firstProductAddToCartButton = driver.findElement(By.xpath("(//button[text()='Add to cart'])[1]"));
    WebElement secondProductAddToCartButton = driver.findElement(By.xpath("(//button[text()='Add to cart'])[2]"));
    firstProductAddToCartButton.click();
    Thread.sleep(1000);
    secondProductAddToCartButton.click();    
    
}
@Then("User should click on the cart")
    public void user_should_click_on_the_cart() {
    WebElement cartIcon = driver.findElement(By.className("shopping_cart_link"));
    cartIcon.click();
    driver.quit();
    }


    
}
