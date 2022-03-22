package com.actitime.testsrcipt;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.actitime.generics.BaseClass;

public class TaskModule extends BaseClass{
	@Test(groups = {"smoketest","regressiontest"})
	public void createTask()
	{
		Reporter.log("Create Task",true);
		
	}
	@Test(groups = "regressiontest")
	public void modifyTask()
	{
		Reporter.log("Modify Task",true);
	}
	@Test(groups = "regressiontest")
	public void deleteTask()
	{
		Reporter.log("Delete Task",true);
	}
}
