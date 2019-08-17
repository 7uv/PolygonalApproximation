/**
 * 
 */
package com.example.demo.util;

/**
 * @author root
 *
 */
public class Resources {

	/**
	 * 
	 */
	@SuppressWarnings("unused")
	public Resources() {
		// TODO Auto-generated constructor stub
        // Generate a random number
        String dbQuery = "select floor(rand()*(10000000)+10);";
        // postgres does not have rand() function
        String postgresQuery ="select floor(random()*(10000000-1+1)+10);";
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
