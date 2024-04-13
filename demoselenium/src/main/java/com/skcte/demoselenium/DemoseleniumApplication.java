package com.skcte.demoselenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import jakarta.websocket.Decoder.Text;

@SpringBootApplication
public class DemoseleniumApplication {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		// driver.get("https://www.google.com");
		// driver.findElement(By.id("APjFqb")).sendKeys("skcet admission");
		// driver.findElement(By.className("gb_Ld")).click();
		// driver.navigate().back();
		// Thread.sleep(1000);
		// driver.close();
		driver.get("https://www.demoblaze.com");
		driver.findElement(By.linkText("Laptops")).click();
		Thread.sleep(10000);
		driver.findElement(By.linkText("MacBook air")).click();
		Thread.sleep(10000);
		driver.findElement(By.linkText("Add to cart")).click();
		Thread.sleep(10000);
		// driver.findElement(By.linkText("OK")).click();
		driver.switchTo().alert().accept();
		Thread.sleep(10000);
		driver.findElement(By.linkText("Cart")).click();
		Thread.sleep(10000);
		List<WebElement> list=driver.findElements(By.tagName("td"));
		int ans=0;
		if(list.isEmpty())
		{
			System.out.print("empty");
		}
		for(WebElement ele:list)
		{
			if(ans==0 || ans==1)
			{
				System.out.println(ele.getText());
			}			
		}
		

		
		


		// SpringApplication.run(DemoseleniumApplication.class, args);
	}
}


