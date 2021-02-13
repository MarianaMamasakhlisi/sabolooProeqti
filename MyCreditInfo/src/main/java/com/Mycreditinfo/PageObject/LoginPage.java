package com.Mycreditinfo.PageObject;

import com.codeborne.selenide.*;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selectors.*;


public class LoginPage {
    protected SelenideElement
          loginInput= $(byName("username")),
         PasswordInput=$(byName("password")),
        loginClick=$(".btn-red");

}
