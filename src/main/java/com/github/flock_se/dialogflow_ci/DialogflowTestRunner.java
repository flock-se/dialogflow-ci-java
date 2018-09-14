package com.github.flock_se.dialogflow_ci;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import com.github.flock_se.dialogflow_ci.dialogflow.Dialogflow;


public class DialogflowTestRunner {
	
	private Dialogflow app;

	public Dialogflow getApplication() {
		return app;
	}

	public void setApplication(Dialogflow app) {
		this.app = app;
	}
}
