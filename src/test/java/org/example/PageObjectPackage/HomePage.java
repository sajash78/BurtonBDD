package org.example.PageObjectPackage;

import org.example.BaseClassPackage.DriverFactory;
import org.hamcrest.Matchers;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import javax.swing.*;
import java.util.List;

public class HomePage extends DriverFactory {
    @FindBy(xpath = "//a[@class='MegaNav-categoryLink'][contains(text(),'Shoes')]")
    WebElement shoes;
    @FindBy (xpath = "//*[@id=\"root\"]/div/div[3]/div/div[3]/div[1]/ul/li[3]/div/nav/div[2]/div[1]/ul/li[1]/a/div/span")
    WebElement chelseaboots;
    @FindBy(id = "sortSelector")
    WebElement bestmatch;


    public void shoe() throws InterruptedException {
        Actions action = new Actions(driver);
        action.moveToElement(shoes).perform();
        Thread.sleep(4000);
        action.moveToElement(chelseaboots).click().perform();
    }
    public void select() throws InterruptedException {
        Thread.sleep(2000);

        Select sel = new Select(bestmatch);
        bestmatch.click();
        sel.selectByIndex(2);
    }
    @FindBy (css = ".ProductImages-image.ProductImages-mobile--showing")
    WebElement  Boots;
 public void mensBoots(){
     List<WebElement> boots = driver.findElements(By.cssSelector(".ProductImages-image.ProductImages-mobile--showing"));
     for (WebElement boot :boots){

         System.out.println(boot.getAttribute("title"));

         if (boot.getAttribute("title").contains("Black Suede Look Chelsea Boots as part of an outfit")){
             boot.click();
             break;

         }
     }


    }
    @FindBy(xpath = "//h1[@class='ProductDetail-title']")
    WebElement product;
    public void reultpageAssertion(){
     String actual = product.getText();
        Assert.assertThat(actual, Matchers.containsString("Look"));
    }
}
// saj.feature
    