package com.devskiller.selenium;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static org.junit.Assert.assertEquals;

public class SeleniumExecutorTest extends BaseSeleniumTest {

  @Test
  public void shouldExtractHelloWorldText() {
    webDriver.get("http://localhost:8089/index.html");
    SeleniumExecutor executor = new SeleniumExecutor(webDriver);
    assertEquals("Hello world!", executor.extractHeader());
  }

  @Test
  public void shouldClickAndExtractLink() {
    webDriver.get("http://localhost:8089/index.html");
    SeleniumExecutor executor = new SeleniumExecutor(webDriver);
    String extractedLink = executor.clickTheButtonAndExtractLink();
    assertEquals("https://devskiller.com/", extractedLink);
  }

}