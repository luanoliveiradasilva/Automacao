package Cucumber.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

/*
 * Create one empty class with the @RunWith(Cucumber.class) annotation.
 *Executing this class as any JUnit test class will run all features found on the classpath in the same package as this class.
 *Para digitar mais de uma classe  no glue, basta manter ele em branco.
 */
@RunWith(Cucumber.class)
@CucumberOptions(plugin = "pretty", features = "classpath:Cucumber/feature", tags="@tag4", glue="",
	monochrome = true, snippets = SnippetType.CAMELCASE, dryRun = false, strict = true)
public class Runner {

	
	
}
