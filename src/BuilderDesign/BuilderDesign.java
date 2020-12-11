package BuilderDesign;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class BuilderDesign {
	@Test
	public void f() {

		LocationBuilt location = LocationObjectMother.newYorkCity();
		LocationBuilt morris = LocationObjectMother.morrisTown();
	}

	@BeforeTest
	public void beforeTest() {
	}

	@AfterTest
	public void afterTest() {
	}

}
