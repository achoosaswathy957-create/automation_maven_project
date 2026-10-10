package com.orangehrm.test;

import java.time.Duration;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

public class LoginDataTableSteps {
    WebDriver driver;

    @Given("User is on the login page")
    public void user_is_on_the_login_page() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @When("User enters username and password")
    public void user_enters_username_and_password(DataTable dataTable) {
        List<Map<String, String>> users = dataTable.asMaps(String.class, String.class);

        for (Map<String, String> user : users) {
            driver.get("https://www.facebook.com/");

            // Handle Cookie pop-up if Facebook shows it
            try {
                WebElement cookieBtn = driver.findElement(By.xpath("//button[contains(., 'Allow') or contains(., 'Accept')]"));
                cookieBtn.click();
            } catch (Exception e) {
                // No cookie banner, proceed normally
            }

            try { Thread.sleep(1500); } catch (InterruptedException e) {}

            WebElement email = driver.findElement(By.name("email"));
            email.clear();
            email.sendKeys(user.get("username"));

            WebElement pass = driver.findElement(By.name("pass"));
            pass.clear();
            pass.sendKeys(user.get("password"));

            try {
                driver.findElement(By.name("login")).click();
            } catch (Exception e) {
                driver.findElement(By.xpath("//button[@type='submit']")).click();
            }

            try { Thread.sleep(2000); } catch (InterruptedException e) {}
        }
    }

    @Then("User should be redirected to the homepage")
    public void user_should_be_redirected_to_the_homepage() {
        if (driver != null) {
            driver.quit();
        }
    }
}