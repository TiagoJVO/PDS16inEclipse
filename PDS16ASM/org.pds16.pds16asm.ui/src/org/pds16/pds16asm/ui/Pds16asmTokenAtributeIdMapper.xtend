package org.pds16.pds16asm.ui

import org.eclipse.xtext.ide.editor.syntaxcoloring.DefaultAntlrTokenToAttributeIdMapper

class Pds16asmTokenAtributeIdMapper extends DefaultAntlrTokenToAttributeIdMapper{

	override String calculateId(String tokenName, int tokenType) {
		 if ("RULE_SL_COMMENT".equals(tokenName) || "RULE_ML_COMMENT".equals(tokenName) ) {
		  	return Pds16asmHighlightingConfiguration.COMMENT;
		 }
		 val bool = "'add'".equals(tokenName) || "'sub'".equals(tokenName) || "'jump'".equals(tokenName);
		 if (bool) {
		  	return Pds16asmHighlightingConfiguration.RULES;
		 }
	}

}