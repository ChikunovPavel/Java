package five;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest2 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver" ,
                "C:/chromedriver.exe");
        WebDriver webDriver = new ChromeDriver();
        webDriver.get("http://www.googele.com/");
        WebElement searchBox =webDriver.findElement(By.name("q"));
        searchBox.sendKeys("GeekBrains");
        searchBox.submit();

    }
}
