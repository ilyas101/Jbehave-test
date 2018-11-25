package ru.karimov.test.steps.serenity;

import ru.karimov.test.pages.TranslatePage;
import net.thucydides.core.annotations.Step;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.hasItem;

public class EndUserSteps {

    TranslatePage translatePage;

    @Step
    public void enters(String keyword) {
        translatePage.enter_keywords(keyword);
    }

    @Step
    public void starts_search() {
        translatePage.lookup_terms();
    }

    @Step
    public void should_see_translation(String translation) {
        assertThat(translatePage.getTranslations(), equalTo(translation));
    }

    @Step
    public void is_the_home_page() {
        translatePage.open();
    }

    @Step
    public void looks_for(String term) {
        enters(term);
        starts_search();
    }
}