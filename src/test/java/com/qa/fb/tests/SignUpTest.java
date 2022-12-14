package com.qa.fb.tests;

import org.apache.log4j.Logger;
import org.openxml4j.exceptions.InvalidFormatException;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.fb.keyword.base.Base;
import com.qa.fb.keyword.engine.KeyWordEngine;

public class SignUpTest extends Base{
	public KeyWordEngine keyWordEngine;
	Logger log = Logger.getLogger(SignUpTest.class);
	
	@BeforeMethod
	public void setUp() {
		log.info("Execution Started");
	}
	
	@Test
	public void signUpTest(){
		keyWordEngine = new KeyWordEngine();
		try {
			keyWordEngine.startExecution("signup");
		} catch (org.apache.poi.openxml4j.exceptions.InvalidFormatException e) {
			e.printStackTrace();
		}
	}
}
