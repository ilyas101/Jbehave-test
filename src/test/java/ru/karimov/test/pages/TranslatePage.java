package ru.karimov.test.pages;

import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import net.serenitybdd.core.pages.WebElementFacade;
import java.util.stream.Collectors;

import net.serenitybdd.core.annotations.findby.FindBy;

import net.thucydides.core.pages.PageObject;

import java.util.List;

@DefaultUrl("https://translate.google.com")
public class TranslatePage extends PageObject {

    @SuppressWarnings("unused")
    @FindBy(name="text")
    private WebElementFacade searchTerms;

    @SuppressWarnings("unused")
    @FindBy(id="gt-submit")
    private WebElementFacade submitButton;

    public void enter_keywords(String keyword) {
        searchTerms.type(keyword);
    }

    public void lookup_terms() {
        find(By.id("gt-lang-src")).find(By.id("sugg-item-en")).click();
        find(By.id("gt-lang-tgt")).find(By.id("sugg-item-ru")).click();
        submitButton.click();
    }

    public String getTranslations() {
        return find(By.id("result_box")).find(By.tagName("span")).getText();
    }

}