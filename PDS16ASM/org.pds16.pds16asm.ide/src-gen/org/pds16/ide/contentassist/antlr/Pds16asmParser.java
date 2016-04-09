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
					put(grammarAccess.getStoreAccess().getAlternatives(), "rule__Store__Alternatives");
					put(grammarAccess.getAritmeticaAccess().getAlternatives(), "rule__Aritmetica__Alternatives");
					put(grammarAccess.getLogicaAccess().getAlternatives(), "rule__Logica__Alternatives");
					put(grammarAccess.getLdImmediateAccess().getAlternatives_0(), "rule__LdImmediate__Alternatives_0");
					put(grammarAccess.getLdDirectAccess().getAlternatives_0(), "rule__LdDirect__Alternatives_0");
					put(grammarAccess.getLdIndexedAccess().getAlternatives_0(), "rule__LdIndexed__Alternatives_0");
					put(grammarAccess.getLdBasedIndexedAccess().getAlternatives_0(), "rule__LdBasedIndexed__Alternatives_0");
					put(grammarAccess.getStDirectAccess().getAlternatives_0(), "rule__StDirect__Alternatives_0");
					put(grammarAccess.getStIndexedAccess().getAlternatives_0(), "rule__StIndexed__Alternatives_0");
					put(grammarAccess.getStBasedIndexedAccess().getAlternatives_0(), "rule__StBasedIndexed__Alternatives_0");
					put(grammarAccess.getAddAccess().getAlternatives_0(), "rule__Add__Alternatives_0");
					put(grammarAccess.getAddAccess().getAlternatives_1(), "rule__Add__Alternatives_1");
					put(grammarAccess.getSubAccess().getAlternatives(), "rule__Sub__Alternatives");
					put(grammarAccess.getSubAccess().getAlternatives_0_0(), "rule__Sub__Alternatives_0_0");
					put(grammarAccess.getSubAccess().getAlternatives_0_1(), "rule__Sub__Alternatives_0_1");
					put(grammarAccess.getAnlAccess().getAlternatives_0(), "rule__Anl__Alternatives_0");
					put(grammarAccess.getOrlAccess().getAlternatives_0(), "rule__Orl__Alternatives_0");
					put(grammarAccess.getXrlAccess().getAlternatives_0(), "rule__Xrl__Alternatives_0");
					put(grammarAccess.getNotAccess().getAlternatives_0(), "rule__Not__Alternatives_0");
					put(grammarAccess.getRrAccess().getAlternatives_0(), "rule__Rr__Alternatives_0");
					put(grammarAccess.getRcAccess().getAlternatives_0(), "rule__Rc__Alternatives_0");
					put(grammarAccess.getJumpOpAccess().getAlternatives_0(), "rule__JumpOp__Alternatives_0");
					put(grammarAccess.getDirectAccess().getAlternatives_2(), "rule__Direct__Alternatives_2");
					put(grammarAccess.getIntOrHexOrStringAccess().getAlternatives(), "rule__IntOrHexOrString__Alternatives");
					put(grammarAccess.getIntOrHexOrStringAccess().getAlternatives_0(), "rule__IntOrHexOrString__Alternatives_0");
					put(grammarAccess.getRegistersAccess().getValueAlternatives_0(), "rule__Registers__ValueAlternatives_0");
					put(grammarAccess.getLdImmediateAccess().getGroup(), "rule__LdImmediate__Group__0");
					put(grammarAccess.getLdDirectAccess().getGroup(), "rule__LdDirect__Group__0");
					put(grammarAccess.getLdIndexedAccess().getGroup(), "rule__LdIndexed__Group__0");
					put(grammarAccess.getLdBasedIndexedAccess().getGroup(), "rule__LdBasedIndexed__Group__0");
					put(grammarAccess.getStDirectAccess().getGroup(), "rule__StDirect__Group__0");
					put(grammarAccess.getStIndexedAccess().getGroup(), "rule__StIndexed__Group__0");
					put(grammarAccess.getStBasedIndexedAccess().getGroup(), "rule__StBasedIndexed__Group__0");
					put(grammarAccess.getAddAccess().getGroup(), "rule__Add__Group__0");
					put(grammarAccess.getSubAccess().getGroup_0(), "rule__Sub__Group_0__0");
					put(grammarAccess.getSubAccess().getGroup_1(), "rule__Sub__Group_1__0");
					put(grammarAccess.getAnlAccess().getGroup(), "rule__Anl__Group__0");
					put(grammarAccess.getOrlAccess().getGroup(), "rule__Orl__Group__0");
					put(grammarAccess.getXrlAccess().getGroup(), "rule__Xrl__Group__0");
					put(grammarAccess.getNotAccess().getGroup(), "rule__Not__Group__0");
					put(grammarAccess.getShlAccess().getGroup(), "rule__Shl__Group__0");
					put(grammarAccess.getShrAccess().getGroup(), "rule__Shr__Group__0");
					put(grammarAccess.getRrAccess().getGroup(), "rule__Rr__Group__0");
					put(grammarAccess.getRcAccess().getGroup(), "rule__Rc__Group__0");
					put(grammarAccess.getJumpOpAccess().getGroup(), "rule__JumpOp__Group__0");
					put(grammarAccess.getImmediateAccess().getGroup(), "rule__Immediate__Group__0");
					put(grammarAccess.getDirectAccess().getGroup(), "rule__Direct__Group__0");
					put(grammarAccess.getIndexedAccess().getGroup(), "rule__Indexed__Group__0");
					put(grammarAccess.getBasedIndexedAccess().getGroup(), "rule__BasedIndexed__Group__0");
					put(grammarAccess.getIntOrHexOrStringAccess().getGroup_0_0(), "rule__IntOrHexOrString__Group_0_0__0");
					put(grammarAccess.getOperationWithTwoRegistersAccess().getGroup(), "rule__OperationWithTwoRegisters__Group__0");
					put(grammarAccess.getOperationsWithTreeRegistersAccess().getGroup(), "rule__OperationsWithTreeRegisters__Group__0");
					put(grammarAccess.getOperationsWithConstantAccess().getGroup(), "rule__OperationsWithConstant__Group__0");
					put(grammarAccess.getOperationShiftAccess().getGroup(), "rule__OperationShift__Group__0");
					put(grammarAccess.getOperationWithOffsetAccess().getGroup(), "rule__OperationWithOffset__Group__0");
					put(grammarAccess.getPDS16ASMAccess().getInstuctionsAssignment(), "rule__PDS16ASM__InstuctionsAssignment");
					put(grammarAccess.getCommentAccess().getCommentAssignment(), "rule__Comment__CommentAssignment");
					put(grammarAccess.getImmediateAccess().getRegisterAssignment_0(), "rule__Immediate__RegisterAssignment_0");
					put(grammarAccess.getImmediateAccess().getImmediate8Assignment_2(), "rule__Immediate__Immediate8Assignment_2");
					put(grammarAccess.getDirectAccess().getRegisterAssignment_0(), "rule__Direct__RegisterAssignment_0");
					put(grammarAccess.getIndexedAccess().getRdAssignment_0(), "rule__Indexed__RdAssignment_0");
					put(grammarAccess.getIndexedAccess().getRbxAssignment_3(), "rule__Indexed__RbxAssignment_3");
					put(grammarAccess.getIndexedAccess().getIdx3Assignment_5(), "rule__Indexed__Idx3Assignment_5");
					put(grammarAccess.getBasedIndexedAccess().getRbxAssignment_3(), "rule__BasedIndexed__RbxAssignment_3");
					put(grammarAccess.getBasedIndexedAccess().getRixAssignment_5(), "rule__BasedIndexed__RixAssignment_5");
					put(grammarAccess.getOperationWithTwoRegistersAccess().getRdAssignment_0(), "rule__OperationWithTwoRegisters__RdAssignment_0");
					put(grammarAccess.getOperationWithTwoRegistersAccess().getRmAssignment_2(), "rule__OperationWithTwoRegisters__RmAssignment_2");
					put(grammarAccess.getOperationsWithTreeRegistersAccess().getRdAssignment_0(), "rule__OperationsWithTreeRegisters__RdAssignment_0");
					put(grammarAccess.getOperationsWithTreeRegistersAccess().getRmAssignment_2(), "rule__OperationsWithTreeRegisters__RmAssignment_2");
					put(grammarAccess.getOperationsWithTreeRegistersAccess().getRnAssignment_4(), "rule__OperationsWithTreeRegisters__RnAssignment_4");
					put(grammarAccess.getOperationsWithConstantAccess().getRdAssignment_0(), "rule__OperationsWithConstant__RdAssignment_0");
					put(grammarAccess.getOperationsWithConstantAccess().getRmAssignment_2(), "rule__OperationsWithConstant__RmAssignment_2");
					put(grammarAccess.getOperationsWithConstantAccess().getConst4Assignment_4(), "rule__OperationsWithConstant__Const4Assignment_4");
					put(grammarAccess.getOperationShiftAccess().getRdAssignment_0(), "rule__OperationShift__RdAssignment_0");
					put(grammarAccess.getOperationShiftAccess().getRmAssignment_2(), "rule__OperationShift__RmAssignment_2");
					put(grammarAccess.getOperationShiftAccess().getConst4Assignment_4(), "rule__OperationShift__Const4Assignment_4");
					put(grammarAccess.getOperationShiftAccess().getSinAssignment_6(), "rule__OperationShift__SinAssignment_6");
					put(grammarAccess.getOperationWithOffsetAccess().getRbxAssignment_0(), "rule__OperationWithOffset__RbxAssignment_0");
					put(grammarAccess.getOperationWithOffsetAccess().getOffset8Assignment_2(), "rule__OperationWithOffset__Offset8Assignment_2");
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
