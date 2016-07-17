package org.pds16.pds16asm.ui;

import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.RGB;
import org.eclipse.xtext.ui.editor.syntaxcoloring.DefaultHighlightingConfiguration;
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightingConfigurationAcceptor;
import org.eclipse.xtext.ui.editor.utils.TextStyle;

@SuppressWarnings("all")
public class Pds16asmHighlightingConfiguration extends DefaultHighlightingConfiguration {
  public final static String DIRECTIVES = "Directives";
  
  public final static String RULES = "Rules";
  
  public final static String COMMENTS = "Comments";
  
  public final static String LABEL = "Label";
  
  public final static String TEXT = "Text";
  
  /**
   * This method is called by the framework and allows clients to register styles for
   * the semantic highlighting stage.
   * 
   * @param acceptor the acceptor is used to announce the various default styles. It is never <code>null</code>.
   */
  @Override
  public void configure(final IHighlightingConfigurationAcceptor acceptor) {
    this.addType(acceptor, Pds16asmHighlightingConfiguration.DIRECTIVES, 127, 0, 85, SWT.BOLD);
    this.addType(acceptor, Pds16asmHighlightingConfiguration.RULES, 127, 0, 85, SWT.BOLD);
    this.addType(acceptor, Pds16asmHighlightingConfiguration.COMMENTS, 63, 127, 95, SWT.NORMAL);
    this.addType(acceptor, Pds16asmHighlightingConfiguration.LABEL, 127, 0, 85, SWT.BOLD);
    this.addType(acceptor, Pds16asmHighlightingConfiguration.TEXT, 42, 0, 255, SWT.NORMAL);
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
  public void addType(final IHighlightingConfigurationAcceptor acceptor, final String str, final int r, final int g, final int b, final int style) {
    TextStyle textStyle = new TextStyle();
    RGB _rGB = new RGB(255, 255, 255);
    textStyle.setBackgroundColor(_rGB);
    RGB _rGB_1 = new RGB(r, g, b);
    textStyle.setColor(_rGB_1);
    textStyle.setStyle(style);
    acceptor.acceptDefaultHighlighting(str, str, textStyle);
  }
}
