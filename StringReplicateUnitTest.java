package assignments;
//*******************************************************************


//StringReplicateUnitTest
//
//This is the unit test class for StringReplicate
//By: m.w.
//10/19/2019
//*******************************************************************

//import unit test assets
import org.junit.Test;
import static org.junit.Assert.*;

public class StringReplicateUnitTest {
	
	//@Test tells JUnit to run this class as a test
	@Test
	public void testStringReplicate() {
		//instantiate class object
		StringReplicate stringReplicate = new StringReplicate();
		//store your result after calling the method from StringReplicate
		String result = StringReplicate.repl("test", 2);
		//compare what it should return vs what we get
		assertEquals("testtest",result);

	}

}
