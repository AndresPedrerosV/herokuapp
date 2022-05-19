package co.com.heroku.app.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebElement;


@DefaultUrl("https://the-internet.herokuapp.com/add_remove_elements/")
public class AddRemovePage extends PageObject {


    @FindBy(xpath = "//*[@id=\"content\"]/div/button")
    WebElement addButton;

    @FindBy(xpath = "//*[@id=\"elements\"]/button")
    WebElement removeButton;


    public void clickOnAddButton(){
        addButton.click();
    }

    public void clickOnRemoveButton(){
        removeButton.click();
    }
}
