package pluralsight_codingchallenge.installer;
import java.util.ArrayList;

public class PackageInstaller {

	/**
	 * Given list of packages with dependencies, 
	 * this method will install the packages in order such that an install won’t fail due to a missing dependency
	 * 
	 * @param dependenciesList
	 * @return
	 * @throws IllegalArgumentException
	 */
	public String getInstallationList(String[] dependenciesList)  throws IllegalArgumentException{
		
		if (dependenciesList == null) {
			throw new IllegalArgumentException();
		}
		
		if (dependenciesList.length == 0) {
			return "";
		}
			
		// use doubly linked list to store each package as a node
		
		// traverse the input array and build up each doubly linked list, stored in an arraylist,
		// since there could be multiple doubly linked list
		
		// traverse all the doubly linked lists and return as a string
		
		return null;
	}
	
}
