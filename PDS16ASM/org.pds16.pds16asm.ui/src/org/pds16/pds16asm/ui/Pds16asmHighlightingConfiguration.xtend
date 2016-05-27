package org.pds16.pds16asm.ui

import org.eclipse.swt.SWT
import org.eclipse.swt.graphics.RGB
import org.eclipse.xtext.ui.editor.syntaxcoloring.DefaultHighlightingConfiguration
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightingConfigurationAcceptor
import org.eclipse.xtext.ui.editor.utils.TextStyle

class Pds16asmHighlightingConfiguration extends DefaultHighlightingConfiguration{
	
	public static final String RULES = "Rule";
	public static final String COMMENT = "Comment";
	
	override configure(IHighlightingConfigurationAcceptor acceptor) {
		addType(acceptor,RULES, 20, 239, 35, SWT.NORMAL);
		addType(acceptor,COMMENT, 255, 32, 218, SWT.NORMAL);
	}
	
	 def addType( IHighlightingConfigurationAcceptor acceptor, String s, int r, int g, int b, int style ){
		 var TextStyle textStyle = new TextStyle();
		 textStyle.setBackgroundColor(new RGB(255, 255, 255));
		 textStyle.setColor(new RGB(r, g, b));
		 textStyle.setStyle(style);
		 acceptor.acceptDefaultHighlighting(s, s, textStyle);
	 }
	
}	