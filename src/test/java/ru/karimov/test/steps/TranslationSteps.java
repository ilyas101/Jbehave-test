package ru.karimov.test.steps;

import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

import ru.karimov.test.steps.serenity.EndUserSteps;

@SuppressWarnings("unused")
public class TranslationSteps {

    @Steps
    EndUserSteps endUser;

    @Given("the user is on the Google Translate home page")
    public void givenTheUserIsOnTheGoogleTranslatePage() {
        endUser.is_the_home_page();
    }

    @When("the user looks up the translation of the word '$word'")
    public void whenTheUserLooksUpTheTranslationOf(String word) {
        endUser.looks_for(word);
    }

    @Then("the user should see the translation '$translation'")
    public void thenTheUserShouldSeeTheTranslation(String translation) {
        endUser.should_see_translation(translation);
    }

}
