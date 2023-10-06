package com.lbrce.devops;

import org.testng.Assert;
import org.testng.annotations.Test;

public class UserValidationTesting {
	@Test
	public void testCase1()
	{
		UserValidation uv=new UserValidation();
		Assert.assertEquals(false,uv.check("neeraja", "neeraja@123"));
	}
	@Test
	public void testCase2()
	{
		UserValidation uv=new UserValidation();
		Assert.assertEquals(false,uv.check("neeru", "neeraja@123"));
	}
	@Test
	public void testCase3()
	{
		UserValidation uv=new UserValidation();
		Assert.assertEquals(true,uv.check("lbrce", "lbrce@76"));
	}
	@Test
	public void testCase4()
	{
		UserValidation uv=new UserValidation();
		Assert.assertEquals(false,uv.check("neeraja", "k@123"));
	}
	@Test
	public void testCase5()
	{
		UserValidation uv=new UserValidation();
		Assert.assertEquals(false,uv.check("neeraja", "neeraja@123"));
	}
}
