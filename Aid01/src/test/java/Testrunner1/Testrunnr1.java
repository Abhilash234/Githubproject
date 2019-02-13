package Testrunner1;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\TRAINING_H1B.06.15\\eclipse-workspace\\Aid01\\src\\test\\java",
  glue= {"Stepdefs1"}, plugin = {"pretty", "json:target/cucumber - report/Cucumber.json" }, monochrome = true)



public class Testrunner1 {

}
