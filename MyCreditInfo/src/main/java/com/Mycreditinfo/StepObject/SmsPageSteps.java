package com.Mycreditinfo.StepObject;

import com.Mycreditinfo.PageObject.SmsPage;
import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;

public class SmsPageSteps extends SmsPage {
    @Step("სმს გაგზავნა")
        public SmsPageSteps GoToShetyobineba(){
            Shetyobineba.click();
             return this;
    }
          public SmsPageSteps GoToNew(){
           New.click();
            return this;
}
            public SmsPageSteps GoToTipi(){
               Tipi.click();
                return this;
}
             public SmsPageSteps GoToText(String Shetyobineba){
              Text.setValue(Shetyobineba);
               Text.shouldNotBe(Condition.empty);
            return this;
 }
                public SmsPageSteps GoToSend(){
                  Send.click();
                    return this;
    }
}