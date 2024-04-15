package de.tr.me.de.tr.me.seinTest;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hallo ich übernehme abnun die Arbeit!" );
        WebDriver driver = new ChromeDriver();

        driver.get("https://the-internet.herokuapp.com/");

      
    }
}
