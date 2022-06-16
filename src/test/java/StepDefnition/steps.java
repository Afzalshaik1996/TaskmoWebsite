package StepDefnition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class steps {
    static WebDriver driver;

    @Given("Open the Chrome browser")
    public void openTheChromeBrowser() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
//        ChromeOptions options = new ChromeOptions();
//        options.addArguments("--headless");
//        driver = new ChromeDriver(options);
        System.out.println("Opening the Chrome browser");
    }

    @When("Navigate the Taskmo website")
    public void navigateTheTaskmoWebsite() {
        driver.get("https://taskmo.com/");
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
        System.out.println("Launched the website");
    }


    @Then("check the Taskmo Logo is Displayed on Website")
    public void checkTheTaskmoLogoIsDisplayedOnWebsite() {
        driver.findElement(By.xpath("//img[@class='taskmo-logo']")).isDisplayed();
        System.out.println("Taskmo logo is displayed on Website");
    }

    @Given("click on Aboutus Page")
    public void click_on_Aboutus_Page() throws InterruptedException {
        driver.findElement(By.xpath("//span[normalize-space()='About']")).click();
        Thread.sleep(2000);
        System.out.println("Aboutus Page is displayed");
    }

    @When("click on Services Page")
    public void click_on_Services_Page() throws InterruptedException {
        driver.findElement(By.xpath("//span[normalize-space()='Services']")).click();
        Thread.sleep(2000);
        System.out.println("Services Page has been clicked");
    }
    @And("click on Blogs Page")
    public void click_on_Blogs_Page() throws InterruptedException {
        driver.findElement(By.xpath("//span[normalize-space()='Blog']")).click();
        Thread.sleep(2000);
        System.out.println("Blogs Page is displayed and clicked all the inside links");
    }

    @Then("click on Contactus Page")
    public void click_on_Contactus_Page() throws InterruptedException {
        driver.findElement(By.xpath("//span[normalize-space()='Contact']")).click();
        Thread.sleep(2000);
        System.out.println("Contact Us Page has been clicked and Displayed");
    }

    @Then("close the browser")
    public void close_the_browser(){
        driver.quit();
        System.out.println("Browser is closed successfully");
    }

}




