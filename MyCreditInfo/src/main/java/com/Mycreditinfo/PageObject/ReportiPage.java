package com.Mycreditinfo.PageObject;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;


public class ReportiPage {

    protected SelenideElement

    Reporti=$(byTitle("საკრედიტო რეპორტი")),
    Gagzavna=$(".send-btn"),
    Reporti1=$(byXpath("/html/body/app-root/ng-component/div/div[2]/div[2]/ng-component/div/send-report-popup/div/div/div[2]/form/div[1]/div/div[2]/div")),
    Reporti2=$(byName("email")),
    Reporti3=$(byText("გაგრძელება")),
    Reporti4=$(byXpath("/html/body/app-root/ng-component/div/div[2]/div[2]/ng-component/div/send-report-popup/div/div/div[2]/div/button")),
    Dasruleba=$(byXpath("/html/body/app-root/ng-component/div/div[2]/div[2]/ng-component/div/send-report-popup/div/div/div[2]/div/button"));
}
