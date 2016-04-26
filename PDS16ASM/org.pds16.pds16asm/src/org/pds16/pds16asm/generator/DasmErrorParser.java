package org.pds16.pds16asm.generator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class DasmErrorParser{
	 public static List<LinedError> getErrorsFromStream(InputStream is) throws NumberFormatException, IOException{
		 List<String> lines = new ArrayList<String>();
		 BufferedReader r = new BufferedReader(new InputStreamReader(is));
		 
		 List<LinedError> errors = new ArrayList<LinedError>();
		 String line;
		 while ((line=r.readLine()) != null) {
		     if(line.startsWith("erro")){
		    	 int linhaIndex = line.indexOf("linha ")+ "linha ".length();
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