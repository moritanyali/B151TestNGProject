package techproed.tests.day26_PageKullanimi;

import org.testng.Assert;
import org.testng.annotations.Test;
import techproed.pages.OpenSourcePage;
import techproed.pages.OpenSourcePageClass;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;

public class C02_PageKullanimi {
    @Test
    public void test01() {
        //https://opensource-demo.orangehrmlive.com/web/index.php/auth/login adrese gidelim
        Driver.getDriver().get(ConfigReader.getProperty("openSourceUrl"));
        //Username: Admin
        //Password: admin123

        //kullaniciAdi, kullaniciSifre, submitButton elementlerini locate edelim
        OpenSourcePageClass.username().sendKeys(ConfigReader.getProperty("OpenSourceUsername"));
        OpenSourcePageClass.password().sendKeys(ConfigReader.getProperty("OpenSourcePassword"));
        OpenSourcePageClass.submitButton().click();

        Assert.assertTrue(OpenSourcePageClass.verify().isDisplayed());
        Driver.closeDriver();
    }
}
