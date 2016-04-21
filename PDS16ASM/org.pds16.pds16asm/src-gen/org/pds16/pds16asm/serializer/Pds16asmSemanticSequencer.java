/*
 * generated by Xtext 2.10.0-SNAPSHOT
 */
package org.pds16.pds16asm.serializer;

import com.google.inject.Inject;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import org.pds16.pds16asm.pds16asm.Ascii;
import org.pds16.pds16asm.pds16asm.Asciiz;
import org.pds16.pds16asm.pds16asm.Const4OrLabel;
import org.pds16.pds16asm.pds16asm.Direct;
import org.pds16.pds16asm.pds16asm.DirectOrLabel;
import org.pds16.pds16asm.pds16asm.Expression;
import org.pds16.pds16asm.pds16asm.Idx3OrLabel;
import org.pds16.pds16asm.pds16asm.Immediate;
import org.pds16.pds16asm.pds16asm.Immediate8OrLabel;
import org.pds16.pds16asm.pds16asm.Indexed;
import org.pds16.pds16asm.pds16asm.JumpOp;
import org.pds16.pds16asm.pds16asm.Label;
import org.pds16.pds16asm.pds16asm.LowOrHight;
import org.pds16.pds16asm.pds16asm.Nop;
import org.pds16.pds16asm.pds16asm.Offset8OrLabel;
import org.pds16.pds16asm.pds16asm.OperationShift;
import org.pds16.pds16asm.pds16asm.OperationWithOffset;
import org.pds16.pds16asm.pds16asm.OperationWithTwoRegisters;
import org.pds16.pds16asm.pds16asm.OperationsWithConstant;
import org.pds16.pds16asm.pds16asm.OperationsWithTreeRegisters;
import org.pds16.pds16asm.pds16asm.PDS16ASM;
import org.pds16.pds16asm.pds16asm.Pds16asmPackage;
import org.pds16.pds16asm.pds16asm.Registers;
import org.pds16.pds16asm.pds16asm.Ret;
import org.pds16.pds16asm.pds16asm.Section;
import org.pds16.pds16asm.pds16asm.Space;
import org.pds16.pds16asm.pds16asm.Word;
import org.pds16.pds16asm.services.Pds16asmGrammarAccess;

@SuppressWarnings("all")
public class Pds16asmSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private Pds16asmGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == Pds16asmPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case Pds16asmPackage.ASCII:
				sequence_Ascii(context, (Ascii) semanticObject); 
				return; 
			case Pds16asmPackage.ASCIIZ:
				sequence_Asciiz(context, (Asciiz) semanticObject); 
				return; 
			case Pds16asmPackage.BYTE:
				sequence_Byte(context, (org.pds16.pds16asm.pds16asm.Byte) semanticObject); 
				return; 
			case Pds16asmPackage.CONST4_OR_LABEL:
				sequence_Const4OrLabel(context, (Const4OrLabel) semanticObject); 
				return; 
			case Pds16asmPackage.DIRECT:
				sequence_Direct(context, (Direct) semanticObject); 
				return; 
			case Pds16asmPackage.DIRECT_OR_LABEL:
				sequence_DirectOrLabel(context, (DirectOrLabel) semanticObject); 
				return; 
			case Pds16asmPackage.EXPRESSION:
				sequence_Expression(context, (Expression) semanticObject); 
				return; 
			case Pds16asmPackage.IDX3_OR_LABEL:
				sequence_Idx3OrLabel(context, (Idx3OrLabel) semanticObject); 
				return; 
			case Pds16asmPackage.IMMEDIATE:
				sequence_Immediate(context, (Immediate) semanticObject); 
				return; 
			case Pds16asmPackage.IMMEDIATE8_OR_LABEL:
				sequence_Immediate8OrLabel(context, (Immediate8OrLabel) semanticObject); 
				return; 
			case Pds16asmPackage.INDEXED:
				sequence_Indexed(context, (Indexed) semanticObject); 
				return; 
			case Pds16asmPackage.JUMP_OP:
				sequence_JumpOp(context, (JumpOp) semanticObject); 
				return; 
			case Pds16asmPackage.LABEL:
				sequence_Label(context, (Label) semanticObject); 
				return; 
			case Pds16asmPackage.LOW_OR_HIGHT:
				sequence_LowOrHight(context, (LowOrHight) semanticObject); 
				return; 
			case Pds16asmPackage.NOP:
				sequence_Nop(context, (Nop) semanticObject); 
				return; 
			case Pds16asmPackage.NUMBER:
				sequence_Number(context, (org.pds16.pds16asm.pds16asm.Number) semanticObject); 
				return; 
			case Pds16asmPackage.OFFSET8_OR_LABEL:
				sequence_Offset8OrLabel(context, (Offset8OrLabel) semanticObject); 
				return; 
			case Pds16asmPackage.OPERATION_SHIFT:
				sequence_OperationShift(context, (OperationShift) semanticObject); 
				return; 
			case Pds16asmPackage.OPERATION_WITH_OFFSET:
				sequence_OperationWithOffset(context, (OperationWithOffset) semanticObject); 
				return; 
			case Pds16asmPackage.OPERATION_WITH_TWO_REGISTERS:
				sequence_OperationWithTwoRegisters(context, (OperationWithTwoRegisters) semanticObject); 
				return; 
			case Pds16asmPackage.OPERATIONS_WITH_CONSTANT:
				sequence_OperationsWithConstant(context, (OperationsWithConstant) semanticObject); 
				return; 
			case Pds16asmPackage.OPERATIONS_WITH_TREE_REGISTERS:
				sequence_OperationsWithTreeRegisters(context, (OperationsWithTreeRegisters) semanticObject); 
				return; 
			case Pds16asmPackage.PDS16ASM:
				sequence_PDS16ASM(context, (PDS16ASM) semanticObject); 
				return; 
			case Pds16asmPackage.REGISTERS:
				if (rule == grammarAccess.getStatementRule()
						|| rule == grammarAccess.getInstructionsRule()) {
					sequence_BasedIndexed_Registers(context, (Registers) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getLoadRule()
						|| rule == grammarAccess.getStoreRule()
						|| rule == grammarAccess.getLdBasedIndexedRule()
						|| rule == grammarAccess.getStBasedIndexedRule()
						|| rule == grammarAccess.getBasedIndexedRule()) {
					sequence_BasedIndexed_Registers(context, (Registers) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getAritmeticaRule()
						|| rule == grammarAccess.getAddRule()
						|| rule == grammarAccess.getSubRule()
						|| rule == grammarAccess.getRegistersRule()) {
					sequence_Registers(context, (Registers) semanticObject); 
					return; 
				}
				else break;
			case Pds16asmPackage.RET:
				sequence_Ret(context, (Ret) semanticObject); 
				return; 
			case Pds16asmPackage.SECTION:
				sequence_Section(context, (Section) semanticObject); 
				return; 
			case Pds16asmPackage.SET:
				sequence_Set(context, (org.pds16.pds16asm.pds16asm.Set) semanticObject); 
				return; 
			case Pds16asmPackage.SPACE:
				sequence_Space(context, (Space) semanticObject); 
				return; 
			case Pds16asmPackage.WORD:
				sequence_Word(context, (Word) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     Statement returns Ascii
	 *     Directive returns Ascii
	 *     LabelDirective returns Ascii
	 *     Ascii returns Ascii
	 *
	 * Constraint:
	 *     value=STRING
	 */
	protected void sequence_Ascii(ISerializationContext context, Ascii semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, Pds16asmPackage.Literals.ASCII__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Pds16asmPackage.Literals.ASCII__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getAsciiAccess().getValueSTRINGTerminalRuleCall_1_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Statement returns Asciiz
	 *     Directive returns Asciiz
	 *     LabelDirective returns Asciiz
	 *     Asciiz returns Asciiz
	 *
	 * Constraint:
	 *     value=STRING
	 */
	protected void sequence_Asciiz(ISerializationContext context, Asciiz semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, Pds16asmPackage.Literals.ASCIIZ__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Pds16asmPackage.Literals.ASCIIZ__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getAsciizAccess().getValueSTRINGTerminalRuleCall_1_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Statement returns Registers
	 *     Instructions returns Registers
	 *
	 * Constraint:
	 *     (
	 *         (
	 *             value='r0' | 
	 *             value='r1' | 
	 *             value='r2' | 
	 *             value='r3' | 
	 *             value='r4' | 
	 *             value='r5' | 
	 *             value='r6' | 
	 *             value='r7' | 
	 *             value='PSW'
	 *         ) 
	 *         (rbx=Registers rix=Registers)?
	 *     )
	 */
	protected void sequence_BasedIndexed_Registers(ISerializationContext context, Registers semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	// This method is commented out because it has the same signature as another method in this class.
	// This is probably a bug in Xtext's serializer, please report it here: 
	// https://bugs.eclipse.org/bugs/enter_bug.cgi?product=TMF
	//
	// Contexts:
	//     Load returns Registers
	//     Store returns Registers
	//     LdBasedIndexed returns Registers
	//     StBasedIndexed returns Registers
	//     BasedIndexed returns Registers
	//
	// Constraint:
	//     (
	//         (
	//             value='r0' | 
	//             value='r1' | 
	//             value='r2' | 
	//             value='r3' | 
	//             value='r4' | 
	//             value='r5' | 
	//             value='r6' | 
	//             value='r7' | 
	//             value='PSW'
	//         ) 
	//         rbx=Registers 
	//         rix=Registers
	//     )
	//
	// protected void sequence_BasedIndexed_Registers(ISerializationContext context, Registers semanticObject) { }
	
	/**
	 * Contexts:
	 *     Statement returns Byte
	 *     Directive returns Byte
	 *     LabelDirective returns Byte
	 *     Byte returns Byte
	 *
	 * Constraint:
	 *     (
	 *         (number+=INT | number+=HEX | number+=OCT | number+=BIN | number+=CHAR) 
	 *         number+=INT? 
	 *         ((number+=HEX | number+=OCT | number+=BIN | number+=CHAR)? number+=INT?)*
	 *     )
	 */
	protected void sequence_Byte(ISerializationContext context, org.pds16.pds16asm.pds16asm.Byte semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Const4OrLabel returns Const4OrLabel
	 *
	 * Constraint:
	 *     (number=Number | label=ID)
	 */
	protected void sequence_Const4OrLabel(ISerializationContext context, Const4OrLabel semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     DirectOrLabel returns DirectOrLabel
	 *
	 * Constraint:
	 *     (number=Number | label=ID)
	 */
	protected void sequence_DirectOrLabel(ISerializationContext context, DirectOrLabel semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Statement returns Direct
	 *     Instructions returns Direct
	 *     Load returns Direct
	 *     Store returns Direct
	 *     LdDirect returns Direct
	 *     StDirect returns Direct
	 *     Direct returns Direct
	 *
	 * Constraint:
	 *     (register=Registers direct7=DirectOrLabel)
	 */
	protected void sequence_Direct(ISerializationContext context, Direct semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, Pds16asmPackage.Literals.DIRECT__REGISTER) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Pds16asmPackage.Literals.DIRECT__REGISTER));
			if (transientValues.isValueTransient(semanticObject, Pds16asmPackage.Literals.DIRECT__DIRECT7) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Pds16asmPackage.Literals.DIRECT__DIRECT7));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getDirectAccess().getRegisterRegistersParserRuleCall_0_0(), semanticObject.getRegister());
		feeder.accept(grammarAccess.getDirectAccess().getDirect7DirectOrLabelParserRuleCall_2_0(), semanticObject.getDirect7());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Statement returns Expression
	 *     Directive returns Expression
	 *     Org returns Expression
	 *     Equ returns Expression
	 *     Expression returns Expression
	 *
	 * Constraint:
	 *     (
	 *         numericValue+=INT | 
	 *         numericValue+=HEX | 
	 *         numericValue+=OCT | 
	 *         numericValue+=BIN | 
	 *         numericValue+=CHAR | 
	 *         idValue+=ID
	 *     )+
	 */
	protected void sequence_Expression(ISerializationContext context, Expression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Idx3OrLabel returns Idx3OrLabel
	 *
	 * Constraint:
	 *     (number=Number | label=ID)
	 */
	protected void sequence_Idx3OrLabel(ISerializationContext context, Idx3OrLabel semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Immediate8OrLabel returns Immediate8OrLabel
	 *
	 * Constraint:
	 *     (number=Number | label=ID)
	 */
	protected void sequence_Immediate8OrLabel(ISerializationContext context, Immediate8OrLabel semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Statement returns Immediate
	 *     Instructions returns Immediate
	 *     Load returns Immediate
	 *     LdImmediate returns Immediate
	 *     Immediate returns Immediate
	 *
	 * Constraint:
	 *     (register=Registers (immediate8=Immediate8OrLabel | lowORhigh=LowOrHight))
	 */
	protected void sequence_Immediate(ISerializationContext context, Immediate semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Statement returns Indexed
	 *     Instructions returns Indexed
	 *     Load returns Indexed
	 *     Store returns Indexed
	 *     LdIndexed returns Indexed
	 *     StIndexed returns Indexed
	 *     Indexed returns Indexed
	 *
	 * Constraint:
	 *     (rd=Registers rbx=Registers idx3=Idx3OrLabel)
	 */
	protected void sequence_Indexed(ISerializationContext context, Indexed semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, Pds16asmPackage.Literals.INDEXED__RD) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Pds16asmPackage.Literals.INDEXED__RD));
			if (transientValues.isValueTransient(semanticObject, Pds16asmPackage.Literals.INDEXED__RBX) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Pds16asmPackage.Literals.INDEXED__RBX));
			if (transientValues.isValueTransient(semanticObject, Pds16asmPackage.Literals.INDEXED__IDX3) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Pds16asmPackage.Literals.INDEXED__IDX3));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getIndexedAccess().getRdRegistersParserRuleCall_0_0(), semanticObject.getRd());
		feeder.accept(grammarAccess.getIndexedAccess().getRbxRegistersParserRuleCall_3_0(), semanticObject.getRbx());
		feeder.accept(grammarAccess.getIndexedAccess().getIdx3Idx3OrLabelParserRuleCall_5_0(), semanticObject.getIdx3());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Statement returns JumpOp
	 *     Instructions returns JumpOp
	 *     Jump returns JumpOp
	 *     JumpOp returns JumpOp
	 *
	 * Constraint:
	 *     op=ID
	 */
	protected void sequence_JumpOp(ISerializationContext context, JumpOp semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, Pds16asmPackage.Literals.JUMP_OP__OP) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Pds16asmPackage.Literals.JUMP_OP__OP));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getJumpOpAccess().getOpIDTerminalRuleCall_1_1_0(), semanticObject.getOp());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Statement returns Label
	 *     Label returns Label
	 *
	 * Constraint:
	 *     (labelName=ID (value=Label | value=LabelDirective | value=Instructions))
	 */
	protected void sequence_Label(ISerializationContext context, Label semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     LowOrHight returns LowOrHight
	 *
	 * Constraint:
	 *     value=Expression
	 */
	protected void sequence_LowOrHight(ISerializationContext context, LowOrHight semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, Pds16asmPackage.Literals.LOW_OR_HIGHT__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Pds16asmPackage.Literals.LOW_OR_HIGHT__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getLowOrHightAccess().getValueExpressionParserRuleCall_3_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Statement returns Nop
	 *     Instructions returns Nop
	 *     Nop returns Nop
	 *
	 * Constraint:
	 *     instruction='nop'
	 */
	protected void sequence_Nop(ISerializationContext context, Nop semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, Pds16asmPackage.Literals.NOP__INSTRUCTION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Pds16asmPackage.Literals.NOP__INSTRUCTION));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getNopAccess().getInstructionNopKeyword_0(), semanticObject.getInstruction());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Number returns Number
	 *
	 * Constraint:
	 *     (value=INT | value=HEX | value=OCT | value=BIN | value=CHAR)
	 */
	protected void sequence_Number(ISerializationContext context, org.pds16.pds16asm.pds16asm.Number semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Offset8OrLabel returns Offset8OrLabel
	 *
	 * Constraint:
	 *     (number=Number | label=ID)
	 */
	protected void sequence_Offset8OrLabel(ISerializationContext context, Offset8OrLabel semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Statement returns OperationShift
	 *     Instructions returns OperationShift
	 *     Logica returns OperationShift
	 *     Shl returns OperationShift
	 *     Shr returns OperationShift
	 *     OperationShift returns OperationShift
	 *
	 * Constraint:
	 *     (rd=Registers rm=Registers const4=Const4OrLabel (sin=INT | sin=HEX | sin=OCT | sin=BIN | sin=CHAR))
	 */
	protected void sequence_OperationShift(ISerializationContext context, OperationShift semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Statement returns OperationWithOffset
	 *     Instructions returns OperationWithOffset
	 *     Jump returns OperationWithOffset
	 *     JumpOp returns OperationWithOffset
	 *     OperationWithOffset returns OperationWithOffset
	 *
	 * Constraint:
	 *     (rbx=Registers offset8=Offset8OrLabel)
	 */
	protected void sequence_OperationWithOffset(ISerializationContext context, OperationWithOffset semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, Pds16asmPackage.Literals.OPERATION_WITH_OFFSET__RBX) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Pds16asmPackage.Literals.OPERATION_WITH_OFFSET__RBX));
			if (transientValues.isValueTransient(semanticObject, Pds16asmPackage.Literals.OPERATION_WITH_OFFSET__OFFSET8) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Pds16asmPackage.Literals.OPERATION_WITH_OFFSET__OFFSET8));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getOperationWithOffsetAccess().getRbxRegistersParserRuleCall_0_0(), semanticObject.getRbx());
		feeder.accept(grammarAccess.getOperationWithOffsetAccess().getOffset8Offset8OrLabelParserRuleCall_2_0(), semanticObject.getOffset8());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Statement returns OperationWithTwoRegisters
	 *     Instructions returns OperationWithTwoRegisters
	 *     Logica returns OperationWithTwoRegisters
	 *     Orl returns OperationWithTwoRegisters
	 *     Not returns OperationWithTwoRegisters
	 *     Rc returns OperationWithTwoRegisters
	 *     OperationWithTwoRegisters returns OperationWithTwoRegisters
	 *
	 * Constraint:
	 *     (rd=Registers rm=Registers)
	 */
	protected void sequence_OperationWithTwoRegisters(ISerializationContext context, OperationWithTwoRegisters semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, Pds16asmPackage.Literals.ORL__RD) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Pds16asmPackage.Literals.ORL__RD));
			if (transientValues.isValueTransient(semanticObject, Pds16asmPackage.Literals.ORL__RM) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Pds16asmPackage.Literals.ORL__RM));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getOperationWithTwoRegistersAccess().getRdRegistersParserRuleCall_0_0(), semanticObject.getRd());
		feeder.accept(grammarAccess.getOperationWithTwoRegistersAccess().getRmRegistersParserRuleCall_2_0(), semanticObject.getRm());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Statement returns OperationsWithConstant
	 *     Instructions returns OperationsWithConstant
	 *     Aritmetica returns OperationsWithConstant
	 *     Logica returns OperationsWithConstant
	 *     Add returns OperationsWithConstant
	 *     Sub returns OperationsWithConstant
	 *     Rr returns OperationsWithConstant
	 *     OperationsWithConstant returns OperationsWithConstant
	 *
	 * Constraint:
	 *     (rd=Registers rm=Registers const4=Const4OrLabel)
	 */
	protected void sequence_OperationsWithConstant(ISerializationContext context, OperationsWithConstant semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, Pds16asmPackage.Literals.OPERATIONS_WITH_CONSTANT__RD) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Pds16asmPackage.Literals.OPERATIONS_WITH_CONSTANT__RD));
			if (transientValues.isValueTransient(semanticObject, Pds16asmPackage.Literals.OPERATIONS_WITH_CONSTANT__RM) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Pds16asmPackage.Literals.OPERATIONS_WITH_CONSTANT__RM));
			if (transientValues.isValueTransient(semanticObject, Pds16asmPackage.Literals.OPERATIONS_WITH_CONSTANT__CONST4) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Pds16asmPackage.Literals.OPERATIONS_WITH_CONSTANT__CONST4));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getOperationsWithConstantAccess().getRdRegistersParserRuleCall_0_0(), semanticObject.getRd());
		feeder.accept(grammarAccess.getOperationsWithConstantAccess().getRmRegistersParserRuleCall_2_0(), semanticObject.getRm());
		feeder.accept(grammarAccess.getOperationsWithConstantAccess().getConst4Const4OrLabelParserRuleCall_4_0(), semanticObject.getConst4());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Statement returns OperationsWithTreeRegisters
	 *     Instructions returns OperationsWithTreeRegisters
	 *     Aritmetica returns OperationsWithTreeRegisters
	 *     Logica returns OperationsWithTreeRegisters
	 *     Add returns OperationsWithTreeRegisters
	 *     Sub returns OperationsWithTreeRegisters
	 *     Anl returns OperationsWithTreeRegisters
	 *     Orl returns OperationsWithTreeRegisters
	 *     Xrl returns OperationsWithTreeRegisters
	 *     OperationsWithTreeRegisters returns OperationsWithTreeRegisters
	 *
	 * Constraint:
	 *     (rd=Registers rm=Registers rn=Registers)
	 */
	protected void sequence_OperationsWithTreeRegisters(ISerializationContext context, OperationsWithTreeRegisters semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, Pds16asmPackage.Literals.ORL__RD) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Pds16asmPackage.Literals.ORL__RD));
			if (transientValues.isValueTransient(semanticObject, Pds16asmPackage.Literals.ORL__RM) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Pds16asmPackage.Literals.ORL__RM));
			if (transientValues.isValueTransient(semanticObject, Pds16asmPackage.Literals.OPERATIONS_WITH_TREE_REGISTERS__RN) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Pds16asmPackage.Literals.OPERATIONS_WITH_TREE_REGISTERS__RN));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getOperationsWithTreeRegistersAccess().getRdRegistersParserRuleCall_0_0(), semanticObject.getRd());
		feeder.accept(grammarAccess.getOperationsWithTreeRegistersAccess().getRmRegistersParserRuleCall_2_0(), semanticObject.getRm());
		feeder.accept(grammarAccess.getOperationsWithTreeRegistersAccess().getRnRegistersParserRuleCall_4_0(), semanticObject.getRn());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     PDS16ASM returns PDS16ASM
	 *
	 * Constraint:
	 *     instuctions+=Statement+
	 */
	protected void sequence_PDS16ASM(ISerializationContext context, PDS16ASM semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Aritmetica returns Registers
	 *     Add returns Registers
	 *     Sub returns Registers
	 *     Registers returns Registers
	 *
	 * Constraint:
	 *     (
	 *         value='r0' | 
	 *         value='r1' | 
	 *         value='r2' | 
	 *         value='r3' | 
	 *         value='r4' | 
	 *         value='r5' | 
	 *         value='r6' | 
	 *         value='r7' | 
	 *         value='PSW'
	 *     )
	 */
	protected void sequence_Registers(ISerializationContext context, Registers semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Statement returns Ret
	 *     Instructions returns Ret
	 *     Ret returns Ret
	 *
	 * Constraint:
	 *     (instruction='ret' | instruction='iret')
	 */
	protected void sequence_Ret(ISerializationContext context, Ret semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Statement returns Section
	 *     Directive returns Section
	 *     Section returns Section
	 *
	 * Constraint:
	 *     value=ID
	 */
	protected void sequence_Section(ISerializationContext context, Section semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, Pds16asmPackage.Literals.SECTION__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Pds16asmPackage.Literals.SECTION__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getSectionAccess().getValueIDTerminalRuleCall_1_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Statement returns Set
	 *     Directive returns Set
	 *     Set returns Set
	 *
	 * Constraint:
	 *     (value1=ID value2=Expression)
	 */
	protected void sequence_Set(ISerializationContext context, org.pds16.pds16asm.pds16asm.Set semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, Pds16asmPackage.Literals.SET__VALUE1) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Pds16asmPackage.Literals.SET__VALUE1));
			if (transientValues.isValueTransient(semanticObject, Pds16asmPackage.Literals.SET__VALUE2) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Pds16asmPackage.Literals.SET__VALUE2));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getSetAccess().getValue1IDTerminalRuleCall_1_0(), semanticObject.getValue1());
		feeder.accept(grammarAccess.getSetAccess().getValue2ExpressionParserRuleCall_3_0(), semanticObject.getValue2());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Statement returns Space
	 *     Directive returns Space
	 *     LabelDirective returns Space
	 *     Space returns Space
	 *
	 * Constraint:
	 *     ((size=INT | size=HEX | size=OCT | size=BIN | size=CHAR) (byteValeu=INT | byteValeu=HEX | byteValeu=OCT | byteValeu=BIN | byteValeu=CHAR)?)
	 */
	protected void sequence_Space(ISerializationContext context, Space semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Statement returns Word
	 *     Directive returns Word
	 *     LabelDirective returns Word
	 *     Word returns Word
	 *
	 * Constraint:
	 *     (
	 *         (
	 *             value+=ID | 
	 *             number+=INT | 
	 *             number+=HEX | 
	 *             number+=OCT | 
	 *             number+=BIN | 
	 *             number+=CHAR
	 *         ) 
	 *         value+=ID? 
	 *         ((number+=INT | number+=HEX | number+=OCT | number+=BIN | number+=CHAR)? value+=ID?)*
	 *     )
	 */
	protected void sequence_Word(ISerializationContext context, Word semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}
