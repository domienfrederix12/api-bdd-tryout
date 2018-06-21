package com.domien;

import io.restassured.RestAssured;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.hamcrest.Matchers.is;

@RunWith(SerenityRunner.class)
public class AppTest {

    @Steps
     TestSteps steps;

    @Test
    public void verifyThatWeCanFindUnitedStatesOfAmericaCountryUsingTheCodeUS() {
        steps.searchCountryByCode("US");
        steps.searchIsExecutedSuccesfully();
        steps.iShouldFindCountry("United States of America");
    }

    @Test
    public void verifyThatWeCanFindIndiaCountryUsingTheCodeIN(){
        steps.searchCountryByCode("IN");
        steps.searchIsExecutedSuccesfully();
        steps.iShouldFindCountry("India");
    }

    @Test
    public void verifyThatWeCanFindBrazilCountryUsingTheCodeBR(){
        steps.searchCountryByCode("BR");
        steps.searchIsExecutedSuccesfully();
        steps.iShouldFindCountry("Brazil");
    }
}