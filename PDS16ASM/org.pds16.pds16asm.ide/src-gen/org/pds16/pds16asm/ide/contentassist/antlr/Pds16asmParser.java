/*
 * generated by Xtext 2.10.1
 */
package org.pds16.pds16asm.ide.contentassist.antlr;

import com.google.inject.Inject;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.pds16.pds16asm.ide.contentassist.antlr.internal.InternalPds16asmParser;
import org.pds16.pds16asm.services.Pds16asmGrammarAccess;

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
					put(grammarAccess.getStatementAccess().getAlternatives(), "rule__Statement__Alternatives");
					put(grammarAccess.getLabelAccess().getValueAlternatives_1_0(), "rule__Label__ValueAlternatives_1_0");
					put(grammarAccess.getDirectiveAccess().getValueAlternatives_0(), "rule__Directive__ValueAlternatives_0");
					put(grammarAccess.getLabelDirectiveAccess().getAlternatives(), "rule__LabelDirective__Alternatives");
					put(grammarAccess.getByteAccess().getAlternatives_1_0(), "rule__Byte__Alternatives_1_0");
					put(grammarAccess.getByteAccess().getAlternatives_1_1_1(), "rule__Byte__Alternatives_1_1_1");
					put(grammarAccess.getWordAccess().getAlternatives_1_0(), "rule__Word__Alternatives_1_0");
					put(grammarAccess.getWordAccess().getAlternatives_1_1_1(), "rule__Word__Alternatives_1_1_1");
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
					put(grammarAccess.getAddAccess().getAlternatives(), "rule__Add__Alternatives");
					put(grammarAccess.getAddAccess().getAlternatives_0_0(), "rule__Add__Alternatives_0_0");
					put(grammarAccess.getAddAccess().getAlternatives_0_1(), "rule__Add__Alternatives_0_1");
					put(grammarAccess.getAddAccess().getAlternatives_1_0(), "rule__Add__Alternatives_1_0");
					put(grammarAccess.getSubAccess().getAlternatives(), "rule__Sub__Alternatives");
					put(grammarAccess.getSubAccess().getAlternatives_0_0(), "rule__Sub__Alternatives_0_0");
					put(grammarAccess.getSubAccess().getAlternatives_0_1(), "rule__Sub__Alternatives_0_1");
					put(grammarAccess.getSubAccess().getAlternatives_2_0(), "rule__Sub__Alternatives_2_0");
					put(grammarAccess.getAnlAccess().getAlternatives_0(), "rule__Anl__Alternatives_0");
					put(grammarAccess.getOrlAccess().getAlternatives(), "rule__Orl__Alternatives");
					put(grammarAccess.getOrlAccess().getAlternatives_0_0(), "rule__Orl__Alternatives_0_0");
					put(grammarAccess.getOrlAccess().getAlternatives_1_0(), "rule__Orl__Alternatives_1_0");
					put(grammarAccess.getXrlAccess().getAlternatives_0(), "rule__Xrl__Alternatives_0");
					put(grammarAccess.getNotAccess().getAlternatives_0(), "rule__Not__Alternatives_0");
					put(grammarAccess.getRrAccess().getAlternatives_0(), "rule__Rr__Alternatives_0");
					put(grammarAccess.getRcAccess().getAlternatives_0(), "rule__Rc__Alternatives_0");
					put(grammarAccess.getJumpOpAccess().getTagAlternatives_0_0(), "rule__JumpOp__TagAlternatives_0_0");
					put(grammarAccess.getJumpOpAccess().getAlternatives_1(), "rule__JumpOp__Alternatives_1");
					put(grammarAccess.getRetAccess().getInstructionAlternatives_0(), "rule__Ret__InstructionAlternatives_0");
					put(grammarAccess.getImmediateAccess().getAlternatives_2(), "rule__Immediate__Alternatives_2");
					put(grammarAccess.getDirectOrLabelAccess().getAlternatives(), "rule__DirectOrLabel__Alternatives");
					put(grammarAccess.getImmediate8OrLabelAccess().getAlternatives_1(), "rule__Immediate8OrLabel__Alternatives_1");
					put(grammarAccess.getIdx3OrLabelAccess().getAlternatives_1(), "rule__Idx3OrLabel__Alternatives_1");
					put(grammarAccess.getConst4OrLabelAccess().getAlternatives_1(), "rule__Const4OrLabel__Alternatives_1");
					put(grammarAccess.getOffset8OrLabelAccess().getAlternatives_1(), "rule__Offset8OrLabel__Alternatives_1");
					put(grammarAccess.getExpressionAccess().getAlternatives_0(), "rule__Expression__Alternatives_0");
					put(grammarAccess.getLowOrHightAccess().getAlternatives_1(), "rule__LowOrHight__Alternatives_1");
					put(grammarAccess.getRegisterAccess().getValueAlternatives_0(), "rule__Register__ValueAlternatives_0");
					put(grammarAccess.getNumberAccess().getValueAlternatives_0(), "rule__Number__ValueAlternatives_0");
					put(grammarAccess.getLabelAccess().getGroup(), "rule__Label__Group__0");
					put(grammarAccess.getAsciiAccess().getGroup(), "rule__Ascii__Group__0");
					put(grammarAccess.getAsciiAccess().getGroup_1(), "rule__Ascii__Group_1__0");
					put(grammarAccess.getAsciiAccess().getGroup_1_1(), "rule__Ascii__Group_1_1__0");
					put(grammarAccess.getAsciizAccess().getGroup(), "rule__Asciiz__Group__0");
					put(grammarAccess.getAsciizAccess().getGroup_1(), "rule__Asciiz__Group_1__0");
					put(grammarAccess.getAsciizAccess().getGroup_1_1(), "rule__Asciiz__Group_1_1__0");
					put(grammarAccess.getByteAccess().getGroup(), "rule__Byte__Group__0");
					put(grammarAccess.getByteAccess().getGroup_1(), "rule__Byte__Group_1__0");
					put(grammarAccess.getByteAccess().getGroup_1_1(), "rule__Byte__Group_1_1__0");
					put(grammarAccess.getWordAccess().getGroup(), "rule__Word__Group__0");
					put(grammarAccess.getWordAccess().getGroup_1(), "rule__Word__Group_1__0");
					put(grammarAccess.getWordAccess().getGroup_1_1(), "rule__Word__Group_1_1__0");
					put(grammarAccess.getSpaceAccess().getGroup(), "rule__Space__Group__0");
					put(grammarAccess.getSpaceAccess().getGroup_2(), "rule__Space__Group_2__0");
					put(grammarAccess.getSetAccess().getGroup(), "rule__Set__Group__0");
					put(grammarAccess.getSectionAccess().getGroup(), "rule__Section__Group__0");
					put(grammarAccess.getOrgAccess().getGroup(), "rule__Org__Group__0");
					put(grammarAccess.getEquAccess().getGroup(), "rule__Equ__Group__0");
					put(grammarAccess.getLdImmediateAccess().getGroup(), "rule__LdImmediate__Group__0");
					put(grammarAccess.getLdDirectAccess().getGroup(), "rule__LdDirect__Group__0");
					put(grammarAccess.getLdIndexedAccess().getGroup(), "rule__LdIndexed__Group__0");
					put(grammarAccess.getLdBasedIndexedAccess().getGroup(), "rule__LdBasedIndexed__Group__0");
					put(grammarAccess.getStDirectAccess().getGroup(), "rule__StDirect__Group__0");
					put(grammarAccess.getStIndexedAccess().getGroup(), "rule__StIndexed__Group__0");
					put(grammarAccess.getStBasedIndexedAccess().getGroup(), "rule__StBasedIndexed__Group__0");
					put(grammarAccess.getAddAccess().getGroup_0(), "rule__Add__Group_0__0");
					put(grammarAccess.getAddAccess().getGroup_1(), "rule__Add__Group_1__0");
					put(grammarAccess.getSubAccess().getGroup_0(), "rule__Sub__Group_0__0");
					put(grammarAccess.getSubAccess().getGroup_1(), "rule__Sub__Group_1__0");
					put(grammarAccess.getSubAccess().getGroup_2(), "rule__Sub__Group_2__0");
					put(grammarAccess.getAnlAccess().getGroup(), "rule__Anl__Group__0");
					put(grammarAccess.getOrlAccess().getGroup_0(), "rule__Orl__Group_0__0");
					put(grammarAccess.getOrlAccess().getGroup_1(), "rule__Orl__Group_1__0");
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
					put(grammarAccess.getImmediate8OrLabelAccess().getGroup(), "rule__Immediate8OrLabel__Group__0");
					put(grammarAccess.getIdx3OrLabelAccess().getGroup(), "rule__Idx3OrLabel__Group__0");
					put(grammarAccess.getConst4OrLabelAccess().getGroup(), "rule__Const4OrLabel__Group__0");
					put(grammarAccess.getOffset8OrLabelAccess().getGroup(), "rule__Offset8OrLabel__Group__0");
					put(grammarAccess.getOperationWithTwoRegistersAccess().getGroup(), "rule__OperationWithTwoRegisters__Group__0");
					put(grammarAccess.getOperationsWithThreeRegistersAccess().getGroup(), "rule__OperationsWithThreeRegisters__Group__0");
					put(grammarAccess.getOperationsWithConstantAccess().getGroup(), "rule__OperationsWithConstant__Group__0");
					put(grammarAccess.getOperationShiftAccess().getGroup(), "rule__OperationShift__Group__0");
					put(grammarAccess.getOperationWithOffsetAccess().getGroup(), "rule__OperationWithOffset__Group__0");
					put(grammarAccess.getExpressionAccess().getGroup(), "rule__Expression__Group__0");
					put(grammarAccess.getExpressionAccess().getGroup_1(), "rule__Expression__Group_1__0");
					put(grammarAccess.getLowOrHightAccess().getGroup(), "rule__LowOrHight__Group__0");
					put(grammarAccess.getPDS16ASMAccess().getInstuctionsAssignment(), "rule__PDS16ASM__InstuctionsAssignment");
					put(grammarAccess.getLabelAccess().getLabelNameAssignment_0(), "rule__Label__LabelNameAssignment_0");
					put(grammarAccess.getLabelAccess().getValueAssignment_1(), "rule__Label__ValueAssignment_1");
					put(grammarAccess.getDirectiveAccess().getValueAssignment(), "rule__Directive__ValueAssignment");
					put(grammarAccess.getBssAccess().getTagAssignment(), "rule__Bss__TagAssignment");
					put(grammarAccess.getDataAccess().getTagAssignment(), "rule__Data__TagAssignment");
					put(grammarAccess.getEndAccess().getTagAssignment(), "rule__End__TagAssignment");
					put(grammarAccess.getTextAccess().getTagAssignment(), "rule__Text__TagAssignment");
					put(grammarAccess.getAsciiAccess().getTagAssignment_0(), "rule__Ascii__TagAssignment_0");
					put(grammarAccess.getAsciiAccess().getValuesAssignment_1_0(), "rule__Ascii__ValuesAssignment_1_0");
					put(grammarAccess.getAsciiAccess().getValuesAssignment_1_1_1(), "rule__Ascii__ValuesAssignment_1_1_1");
					put(grammarAccess.getAsciizAccess().getTagAssignment_0(), "rule__Asciiz__TagAssignment_0");
					put(grammarAccess.getAsciizAccess().getValuesAssignment_1_0(), "rule__Asciiz__ValuesAssignment_1_0");
					put(grammarAccess.getAsciizAccess().getValuesAssignment_1_1_1(), "rule__Asciiz__ValuesAssignment_1_1_1");
					put(grammarAccess.getByteAccess().getTagAssignment_0(), "rule__Byte__TagAssignment_0");
					put(grammarAccess.getByteAccess().getValuesAssignment_1_0_0(), "rule__Byte__ValuesAssignment_1_0_0");
					put(grammarAccess.getByteAccess().getNumbersAssignment_1_0_1(), "rule__Byte__NumbersAssignment_1_0_1");
					put(grammarAccess.getByteAccess().getValuesAssignment_1_1_1_0(), "rule__Byte__ValuesAssignment_1_1_1_0");
					put(grammarAccess.getByteAccess().getNumbersAssignment_1_1_1_1(), "rule__Byte__NumbersAssignment_1_1_1_1");
					put(grammarAccess.getWordAccess().getTagAssignment_0(), "rule__Word__TagAssignment_0");
					put(grammarAccess.getWordAccess().getValuesAssignment_1_0_0(), "rule__Word__ValuesAssignment_1_0_0");
					put(grammarAccess.getWordAccess().getNumbersAssignment_1_0_1(), "rule__Word__NumbersAssignment_1_0_1");
					put(grammarAccess.getWordAccess().getValuesAssignment_1_1_1_0(), "rule__Word__ValuesAssignment_1_1_1_0");
					put(grammarAccess.getWordAccess().getNumbersAssignment_1_1_1_1(), "rule__Word__NumbersAssignment_1_1_1_1");
					put(grammarAccess.getSpaceAccess().getTagAssignment_0(), "rule__Space__TagAssignment_0");
					put(grammarAccess.getSpaceAccess().getSizeAssignment_1(), "rule__Space__SizeAssignment_1");
					put(grammarAccess.getSpaceAccess().getByteValueAssignment_2_1(), "rule__Space__ByteValueAssignment_2_1");
					put(grammarAccess.getSetAccess().getTagAssignment_0(), "rule__Set__TagAssignment_0");
					put(grammarAccess.getSetAccess().getIdAssignment_1(), "rule__Set__IdAssignment_1");
					put(grammarAccess.getSetAccess().getValueAssignment_3(), "rule__Set__ValueAssignment_3");
					put(grammarAccess.getSectionAccess().getTagAssignment_0(), "rule__Section__TagAssignment_0");
					put(grammarAccess.getSectionAccess().getIdAssignment_1(), "rule__Section__IdAssignment_1");
					put(grammarAccess.getOrgAccess().getTagAssignment_0(), "rule__Org__TagAssignment_0");
					put(grammarAccess.getOrgAccess().getValueAssignment_1(), "rule__Org__ValueAssignment_1");
					put(grammarAccess.getEquAccess().getTagAssignment_0(), "rule__Equ__TagAssignment_0");
					put(grammarAccess.getEquAccess().getIdAssignment_1(), "rule__Equ__IdAssignment_1");
					put(grammarAccess.getEquAccess().getValueAssignment_3(), "rule__Equ__ValueAssignment_3");
					put(grammarAccess.getJumpOpAccess().getTagAssignment_0(), "rule__JumpOp__TagAssignment_0");
					put(grammarAccess.getJumpOpAccess().getOpOffAssignment_1_0(), "rule__JumpOp__OpOffAssignment_1_0");
					put(grammarAccess.getJumpOpAccess().getOpIdAssignment_1_1(), "rule__JumpOp__OpIdAssignment_1_1");
					put(grammarAccess.getNopAccess().getInstructionAssignment(), "rule__Nop__InstructionAssignment");
					put(grammarAccess.getRetAccess().getInstructionAssignment(), "rule__Ret__InstructionAssignment");
					put(grammarAccess.getImmediateAccess().getRegisterAssignment_0(), "rule__Immediate__RegisterAssignment_0");
					put(grammarAccess.getImmediateAccess().getImmediate8Assignment_2_0(), "rule__Immediate__Immediate8Assignment_2_0");
					put(grammarAccess.getImmediateAccess().getLowORhighAssignment_2_1(), "rule__Immediate__LowORhighAssignment_2_1");
					put(grammarAccess.getDirectAccess().getRegisterAssignment_0(), "rule__Direct__RegisterAssignment_0");
					put(grammarAccess.getDirectAccess().getDirect7Assignment_2(), "rule__Direct__Direct7Assignment_2");
					put(grammarAccess.getIndexedAccess().getRdAssignment_0(), "rule__Indexed__RdAssignment_0");
					put(grammarAccess.getIndexedAccess().getRbxAssignment_3(), "rule__Indexed__RbxAssignment_3");
					put(grammarAccess.getIndexedAccess().getIdx3Assignment_5(), "rule__Indexed__Idx3Assignment_5");
					put(grammarAccess.getBasedIndexedAccess().getRbxAssignment_3(), "rule__BasedIndexed__RbxAssignment_3");
					put(grammarAccess.getBasedIndexedAccess().getRixAssignment_5(), "rule__BasedIndexed__RixAssignment_5");
					put(grammarAccess.getDirectOrLabelAccess().getNumberAssignment_0(), "rule__DirectOrLabel__NumberAssignment_0");
					put(grammarAccess.getDirectOrLabelAccess().getLabelAssignment_1(), "rule__DirectOrLabel__LabelAssignment_1");
					put(grammarAccess.getImmediate8OrLabelAccess().getNumberAssignment_1_0(), "rule__Immediate8OrLabel__NumberAssignment_1_0");
					put(grammarAccess.getImmediate8OrLabelAccess().getLabelAssignment_1_1(), "rule__Immediate8OrLabel__LabelAssignment_1_1");
					put(grammarAccess.getIdx3OrLabelAccess().getNumberAssignment_1_0(), "rule__Idx3OrLabel__NumberAssignment_1_0");
					put(grammarAccess.getIdx3OrLabelAccess().getLabelAssignment_1_1(), "rule__Idx3OrLabel__LabelAssignment_1_1");
					put(grammarAccess.getConst4OrLabelAccess().getNumberAssignment_1_0(), "rule__Const4OrLabel__NumberAssignment_1_0");
					put(grammarAccess.getConst4OrLabelAccess().getLabelAssignment_1_1(), "rule__Const4OrLabel__LabelAssignment_1_1");
					put(grammarAccess.getOffset8OrLabelAccess().getNumberAssignment_1_0(), "rule__Offset8OrLabel__NumberAssignment_1_0");
					put(grammarAccess.getOffset8OrLabelAccess().getLabelAssignment_1_1(), "rule__Offset8OrLabel__LabelAssignment_1_1");
					put(grammarAccess.getOperationWithTwoRegistersAccess().getRdAssignment_0(), "rule__OperationWithTwoRegisters__RdAssignment_0");
					put(grammarAccess.getOperationWithTwoRegistersAccess().getRmAssignment_2(), "rule__OperationWithTwoRegisters__RmAssignment_2");
					put(grammarAccess.getOperationsWithThreeRegistersAccess().getRdAssignment_0(), "rule__OperationsWithThreeRegisters__RdAssignment_0");
					put(grammarAccess.getOperationsWithThreeRegistersAccess().getRmAssignment_2(), "rule__OperationsWithThreeRegisters__RmAssignment_2");
					put(grammarAccess.getOperationsWithThreeRegistersAccess().getRnAssignment_4(), "rule__OperationsWithThreeRegisters__RnAssignment_4");
					put(grammarAccess.getOperationsWithConstantAccess().getRdAssignment_0(), "rule__OperationsWithConstant__RdAssignment_0");
					put(grammarAccess.getOperationsWithConstantAccess().getRmAssignment_2(), "rule__OperationsWithConstant__RmAssignment_2");
					put(grammarAccess.getOperationsWithConstantAccess().getConst4Assignment_4(), "rule__OperationsWithConstant__Const4Assignment_4");
					put(grammarAccess.getOperationShiftAccess().getRdAssignment_0(), "rule__OperationShift__RdAssignment_0");
					put(grammarAccess.getOperationShiftAccess().getRmAssignment_2(), "rule__OperationShift__RmAssignment_2");
					put(grammarAccess.getOperationShiftAccess().getConst4Assignment_4(), "rule__OperationShift__Const4Assignment_4");
					put(grammarAccess.getOperationShiftAccess().getSinAssignment_6(), "rule__OperationShift__SinAssignment_6");
					put(grammarAccess.getOperationWithOffsetAccess().getRbxAssignment_0(), "rule__OperationWithOffset__RbxAssignment_0");
					put(grammarAccess.getOperationWithOffsetAccess().getOffset8Assignment_2(), "rule__OperationWithOffset__Offset8Assignment_2");
					put(grammarAccess.getExpressionAccess().getNumericValueAssignment_0_0(), "rule__Expression__NumericValueAssignment_0_0");
					put(grammarAccess.getExpressionAccess().getIdValueAssignment_0_1(), "rule__Expression__IdValueAssignment_0_1");
					put(grammarAccess.getExpressionAccess().getOperandAssignment_1_0(), "rule__Expression__OperandAssignment_1_0");
					put(grammarAccess.getExpressionAccess().getExpressionAssignment_1_1(), "rule__Expression__ExpressionAssignment_1_1");
					put(grammarAccess.getLowOrHightAccess().getValueAssignment_3(), "rule__LowOrHight__ValueAssignment_3");
					put(grammarAccess.getRegisterAccess().getValueAssignment(), "rule__Register__ValueAssignment");
					put(grammarAccess.getNumberAccess().getValueAssignment(), "rule__Number__ValueAssignment");
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
