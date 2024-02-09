package com.newage.vaadinDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class UserInterface {
  @Test
  public void f() throws InterruptedException {
	  WebDriver driver = new ChromeDriver();
	  driver.get("https://demo.vaadin.com/sampler/#");
	  Thread.sleep(2000);
	  System.out.println(driver.findElement(By.xpath("(//div[@id='navigator']//div[@class='gwt-HTML titlelabel transitioned'])[1]")).getText());
	  driver.quit();
  }
}
