package org.pds16.pds16asm.ui

import org.eclipse.swt.SWT
import org.eclipse.swt.graphics.RGB
import org.eclipse.xtext.ui.editor.syntaxcoloring.DefaultHighlightingConfiguration
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightingConfigurationAcceptor
import org.eclipse.xtext.ui.editor.utils.TextStyle

class Pds16asmHighlightingConfiguration extends DefaultHighlightingConfiguration{
	
	public static final String DIRECTIVES = "Directives";
	public static final String RULES = "Rules";
	public static final String NUMBERS = "Numbers";
	public static final String COMMENTS = "Comments";
	public static final String REGISTERS = "Registers";
	public static final String LABEL = "Label";
	public static final String TEXT = "Text";
	public static final String SIMBOL_CARACTER = "Simbol_Caracter";
	
	override configure(IHighlightingConfigurationAcceptor acceptor) {
		addType(acceptor,DIRECTIVES, 26, 121, 216, SWT.BOLD);
		addType(acceptor,RULES, 26, 26, 222, SWT.BOLD);
		addType(acceptor,NUMBERS, 235, 75, 9, SWT.NORMAL);
		addType(acceptor,COMMENTS, 2, 172, 13, SWT.NORMAL);
		addType(acceptor,REGISTERS, 151, 7, 223, SWT.NORMAL);
		addType(acceptor,LABEL, 210, 4, 4, SWT.BOLD);
		addType(acceptor,TEXT, 212, 212, 0, SWT.NORMAL);
		addType(acceptor,SIMBOL_CARACTER, 0, 0, 0, SWT.NORMAL);
	}
	
	 def addType( IHighlightingConfigurationAcceptor acceptor, String s, int r, int g, int b, int style ){
		 var TextStyle textStyle = new TextStyle();
		 textStyle.setBackgroundColor(new RGB(255, 255, 255));
		 textStyle.setColor(new RGB(r, g, b));
		 textStyle.setStyle(style);
		 acceptor.acceptDefaultHighlighting(s, s, textStyle);
	 }
	
}	