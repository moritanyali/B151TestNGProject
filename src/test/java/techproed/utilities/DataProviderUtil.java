package techproed.utilities;

import org.testng.annotations.DataProvider;

public class DataProviderUtil {
    @DataProvider
    public Object[][] sehirverileri() {
        return new Object[][]{
                {"Ankara", "IcAnadolu", "06"},
                {"Izmir", "Ege", "35"},
                {"Diyarbakir", "Dogu", "21"}
        };
    }
}
