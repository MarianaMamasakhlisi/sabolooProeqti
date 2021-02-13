package com.Mycreditinfo.PageObject;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;

public class SmsPage {

    protected SelenideElement

    Shetyobineba=$(byTitle("შეტყობინებები")),
     New =$(".new-message"),
      Tipi =$(byXpath("/html/body/app-root/ng-component/div/div[2]/div[2]/ng-component/new-message/div/div/div[2]/div[1]/div[2]/div[1]")),
    Text =$(byXpath("/html/body/app-root/ng-component/div/div[2]/div[2]/ng-component/new-message/div/div/div[2]/div[4]/message-box/div/textarea")),
      Send =$(".send");
}