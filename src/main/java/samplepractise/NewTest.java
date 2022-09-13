package samplepractise;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewTest {
	
	 public static void main(String[] args) {
		  System.setProperty("webdriver.chrome.driver", "C:\\ChromeDriver\\chromedriver.exe"); 
		  WebDriver driver=new ChromeDriver();
		  driver.get("https://www.google.com");
		  driver.close();
	  }
}
