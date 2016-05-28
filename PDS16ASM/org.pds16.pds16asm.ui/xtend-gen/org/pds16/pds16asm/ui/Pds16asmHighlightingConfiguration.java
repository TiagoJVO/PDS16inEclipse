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
  
  public final static String NUMBERS = "Numbers";
  
  public final static String COMMENTS = "Comments";
  
  public final static String REGISTERS = "Registers";
  
  public final static String LABEL = "Label";
  
  public final static String TEXT = "Text";
  
  public final static String SIMBOL_CARACTER = "Simbol_Caracter";
  
  @Override
  public void configure(final IHighlightingConfigurationAcceptor acceptor) {
    this.addType(acceptor, Pds16asmHighlightingConfiguration.DIRECTIVES, 26, 121, 216, SWT.BOLD);
    this.addType(acceptor, Pds16asmHighlightingConfiguration.RULES, 26, 26, 222, SWT.BOLD);
    this.addType(acceptor, Pds16asmHighlightingConfiguration.NUMBERS, 235, 75, 9, SWT.NORMAL);
    this.addType(acceptor, Pds16asmHighlightingConfiguration.COMMENTS, 2, 172, 13, SWT.NORMAL);
    this.addType(acceptor, Pds16asmHighlightingConfiguration.REGISTERS, 151, 7, 223, SWT.NORMAL);
    this.addType(acceptor, Pds16asmHighlightingConfiguration.LABEL, 210, 4, 4, SWT.BOLD);
    this.addType(acceptor, Pds16asmHighlightingConfiguration.TEXT, 212, 212, 0, SWT.NORMAL);
    this.addType(acceptor, Pds16asmHighlightingConfiguration.SIMBOL_CARACTER, 0, 0, 0, SWT.NORMAL);
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
