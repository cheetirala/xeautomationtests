package com.xe.tests;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

/**
 * Created by kotche on 19/12/2016.
 */

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features/eurotopoundconversion.feature", format = {"pretty", "json:target/cucumber.json"}, tags={"~@ignore", "@transfermoneywithxe"})

public class RunCukesTest {
}
