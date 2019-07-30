package com.shiksha.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;



@RunWith(Cucumber.class)
@CucumberOptions(
glue = { "com.shiksha.steps" },
features={"src/test/resources/features/"},

tags={"@run"},
plugin = {"html:target/site/cucumber-pretty","json:target/cucumber.json"})
public class ScriptRunner {
}	