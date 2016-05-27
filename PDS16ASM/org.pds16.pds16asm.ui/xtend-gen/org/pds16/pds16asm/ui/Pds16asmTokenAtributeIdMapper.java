package org.pds16.pds16asm.ui;

import org.eclipse.xtext.ide.editor.syntaxcoloring.DefaultAntlrTokenToAttributeIdMapper;
import org.pds16.pds16asm.parser.antlr.lexer.InternalPds16asmLexer;
import org.pds16.pds16asm.ui.Pds16asmHighlightingConfiguration;

@SuppressWarnings("all")
public class Pds16asmTokenAtributeIdMapper extends DefaultAntlrTokenToAttributeIdMapper {
  @Override
  public String calculateId(final String tokenName, final int tokenType) {
    switch (tokenType) {
      case InternalPds16asmLexer.RULE_IDLABEL:
        return Pds16asmHighlightingConfiguration.LABEL;
      case InternalPds16asmLexer.Add:
        return Pds16asmHighlightingConfiguration.RULES;
      case InternalPds16asmLexer.RULE_ML_COMMENT:
        return Pds16asmHighlightingConfiguration.COMMENT;
    }
    return null;
  }
}
