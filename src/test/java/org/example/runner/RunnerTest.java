package org.example.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(tags = "", features = "src/test/resources/features/Search.feature", glue = "org.example.definitions")
public class RunnerTest extends AbstractTestNGCucumberTests { }
