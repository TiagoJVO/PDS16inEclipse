/**
 * generated by Xtext 2.9.2
 */
package org.pds16.pds16asm.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.pds16.pds16asm.Add;
import org.pds16.pds16asm.Anl;
import org.pds16.pds16asm.Aritmetica;
import org.pds16.pds16asm.Ascii;
import org.pds16.pds16asm.Asciiz;
import org.pds16.pds16asm.BasedIndexed;
import org.pds16.pds16asm.Direct;
import org.pds16.pds16asm.Directive;
import org.pds16.pds16asm.Equ;
import org.pds16.pds16asm.Expression;
import org.pds16.pds16asm.Immediate;
import org.pds16.pds16asm.Indexed;
import org.pds16.pds16asm.Instructions;
import org.pds16.pds16asm.IntOrHexOrString;
import org.pds16.pds16asm.Jump;
import org.pds16.pds16asm.JumpOp;
import org.pds16.pds16asm.Label;
import org.pds16.pds16asm.LabelDirective;
import org.pds16.pds16asm.LdBasedIndexed;
import org.pds16.pds16asm.LdDirect;
import org.pds16.pds16asm.LdImmediate;
import org.pds16.pds16asm.LdIndexed;
import org.pds16.pds16asm.Load;
import org.pds16.pds16asm.Logica;
import org.pds16.pds16asm.LowOrHight;
import org.pds16.pds16asm.Not;
import org.pds16.pds16asm.OperationShift;
import org.pds16.pds16asm.OperationWithOffset;
import org.pds16.pds16asm.OperationWithTwoRegisters;
import org.pds16.pds16asm.OperationsWithConstant;
import org.pds16.pds16asm.OperationsWithTreeRegisters;
import org.pds16.pds16asm.Org;
import org.pds16.pds16asm.Orl;
import org.pds16.pds16asm.PDS16ASM;
import org.pds16.pds16asm.Pds16asmFactory;
import org.pds16.pds16asm.Pds16asmPackage;
import org.pds16.pds16asm.Rc;
import org.pds16.pds16asm.Registers;
import org.pds16.pds16asm.Rr;
import org.pds16.pds16asm.Section;
import org.pds16.pds16asm.Set;
import org.pds16.pds16asm.Shl;
import org.pds16.pds16asm.Shr;
import org.pds16.pds16asm.Space;
import org.pds16.pds16asm.StBasedIndexed;
import org.pds16.pds16asm.StDirect;
import org.pds16.pds16asm.StIndexed;
import org.pds16.pds16asm.Statement;
import org.pds16.pds16asm.Store;
import org.pds16.pds16asm.Sub;
import org.pds16.pds16asm.Word;
import org.pds16.pds16asm.Xrl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Pds16asmFactoryImpl extends EFactoryImpl implements Pds16asmFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static Pds16asmFactory init()
  {
    try
    {
      Pds16asmFactory thePds16asmFactory = (Pds16asmFactory)EPackage.Registry.INSTANCE.getEFactory(Pds16asmPackage.eNS_URI);
      if (thePds16asmFactory != null)
      {
        return thePds16asmFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new Pds16asmFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Pds16asmFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case Pds16asmPackage.PDS16ASM: return createPDS16ASM();
      case Pds16asmPackage.STATEMENT: return createStatement();
      case Pds16asmPackage.LABEL: return createLabel();
      case Pds16asmPackage.DIRECTIVE: return createDirective();
      case Pds16asmPackage.LABEL_DIRECTIVE: return createLabelDirective();
      case Pds16asmPackage.ASCII: return createAscii();
      case Pds16asmPackage.ASCIIZ: return createAsciiz();
      case Pds16asmPackage.BYTE: return createByte();
      case Pds16asmPackage.WORD: return createWord();
      case Pds16asmPackage.SPACE: return createSpace();
      case Pds16asmPackage.SET: return createSet();
      case Pds16asmPackage.SECTION: return createSection();
      case Pds16asmPackage.ORG: return createOrg();
      case Pds16asmPackage.EQU: return createEqu();
      case Pds16asmPackage.INSTRUCTIONS: return createInstructions();
      case Pds16asmPackage.LOAD: return createLoad();
      case Pds16asmPackage.STORE: return createStore();
      case Pds16asmPackage.ARITMETICA: return createAritmetica();
      case Pds16asmPackage.LOGICA: return createLogica();
      case Pds16asmPackage.JUMP: return createJump();
      case Pds16asmPackage.LD_IMMEDIATE: return createLdImmediate();
      case Pds16asmPackage.LD_DIRECT: return createLdDirect();
      case Pds16asmPackage.LD_INDEXED: return createLdIndexed();
      case Pds16asmPackage.LD_BASED_INDEXED: return createLdBasedIndexed();
      case Pds16asmPackage.ST_DIRECT: return createStDirect();
      case Pds16asmPackage.ST_INDEXED: return createStIndexed();
      case Pds16asmPackage.ST_BASED_INDEXED: return createStBasedIndexed();
      case Pds16asmPackage.ADD: return createAdd();
      case Pds16asmPackage.SUB: return createSub();
      case Pds16asmPackage.ANL: return createAnl();
      case Pds16asmPackage.ORL: return createOrl();
      case Pds16asmPackage.XRL: return createXrl();
      case Pds16asmPackage.NOT: return createNot();
      case Pds16asmPackage.SHL: return createShl();
      case Pds16asmPackage.SHR: return createShr();
      case Pds16asmPackage.RR: return createRr();
      case Pds16asmPackage.RC: return createRc();
      case Pds16asmPackage.JUMP_OP: return createJumpOp();
      case Pds16asmPackage.IMMEDIATE: return createImmediate();
      case Pds16asmPackage.DIRECT: return createDirect();
      case Pds16asmPackage.INDEXED: return createIndexed();
      case Pds16asmPackage.BASED_INDEXED: return createBasedIndexed();
      case Pds16asmPackage.INT_OR_HEX_OR_STRING: return createIntOrHexOrString();
      case Pds16asmPackage.OPERATION_WITH_TWO_REGISTERS: return createOperationWithTwoRegisters();
      case Pds16asmPackage.OPERATIONS_WITH_TREE_REGISTERS: return createOperationsWithTreeRegisters();
      case Pds16asmPackage.OPERATIONS_WITH_CONSTANT: return createOperationsWithConstant();
      case Pds16asmPackage.OPERATION_SHIFT: return createOperationShift();
      case Pds16asmPackage.OPERATION_WITH_OFFSET: return createOperationWithOffset();
      case Pds16asmPackage.EXPRESSION: return createExpression();
      case Pds16asmPackage.LOW_OR_HIGHT: return createLowOrHight();
      case Pds16asmPackage.REGISTERS: return createRegisters();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PDS16ASM createPDS16ASM()
  {
    PDS16ASMImpl pds16ASM = new PDS16ASMImpl();
    return pds16ASM;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Statement createStatement()
  {
    StatementImpl statement = new StatementImpl();
    return statement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Label createLabel()
  {
    LabelImpl label = new LabelImpl();
    return label;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Directive createDirective()
  {
    DirectiveImpl directive = new DirectiveImpl();
    return directive;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LabelDirective createLabelDirective()
  {
    LabelDirectiveImpl labelDirective = new LabelDirectiveImpl();
    return labelDirective;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Ascii createAscii()
  {
    AsciiImpl ascii = new AsciiImpl();
    return ascii;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Asciiz createAsciiz()
  {
    AsciizImpl asciiz = new AsciizImpl();
    return asciiz;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public org.pds16.pds16asm.Byte createByte()
  {
    ByteImpl byte_ = new ByteImpl();
    return byte_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Word createWord()
  {
    WordImpl word = new WordImpl();
    return word;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Space createSpace()
  {
    SpaceImpl space = new SpaceImpl();
    return space;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Set createSet()
  {
    SetImpl set = new SetImpl();
    return set;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Section createSection()
  {
    SectionImpl section = new SectionImpl();
    return section;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Org createOrg()
  {
    OrgImpl org = new OrgImpl();
    return org;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Equ createEqu()
  {
    EquImpl equ = new EquImpl();
    return equ;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Instructions createInstructions()
  {
    InstructionsImpl instructions = new InstructionsImpl();
    return instructions;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Load createLoad()
  {
    LoadImpl load = new LoadImpl();
    return load;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Store createStore()
  {
    StoreImpl store = new StoreImpl();
    return store;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Aritmetica createAritmetica()
  {
    AritmeticaImpl aritmetica = new AritmeticaImpl();
    return aritmetica;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Logica createLogica()
  {
    LogicaImpl logica = new LogicaImpl();
    return logica;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Jump createJump()
  {
    JumpImpl jump = new JumpImpl();
    return jump;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LdImmediate createLdImmediate()
  {
    LdImmediateImpl ldImmediate = new LdImmediateImpl();
    return ldImmediate;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LdDirect createLdDirect()
  {
    LdDirectImpl ldDirect = new LdDirectImpl();
    return ldDirect;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LdIndexed createLdIndexed()
  {
    LdIndexedImpl ldIndexed = new LdIndexedImpl();
    return ldIndexed;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LdBasedIndexed createLdBasedIndexed()
  {
    LdBasedIndexedImpl ldBasedIndexed = new LdBasedIndexedImpl();
    return ldBasedIndexed;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StDirect createStDirect()
  {
    StDirectImpl stDirect = new StDirectImpl();
    return stDirect;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StIndexed createStIndexed()
  {
    StIndexedImpl stIndexed = new StIndexedImpl();
    return stIndexed;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StBasedIndexed createStBasedIndexed()
  {
    StBasedIndexedImpl stBasedIndexed = new StBasedIndexedImpl();
    return stBasedIndexed;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Add createAdd()
  {
    AddImpl add = new AddImpl();
    return add;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Sub createSub()
  {
    SubImpl sub = new SubImpl();
    return sub;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Anl createAnl()
  {
    AnlImpl anl = new AnlImpl();
    return anl;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Orl createOrl()
  {
    OrlImpl orl = new OrlImpl();
    return orl;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Xrl createXrl()
  {
    XrlImpl xrl = new XrlImpl();
    return xrl;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Not createNot()
  {
    NotImpl not = new NotImpl();
    return not;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Shl createShl()
  {
    ShlImpl shl = new ShlImpl();
    return shl;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Shr createShr()
  {
    ShrImpl shr = new ShrImpl();
    return shr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Rr createRr()
  {
    RrImpl rr = new RrImpl();
    return rr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Rc createRc()
  {
    RcImpl rc = new RcImpl();
    return rc;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public JumpOp createJumpOp()
  {
    JumpOpImpl jumpOp = new JumpOpImpl();
    return jumpOp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Immediate createImmediate()
  {
    ImmediateImpl immediate = new ImmediateImpl();
    return immediate;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Direct createDirect()
  {
    DirectImpl direct = new DirectImpl();
    return direct;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Indexed createIndexed()
  {
    IndexedImpl indexed = new IndexedImpl();
    return indexed;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BasedIndexed createBasedIndexed()
  {
    BasedIndexedImpl basedIndexed = new BasedIndexedImpl();
    return basedIndexed;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IntOrHexOrString createIntOrHexOrString()
  {
    IntOrHexOrStringImpl intOrHexOrString = new IntOrHexOrStringImpl();
    return intOrHexOrString;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OperationWithTwoRegisters createOperationWithTwoRegisters()
  {
    OperationWithTwoRegistersImpl operationWithTwoRegisters = new OperationWithTwoRegistersImpl();
    return operationWithTwoRegisters;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OperationsWithTreeRegisters createOperationsWithTreeRegisters()
  {
    OperationsWithTreeRegistersImpl operationsWithTreeRegisters = new OperationsWithTreeRegistersImpl();
    return operationsWithTreeRegisters;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OperationsWithConstant createOperationsWithConstant()
  {
    OperationsWithConstantImpl operationsWithConstant = new OperationsWithConstantImpl();
    return operationsWithConstant;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OperationShift createOperationShift()
  {
    OperationShiftImpl operationShift = new OperationShiftImpl();
    return operationShift;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OperationWithOffset createOperationWithOffset()
  {
    OperationWithOffsetImpl operationWithOffset = new OperationWithOffsetImpl();
    return operationWithOffset;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression createExpression()
  {
    ExpressionImpl expression = new ExpressionImpl();
    return expression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LowOrHight createLowOrHight()
  {
    LowOrHightImpl lowOrHight = new LowOrHightImpl();
    return lowOrHight;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Registers createRegisters()
  {
    RegistersImpl registers = new RegistersImpl();
    return registers;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Pds16asmPackage getPds16asmPackage()
  {
    return (Pds16asmPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static Pds16asmPackage getPackage()
  {
    return Pds16asmPackage.eINSTANCE;
  }

} //Pds16asmFactoryImpl
