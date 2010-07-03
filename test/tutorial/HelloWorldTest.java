package tutorial;

import junit.framework.TestCase;

import com.opensymphony.xwork2.ActionSupport;

public class HelloWorldTest extends TestCase {

	public void testExecute() {
	     HelloWorld hello = new HelloWorld();
	        hello.setName("World");
	        String result = hello.execute();
	        
	        assertTrue("Expected a success result!", ActionSupport.SUCCESS.equals(result));
	        
	        final String msg = "Hello, World!";
	        assertTrue("Expected the default message!", msg.equals(hello.getName()));
	}

}
