package org.pds16.pds16asm.ui

import org.eclipse.xtext.ide.editor.syntaxcoloring.DefaultAntlrTokenToAttributeIdMapper
import org.pds16.pds16asm.parser.antlr.lexer.InternalPds16asmLexer

class Pds16asmTokenAtributeIdMapper extends DefaultAntlrTokenToAttributeIdMapper{

	override String calculateId(String tokenName, int tokenType) {
		switch(tokenType){
			
			case InternalPds16asmLexer.Ascii:
				return Pds16asmHighlightingConfiguration.DIRECTIVES
			case InternalPds16asmLexer.Asciiz:
				return Pds16asmHighlightingConfiguration.DIRECTIVES
			case InternalPds16asmLexer.Bss:
				return Pds16asmHighlightingConfiguration.DIRECTIVES
			case InternalPds16asmLexer.Byte:
				return Pds16asmHighlightingConfiguration.DIRECTIVES
			case InternalPds16asmLexer.Data:
				return Pds16asmHighlightingConfiguration.DIRECTIVES
			case InternalPds16asmLexer.End:
				return Pds16asmHighlightingConfiguration.DIRECTIVES
			case InternalPds16asmLexer.Equ:
				return Pds16asmHighlightingConfiguration.DIRECTIVES
			case InternalPds16asmLexer.Org:
				return Pds16asmHighlightingConfiguration.DIRECTIVES
			case InternalPds16asmLexer.Section:
				return Pds16asmHighlightingConfiguration.DIRECTIVES
			case InternalPds16asmLexer.Set:
				return Pds16asmHighlightingConfiguration.DIRECTIVES
			case InternalPds16asmLexer.Space:
				return Pds16asmHighlightingConfiguration.DIRECTIVES
			case InternalPds16asmLexer.Text:
				return Pds16asmHighlightingConfiguration.DIRECTIVES
			case InternalPds16asmLexer.Word:
				return Pds16asmHighlightingConfiguration.DIRECTIVES	
			
			case InternalPds16asmLexer.Adc:
				return Pds16asmHighlightingConfiguration.RULES
			case InternalPds16asmLexer.Adcf:
				return Pds16asmHighlightingConfiguration.RULES
			case InternalPds16asmLexer.Add:
				return Pds16asmHighlightingConfiguration.RULES
			case InternalPds16asmLexer.Addf:
				return Pds16asmHighlightingConfiguration.RULES
			case InternalPds16asmLexer.Anl:
				return Pds16asmHighlightingConfiguration.RULES
			case InternalPds16asmLexer.Anlf:
				return Pds16asmHighlightingConfiguration.RULES
			case InternalPds16asmLexer.Dec:
				return Pds16asmHighlightingConfiguration.RULES
			case InternalPds16asmLexer.Decf:
				return Pds16asmHighlightingConfiguration.RULES
			case InternalPds16asmLexer.Inc:
				return Pds16asmHighlightingConfiguration.RULES
			case InternalPds16asmLexer.Incf:
				return Pds16asmHighlightingConfiguration.RULES
			case InternalPds16asmLexer.Iret:
				return Pds16asmHighlightingConfiguration.RULES
			case InternalPds16asmLexer.Jae:
				return Pds16asmHighlightingConfiguration.RULES
			case InternalPds16asmLexer.Jbl:
				return Pds16asmHighlightingConfiguration.RULES
			case InternalPds16asmLexer.Jc:
				return Pds16asmHighlightingConfiguration.RULES
			case InternalPds16asmLexer.Je:
				return Pds16asmHighlightingConfiguration.RULES
			case InternalPds16asmLexer.Jmp:
				return Pds16asmHighlightingConfiguration.RULES
			case InternalPds16asmLexer.Jmpl:
				return Pds16asmHighlightingConfiguration.RULES
			case InternalPds16asmLexer.Jnc:
				return Pds16asmHighlightingConfiguration.RULES
			case InternalPds16asmLexer.Jne:
				return Pds16asmHighlightingConfiguration.RULES
			case InternalPds16asmLexer.Jnz:
				return Pds16asmHighlightingConfiguration.RULES
			case InternalPds16asmLexer.Jz:
				return Pds16asmHighlightingConfiguration.RULES
			case InternalPds16asmLexer.Ld:
				return Pds16asmHighlightingConfiguration.RULES
			case InternalPds16asmLexer.Ldb:
				return Pds16asmHighlightingConfiguration.RULES
			case InternalPds16asmLexer.Ldi:
				return Pds16asmHighlightingConfiguration.RULES
			case InternalPds16asmLexer.Ldih:
				return Pds16asmHighlightingConfiguration.RULES
			case InternalPds16asmLexer.Mov:
				return Pds16asmHighlightingConfiguration.RULES
			case InternalPds16asmLexer.Movf:
				return Pds16asmHighlightingConfiguration.RULES
			case InternalPds16asmLexer.Nop:
				return Pds16asmHighlightingConfiguration.RULES
			case InternalPds16asmLexer.Not:
				return Pds16asmHighlightingConfiguration.RULES
			case InternalPds16asmLexer.Notf:
				return Pds16asmHighlightingConfiguration.RULES
			case InternalPds16asmLexer.Orl:
				return Pds16asmHighlightingConfiguration.RULES
			case InternalPds16asmLexer.Orlf:
				return Pds16asmHighlightingConfiguration.RULES
			case InternalPds16asmLexer.Rcl:
				return Pds16asmHighlightingConfiguration.RULES
			case InternalPds16asmLexer.Rcr:
				return Pds16asmHighlightingConfiguration.RULES
			case InternalPds16asmLexer.Ret:
				return Pds16asmHighlightingConfiguration.RULES
			case InternalPds16asmLexer.Rrl:
				return Pds16asmHighlightingConfiguration.RULES
			case InternalPds16asmLexer.Rrm:
				return Pds16asmHighlightingConfiguration.RULES
			case InternalPds16asmLexer.Sbb:
				return Pds16asmHighlightingConfiguration.RULES
			case InternalPds16asmLexer.Sbbf:
				return Pds16asmHighlightingConfiguration.RULES
			case InternalPds16asmLexer.Shl:
				return Pds16asmHighlightingConfiguration.RULES
			case InternalPds16asmLexer.Shr:
				return Pds16asmHighlightingConfiguration.RULES
			case InternalPds16asmLexer.St:
				return Pds16asmHighlightingConfiguration.RULES
			case InternalPds16asmLexer.Stb:
				return Pds16asmHighlightingConfiguration.RULES
			case InternalPds16asmLexer.Sub:
				return Pds16asmHighlightingConfiguration.RULES
			case InternalPds16asmLexer.Subf:
				return Pds16asmHighlightingConfiguration.RULES
			case InternalPds16asmLexer.Subr:
				return Pds16asmHighlightingConfiguration.RULES
			case InternalPds16asmLexer.Xrl:
				return Pds16asmHighlightingConfiguration.RULES
			case InternalPds16asmLexer.Xrlf:
				return Pds16asmHighlightingConfiguration.RULES
							
			case InternalPds16asmLexer.RULE_SL_COMMENT:
				return Pds16asmHighlightingConfiguration.COMMENTS
			case InternalPds16asmLexer.RULE_ML_COMMENT:
				return Pds16asmHighlightingConfiguration.COMMENTS
			
			case InternalPds16asmLexer.RULE_IDLABEL:
				return Pds16asmHighlightingConfiguration.LABEL
			
			case InternalPds16asmLexer.RULE_ID:
				return Pds16asmHighlightingConfiguration.TEXT
			case InternalPds16asmLexer.RULE_STRING:
				return Pds16asmHighlightingConfiguration.TEXT
			case InternalPds16asmLexer.High:
				return Pds16asmHighlightingConfiguration.TEXT
			case InternalPds16asmLexer.Low:
				return Pds16asmHighlightingConfiguration.TEXT			
		}
		return super.calculateId(tokenName,tokenType);
	}
	
}