package basicAnnotations_M3;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Scenario5 { //Scenario:Group
	
	@Test //add testNG library //run as testNG
	public void test1()
	{
		System.out.println("Test Case 1 from Scenario 5 ");
	}
	
	@Test
	public void test2()
	{
		System.out.println("Test Case 2 from Scenario 5 ");
	}
	
	@Test
	public void test3()
	{
		System.out.println("Test Case 3 from Scenario 5 ");
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
		System.out.println("Pre condition for Scenario 5");
	}
	
	@AfterClass
	public void postScenario()
	{
		System.out.println("Post condition for Scenario 5");
	}

}

