package org.pds16.pds16asm.generator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class DasmErrorParser{

	/**
	 * <p>
	 * Decodes a received InputStream, to a List of LinedError objects.
	 * Only lines started with "erro" will be decoded 
	 * </p>
	 * 
	 * <p>
	 * Each line started with "erro" should follow the following scheme:<br>
	 * - erro - linha 9 -> ERROR MESSAGE<br>
	 * where after "linha " should be the line of the error, and after "-> " the error message
	 * </p>
	 * 
	 * @param is the InputStream containing the resource to be parsed
	 * @return a List of LinedError containing all parsed errors
	 * @throws NumberFormatException
	 * @throws IOException
	 */
	 public static List<LinedError> getErrorsFromStream(InputStream is) throws NumberFormatException, IOException{
		 BufferedReader r = new BufferedReader(new InputStreamReader(is));
		 
		 List<LinedError> errors = new ArrayList<LinedError>();
		 String line;
		 while ((line=r.readLine()) != null) {
		     if(line.startsWith("erro")){
		    	//first number of line index
		    	 int linhaIndex = line.indexOf("linha ")+ "linha ".length();
		    	 
		    	//parsing line from first number until the next white space
		    	 int errorLine = Integer.parseInt(
		    			 					line.substring(
		    			 							linhaIndex, 
		    			 							line.indexOf(
		    			 									' ', 
		    			 									linhaIndex))
		    			 					, 10);
		    	
		    	 String errorMessage = line.substring(line.indexOf("-> ")+ "-> ".length());
		    	 errors.add(new LinedError(errorMessage, errorLine));
		     }
		 }
		 return errors;
	 }
}