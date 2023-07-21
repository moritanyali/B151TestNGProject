package techproed.tests.day28_DataProvider;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import techproed.pages.GooglePage;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;
import techproed.utilities.ReusableMethods;

public class C02_DataProviderTest {
    @DataProvider
    public static Object[][] araclar() {
        return new Object[][]{
                {"volvo"},{"audi"},{"mercedes"},{"ford"}};
    }

    /*
         Google sayfasina gidip
         DataProvider ile belirtilen arac isimlerini aratalim
         */
    @Test(dataProvider = "araclar")
    public void test01(String araclar) {
        //Google sayfasına gidelim
        Driver.getDriver().get(ConfigReader.getProperty("googleUrl"));
        //Dataproviderdaki verilerle testng notasyonlarıyla arama yapalım
        GooglePage google = new GooglePage();
        google.aramaKutusu.sendKeys(araclar, Keys.ENTER);
        ReusableMethods.bekle(2);
        //Her arama için sayfa resmi alalım
        ReusableMethods.tumSayfaResmi();
        //Sayfayi kapatalım
        Driver.closeDriver();

    }
}
