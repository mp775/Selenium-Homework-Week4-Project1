package com.nopcommerce.pages.computer;

import com.nopcommerce.utilities.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComputerDesktopPage extends Utility {
    ArrayList<String> beforeFilterProductNameList = new ArrayList<>();
    ArrayList<String> afterFilterProductNameList = new ArrayList<>();
    By computerTab = By.xpath("(//a[normalize-space()='Computers'])[1]");
    By desktopTab = By.cssSelector("h2[class='title'] a[title='Show products in category Desktops']");
    By positionZtoA = By.id("products-orderby");
    By addToCartText = By.xpath("//div[@class='buttons']/button");
    By positionAtoZ = By.id("products-orderby");

    public void clickOnComputerTab() {
        clickOnElement(computerTab);
    }

    public void clickOnDesktopTab() {
        clickOnElement(desktopTab);
    }

    public ArrayList<String> desktopProductListBeforeFilter() {
        List<WebElement> beforeFilterProductName = driver.findElements(By.xpath("//h2[@class='product-title']"));
        for (WebElement products : beforeFilterProductName) {
            beforeFilterProductNameList.add(String.valueOf(products.getText()));
        }
        System.out.println("Product List before filter apply : " + beforeFilterProductNameList);
        Collections.reverse(beforeFilterProductNameList);
        System.out.println("Sort Array List in reverse Alphabetic Order : " + beforeFilterProductNameList);
        return beforeFilterProductNameList;
    }

    public ArrayList<String> desktopProductListAfterFilter() {
        List<WebElement> afterFilterProductName = driver.findElements(By.xpath("//h2[@class='product-title']"));
        for (WebElement products : afterFilterProductName) {
            afterFilterProductNameList.add(String.valueOf(products.getText()));
        }
        System.out.println("Product List after applying filter : " + afterFilterProductNameList);
        return afterFilterProductNameList;
    }

    public void selectShortByPositionAtoZ() {
        selectByVisibleTextFromDropDown(positionZtoA, "Name: A to Z");

    }

    public void selectShortByPositionZtoA() {
        selectByVisibleTextFromDropDown(positionAtoZ, "Name: Z to A");
    }


    public void addToCart() {

        clickOnElement(addToCartText);
    }


}

