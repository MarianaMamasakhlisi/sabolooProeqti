package com.Mycreditinfo.StepObject;


import com.Mycreditinfo.PageObject.LoginPage;
import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;

public class LoginPageSteps  extends LoginPage {
    @Step("იუზერი {Login}")
      public  LoginPageSteps LoginValue (String Login){
         loginInput.setValue(Login);
           loginInput.shouldNotBe(Condition.empty);
              return this;
    }
        @Step("პაროლი {Password}")
          public  LoginPageSteps PasswordValue (String Password){
            PasswordInput.setValue(Password);
              PasswordInput.shouldNotBe(Condition.empty);
                return this;
    }
           public  LoginPageSteps GoToCreateMethod (){
              loginClick.click();
                return this;
    }
}
