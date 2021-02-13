package com.Mycreditinfo.PageObject;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;

public class GadaxdebiPage {
    protected SelenideElement


    Gadaxdebi=$(byTitle("გადახდები")),
     Package=$(".packages"),
       Filtri=$(".filter"),
      Statusi=$(byName("status")),
    Gauqmebuli=$(byXpath("/html/body/app-root/ng-component/div/div[2]/div[2]/app-payments/div/div/div[3]/app-operations/div[2]/div/div[2]/form/div[1]/ul/li[5]")),
  Gagrzeleba=$(".button");


}
