package com.cydeo.tests.day04_findElements_checkboxes_radio;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/*
  TC #1: XPATH and cssSelector Practices
1. Open Chrome browser
2. Go to https://practice.cydeo.com/forgot_password
3. Locate all the WebElements on the page using XPATH and/or CSS locator only (total of 6)
a. “Home” link
b. “Forgot password” header
c. “E-mail” text
d. E-mail input box
e. “Retrieve password” button
f. “Powered by Cydeo text
4. Verify all web elements are displayed.
First solve the task with using cssSelector only. Try to create 2 different
cssSelector if possible
Then solve the task using XPATH only. Try to create 2 different
XPATH locator if possible
 */
public class T1_xpath_cssSelector_practices {
    public static void main(String[] args) throws InterruptedException {

        //TC #1: XPATH and cssSelector Practices
        //1. Open Chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        //2. Go to https://practice.cydeo.com/forgot_password
        driver.get("https://practice.cydeo.com/forgot_password");

        //3. Locate all the WebElements on the page using XPATH and/or CSS locator only (total of 6)
        //a. “Home” link

        //Locating "Home" link, using cssSelector, syntax #1, class attribute value
        //                 tagName[attribute='value']
        WebElement homeLink_ex1 = driver.findElement(By.cssSelector("a[class='nav-link']"));

        //Locating "Home" link, using cssSelector, syntax #2 (tagName.classValue), class attribute value
        WebElement homeLink_ex2 = driver.findElement(By.cssSelector("a.nav-link"));


        //Locating "Home" link, using cssSelector, syntax #1, href class attribute value
        WebElement homeLink_ex3 = driver.findElement(By.cssSelector("a[href='/']"));



        //b. “Forgot password” header
        //Locate header, using xpath, using text of h2
        //WebElement forget = driver.findElement(By.xpath("//h2[text()='Forgot Password']"));
        WebElement header_ex1 = driver.findElement(By.xpath("//h2[.='Forgot Password']"));


        //Locate header, using cssSelector,syntax #1 locate parent element and move down to h2
        WebElement header_ex2 = driver.findElement(By.cssSelector("div[class='example']>h2"));


        //Locate header, using cssSelector,syntax #2 locate parent element and move down to h2
        WebElement header_ex3 = driver.findElement(By.cssSelector("div.example>h2"));



        //c. “E-mail” text
        // locate the 'email' label using xpath
        WebElement emailLabel_ex1 = driver.findElement(By.xpath("//label[@for='email']"));
        WebElement emailLabel_ex2 = driver.findElement(By.xpath("//label[.='E-mail']"));



        //d. E-mail input box
        // locate the 'email' input box using xpath
        WebElement emailInput_ex1 = driver.findElement(By.xpath("//input[@name='email']"));

        // locate the 'email' input box using xpath contains method
        WebElement emailInput_ex2 = driver.findElement(By.xpath("//input[@pattern='[a-z0-9._%+-]+@[a-z0-9.-]+\\.[a-z]{2,3}$']"));


        // locate the 'email' input box using xpath contains method
        //tagName[contains(@attribute, 'value')]
        WebElement emailInput_ex2_second = driver.findElement(By.xpath("//input[contains(@pattern, '[a-z0-9._%+-]+@[a-z0-9.-]+\\.[a-z]{2,3}$' )]"));
        WebElement emailInput_ex2_thr = driver.findElement(By.xpath("//input[contains(@pattern, 'a-z' )]")); // work it



        //e. “Retrieve password” button
        //locate it using xpath
        WebElement retrievePasswordButton = driver.findElement(By.xpath("//button[@id='form_submit']"));


        //f. “Powered by Cydeo text
        WebElement poweredByCydeoText = driver.findElement(By.xpath("//div[@style='text-align: center;']"));


        //4. Verify all web elements are displayed.
        System.out.println("homeLink_ex1.isDisplayed() = " + homeLink_ex1.isDisplayed());
        System.out.println("header_ex1.isDisplayed() = " + header_ex1.isDisplayed());
        System.out.println("emailLabel_ex1.isDisplayed() = " + emailLabel_ex1.isDisplayed());
        System.out.println("emailInput_ex1.isDisplayed() = " + emailInput_ex1.isDisplayed());
        System.out.println("poweredByCydeoText.isDisplayed() = " + poweredByCydeoText.isDisplayed());
        System.out.println("retrievePasswordButton.isDisplayed() = " + retrievePasswordButton.isDisplayed());


        //wait 2 second before closing the browser.
        Thread.sleep(2000);
        driver.close();


    }
}
