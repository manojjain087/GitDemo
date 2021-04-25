import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class GmailLogin2 {
 public static void main(String str[]) throws InterruptedException, AWTException{
 WebDriver driver = new FirefoxDriver();
 driver.manage().window().maximize();
 driver.get("http://www.gmail.com/");
 //open gmail
 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
 driver.findElement(By.xpath(".//*[@id='Email']")).sendKeys("manoj.mi3@gmail.com");
 //enter emailid
  driver.findElement(By.xpath(".//*[@id='Passwd']")).sendKeys("codebank");
   // enter password
 driver.findElement(By.xpath("//*[@id='signIn']")).click();
 //click on sign in
 driver.findElement(By.xpath("//div[contains(text(),'COMPOSE')]")).click();
 //click on compose button
 
 driver.findElement(By.xpath("//form[1]//textarea[1]")).sendKeys("ritu7181@gmail.com");
 //enter email id where you need to send email
 
  driver.findElement(By.xpath("//div[@class='aoD az6']//input[@class='aoT']")).sendKeys("Please find attachment");
 //Enter subject
     Thread.sleep(15000);
  driver.findElement(By.xpath("//div[@class='a1 aaA aMZ']")).click();
  //click on attachment icon
 StringSelection ss = new StringSelection("C:\\Users\\selenium17_3\\Downloads\\manoj.txt");
     //upload your file using RobotClass
     //attach your path where file is located.
     Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
     Robot robot = new Robot();
     Thread.sleep(5000);
     robot.keyPress(KeyEvent.VK_CONTROL);
     robot.keyPress(KeyEvent.VK_V);
     robot.keyRelease(KeyEvent.VK_CONTROL);
     robot.keyRelease(KeyEvent.VK_V);
     Thread.sleep(6000);
     robot.keyPress(KeyEvent.VK_ENTER);
     robot.keyRelease(KeyEvent.VK_ENTER);
     Thread.sleep(10000);
       driver.findElement(By.xpath("//div[text()='Send']")).click();
     //Click on send
   }
}