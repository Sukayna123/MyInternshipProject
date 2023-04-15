package pages;

import net.bytebuddy.dynamic.scaffold.TypeWriter;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.DriverClass;
import utilities.MyMethods;

public class Sukayna_POM extends MyMethods {
    public Sukayna_POM() {
        PageFactory.initElements(DriverClass.getDriver(), this);
    }

    @FindBy(css = "input[placeholder='Username']")
    private WebElement loginUsername;

    @FindBy(xpath = "//input[@placeholder='Password']")
    private WebElement loginPassword;

    @FindBy(xpath = "//span[contains(text(),' LOGIN ')]")
    private WebElement loginButton;

    @FindBy(xpath = "//span[text()='Setup']")
    private WebElement setupFromDashBoard;

    @FindBy(xpath = "//span[text()='Parameters']")
    private WebElement parametersUnderSetup;

    @FindBy(xpath = "//span[text()='Discounts']")
    private WebElement discountUnderParameters;

    @FindBy(css = "svg[class='svg-inline--fa fa-plus']")
    private WebElement addSignPlus;

    @FindBy(xpath = "(//input[@data-placeholder='Description'])[2]")
    private WebElement descriptionInputNewDiscount;

    @FindBy(xpath= "(//input[@data-placeholder='Integration Code'])[2]")
    private WebElement integrationInputNewDiscount;

   // @FindBy(xpath= "//input[@data-placeholder='Priority']")
    @FindBy(css= "input[data-placeholder='Priority']")
    private WebElement priorityInputNewDiscount;

  //  @FindBy(xpath = "//span[text()='Save']")
   // @FindBy(xpath = "(//button[@color='accent'])[12]")
    @FindBy(xpath = "//span[text()='Save']")
    private WebElement saveButtonNewDiscount;

    @FindBy(xpath = "//div[text()='Discount successfully created']")
    private WebElement discountSuccessfullyCreatedMessageNewDiscount;

  //  @FindBy(xpath = "//div[@class='hot-toast-bar-base']")
    @FindBy(xpath = "//hot-toast[@class='ng-star-inserted']//div[1]//div")
    private WebElement theDiscountWithDescriptionMessageNewDiscount;

   // @FindBy(css = "svg[class='svg-inline--fa fa-pen-to-square']")
    @FindBy(xpath = "(//span[@class='mat-button-wrapper'])[11]")
    private WebElement editSignUnderDiscount;

    // @FindBy(css = "svg[class='svg-inline--fa fa-trash-can']")
   // @FindBy(xpath = "//span[@class='mat-button-wrapper']")
    @FindBy(xpath = "(//span[@class='mat-button-wrapper'])[12]")
    private WebElement deleteSignUnderDiscount;

    @FindBy(xpath = "//div[text()='Discount successfully updated']")
    private WebElement discountSuccessfullyUpdatedNewDiscount;


     @FindBy(xpath = "//*[text()=' This field cannot be left blank!']")
    private WebElement redMessageFieldCannotBeBlank;

    @FindBy(id = "mat-error-26")
    //  @FindBy(xpath = "//*[text()=' This field is required!']")
    private WebElement redMessageFieldIsRequired;

    @FindBy(xpath = "//button[@type='submit']")
    private WebElement deleteUnderDelete;

    @FindBy(xpath = "//div[text()='Discount successfully deleted']")
    private WebElement discountSuccessfullyDeletedMessageAfterDelete;

   // @FindBy(xpath = "//span[text()=' Cancel ']")
    @FindBy(xpath = "(//button[@type='button'])[5]")
    private WebElement cancelDeleteButtonNewDiscount;

    @FindBy(xpath = "//span[text()='Human Resources']")
    private WebElement humanResources;

    @FindBy(xpath = "(//span[text()='Setup'])[3]")
    private WebElement setupUnderHumanResources;

    @FindBy(xpath = "//span[text()='Attestations']")
    private WebElement attestationsUnderSetUpHR;

    @FindBy(id = "ms-text-field-5")
    private WebElement nameInputHR;

    @FindBy(xpath = "//span[text()='Save']")
    private WebElement saveButtonNewAttestationHR;

    @FindBy(xpath = "//div[text()='Attestation successfully created']")
    private WebElement attestationSuccessMessageAfterAddHR;

    @FindBy(xpath = "//div[text()='The Attestation with Name \"dd\" already exists.']")
    //must change the name to what i use to work
    private WebElement errorMessageAlreadyExistAttestationHR;

    @FindBy(xpath = "//*[text()=' This field cannot be left blank!']")
    private WebElement redMessageUnderNameHR;

    @FindBy(xpath = "//input[@data-placeholder='Description']")
    private WebElement descriptionSearchBox;

    @FindBy(xpath = "//input[@data-placeholder='Integration Code']")
    private WebElement integrationCodeSearchBox;

  //  @FindBy(xpath = "//span[text()='Search']")
    @FindBy(xpath = "//button[@class='mat-raised-button']")
    private WebElement discountSearchButton;

    @FindBy (xpath = "(//div[@class='mat-form-field-infix ng-tns-c12-163'])//input")
    private WebElement nameInputSearch;

    @FindBy(xpath = "//div[text()='Attestation successfully updated']")
    private WebElement attestationUpdatedMessage;



    public WebElement getLoginUsername() {
        return loginUsername;
    }

    public WebElement getLoginPassword() {
        return loginPassword;
    }

    public WebElement getLoginButton() {
        return loginButton;
    }

    public WebElement getSetupFromDashBoard() {
        return setupFromDashBoard;
    }

    public WebElement getParametersUnderSetup() {
        return parametersUnderSetup;
    }

    public WebElement getDiscountUnderParameters() {
        return discountUnderParameters;
    }

    public WebElement getAddSignPlus() {
        return addSignPlus;
    }

    public WebElement getDescriptionInputNewDiscount() {
        return descriptionInputNewDiscount;
    }

    public WebElement getIntegrationInputNewDiscount() {
        return integrationInputNewDiscount;
    }

    public WebElement getPriorityInputNewDiscount() {
        return priorityInputNewDiscount;
    }

    public WebElement getSaveButtonNewDiscount() {
        return saveButtonNewDiscount;
    }

    public WebElement getDiscountSuccessfullyCreatedMessageNewDiscount() {
        return discountSuccessfullyCreatedMessageNewDiscount;
    }
    public WebElement getTheDiscountWithDescriptionMessageNewDiscount() {
        return theDiscountWithDescriptionMessageNewDiscount;
    }
    public WebElement getEditSignUnderDiscount() {
        return editSignUnderDiscount;
    }

    public WebElement getDeleteSignUnderDiscount() {
        return deleteSignUnderDiscount;
    }

    public WebElement getDiscountSuccessfullyUpdatedNewDiscount() {
        return discountSuccessfullyUpdatedNewDiscount;
    }

    public WebElement getRedMessageFieldCannotBeBlank() {
        return redMessageFieldCannotBeBlank;
    }

    public WebElement getRedMessageFieldIsRequired() {
        return redMessageFieldIsRequired;
    }

    public WebElement getDeleteUnderDelete() {
        return deleteUnderDelete;
    }

    public WebElement getDiscountSuccessfullyDeletedMessageAfterDelete() {
        return discountSuccessfullyDeletedMessageAfterDelete;
    }

    public WebElement getCancelDeleteButtonNewDiscount() {
        return cancelDeleteButtonNewDiscount;
    }

    public WebElement getHumanResources() {
        return humanResources;
    }

    public WebElement getSetupUnderHumanResources() {
        return setupUnderHumanResources;
    }

    public WebElement getAttestationsUnderSetUpHR() {
        return attestationsUnderSetUpHR;
    }

    public WebElement getNameInputHR() {
        return nameInputHR;
    }

    public WebElement getSaveButtonNewAttestationHR() {
        return saveButtonNewAttestationHR;
    }

    public WebElement getAttestationSuccessMessageAfterAddHR() {
        return attestationSuccessMessageAfterAddHR;
    }

    public WebElement getErrorMessageAlreadyExistAttestationHR() {
        return errorMessageAlreadyExistAttestationHR;
    }

    public WebElement getRedMessageUnderNameHR() {
        return redMessageUnderNameHR;
    }

    public WebElement getDescriptionSearchBox() {
        return descriptionSearchBox;
    }

    public WebElement getIntegrationCodeSearchBox() {
        return integrationCodeSearchBox;
    }

    public WebElement getDiscountSearchButton() {
        return discountSearchButton;
    }

    public WebElement getNameInputSearch() {
        return nameInputSearch;
    }

    public WebElement getAttestationUpdatedMessage() {
        return attestationUpdatedMessage;
    }
}
