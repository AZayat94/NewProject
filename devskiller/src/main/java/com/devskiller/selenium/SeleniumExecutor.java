package com.devskiller.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SeleniumExecutor {

  private By Header_Text = By.tagName("h1");
  private By ClickMe_Button = By.xpath("//button");
  private By Link = By.tagName("a");
  private final WebDriver driver;

  public SeleniumExecutor(WebDriver driver) {
    this.driver = driver;
  }

  public String extractHeader() {
    String HeaderText = driver.findElement(Header_Text).getText();
    return HeaderText;
  }

  public String clickTheButtonAndExtractLink() {
    driver.findElement(ClickMe_Button).click();
    String URL = driver.findElement(Link).getAttribute("href");
    return URL;
  }


}
