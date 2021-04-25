package com.WebDriver2;

import java.util.Random;

public class RandomNumbers {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
	 Random r = new Random();
	 int x=r.nextInt(10);//it will give random number btw 0 to 9
	 System.out.println("Random Number is:"+x);

	}

}
