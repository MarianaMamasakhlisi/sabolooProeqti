package Mycreditinfo;

import com.Mycreditinfo.StepObject.LoginPageSteps;
import com.Mycreditinfo.Utuls.ChromeRunner;
import com.Mycreditinfo.Utuls.Retry;
import io.qameta.allure.Description;
import io.qameta.allure.Link;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import static  com.Mycreditinfo.DataObject.LoginPageData.*;
import static com.codeborne.selenide.Selenide.sleep;

@Listeners(com.Mycreditinfo.Utuls.TestLister.class)
public class LoginPage extends ChromeRunner {
    @Test (retryAnalyzer = Retry.class)
    @Severity(SeverityLevel.CRITICAL)
    @Description("Some detailed test description")
    @Link(name = "კრედიტინფო", type = "https://new.mycreditinfo.ge/")
    public  void test(){
        LoginPageSteps steps=new LoginPageSteps();
        steps.LoginValue(login)
                .PasswordValue(password)
                .GoToCreateMethod();
        Assert.assertEquals("17001031891",login);
        sleep(3000);
    }
}
