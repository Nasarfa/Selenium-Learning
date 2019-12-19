package javaExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ScrollingExample {
    @Test
	public void scrolldown() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","/Users/nasar/Downloads/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.carwale.com/?utm_source=google&utm_medium=cpc&utm_campaign=6038662&gclid=EAIaIQobChMIxqaqi7nB5gIVixePCh2wgwx9EAAYAyAAEgIPyvD_BwE");
		driver.manage().window().maximize();
driver.findElement(By.xpath("//*[@id=\"moreComparison\"]/a")).click();
	}
}
