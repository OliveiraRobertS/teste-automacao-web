package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import config.PageBase;
import utils.Utils;

public class HomePage extends PageBase{
	
	Utils utils = new Utils();
	
	WebElement expandedAccounts = driver.findElement(By.xpath("//ul[@id='social-sidebar-menu']/li[5]/a"));
	WebElement suppliers 	= driver.findElement(By.xpath("/html/body/div[2]/nav/div[2]/ul/li[5]/ul/li[2]/a"));
	
	public void accountClick() throws InterruptedException {
		utils.click(expandedAccounts, 10);
	}
	
	public void suppliers() throws InterruptedException {
		utils.click(suppliers, 10);
	}
}
