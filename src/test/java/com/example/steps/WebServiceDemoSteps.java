package com.example.steps;

import com.example.WebServiceDemoImpl;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

/**
 * JbehaveRestAPIDemo
 * Created by Chamila Ambahera on 03/7/2023.
 * chamila.ambahera@gmail.com
 */

public class WebServiceDemoSteps {
    @Given("I provide a valid API URI")
    public void setEndPoint() {
        WebServiceDemoImpl.setRestURI("https://api.tmsandbox.co.nz/v1/Categories/6327/Details.json?catalogue=false");
    }

    @When("Send Request")
    public void sendRequest() {
        WebServiceDemoImpl.sendRequest();
    }

    @Then("Validate Name : $name")
    public void validateName(String name) {
        WebServiceDemoImpl.validateName(name);
    }

    @Then("Validate CanReList : $canReList")
    public void validateCanReList(String canReList) {
        WebServiceDemoImpl.validateCanReList(canReList);
    }

    @Then("validate Promotion Name : $name and Description : $description")
    public void validatePromotion(String name, String description) {
        WebServiceDemoImpl.validatePromotions(name, description);
    }
}
