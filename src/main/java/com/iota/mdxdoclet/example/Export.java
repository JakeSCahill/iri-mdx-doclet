package com.iota.mdxdoclet.example;

import java.util.List;

import com.iota.mdxdoclet.ApiCall;
import com.sun.javadoc.MethodDoc;

public interface Export {
	
	/**
	 * Generates an example based on parameters from the Statement in API
	 * @param command The Statement Method
	 * @param api The Related API command
	 * @return the example code
	 */
	String generateExample(MethodDoc command, ApiCall api);

	
	/**
	 * Generates basic response data based on MethodDoc return value
	 * @param command The command the response is from (Statement in API)
	 * @param api The API command
	 * @return the response code
	 */
	String generateResponse(MethodDoc command, ApiCall api);
	
	/**
	 * Generates response data based on a list of methods
	 * @param command The command the response is from (Statement in API)
	 * @param api The API command
	 * @param methods The list of methods (public getters with javadoc)
	 * @return the response code
	 */
	String generateResponse(MethodDoc command, ApiCall api, List<MethodDoc> methods);
	
	/**
	 * Generates an example error
	 * @return the error code
	 */
	String generateError();
	
	/**
	 * The name of this generator (cURL, python, NodeJS)
	 * @return the name
	 */
	String getName();


	/**
	 * THe language is the actual coding language we format this example at (Nodejs->javascript)
	 * @return the language
	 */
	String getLanguage();
}
