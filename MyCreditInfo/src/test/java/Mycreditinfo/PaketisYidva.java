package Mycreditinfo;

import com.Mycreditinfo.StepObject.HomePageSteps;
import com.Mycreditinfo.Utuls.ChromeRunner;
import com.Mycreditinfo.Utuls.Retry;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.sleep;

@Listeners(com.Mycreditinfo.Utuls.TestLister.class)

public class PaketisYidva extends ChromeRunner {
    @Test(retryAnalyzer = Retry.class)
    @Severity(SeverityLevel.CRITICAL)
    @Description("Some detailed test description")
public void test(){
        HomePageSteps steps=new HomePageSteps();
        steps.GoToBuyPaketi()
             .buyValue();
        sleep(3000);
    }

}
