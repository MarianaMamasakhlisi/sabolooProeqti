package com.Mycreditinfo.StepObject;

import com.Mycreditinfo.PageObject.HomePage;


import io.qameta.allure.Step;

public class HomePageSteps extends HomePage {
    @Step("პაკეტის ყიდვა ")
    public HomePageSteps GoToBuyPaketi (){
        Paketi.click();
        return this;
    }
         public HomePageSteps buyValue (){
        Dasruleba.click();
        return this;
    }
}
