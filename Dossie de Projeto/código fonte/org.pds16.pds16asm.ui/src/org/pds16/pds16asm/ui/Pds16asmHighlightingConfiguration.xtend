package org.pds16.pds16asm.ui

import org.eclipse.swt.SWT
import org.eclipse.swt.graphics.RGB
import org.eclipse.xtext.ui.editor.syntaxcoloring.DefaultHighlightingConfiguration
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightingConfigurationAcceptor
import org.eclipse.xtext.ui.editor.utils.TextStyle

class Pds16asmHighlightingConfiguration extends DefaultHighlightingConfiguration{
	
	public static final String DIRECTIVES = "Directives"
	public static final String RULES = "Rules"
	public static final String COMMENTS = "Comments"
	public static final String LABEL = "Label"
	public static final String TEXT = "Text"
		
	/**
	 * This method is called by the framework and allows clients to register styles for
	 * the semantic highlighting stage.
	 * 
	 * @param acceptor the acceptor is used to announce the various default styles. It is never <code>null</code>.
	 */
	override configure(IHighlightingConfigurationAcceptor acceptor) {
		addType(acceptor,DIRECTIVES, 127, 0, 85, SWT.BOLD)
		addType(acceptor,RULES, 127, 0, 85, SWT.BOLD)
		addType(acceptor,COMMENTS, 63, 127, 95, SWT.NORMAL)
		addType(acceptor,LABEL, 127, 0, 85, SWT.BOLD)
		addType(acceptor,TEXT, 42, 0, 255, SWT.NORMAL)
	}
	
	/**
	 * This method register a new style of the semantic highlighting 
	 * 
	 * @param acceptor the acceptor is used to announce the various default styles. It is never <code>null</code>.
	 * @param str the str is used to indicate the id and name of the new style
	 * @param r the r is used to indicate the amount for the color red
	 * @param g the g is used to indicate the amount for the color green
	 * @param b the b is used to indicate the amount for the color brown
	 * @param style the style is used to indicate the style of the text
	 */
	def addType( IHighlightingConfigurationAcceptor acceptor, String str, int r, int g, int b, int style ){
		 var TextStyle textStyle = new TextStyle()
		 textStyle.setBackgroundColor(new RGB(255, 255, 255))
		 textStyle.setColor(new RGB(r, g, b))
		 textStyle.setStyle(style)
		 acceptor.acceptDefaultHighlighting(str, str, textStyle)
	}
	
}	