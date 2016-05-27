package org.pds16.pds16asm.ui;

import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.RGB;
import org.eclipse.xtext.ui.editor.syntaxcoloring.DefaultHighlightingConfiguration;
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightingConfigurationAcceptor;
import org.eclipse.xtext.ui.editor.utils.TextStyle;

@SuppressWarnings("all")
public class Pds16asmHighlightingConfiguration extends DefaultHighlightingConfiguration {
  public final static String RULES = "Rule";
  
  public final static String COMMENT = "Comment";
  
  @Override
  public void configure(final IHighlightingConfigurationAcceptor acceptor) {
    this.addType(acceptor, Pds16asmHighlightingConfiguration.RULES, 20, 239, 35, SWT.NORMAL);
    this.addType(acceptor, Pds16asmHighlightingConfiguration.COMMENT, 255, 32, 218, SWT.NORMAL);
  }
  
  public void addType(final IHighlightingConfigurationAcceptor acceptor, final String s, final int r, final int g, final int b, final int style) {
    TextStyle textStyle = new TextStyle();
    RGB _rGB = new RGB(255, 255, 255);
    textStyle.setBackgroundColor(_rGB);
    RGB _rGB_1 = new RGB(r, g, b);
    textStyle.setColor(_rGB_1);
    textStyle.setStyle(style);
    acceptor.acceptDefaultHighlighting(s, s, textStyle);
  }
}
