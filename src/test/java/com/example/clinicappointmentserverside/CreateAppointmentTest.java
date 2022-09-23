package com.example.clinicappointmentserverside;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;
public class CreateAppointmentTest {
    private WebDriver driver;
    private Map<String, Object> vars;
    JavascriptExecutor js;
    @Before
    public void setUp() {
        driver = new FirefoxDriver();
        js = (JavascriptExecutor) driver;
        vars = new HashMap<String, Object>();
    }
    @After
    public void tearDown() {
        driver.quit();
    }
    @Test
    public void createAppointment() {
        driver.get("http://localhost:4200/");
        driver.manage().window().setSize(new Dimension(1440, 780));
        driver.findElement(By.id("appointment-btn")).click();
        driver.findElement(By.cssSelector(".btn-container > button")).click();
        driver.findElement(By.name("patient")).click();
        driver.findElement(By.name("patient")).sendKeys("Paciente 1");
        driver.findElement(By.name("infodesc")).click();
        driver.findElement(By.name("infodesc")).sendKeys("Migraña fuerte");
        driver.findElement(By.name("specialty")).click();
        driver.findElement(By.name("specialty")).sendKeys("Neurología");
        driver.findElement(By.name("date")).click();
        driver.findElement(By.name("date")).sendKeys("25/09/2022");
        driver.findElement(By.cssSelector(".btn")).click();
    }
}
