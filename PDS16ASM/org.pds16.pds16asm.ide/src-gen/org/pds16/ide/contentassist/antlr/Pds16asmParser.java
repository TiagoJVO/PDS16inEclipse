/*
 * generated by Xtext 2.9.2
 */
package org.pds16.ide.contentassist.antlr;

import com.google.inject.Inject;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.pds16.ide.contentassist.antlr.internal.InternalPds16asmParser;
import org.pds16.services.Pds16asmGrammarAccess;

public class Pds16asmParser extends AbstractContentAssistParser {

	@Inject
	private Pds16asmGrammarAccess grammarAccess;

	private Map<AbstractElement, String> nameMappings;

	@Override
	protected InternalPds16asmParser createParser() {
		InternalPds16asmParser result = new InternalPds16asmParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getInstructionsAccess().getAlternatives(), "rule__Instructions__Alternatives");
					put(grammarAccess.getLoadAccess().getAlternatives(), "rule__Load__Alternatives");
					put(grammarAccess.getLdImmediateAccess().getAlternatives(), "rule__LdImmediate__Alternatives");
					put(grammarAccess.getLdDirectAccess().getAlternatives(), "rule__LdDirect__Alternatives");
					put(grammarAccess.getLdIndexedAccess().getAlternatives(), "rule__LdIndexed__Alternatives");
					put(grammarAccess.getLdBasedIndexedAccess().getAlternatives(), "rule__LdBasedIndexed__Alternatives");
					put(grammarAccess.getIndexedAccess().getAlternatives_6(), "rule__Indexed__Alternatives_6");
					put(grammarAccess.getRegistersAccess().getValueAlternatives_0(), "rule__Registers__ValueAlternatives_0");
					put(grammarAccess.getLdImmediateAccess().getGroup_0(), "rule__LdImmediate__Group_0__0");
					put(grammarAccess.getLdImmediateAccess().getGroup_1(), "rule__LdImmediate__Group_1__0");
					put(grammarAccess.getLdDirectAccess().getGroup_0(), "rule__LdDirect__Group_0__0");
					put(grammarAccess.getLdDirectAccess().getGroup_1(), "rule__LdDirect__Group_1__0");
					put(grammarAccess.getLdIndexedAccess().getGroup_0(), "rule__LdIndexed__Group_0__0");
					put(grammarAccess.getLdIndexedAccess().getGroup_1(), "rule__LdIndexed__Group_1__0");
					put(grammarAccess.getLdBasedIndexedAccess().getGroup_0(), "rule__LdBasedIndexed__Group_0__0");
					put(grammarAccess.getLdBasedIndexedAccess().getGroup_1(), "rule__LdBasedIndexed__Group_1__0");
					put(grammarAccess.getImmediateAccess().getGroup(), "rule__Immediate__Group__0");
					put(grammarAccess.getDirectAccess().getGroup(), "rule__Direct__Group__0");
					put(grammarAccess.getIndexedAccess().getGroup(), "rule__Indexed__Group__0");
					put(grammarAccess.getBasedIndexedAccess().getGroup(), "rule__BasedIndexed__Group__0");
					put(grammarAccess.getHexaDecimalAccess().getGroup(), "rule__HexaDecimal__Group__0");
					put(grammarAccess.getPDS16ASMAccess().getInstuctionsAssignment(), "rule__PDS16ASM__InstuctionsAssignment");
					put(grammarAccess.getImmediateAccess().getRegisterAssignment_0(), "rule__Immediate__RegisterAssignment_0");
					put(grammarAccess.getImmediateAccess().getImmediate8Assignment_2(), "rule__Immediate__Immediate8Assignment_2");
					put(grammarAccess.getDirectAccess().getRegisterAssignment_0(), "rule__Direct__RegisterAssignment_0");
					put(grammarAccess.getDirectAccess().getDirect7Assignment_2(), "rule__Direct__Direct7Assignment_2");
					put(grammarAccess.getIndexedAccess().getRdAssignment_0(), "rule__Indexed__RdAssignment_0");
					put(grammarAccess.getIndexedAccess().getRbxAssignment_3(), "rule__Indexed__RbxAssignment_3");
					put(grammarAccess.getIndexedAccess().getIndexAssignment_5(), "rule__Indexed__IndexAssignment_5");
					put(grammarAccess.getBasedIndexedAccess().getRbxAssignment_3(), "rule__BasedIndexed__RbxAssignment_3");
					put(grammarAccess.getBasedIndexedAccess().getRixAssignment_5(), "rule__BasedIndexed__RixAssignment_5");
					put(grammarAccess.getHexaDecimalAccess().getNumberAssignment_1(), "rule__HexaDecimal__NumberAssignment_1");
					put(grammarAccess.getCommentAccess().getValueAssignment(), "rule__Comment__ValueAssignment");
					put(grammarAccess.getRegistersAccess().getValueAssignment(), "rule__Registers__ValueAssignment");
				}
			};
		}
		return nameMappings.get(element);
	}

	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			InternalPds16asmParser typedParser = (InternalPds16asmParser) parser;
			typedParser.entryRulePDS16ASM();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public Pds16asmGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(Pds16asmGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}