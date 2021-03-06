package basicAnnotations_M1;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Scenario2{ //Scenario:Group
	
	@Test //add testNG library //run as testNG
	public void test1()
	{
		System.out.println("Test Case 1 from Scenario 2 ");
	}
	
	@Test
	public void test2()
	{
		System.out.println("Test Case 2 from Scenario 2 ");
	}
	
	@Test
	public void test3()
	{
		System.out.println("Test Case 3 from Scenario 2 ");
	}
	
	@BeforeMethod
	public void testCasePreCondition()
	{
	System.out.println("Test case pre condition");
    }
	
	@AfterMethod
	public void testCasePostCondition()
	{
	System.out.println("Test case post condition");
    }
	
	@BeforeClass
	public void preScenario()
	{
		System.out.println("Pre condition for Scenario 2");
	}
	
	@AfterClass
	public void postScenario()
	{
		System.out.println("Post condition for Scenario 2");
	}

}
