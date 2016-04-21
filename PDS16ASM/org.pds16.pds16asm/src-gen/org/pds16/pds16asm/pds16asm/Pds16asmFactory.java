/**
 * generated by Xtext 2.10.0-SNAPSHOT
 */
package org.pds16.pds16asm.pds16asm;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.pds16.pds16asm.pds16asm.Pds16asmPackage
 * @generated
 */
public interface Pds16asmFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  Pds16asmFactory eINSTANCE = org.pds16.pds16asm.pds16asm.impl.Pds16asmFactoryImpl.init();

  /**
   * Returns a new object of class '<em>PDS16ASM</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>PDS16ASM</em>'.
   * @generated
   */
  PDS16ASM createPDS16ASM();

  /**
   * Returns a new object of class '<em>Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Statement</em>'.
   * @generated
   */
  Statement createStatement();

  /**
   * Returns a new object of class '<em>Label</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Label</em>'.
   * @generated
   */
  Label createLabel();

  /**
   * Returns a new object of class '<em>Directive</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Directive</em>'.
   * @generated
   */
  Directive createDirective();

  /**
   * Returns a new object of class '<em>Label Directive</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Label Directive</em>'.
   * @generated
   */
  LabelDirective createLabelDirective();

  /**
   * Returns a new object of class '<em>Ascii</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Ascii</em>'.
   * @generated
   */
  Ascii createAscii();

  /**
   * Returns a new object of class '<em>Asciiz</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Asciiz</em>'.
   * @generated
   */
  Asciiz createAsciiz();

  /**
   * Returns a new object of class '<em>Byte</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Byte</em>'.
   * @generated
   */
  Byte createByte();

  /**
   * Returns a new object of class '<em>Word</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Word</em>'.
   * @generated
   */
  Word createWord();

  /**
   * Returns a new object of class '<em>Space</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Space</em>'.
   * @generated
   */
  Space createSpace();

  /**
   * Returns a new object of class '<em>Set</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Set</em>'.
   * @generated
   */
  Set createSet();

  /**
   * Returns a new object of class '<em>Section</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Section</em>'.
   * @generated
   */
  Section createSection();

  /**
   * Returns a new object of class '<em>Org</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Org</em>'.
   * @generated
   */
  Org createOrg();

  /**
   * Returns a new object of class '<em>Equ</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Equ</em>'.
   * @generated
   */
  Equ createEqu();

  /**
   * Returns a new object of class '<em>Instructions</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Instructions</em>'.
   * @generated
   */
  Instructions createInstructions();

  /**
   * Returns a new object of class '<em>Load</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Load</em>'.
   * @generated
   */
  Load createLoad();

  /**
   * Returns a new object of class '<em>Store</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Store</em>'.
   * @generated
   */
  Store createStore();

  /**
   * Returns a new object of class '<em>Aritmetica</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Aritmetica</em>'.
   * @generated
   */
  Aritmetica createAritmetica();

  /**
   * Returns a new object of class '<em>Logica</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Logica</em>'.
   * @generated
   */
  Logica createLogica();

  /**
   * Returns a new object of class '<em>Jump</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Jump</em>'.
   * @generated
   */
  Jump createJump();

  /**
   * Returns a new object of class '<em>Ld Immediate</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Ld Immediate</em>'.
   * @generated
   */
  LdImmediate createLdImmediate();

  /**
   * Returns a new object of class '<em>Ld Direct</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Ld Direct</em>'.
   * @generated
   */
  LdDirect createLdDirect();

  /**
   * Returns a new object of class '<em>Ld Indexed</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Ld Indexed</em>'.
   * @generated
   */
  LdIndexed createLdIndexed();

  /**
   * Returns a new object of class '<em>Ld Based Indexed</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Ld Based Indexed</em>'.
   * @generated
   */
  LdBasedIndexed createLdBasedIndexed();

  /**
   * Returns a new object of class '<em>St Direct</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>St Direct</em>'.
   * @generated
   */
  StDirect createStDirect();

  /**
   * Returns a new object of class '<em>St Indexed</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>St Indexed</em>'.
   * @generated
   */
  StIndexed createStIndexed();

  /**
   * Returns a new object of class '<em>St Based Indexed</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>St Based Indexed</em>'.
   * @generated
   */
  StBasedIndexed createStBasedIndexed();

  /**
   * Returns a new object of class '<em>Add</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Add</em>'.
   * @generated
   */
  Add createAdd();

  /**
   * Returns a new object of class '<em>Sub</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Sub</em>'.
   * @generated
   */
  Sub createSub();

  /**
   * Returns a new object of class '<em>Anl</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Anl</em>'.
   * @generated
   */
  Anl createAnl();

  /**
   * Returns a new object of class '<em>Orl</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Orl</em>'.
   * @generated
   */
  Orl createOrl();

  /**
   * Returns a new object of class '<em>Xrl</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Xrl</em>'.
   * @generated
   */
  Xrl createXrl();

  /**
   * Returns a new object of class '<em>Not</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Not</em>'.
   * @generated
   */
  Not createNot();

  /**
   * Returns a new object of class '<em>Shl</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Shl</em>'.
   * @generated
   */
  Shl createShl();

  /**
   * Returns a new object of class '<em>Shr</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Shr</em>'.
   * @generated
   */
  Shr createShr();

  /**
   * Returns a new object of class '<em>Rr</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Rr</em>'.
   * @generated
   */
  Rr createRr();

  /**
   * Returns a new object of class '<em>Rc</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Rc</em>'.
   * @generated
   */
  Rc createRc();

  /**
   * Returns a new object of class '<em>Jump Op</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Jump Op</em>'.
   * @generated
   */
  JumpOp createJumpOp();

  /**
   * Returns a new object of class '<em>Nop</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Nop</em>'.
   * @generated
   */
  Nop createNop();

  /**
   * Returns a new object of class '<em>Ret</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Ret</em>'.
   * @generated
   */
  Ret createRet();

  /**
   * Returns a new object of class '<em>Immediate</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Immediate</em>'.
   * @generated
   */
  Immediate createImmediate();

  /**
   * Returns a new object of class '<em>Direct</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Direct</em>'.
   * @generated
   */
  Direct createDirect();

  /**
   * Returns a new object of class '<em>Indexed</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Indexed</em>'.
   * @generated
   */
  Indexed createIndexed();

  /**
   * Returns a new object of class '<em>Based Indexed</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Based Indexed</em>'.
   * @generated
   */
  BasedIndexed createBasedIndexed();

  /**
   * Returns a new object of class '<em>Direct Or Label</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Direct Or Label</em>'.
   * @generated
   */
  DirectOrLabel createDirectOrLabel();

  /**
   * Returns a new object of class '<em>Immediate8 Or Label</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Immediate8 Or Label</em>'.
   * @generated
   */
  Immediate8OrLabel createImmediate8OrLabel();

  /**
   * Returns a new object of class '<em>Idx3 Or Label</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Idx3 Or Label</em>'.
   * @generated
   */
  Idx3OrLabel createIdx3OrLabel();

  /**
   * Returns a new object of class '<em>Const4 Or Label</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Const4 Or Label</em>'.
   * @generated
   */
  Const4OrLabel createConst4OrLabel();

  /**
   * Returns a new object of class '<em>Offset8 Or Label</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Offset8 Or Label</em>'.
   * @generated
   */
  Offset8OrLabel createOffset8OrLabel();

  /**
   * Returns a new object of class '<em>Operation With Two Registers</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Operation With Two Registers</em>'.
   * @generated
   */
  OperationWithTwoRegisters createOperationWithTwoRegisters();

  /**
   * Returns a new object of class '<em>Operations With Tree Registers</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Operations With Tree Registers</em>'.
   * @generated
   */
  OperationsWithTreeRegisters createOperationsWithTreeRegisters();

  /**
   * Returns a new object of class '<em>Operations With Constant</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Operations With Constant</em>'.
   * @generated
   */
  OperationsWithConstant createOperationsWithConstant();

  /**
   * Returns a new object of class '<em>Operation Shift</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Operation Shift</em>'.
   * @generated
   */
  OperationShift createOperationShift();

  /**
   * Returns a new object of class '<em>Operation With Offset</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Operation With Offset</em>'.
   * @generated
   */
  OperationWithOffset createOperationWithOffset();

  /**
   * Returns a new object of class '<em>Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Expression</em>'.
   * @generated
   */
  Expression createExpression();

  /**
   * Returns a new object of class '<em>Low Or Hight</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Low Or Hight</em>'.
   * @generated
   */
  LowOrHight createLowOrHight();

  /**
   * Returns a new object of class '<em>Registers</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Registers</em>'.
   * @generated
   */
  Registers createRegisters();

  /**
   * Returns a new object of class '<em>Number</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Number</em>'.
   * @generated
   */
  Number createNumber();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  Pds16asmPackage getPds16asmPackage();

} //Pds16asmFactory
