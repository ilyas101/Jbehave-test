package ru.karimov.test.pages;

import net.thucydides.core.annotations.DefaultUrl;
import net.serenitybdd.core.pages.WebElementFacade;

import net.serenitybdd.core.annotations.findby.FindBy;

import net.thucydides.core.pages.PageObject;

@DefaultUrl("https://translate.google.com/?hl=ru&tab=TT")
public class TranslatePage extends PageObject {

    @SuppressWarnings("unused")
    @FindBy(id="source")
    private WebElementFacade searchTerms;

    @SuppressWarnings("unused")
    @FindBy(xpath="/html/body/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div/span[1]/span")
    private WebElementFacade result;


    public void enter_keywords(String keyword) {
        searchTerms.type(keyword);
    }

    public void lookup_terms() {
        waitFor(result);
    }

    public String getTranslations() {
        return result.getText();
    }

}