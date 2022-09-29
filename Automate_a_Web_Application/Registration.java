package Automate_a_Web_Application;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Registration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","D:\\\\mysql/chromedriver.exe");
		String driverPath="D:\\mysql/chromedriver.exe";
		WebDriver driver ;
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com/campaign/landing.php?campaign_id=14884913640&extra_1=s%7Cc%7C589460569891%7Cb%7Cfacebook%20signin%7C&placement=&creative=589460569891&keyword=facebook%20signin&partner_id=googlesem&extra_2=campaignid%3D14884913640%26adgroupid%3D128696221832%26matchtype%3Db%26network%3Dg%26source%3Dnotmobile%26search_or_content%3Ds%26device%3Dc%26devicemodel%3D%26adposition%3D%26target%3D%26targetid%3Dkwd-3821998899%26loc_physical_ms%3D9302797%26loc_interest_ms%3D%26feeditemid%3D%26param1%3D%26param2%3D&gclid=EAIaIQobChMIkbuT9dq5-gIVgdGWCh3ZdQ0PEAAYASAAEgJ-I_D_BwE");
    	driver.findElement(By.name("firstname")).sendKeys("Raj");
    	driver.findElement(By.name("lastname")).sendKeys("thakur");
    	driver.findElement(By.name("reg_email__")).sendKeys("rj@gmail.com");
    	driver.findElement(By.name("reg_email_confirmation__")).sendKeys("rj@gmail.com");
    	driver.findElement(By.id("password_step_input")).sendKeys("raj@123");
    	driver.findElement(By.id("day")).sendKeys("27");
    	driver.findElement(By.id("month")).sendKeys("jun");
    	driver.findElement(By.id("year")).sendKeys("1998");
    	driver.findElement(By.className("_5k_2 _5dba")).click();
   	driver.findElement(By.id("u_0_s_jy")).click();
		
		
	
		


	}

}
