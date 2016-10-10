package pluralsight_codingchallenge.installer;
import java.util.ArrayList;
import org.junit.Test;
import junit.framework.TestCase;

public class PackageInstallerTest extends TestCase {
	
	PackageInstaller packageInstaller = new PackageInstaller();
	
	String[] correctInput = {"KittenService: ", "Leetmeme: Cyberportal", "Cyberportal: Ice", "CamelCaser: KittenService", "Fraudstream: Leetmeme", "Ice: "};
	String[] invalidInput = {"KittenService: ", "Leetmeme: Cyberportal", "Cyberportal: Ice", "CamelCaser: KittenService", "Fraudstream: ", "Ice: Leetmeme"};
	String[] emptyInput = {};
	
	String expectedCorrectOutput = "KittenService, Ice, Cyberportal, Leetmeme, CamelCaser, Fraudstream";
	
	/** 
	 * Tests valid input and successful output. 
	 * Although there are possible variations of a successful output, given the algorithm I have implemented, the output will always be in the order specified.
	 */
	@Test
	public void testSuccessfulOutput() {
		String output = packageInstaller.getInstallationList(correctInput);
		assertEquals(output, expectedCorrectOutput);
	}
	
	/**
	 * Tests an invalid input that has circular dependencies.
	 * Should throw IllegalArgumentException.
	 */
	@Test/*(expected=IllegalArgumentException.class)*/ 
	//TODO expected tag doesn't work; figure out why
	public void testCircularDependency() {
		  boolean thrown = false;

		  try {
			  packageInstaller.getInstallationList(invalidInput);
		  } catch (IllegalArgumentException e) {
			  thrown = true;
		  }

		  assertTrue(thrown);
	}
	
	/**
	 * Tests empty input array.
	 * Should output empty installation list string.
	 */
	@Test
	public void testEmptyInput() {
		String output = packageInstaller.getInstallationList(emptyInput);
		assertEquals(output, "");
	}
	
	/**
	 * Tests null input.
	 * Should throw IllegalArgumentException
	 */
	@Test/*(expected=IllegalArgumentException.class)*/
	public void testNullInput() {
		
	  boolean thrown = false;

	  try {
		  packageInstaller.getInstallationList(null);
	  } catch (IllegalArgumentException e) {
		  thrown = true;
	  }

	  assertTrue(thrown);
	}
	
	
}
