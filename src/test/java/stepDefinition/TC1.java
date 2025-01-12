package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TC1 {

    WebDriver driver;
    @Given("User is on the login page")
    public void user_is_on_the_login_page() {

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/");
        System.out.println("Login Successful");
    }
 
    @When("User Enter Username and Password")
    public void user_enter_username_and_password() {
        WebElement emailField = driver.findElement(By.id("user-name"));
        emailField.sendKeys("standard_user"); 
        WebElement passwordField = driver.findElement(By.id("password"));
        passwordField.sendKeys("secret_sauce"); 
        
    }
    @When("User should click the LoginButton")
    public void user_should_click_the_login_button() {
        WebElement loginButton = driver.findElement(By.name("login-button"));
        loginButton.click();
    }
    @Then("Login Should be successful")
    public void login_should_be_successful() {
        System.out.println("Login Successful");
        driver.quit();
    }
}
