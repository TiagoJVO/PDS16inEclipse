package org.pds16.pds16asm.ui

import org.eclipse.swt.SWT
import org.eclipse.swt.graphics.RGB
import org.eclipse.xtext.ui.editor.syntaxcoloring.DefaultHighlightingConfiguration
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightingConfigurationAcceptor
import org.eclipse.xtext.ui.editor.utils.TextStyle

class Pds16asmHighlightingConfiguration extends DefaultHighlightingConfiguration{
	
	public static final String DIRECTIVES = "Directives";
	public static final String RULES = "Rules";
	public static final String COMMENTS = "Comments";
	public static final String LABEL = "Label";
	public static final String TEXT = "Text";
	
	override configure(IHighlightingConfigurationAcceptor acceptor) {
		addType(acceptor,DIRECTIVES, 127, 0, 85, SWT.BOLD);
		addType(acceptor,RULES, 127, 0, 85, SWT.BOLD);
		addType(acceptor,COMMENTS, 63, 127, 95, SWT.NORMAL);
		addType(acceptor,LABEL, 127, 0, 85, SWT.BOLD);
		addType(acceptor,TEXT, 42, 0, 255, SWT.NORMAL);
	}
	
	 def addType( IHighlightingConfigurationAcceptor acceptor, String s, int r, int g, int b, int style ){
		 var TextStyle textStyle = new TextStyle();
		 textStyle.setBackgroundColor(new RGB(255, 255, 255));
		 textStyle.setColor(new RGB(r, g, b));
		 textStyle.setStyle(style);
		 acceptor.acceptDefaultHighlighting(s, s, textStyle);
	 }
	
}	