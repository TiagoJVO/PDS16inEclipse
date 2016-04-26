package org.pds16.pds16asm.generator;

import org.eclipse.emf.ecore.resource.Resource;

public class LinedDiagnostic implements Resource.Diagnostic{
	 final String message;
	 final int line;
	 final String resourceURI;

	public LinedDiagnostic(String message, int line,String resourceURI) {
	    this.message = message;
	    this.line = line;
	    this.resourceURI=resourceURI;
	}

	@Override
	public String getMessage() {
	    return message;
	}

	@Override
	public String getLocation() {
	    return resourceURI;
	}

	@Override
	public int getLine() {
	    return line;
	}

	@Override
	public int getColumn() {
	    return 1;
	}

	}