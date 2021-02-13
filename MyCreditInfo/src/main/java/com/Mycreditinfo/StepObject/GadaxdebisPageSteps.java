package com.Mycreditinfo.StepObject;

import com.Mycreditinfo.PageObject.GadaxdebiPage;
import io.qameta.allure.Step;

public class GadaxdebisPageSteps extends GadaxdebiPage {
    @Step("გადახდების გვერდი")
    public GadaxdebisPageSteps GoToGadaxdebi() {
        Gadaxdebi.click();
        return this;
    }
         public GadaxdebisPageSteps GoToPackage() {
        Package.click();
        return this;
    }
            public GadaxdebisPageSteps GoToFiltri() {
        Filtri.click();
        return this;
    }
            public GadaxdebisPageSteps GoToStatusi() {
        Statusi.click();
        return this;
    }
             public GadaxdebisPageSteps GoToGauqmebuli() {
        Gauqmebuli.click();
        return this;
    }
         public GadaxdebisPageSteps GoToGagrzeleba() {
        Gagrzeleba.click();
        return this;
    }
}