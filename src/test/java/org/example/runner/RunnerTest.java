package org.example.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(tags = "@iphone", features = "src/test/resources/features/", glue = "org.example.definitions")
public class RunnerTest extends AbstractTestNGCucumberTests { }
