package com.actitime.testsrcipt;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.actitime.generics.BaseClass;

public class ProjectModule extends BaseClass{
	@Test(groups = {"smoketest","regressiontest"})
	public void createProject()
	{
		Reporter.log("Create Project",true);
		
	}
	@Test(groups = "regressiontest")
	public void modifyProject()
	{
		Reporter.log("Modify Project",true);
	}
	@Test(groups = "regressiontest")
	public void deleteProject()
	{
		Reporter.log("Delete Project",true);
	}
}
