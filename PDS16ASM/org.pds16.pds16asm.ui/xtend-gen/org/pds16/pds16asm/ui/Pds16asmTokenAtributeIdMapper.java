package org.pds16.pds16asm.ui;

import org.eclipse.xtext.ide.editor.syntaxcoloring.DefaultAntlrTokenToAttributeIdMapper;
import org.pds16.pds16asm.ui.Pds16asmHighlightingConfiguration;

@SuppressWarnings("all")
public class Pds16asmTokenAtributeIdMapper extends DefaultAntlrTokenToAttributeIdMapper {
  @Override
  public String calculateId(final String tokenName, final int tokenType) {
    boolean _or = false;
    boolean _equals = "RULE_SL_COMMENT".equals(tokenName);
    if (_equals) {
      _or = true;
    } else {
      boolean _equals_1 = "RULE_ML_COMMENT".equals(tokenName);
      _or = _equals_1;
    }
    if (_or) {
      return Pds16asmHighlightingConfiguration.COMMENT;
    }
    boolean _or_1 = false;
    boolean _or_2 = false;
    boolean _equals_2 = "\'add\'".equals(tokenName);
    if (_equals_2) {
      _or_2 = true;
    } else {
      boolean _equals_3 = "\'sub\'".equals(tokenName);
      _or_2 = _equals_3;
    }
    if (_or_2) {
      _or_1 = true;
    } else {
      boolean _equals_4 = "\'jump\'".equals(tokenName);
      _or_1 = _equals_4;
    }
    final boolean bool = _or_1;
    if (bool) {
      return Pds16asmHighlightingConfiguration.RULES;
    }
    return null;
  }
}
