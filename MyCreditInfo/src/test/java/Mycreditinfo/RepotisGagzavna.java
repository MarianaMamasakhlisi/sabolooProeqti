package Mycreditinfo;

import com.Mycreditinfo.StepObject.ReportiPageSteps;
import com.Mycreditinfo.Utuls.ChromeRunner;
import com.Mycreditinfo.Utuls.Retry;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import static com.Mycreditinfo.DataObject.LoginPageData.login;
import static  com.Mycreditinfo.DataObject.ReportiPageData.*;
import static com.codeborne.selenide.Selenide.sleep;

@Listeners(com.Mycreditinfo.Utuls.TestLister.class)

public class RepotisGagzavna extends ChromeRunner {
    @Test(retryAnalyzer = Retry.class)
       public  void test(){
           ReportiPageSteps steps=new ReportiPageSteps();
            steps.GoToReporti()
                 .GoToGagzavna()
                 .GoToReporti1()
                 .GoToReporti2(Mail)
                 .GoToReporti3()
                 .GoToReporti4()
                 .GoToDasruleba();
        Assert.assertEquals("marianamamasakhlisi@gmail.com",Mail);
                sleep(3000);
    }
}
