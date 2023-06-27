package com.cydeo.tests.day02_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HWP3_Gmail_Title_Verification {
    public static void main(String[] args) throws InterruptedException {

        //TC #3: Back and forth navigation
        //1- Open a Chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();


        //2- Go to: https://google.com
        driver.get("https://google.com");

        //3- Click to Gmail from top right.
        //Locating the Gmail link using "linkText" locator.
        WebElement gmailLink = driver.findElement(By.linkText("Gmail"));
        Thread.sleep(3000);

        //click to the gmail link
        gmailLink.click();
        Thread.sleep(3000);


        //4- Verify title contains:
        //Expected: Gmail
        String expectedGmailTitle = "Gmail";
        String actualGmail= driver.getTitle();

        System.out.println("actualGmail = " + actualGmail);

        if (actualGmail.equals(expectedGmailTitle)){
            System.out.println("Gmail verification PASSED!");
        }else {
            System.out.println("Gmail verification FAILED!");
        }


        //5- Go back to Google by using the .back();
        driver.navigate().back();
        Thread.sleep(3000);

        //6- Verify title equals:
        //Expected: Google
        String expectedTitle = "Google";
        String actualTitle = driver.getTitle();

        if (actualTitle.equals(expectedTitle)){
            System.out.println("Google title verification PASSED!");
        }else {
            System.out.println("Google title verification FAILED!");
        }

        driver.close();
    }
}
