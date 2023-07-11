package com.nopcommerce.testsuit;

import com.nopcommerce.pages.homapage.TopMenuPage;
import com.nopcommerce.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TopMenuTest extends BaseTest {
    TopMenuPage topMenuPage = new TopMenuPage();

    @Test
    public void verifyPageNavigation() {
        topMenuPage.selectMenu("Computers");
        String expectedPageNavigationText = "Computers";
        String pageNavigateTo = topMenuPage.getPageName("Computers");
        Assert.assertEquals(pageNavigateTo,expectedPageNavigationText,"Page navigation not working");
    }
}
