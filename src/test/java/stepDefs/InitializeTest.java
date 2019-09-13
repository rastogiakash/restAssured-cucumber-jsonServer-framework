package stepDefs;

import cucumber.api.java.Before;
import utilities.RestAssuredListener;

public class InitializeTest {	

	@Before
    public void TestSetup(){
		RestAssuredListener restAssuredListener = new RestAssuredListener();
    }
}
