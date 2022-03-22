package com.actitime.testsrcipt;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DemoDataProvider {

	@DataProvider
	public Object[][] getDataForAddToCart() {
	Object[][] obj=new Object[3][3];
	obj[0][0]="mobile";
	obj[0][1]="i phone 13 pro max";
	obj[0][2]="10";
	obj[1][0]="TV";
	obj[1][1]="one plus 55";
	obj[1][2]="2";
	obj[2][0]="Laptop";
	obj[2][1]="Dell latitute";
	obj[2][2]="2";
	return obj;
	}
	
	@Test(dataProvider = "getDataForAddToCart")
	public void addToCart(String category,String model,String qty) 
	{
		System.out.println("category = "+category+" model = "+model+" quality ="+qty);
	}
	
}
