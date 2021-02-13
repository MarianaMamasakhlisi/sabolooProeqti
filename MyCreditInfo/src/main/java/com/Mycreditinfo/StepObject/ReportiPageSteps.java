package com.Mycreditinfo.StepObject;

import com.Mycreditinfo.PageObject.ReportiPage;
import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.sleep;

public class ReportiPageSteps extends ReportiPage {
    @Step("რეპორტის გაგზავნა ")
    public ReportiPageSteps GoToReporti(){
        Reporti.click();
          return this;
    }
      public ReportiPageSteps GoToGagzavna(){
        Gagzavna.click();
           return this;
    }
      public ReportiPageSteps GoToReporti1(){
        Reporti1.click();
           return this;
}
      public ReportiPageSteps GoToReporti2(String Mail){
        Reporti2.setValue(Mail);
          Reporti2.shouldNotBe(Condition.empty);
            return this;
}
         public ReportiPageSteps GoToReporti3(){
           Reporti3.click();
         return this;
}
       public ReportiPageSteps GoToReporti4(){
          Reporti4.click();
          sleep(3000);
          return this;
    }
       public ReportiPageSteps GoToDasruleba(){
          Dasruleba.click();
          sleep(3000);
         return this;
 }
}
