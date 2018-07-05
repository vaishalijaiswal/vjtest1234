package Locator;

import org.openqa.selenium.By;

public class GmailLocator 
{
//	public static By username = By.xpath("//*[@id='identifierId']");
//	public static By password = By.xpath("//*[@id='password']/div[1]/div/div[1]/input");
//	//public static By password = By.cssSelector("#password > div.aCsJod.oJeWuf > div > div.Xb9hP > input");
//	public static By nex1 = By.cssSelector("#identifierNext > content");
//	public static By compose = By.xpath("//*[@id=':ir']/div/div");
	
	public static By username = By.cssSelector("#identifierId");
	 public static By password = By.cssSelector("#password > div.aCsJod.oJeWuf > div > div.Xb9hP > input");
	 public static By next1 = By.cssSelector("#identifierNext > content > span");
	 public static By next2 = By.xpath("//*[@id='passwordNext']/content/span");
	 public static By compose = By.xpath("//*[@id=':j6']/div/div");
  public static By gmailLogo = By.xpath("//*[@id='yDmH0d']/div[2]/c-wiz/div/div/div[5]/div[2]/c-wiz/div/div[1]/div/div[1]/div[2]/a[2]");



}
