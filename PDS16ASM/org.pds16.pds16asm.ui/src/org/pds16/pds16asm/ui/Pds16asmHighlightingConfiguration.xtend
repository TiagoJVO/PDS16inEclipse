package org.pds16.pds16asm.ui

import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightingConfiguration
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightingConfigurationAcceptor
import org.eclipse.swt.graphics.RGB
import org.eclipse.xtext.ui.editor.utils.TextStyle
import org.eclipse.swt.SWT

class Pds16asmHighlightingConfiguration implements IHighlightingConfiguration{
	
	public static final String ADD = "Add";
	
	override configure(IHighlightingConfigurationAcceptor acceptor) {
		addType(acceptor,ADD, 20, 239, 35, SWT.NORMAL);
	}
	
	 def addType( IHighlightingConfigurationAcceptor acceptor, String s, int r, int g, int b, int style ){
		 var TextStyle textStyle = new TextStyle();
		 textStyle.setBackgroundColor(new RGB(255, 255, 255));
		 textStyle.setColor(new RGB(r, g, b));
		 textStyle.setStyle(style);
		 acceptor.acceptDefaultHighlighting(s, s, textStyle);
	 }
	
}	