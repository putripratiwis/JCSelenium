package com.juaracoding.selenium.example;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumOne {
    public static void main(String[] args) throws InterruptedException {
        // System Property for Chrome Driver
        System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");

        // Instantiate a ChromeDriver class.
        WebDriver driver=new ChromeDriver();

        driver.manage().window().maximize();

        String url = "https://demoqa.com/text-box";

        driver.get(url);

        //String titleName = driver.getTitle();
        //System.out.println(titleName);

        JavascriptExecutor js = (JavascriptExecutor) driver;

        Thread.sleep(3000);

        driver.findElement(By.id("userName")).sendKeys("JuaraCoding");
        System.out.println("input username");
        driver.findElement(By.id("userEmail")).sendKeys("info@juaracoding.com");
        System.out.println("input email");
        driver.findElement(By.id("currentAddress")).sendKeys("Jakarta");
        System.out.println("input current address");
        driver.findElement(By.id("permanentAddress")).sendKeys("Jakarta");
        System.out.println("input permanent address");

        //scroll vertical 1000 pixel
        js.executeScript("window.scrollBy(0,3000");

        driver.findElement(By.id("submit")).click();
        System.out.println("button submit click");


        //driver.quit();

    }
}