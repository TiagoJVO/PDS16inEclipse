package org.pds16.pds16asm.generator;

public class LinedError {
	private final String description;
	private final int line;

	public LinedError(String description, int line){
		this.description = description;
		this.line = line;
	}
	
	/**
	 * 
	 * @return this LinedError description
	 */
	public String getDescription() {
		return description;
	}
	
	/**
	 * 
	 * @return this LinedError line
	 */
	public int getLine() {
		return line;
	}
}
