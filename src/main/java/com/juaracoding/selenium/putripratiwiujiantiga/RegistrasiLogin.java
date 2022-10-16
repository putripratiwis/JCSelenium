package com.juaracoding.selenium.putripratiwiujiantiga;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegistrasiLogin {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");

        WebDriver driver=new ChromeDriver();

        driver.manage().window().maximize();

        String url = "https://shop.demoqa.com/my-account/";

        driver.get(url);

        String titleName = driver.getTitle();
        System.out.println(titleName);


        Thread.sleep(3000);


        driver.findElement(By.id("reg_username")).sendKeys("putripratiwi");
        System.out.println("input username");
        driver.findElement(By.id("reg_email")).sendKeys("putripratiwis@gmail.com");
        System.out.println("input email");
        driver.findElement(By.id("reg_password")).sendKeys("Jakarta1990!");
        System.out.println("input password");
        driver.findElement(By.xpath("//*[@id=\"customer_login\"]/div[2]/form/p[4]/button")).click();
        System.out.println("button registrasi click");
        driver.navigate().back();
        System.out.println("Navigate Back");
        driver.findElement(By.id("username")).sendKeys("putripratiwi");
        System.out.println("login username");
        driver.findElement(By.id("password")).sendKeys("Jakarta1990!");
        System.out.println("login password");
        driver.findElement(By.xpath("//*[@id=\"customer_login\"]/div[1]/form/p[3]/button")).click();
        System.out.println("button login click");



    }
}
