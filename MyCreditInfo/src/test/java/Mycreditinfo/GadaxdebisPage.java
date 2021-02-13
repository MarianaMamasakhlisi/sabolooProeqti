package Mycreditinfo;

import com.Mycreditinfo.StepObject.GadaxdebisPageSteps;
import com.Mycreditinfo.Utuls.ChromeRunner;
import com.Mycreditinfo.Utuls.Retry;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.sleep;

@Listeners(com.Mycreditinfo.Utuls.TestLister.class)

public class GadaxdebisPage extends ChromeRunner {
    @Test(retryAnalyzer = Retry.class)
    public  void test() {
        GadaxdebisPageSteps steps = new GadaxdebisPageSteps();
        steps.GoToGadaxdebi()
             .GoToPackage()
             .GoToFiltri()
             .GoToStatusi()
             .GoToGauqmebuli()
             .GoToGagrzeleba();
            }
}
