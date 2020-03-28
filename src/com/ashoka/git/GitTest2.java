/**
 * 
 */
package com.ashoka.git;

/**
 * @author ASHOKA
 *
 */
public class GitTest2 {

	/**
	 * the program for string reverse with out using built in methods
	 */
	public static void main(String[] args) {
		String s1="india";
		String rev="";
		for(int i=s1.length()-1;i>=0;i--) {
			rev=rev+s1.charAt(i);
		}
		System.out.println(rev);
	}

}
