package Project.FacebookTest;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Sample {
	
	@Test
	@Parameters({ "emailid", "password" })
	public void f(String emailid, String password) {

		System.out.println(emailid);
		System.out.println(password);

//		Project.FacebookTest.Sample

	}
}
