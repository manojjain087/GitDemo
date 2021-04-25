package com.webdriver1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class LaunchIE {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.setProperty("webdriver.ie.driver","Z:\\IEDriverServer.exe");
		//Firefox is strongly supported by Selenium and for that we don't need to externally import the setup files.its there in selenium ref library by default which has imported.
		//Chrome and IE not configured so we need to externally import there setups/.exe files using setproperty methods.
		//so we need to explicitly import external property of chrome and IE using java methods that we can do by setproperty method.
		
		//setProperty used for explicitly configure the external libraries using   1.key - what to configure and 2.value where to configure.
		//single \ interpret as escape sequence by java that's why we are using \\ here in value for location or Path
		//.exe is added after the setup file name which was imported in setproperty method under value.
		WebDriver driver= new InternetExplorerDriver();
		driver.close();

	}

}
