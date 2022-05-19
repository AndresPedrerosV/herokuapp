package co.com.heroku.app.stepdefinitions;

import co.com.heroku.app.steps.AddRemoveHomePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class AddRemoveDefinitions {

    @Steps
    AddRemoveHomePage addRemoveHomePage;

    @Given("andres enter in the exercise")
    public void andresEnterInTheExercise(){
        addRemoveHomePage.opensAddRemovePage();
    }

    @When("he search the add button and click")
    public void heSearchTheAddButtonAndClick(){
        addRemoveHomePage.searchAddHomePage();
    }
    @Then("he search the remove button and click")
    public void heSearchTheRemoveButtonAndClick(){
        addRemoveHomePage.searchRemoveHomePage();

    }




}
