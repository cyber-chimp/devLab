package test;
import org.testng.Assert;
import org.testng.annotations.Test;
import main.App;

public class AppTest {
	@Test
	public void test1() {
		App myapp=new App();
		Assert.assertEquals(0, myapp.UserLogin("zoro", "2piece"));
	}
	
	@Test
	public void test2() {
		App myapp1=new App();
		Assert.assertEquals(1, myapp1.UserLogin("zoro", "1piece"));
	}
}
