package co.com.heroku.app.steps;

import co.com.heroku.app.pages.AddRemovePage;
import net.thucydides.core.annotations.Step;

public class AddRemoveHomePage {

    AddRemovePage addRemovePage;

    @Step
    public void opensAddRemovePage(){
        addRemovePage.open();
    }

    @Step
    public void searchAddHomePage(){
        addRemovePage.clickOnAddButton();
    }
    @Step
    public  void  searchRemoveHomePage(){
        addRemovePage.clickOnRemoveButton();
    }
}
