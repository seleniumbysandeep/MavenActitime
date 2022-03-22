package com.actitime.testsrcipt;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.actitime.generics.BaseClass;

public class UserModule extends BaseClass{
	@Test
	public void createUser() {
		Reporter.log("createCustomer",true);
		
	}
}
