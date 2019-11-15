package Test_Amazon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test_Homepage {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
       WebDriver driver = new ChromeDriver();
       driver.get("http://google.com");
       driver.manage().window().maximize();
       String Title= driver.getTitle();
       System.out.println(Title);
       driver.quit();
	}

}
