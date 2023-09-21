package com.string;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Joinstr {
	public static void main(String[] args)throws ClassNotFoundException {
		String s="Hello";
		System.out.println("First-"+s);
		String v="World";
		System.out.println("Second-"+v);
		String join=s.concat(v);
		System.out.println("joined string is-"+join);
		}


}
