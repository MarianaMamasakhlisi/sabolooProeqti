package Mycreditinfo;


import com.Mycreditinfo.StepObject.SmsPageSteps;
import com.Mycreditinfo.Utuls.ChromeRunner;
import com.Mycreditinfo.Utuls.Retry;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import static com.Mycreditinfo.DataObject.ShetyobinebaPageData.*;
import static com.codeborne.selenide.Selenide.sleep;

@Listeners(com.Mycreditinfo.Utuls.TestLister.class)

public class SmsGagzavna extends ChromeRunner {
    @Test(retryAnalyzer = Retry.class)
    public  void test(){
        SmsPageSteps steps=new SmsPageSteps();
        steps.GoToShetyobineba()
             .GoToNew()
             .GoToTipi()
             .GoToText(Shetyobineba)
             .GoToSend();
        sleep(3000);
    }
}
