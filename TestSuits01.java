package org.example;


import org.jetbrains.annotations.NotNull;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Arrays;
import java.util.Date;


public class TestSuits01 {



        protected static WebDriver driver;
        //import selenium web-driver dependency by clicking on 'RED' bulb or (Manualy = In 'POM' file)

    @BeforeMethod

    public void ClickOnBrowser() {

        System.setProperty("webdriver.chrome.driver", "src/test/java/driver/chromedriver.exe");//Open Chrome
        driver = new ChromeDriver();// import chrome web-Driver dependency (In 'POM' file)
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));//Duration to be wait
        driver.manage().window().maximize();  //Maximize the screen
        driver.get("https://demo.nopcommerce.com/"); //Open Web page
        driver.findElement(By.className("ico-register")).click();// click on register button

    }

  @Test
    public void userShouldBeAbleToRegisterSuccessfully() {

      //select on gender
      driver.findElement(By.id("gender-male")).click();
      //Enter First name
      driver.findElement(By.xpath("//input[@name='FirstName']")).sendKeys("amit");
      //Sendvalue(By.xpath("//input[@name='FirstName']"), "amit");

      //Enter Last name
      driver.findElement(By.id("LastName")).sendKeys("Patel");
      //Sendvalue(By.id("LastName"), "Patel");

      //select birth day
      Select birthday = new Select(driver.findElement(By.xpath("//select[@name='DateOfBirthDay']")));
      birthday.selectByIndex(10);

      //select birth month
      Select birthMonth = new Select(driver.findElement(By.name("DateOfBirthMonth")));
      birthMonth.selectByValue("5");

      //select birth year
      Select birthYear = new Select(driver.findElement(By.xpath("//select[@name='DateOfBirthYear']")));
      birthYear.selectByValue("1950");


      //Enter Email and Printout Time
      driver.findElement(By.id("Email")).sendKeys("abc0111@gmail.com");
      //Sendvalue(By.id("Email"), "abc" + rendomdate() + "@gmail.com");
      //System.out.println(rendomdate());

      //Enter password
      driver.findElement(By.id("Password")).sendKeys("xyz@123");
      //Sendvalue(By.id("Password"), "xyz@123");

      //Enter Confirmed Password
      driver.findElement(By.id("ConfirmPassword")).sendKeys("xyz@123");
      // Sendvalue(By.id("ConfirmPassword"), "xyz@123");

      //Click on Register button
      driver.findElement(By.id("register-button")).click();

      Assert.assertEquals
              ("Your registration completed", "Your registration completed", "Your registration is not completed");
  }

@AfterMethod
        public void closeBrowser() {

          driver.quit();
      }

@Test
    public static void setDriver(WebDriver driver) {
        TestSuits01.driver = driver;

    //click on computer
            driver.findElement(By.className("//ul[@class='top-YEHu notmobile']/li/a")).click();
            //Assert.assertEquals();}

            //click on desktop
            driver.findElement(By.className("//li[@class='inactive']/a")).click();

           //click on add to cart button
            driver.findElement(By.className("//div[@class='buttons']/button")).click();

            //select on processor
           Select select = new Select(driver.findElement(By.id("//*[@id=\"product_attribute_1\"]")));
           select.selectByVisibleText("Processor ");

           //select RAM
            Select select1 = new Select(driver.findElement(By.id("product_attribute_2")));
            select1.selectByValue("2");

            //select HDD
           driver.findElement(By.id("product_attribute_3_6")).click();

           //select OS
            driver.findElement(By.id("product_attribute_4_8")).click();

            //select software
            driver.findElement(By.id("prVN  DTHoduct_attribute_5_10")).click();
            driver.findElement(By.id("product_attribute_5_11")).click();
            driver.findElement(By.id("product_attribute_5_12")).click();
    }

@Test
        public void UserShouldBeAbleToSeeCurrencyButton(){

        // click on currency tab
        driver.findElement(By.id("customerCurrency"));

       //select euro
       Select euro = new Select(driver.findElement(By.id("customerCurrency")));
       euro.selectByVisibleText("Euro");

     //currency check
     Assert.assertEquals("€", "€" ,"currency is match successfully");


    }
    @Test
    public void UseShouldBeAbleToReferToFriend(){
        //select on gender
        driver.findElement(By.id("gender-male")).click();
        //Enter First name
        driver.findElement(By.xpath("//input[@name='FirstName']")).sendKeys("amit");
        //Sendvalue(By.xpath("//input[@name='FirstName']"), "amit");

        //Enter Last name
        driver.findElement(By.id("LastName")).sendKeys("Patel");
        //Sendvalue(By.id("LastName"), "Patel");

        //select birth day
        Select birthday = new Select(driver.findElement(By.xpath("//select[@name='DateOfBirthDay']")));
        birthday.selectByIndex(10);

        //select birth month
        Select birthMonth = new Select(driver.findElement(By.name("DateOfBirthMonth")));
        birthMonth.selectByValue("5");

        //select birth year
        Select birthYear = new Select(driver.findElement(By.xpath("//select[@name='DateOfBirthYear']")));
        birthYear.selectByValue("1950");


        //Enter Email and Printout Time
        driver.findElement(By.id("Email")).sendKeys("abc0111@gmail.com");
        //Sendvalue(By.id("Email"), "abc" + rendomdate() + "@gmail.com");
        //System.out.println(rendomdate());

        //Enter password
        driver.findElement(By.id("Password")).sendKeys("xyz@123");
        //Sendvalue(By.id("Password"), "xyz@123");

        //Enter Confirmed Password
        driver.findElement(By.id("ConfirmPassword")).sendKeys("xyz@123");
        // Sendvalue(By.id("ConfirmPassword"), "xyz@123");

        //Click on Register button
        driver.findElement(By.id("register-button")).click();

        //click on continue
       // for (String s : Arrays.asList("button-1 register-continue-button", "button-2 product-box-add-to-cart-button", "button-2 email-a-friend-button")) {
         //   driver.findElement(By.className(s)).click();
        //}

        //click on add to cart button

        //click on email a friend

        //enter your friend email
        driver.findElement(By.className("friend-email")).sendKeys("anjli1990@gmail.com");

        //enter your email address
        driver.findElement(By.className("your-email")).sendKeys("abc0111@gmail.com");

        //write personal massge
        driver.findElement(By.id("PersonalMessage")).sendKeys("send successfully.");

    }



















//>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>              All Utility Methods          >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>

        //Click on Element
        public static void Clickonelement(By by)
        {
            driver.findElement(by).click();
        }

        //Send Text Values
        public static void Sendvalue(By by, String value)
        {
            driver.findElement(by).sendKeys(value);
        }

        //Time stamp
        public static @NotNull String rendomdate()
        {
            Date dat = new Date();
            SimpleDateFormat formate = new SimpleDateFormat("ddMMyyyyHHmmss");
            return formate.format(dat);
        }


        //1.Wait for clickable
        public static void driverWaitsUntil(By by, int time) {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(time));
            wait.until(ExpectedConditions.elementToBeClickable(by)).click();
        }

        //2.wait for locator
        public static void driverWaitUntilElementLocated(int time, By by) {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(time));
            wait.until(ExpectedConditions.invisibilityOfElementLocated(by));
        }

        //3.wait for title-contains
        public static void driverWaitUntilElementTitleContains(By by, int time) {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(time));
            wait.until(ExpectedConditions.invisibilityOfElementLocated(by));
        }

        //4.wait for url fraction
        public static void driverWaitUntilElementURLFraction(By by, int time, String fraction) {
            WebDriverWait frction = new WebDriverWait(driver, Duration.ofSeconds(time));
            frction.until(ExpectedConditions.urlContains(fraction));
        }

        //5.wait for element to be clickable
        public static void driverWaitUntilElementToBeClickable(By by, int time) {
            WebDriverWait click = new WebDriverWait(driver, Duration.ofSeconds(time));
            click.until(ExpectedConditions.elementToBeClickable(by));
        }

        //6.wait for present of elemeants
        public static void driverWaitUntilPrasentdOfElement(By by, int time) {
            WebDriverWait presnt = new WebDriverWait(driver, Duration.ofSeconds(time));
            presnt.until(ExpectedConditions.presenceOfElementLocated(by));
        }

        //7.wait for InvisibaleOfElement
        public static void driverWaitUntilInvisibaleOfElement(By by, int time) {
            WebDriverWait invisble = new WebDriverWait(driver, Duration.ofSeconds(time));
            invisble.until(ExpectedConditions.invisibilityOfAllElements());
        }

        //8.wait for alertispresent
        public static void driverWaitUntilElementAlertIsPresent(By by, int time) {
            WebDriverWait wait7 = new WebDriverWait(driver, Duration.ofSeconds(time));
            wait7.until(ExpectedConditions.alertIsPresent());



        }

}