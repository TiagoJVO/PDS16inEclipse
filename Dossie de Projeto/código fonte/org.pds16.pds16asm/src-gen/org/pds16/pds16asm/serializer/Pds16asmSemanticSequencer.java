/*
 * generated by Xtext 2.10.1
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
import org.pds16.pds16asm.pds16asm.Bss;
import org.pds16.pds16asm.pds16asm.Const4OrLabel;
import org.pds16.pds16asm.pds16asm.Data;
import org.pds16.pds16asm.pds16asm.Direct;
import org.pds16.pds16asm.pds16asm.DirectOrLabel;
import org.pds16.pds16asm.pds16asm.Directive;
import org.pds16.pds16asm.pds16asm.End;
import org.pds16.pds16asm.pds16asm.Equ;
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
import org.pds16.pds16asm.pds16asm.OperationsWithThreeRegisters;
import org.pds16.pds16asm.pds16asm.Org;
import org.pds16.pds16asm.pds16asm.PDS16ASM;
import org.pds16.pds16asm.pds16asm.Pds16asmPackage;
import org.pds16.pds16asm.pds16asm.Register;
import org.pds16.pds16asm.pds16asm.Ret;
import org.pds16.pds16asm.pds16asm.Section;
import org.pds16.pds16asm.pds16asm.Space;
import org.pds16.pds16asm.pds16asm.Text;
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
			case Pds16asmPackage.BSS:
				sequence_Bss(context, (Bss) semanticObject); 
				return; 
			case Pds16asmPackage.BYTE:
				sequence_Byte(context, (org.pds16.pds16asm.pds16asm.Byte) semanticObject); 
				return; 
			case Pds16asmPackage.CONST4_OR_LABEL:
				sequence_Const4OrLabel(context, (Const4OrLabel) semanticObject); 
				return; 
			case Pds16asmPackage.DATA:
				sequence_Data(context, (Data) semanticObject); 
				return; 
			case Pds16asmPackage.DIRECT:
				sequence_Direct(context, (Direct) semanticObject); 
				return; 
			case Pds16asmPackage.DIRECT_OR_LABEL:
				sequence_DirectOrLabel(context, (DirectOrLabel) semanticObject); 
				return; 
			case Pds16asmPackage.DIRECTIVE:
				sequence_Directive(context, (Directive) semanticObject); 
				return; 
			case Pds16asmPackage.END:
				sequence_End(context, (End) semanticObject); 
				return; 
			case Pds16asmPackage.EQU:
				sequence_Equ(context, (Equ) semanticObject); 
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
			case Pds16asmPackage.OPERATIONS_WITH_THREE_REGISTERS:
				sequence_OperationsWithThreeRegisters(context, (OperationsWithThreeRegisters) semanticObject); 
				return; 
			case Pds16asmPackage.ORG:
				sequence_Org(context, (Org) semanticObject); 
				return; 
			case Pds16asmPackage.PDS16ASM:
				sequence_PDS16ASM(context, (PDS16ASM) semanticObject); 
				return; 
			case Pds16asmPackage.REGISTER:
				if (rule == grammarAccess.getStatementRule()
						|| rule == grammarAccess.getInstructionsRule()) {
					sequence_BasedIndexed_Register(context, (Register) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getLoadRule()
						|| rule == grammarAccess.getStoreRule()
						|| rule == grammarAccess.getLdBasedIndexedRule()
						|| rule == grammarAccess.getStBasedIndexedRule()
						|| rule == grammarAccess.getBasedIndexedRule()) {
					sequence_BasedIndexed_Register(context, (Register) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getAritmeticaRule()
						|| rule == grammarAccess.getAddRule()
						|| rule == grammarAccess.getSubRule()
						|| rule == grammarAccess.getRegisterRule()) {
					sequence_Register(context, (Register) semanticObject); 
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
			case Pds16asmPackage.TEXT:
				sequence_Text(context, (Text) semanticObject); 
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
	 *     LabelDirective returns Ascii
	 *     Ascii returns Ascii
	 *
	 * Constraint:
	 *     (tag='.ascii' (values+=STRING values+=STRING*)?)
	 */
	protected void sequence_Ascii(ISerializationContext context, Ascii semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     LabelDirective returns Asciiz
	 *     Asciiz returns Asciiz
	 *
	 * Constraint:
	 *     (tag='.asciiz' (values+=STRING values+=STRING*)?)
	 */
	protected void sequence_Asciiz(ISerializationContext context, Asciiz semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Statement returns Register
	 *     Instructions returns Register
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
	 *             value='LR' | 
	 *             value='PSW' | 
	 *             value='PC'
	 *         ) 
	 *         (rbx=Register rix=Register)?
	 *     )
	 */
	protected void sequence_BasedIndexed_Register(ISerializationContext context, Register semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	// This method is commented out because it has the same signature as another method in this class.
	// This is probably a bug in Xtext's serializer, please report it here: 
	// https://bugs.eclipse.org/bugs/enter_bug.cgi?product=TMF
	//
	// Contexts:
	//     Load returns Register
	//     Store returns Register
	//     LdBasedIndexed returns Register
	//     StBasedIndexed returns Register
	//     BasedIndexed returns Register
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
	//             value='LR' | 
	//             value='PSW' | 
	//             value='PC'
	//         ) 
	//         rbx=Register 
	//         rix=Register
	//     )
	//
	// protected void sequence_BasedIndexed_Register(ISerializationContext context, Register semanticObject) { }
	
	/**
	 * Contexts:
	 *     Bss returns Bss
	 *
	 * Constraint:
	 *     tag='.bss'
	 */
	protected void sequence_Bss(ISerializationContext context, Bss semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, Pds16asmPackage.Literals.BSS__TAG) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Pds16asmPackage.Literals.BSS__TAG));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getBssAccess().getTagBssKeyword_0(), semanticObject.getTag());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     LabelDirective returns Byte
	 *     Byte returns Byte
	 *
	 * Constraint:
	 *     (tag='.byte' ((values+=ID | numbers+=Number) values+=ID? (numbers+=Number? values+=ID?)*)?)
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
	 *     Data returns Data
	 *
	 * Constraint:
	 *     tag='.data'
	 */
	protected void sequence_Data(ISerializationContext context, Data semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, Pds16asmPackage.Literals.DATA__TAG) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Pds16asmPackage.Literals.DATA__TAG));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getDataAccess().getTagDataKeyword_0(), semanticObject.getTag());
		feeder.finish();
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
	 *     (register=Register direct7=DirectOrLabel)
	 */
	protected void sequence_Direct(ISerializationContext context, Direct semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, Pds16asmPackage.Literals.DIRECT__REGISTER) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Pds16asmPackage.Literals.DIRECT__REGISTER));
			if (transientValues.isValueTransient(semanticObject, Pds16asmPackage.Literals.DIRECT__DIRECT7) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Pds16asmPackage.Literals.DIRECT__DIRECT7));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getDirectAccess().getRegisterRegisterParserRuleCall_0_0(), semanticObject.getRegister());
		feeder.accept(grammarAccess.getDirectAccess().getDirect7DirectOrLabelParserRuleCall_2_0(), semanticObject.getDirect7());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Statement returns Directive
	 *     Directive returns Directive
	 *
	 * Constraint:
	 *     (
	 *         value=Bss | 
	 *         value=Data | 
	 *         value=End | 
	 *         value=Text | 
	 *         value=Equ | 
	 *         value=Org | 
	 *         value=Section | 
	 *         value=Set | 
	 *         value=LabelDirective
	 *     )
	 */
	protected void sequence_Directive(ISerializationContext context, Directive semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     End returns End
	 *
	 * Constraint:
	 *     tag='.end'
	 */
	protected void sequence_End(ISerializationContext context, End semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, Pds16asmPackage.Literals.END__TAG) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Pds16asmPackage.Literals.END__TAG));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getEndAccess().getTagEndKeyword_0(), semanticObject.getTag());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Equ returns Equ
	 *
	 * Constraint:
	 *     (tag='.equ' id=ID value=Expression)
	 */
	protected void sequence_Equ(ISerializationContext context, Equ semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, Pds16asmPackage.Literals.EQU__TAG) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Pds16asmPackage.Literals.EQU__TAG));
			if (transientValues.isValueTransient(semanticObject, Pds16asmPackage.Literals.EQU__ID) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Pds16asmPackage.Literals.EQU__ID));
			if (transientValues.isValueTransient(semanticObject, Pds16asmPackage.Literals.EQU__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Pds16asmPackage.Literals.EQU__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getEquAccess().getTagEquKeyword_0_0(), semanticObject.getTag());
		feeder.accept(grammarAccess.getEquAccess().getIdIDTerminalRuleCall_1_0(), semanticObject.getId());
		feeder.accept(grammarAccess.getEquAccess().getValueExpressionParserRuleCall_3_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Expression returns Expression
	 *
	 * Constraint:
	 *     ((numericValue+=Number | idValue+=ID) (operand=OPERANDS expression=Expression)?)
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
	 *     (register=Register (immediate8=Immediate8OrLabel | lowORhigh=LowOrHight))
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
	 *     (rd=Register rbx=Register idx3=Idx3OrLabel)
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
		feeder.accept(grammarAccess.getIndexedAccess().getRdRegisterParserRuleCall_0_0(), semanticObject.getRd());
		feeder.accept(grammarAccess.getIndexedAccess().getRbxRegisterParserRuleCall_3_0(), semanticObject.getRbx());
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
	 *     (
	 *         (
	 *             tag='jz' | 
	 *             tag='je' | 
	 *             tag='jnz' | 
	 *             tag='jne' | 
	 *             tag='jc' | 
	 *             tag='jbl' | 
	 *             tag='jnc' | 
	 *             tag='jae' | 
	 *             tag='jmp' | 
	 *             tag='jmpl'
	 *         ) 
	 *         (opOff=OperationWithOffset | opId=ID)?
	 *     )
	 */
	protected void sequence_JumpOp(ISerializationContext context, JumpOp semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Statement returns Label
	 *     Label returns Label
	 *
	 * Constraint:
	 *     (labelName=IDLABEL (value=Label | value=LabelDirective | value=Instructions))
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
	 *     (rd=Register rm=Register const4=Const4OrLabel sin=Number)
	 */
	protected void sequence_OperationShift(ISerializationContext context, OperationShift semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, Pds16asmPackage.Literals.OPERATION_SHIFT__RD) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Pds16asmPackage.Literals.OPERATION_SHIFT__RD));
			if (transientValues.isValueTransient(semanticObject, Pds16asmPackage.Literals.OPERATION_SHIFT__RM) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Pds16asmPackage.Literals.OPERATION_SHIFT__RM));
			if (transientValues.isValueTransient(semanticObject, Pds16asmPackage.Literals.OPERATION_SHIFT__CONST4) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Pds16asmPackage.Literals.OPERATION_SHIFT__CONST4));
			if (transientValues.isValueTransient(semanticObject, Pds16asmPackage.Literals.OPERATION_SHIFT__SIN) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Pds16asmPackage.Literals.OPERATION_SHIFT__SIN));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getOperationShiftAccess().getRdRegisterParserRuleCall_0_0(), semanticObject.getRd());
		feeder.accept(grammarAccess.getOperationShiftAccess().getRmRegisterParserRuleCall_2_0(), semanticObject.getRm());
		feeder.accept(grammarAccess.getOperationShiftAccess().getConst4Const4OrLabelParserRuleCall_4_0(), semanticObject.getConst4());
		feeder.accept(grammarAccess.getOperationShiftAccess().getSinNumberParserRuleCall_6_0(), semanticObject.getSin());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     OperationWithOffset returns OperationWithOffset
	 *
	 * Constraint:
	 *     (rbx=Register offset8=Offset8OrLabel)
	 */
	protected void sequence_OperationWithOffset(ISerializationContext context, OperationWithOffset semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, Pds16asmPackage.Literals.OPERATION_WITH_OFFSET__RBX) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Pds16asmPackage.Literals.OPERATION_WITH_OFFSET__RBX));
			if (transientValues.isValueTransient(semanticObject, Pds16asmPackage.Literals.OPERATION_WITH_OFFSET__OFFSET8) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Pds16asmPackage.Literals.OPERATION_WITH_OFFSET__OFFSET8));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getOperationWithOffsetAccess().getRbxRegisterParserRuleCall_0_0(), semanticObject.getRbx());
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
	 *     (rd=Register rm=Register)
	 */
	protected void sequence_OperationWithTwoRegisters(ISerializationContext context, OperationWithTwoRegisters semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, Pds16asmPackage.Literals.ORL__RD) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Pds16asmPackage.Literals.ORL__RD));
			if (transientValues.isValueTransient(semanticObject, Pds16asmPackage.Literals.ORL__RM) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Pds16asmPackage.Literals.ORL__RM));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getOperationWithTwoRegistersAccess().getRdRegisterParserRuleCall_0_0(), semanticObject.getRd());
		feeder.accept(grammarAccess.getOperationWithTwoRegistersAccess().getRmRegisterParserRuleCall_2_0(), semanticObject.getRm());
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
	 *     (rd=Register rm=Register const4=Const4OrLabel)
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
		feeder.accept(grammarAccess.getOperationsWithConstantAccess().getRdRegisterParserRuleCall_0_0(), semanticObject.getRd());
		feeder.accept(grammarAccess.getOperationsWithConstantAccess().getRmRegisterParserRuleCall_2_0(), semanticObject.getRm());
		feeder.accept(grammarAccess.getOperationsWithConstantAccess().getConst4Const4OrLabelParserRuleCall_4_0(), semanticObject.getConst4());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Statement returns OperationsWithThreeRegisters
	 *     Instructions returns OperationsWithThreeRegisters
	 *     Aritmetica returns OperationsWithThreeRegisters
	 *     Logica returns OperationsWithThreeRegisters
	 *     Add returns OperationsWithThreeRegisters
	 *     Sub returns OperationsWithThreeRegisters
	 *     Anl returns OperationsWithThreeRegisters
	 *     Orl returns OperationsWithThreeRegisters
	 *     Xrl returns OperationsWithThreeRegisters
	 *     OperationsWithThreeRegisters returns OperationsWithThreeRegisters
	 *
	 * Constraint:
	 *     (rd=Register rm=Register rn=Register)
	 */
	protected void sequence_OperationsWithThreeRegisters(ISerializationContext context, OperationsWithThreeRegisters semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, Pds16asmPackage.Literals.ORL__RD) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Pds16asmPackage.Literals.ORL__RD));
			if (transientValues.isValueTransient(semanticObject, Pds16asmPackage.Literals.ORL__RM) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Pds16asmPackage.Literals.ORL__RM));
			if (transientValues.isValueTransient(semanticObject, Pds16asmPackage.Literals.OPERATIONS_WITH_THREE_REGISTERS__RN) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Pds16asmPackage.Literals.OPERATIONS_WITH_THREE_REGISTERS__RN));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getOperationsWithThreeRegistersAccess().getRdRegisterParserRuleCall_0_0(), semanticObject.getRd());
		feeder.accept(grammarAccess.getOperationsWithThreeRegistersAccess().getRmRegisterParserRuleCall_2_0(), semanticObject.getRm());
		feeder.accept(grammarAccess.getOperationsWithThreeRegistersAccess().getRnRegisterParserRuleCall_4_0(), semanticObject.getRn());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Org returns Org
	 *
	 * Constraint:
	 *     (tag='.org' value=Expression)
	 */
	protected void sequence_Org(ISerializationContext context, Org semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, Pds16asmPackage.Literals.ORG__TAG) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Pds16asmPackage.Literals.ORG__TAG));
			if (transientValues.isValueTransient(semanticObject, Pds16asmPackage.Literals.ORG__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Pds16asmPackage.Literals.ORG__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getOrgAccess().getTagOrgKeyword_0_0(), semanticObject.getTag());
		feeder.accept(grammarAccess.getOrgAccess().getValueExpressionParserRuleCall_1_0(), semanticObject.getValue());
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
	 *     Aritmetica returns Register
	 *     Add returns Register
	 *     Sub returns Register
	 *     Register returns Register
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
	 *         value='LR' | 
	 *         value='PSW' | 
	 *         value='PC'
	 *     )
	 */
	protected void sequence_Register(ISerializationContext context, Register semanticObject) {
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
	 *     Section returns Section
	 *
	 * Constraint:
	 *     (tag='.section' id=ID)
	 */
	protected void sequence_Section(ISerializationContext context, Section semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, Pds16asmPackage.Literals.SECTION__TAG) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Pds16asmPackage.Literals.SECTION__TAG));
			if (transientValues.isValueTransient(semanticObject, Pds16asmPackage.Literals.SECTION__ID) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Pds16asmPackage.Literals.SECTION__ID));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getSectionAccess().getTagSectionKeyword_0_0(), semanticObject.getTag());
		feeder.accept(grammarAccess.getSectionAccess().getIdIDTerminalRuleCall_1_0(), semanticObject.getId());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Set returns Set
	 *
	 * Constraint:
	 *     (tag='.set' id=ID value=Expression)
	 */
	protected void sequence_Set(ISerializationContext context, org.pds16.pds16asm.pds16asm.Set semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, Pds16asmPackage.Literals.SET__TAG) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Pds16asmPackage.Literals.SET__TAG));
			if (transientValues.isValueTransient(semanticObject, Pds16asmPackage.Literals.SET__ID) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Pds16asmPackage.Literals.SET__ID));
			if (transientValues.isValueTransient(semanticObject, Pds16asmPackage.Literals.SET__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Pds16asmPackage.Literals.SET__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getSetAccess().getTagSetKeyword_0_0(), semanticObject.getTag());
		feeder.accept(grammarAccess.getSetAccess().getIdIDTerminalRuleCall_1_0(), semanticObject.getId());
		feeder.accept(grammarAccess.getSetAccess().getValueExpressionParserRuleCall_3_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     LabelDirective returns Space
	 *     Space returns Space
	 *
	 * Constraint:
	 *     (tag='.space' size=Number byteValue=Number?)
	 */
	protected void sequence_Space(ISerializationContext context, Space semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Text returns Text
	 *
	 * Constraint:
	 *     tag='.text'
	 */
	protected void sequence_Text(ISerializationContext context, Text semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, Pds16asmPackage.Literals.TEXT__TAG) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Pds16asmPackage.Literals.TEXT__TAG));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getTextAccess().getTagTextKeyword_0(), semanticObject.getTag());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     LabelDirective returns Word
	 *     Word returns Word
	 *
	 * Constraint:
	 *     (tag='.word' ((values+=ID | numbers+=Number) values+=ID? (numbers+=Number? values+=ID?)*)?)
	 */
	protected void sequence_Word(ISerializationContext context, Word semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}
