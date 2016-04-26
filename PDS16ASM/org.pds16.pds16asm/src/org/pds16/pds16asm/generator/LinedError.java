package org.pds16.pds16asm.generator;

public class LinedError {
	private final String description;
	private final int line;

	public LinedError(String description, int line){
		this.description = description;
		this.line = line;
	}
	public String getDescription() {
		return description;
	}
	public int getLine() {
		return line;
	}
}
