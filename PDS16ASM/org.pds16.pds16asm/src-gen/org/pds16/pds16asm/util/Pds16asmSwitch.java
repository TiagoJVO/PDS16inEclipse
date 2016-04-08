/**
 * generated by Xtext 2.9.2
 */
package org.pds16.pds16asm.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.pds16.pds16asm.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.pds16.pds16asm.Pds16asmPackage
 * @generated
 */
public class Pds16asmSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static Pds16asmPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Pds16asmSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = Pds16asmPackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @parameter ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case Pds16asmPackage.PDS16ASM:
      {
        PDS16ASM pds16ASM = (PDS16ASM)theEObject;
        T result = casePDS16ASM(pds16ASM);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Pds16asmPackage.INSTRUCTIONS:
      {
        Instructions instructions = (Instructions)theEObject;
        T result = caseInstructions(instructions);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Pds16asmPackage.LOAD:
      {
        Load load = (Load)theEObject;
        T result = caseLoad(load);
        if (result == null) result = caseInstructions(load);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Pds16asmPackage.STORE:
      {
        Store store = (Store)theEObject;
        T result = caseStore(store);
        if (result == null) result = caseInstructions(store);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Pds16asmPackage.ARITMETICA:
      {
        Aritmetica aritmetica = (Aritmetica)theEObject;
        T result = caseAritmetica(aritmetica);
        if (result == null) result = caseInstructions(aritmetica);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Pds16asmPackage.LOGICA:
      {
        Logica logica = (Logica)theEObject;
        T result = caseLogica(logica);
        if (result == null) result = caseInstructions(logica);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Pds16asmPackage.JUMP:
      {
        Jump jump = (Jump)theEObject;
        T result = caseJump(jump);
        if (result == null) result = caseInstructions(jump);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Pds16asmPackage.LD_IMMEDIATE:
      {
        LdImmediate ldImmediate = (LdImmediate)theEObject;
        T result = caseLdImmediate(ldImmediate);
        if (result == null) result = caseLoad(ldImmediate);
        if (result == null) result = caseInstructions(ldImmediate);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Pds16asmPackage.LD_DIRECT:
      {
        LdDirect ldDirect = (LdDirect)theEObject;
        T result = caseLdDirect(ldDirect);
        if (result == null) result = caseLoad(ldDirect);
        if (result == null) result = caseInstructions(ldDirect);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Pds16asmPackage.LD_INDEXED:
      {
        LdIndexed ldIndexed = (LdIndexed)theEObject;
        T result = caseLdIndexed(ldIndexed);
        if (result == null) result = caseLoad(ldIndexed);
        if (result == null) result = caseInstructions(ldIndexed);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Pds16asmPackage.LD_BASED_INDEXED:
      {
        LdBasedIndexed ldBasedIndexed = (LdBasedIndexed)theEObject;
        T result = caseLdBasedIndexed(ldBasedIndexed);
        if (result == null) result = caseLoad(ldBasedIndexed);
        if (result == null) result = caseInstructions(ldBasedIndexed);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Pds16asmPackage.ST_DIRECT:
      {
        StDirect stDirect = (StDirect)theEObject;
        T result = caseStDirect(stDirect);
        if (result == null) result = caseStore(stDirect);
        if (result == null) result = caseInstructions(stDirect);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Pds16asmPackage.ST_INDEXED:
      {
        StIndexed stIndexed = (StIndexed)theEObject;
        T result = caseStIndexed(stIndexed);
        if (result == null) result = caseStore(stIndexed);
        if (result == null) result = caseInstructions(stIndexed);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Pds16asmPackage.ST_BASED_INDEXED:
      {
        StBasedIndexed stBasedIndexed = (StBasedIndexed)theEObject;
        T result = caseStBasedIndexed(stBasedIndexed);
        if (result == null) result = caseStore(stBasedIndexed);
        if (result == null) result = caseInstructions(stBasedIndexed);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Pds16asmPackage.ADD_REGISTERS:
      {
        AddRegisters addRegisters = (AddRegisters)theEObject;
        T result = caseAddRegisters(addRegisters);
        if (result == null) result = caseAritmetica(addRegisters);
        if (result == null) result = caseInstructions(addRegisters);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Pds16asmPackage.ADD_CONSTANT:
      {
        AddConstant addConstant = (AddConstant)theEObject;
        T result = caseAddConstant(addConstant);
        if (result == null) result = caseAritmetica(addConstant);
        if (result == null) result = caseInstructions(addConstant);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Pds16asmPackage.SUB_REGISTERS:
      {
        SubRegisters subRegisters = (SubRegisters)theEObject;
        T result = caseSubRegisters(subRegisters);
        if (result == null) result = caseAritmetica(subRegisters);
        if (result == null) result = caseInstructions(subRegisters);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Pds16asmPackage.SUB_CONSTANT:
      {
        SubConstant subConstant = (SubConstant)theEObject;
        T result = caseSubConstant(subConstant);
        if (result == null) result = caseAritmetica(subConstant);
        if (result == null) result = caseInstructions(subConstant);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Pds16asmPackage.ANL:
      {
        ANL anl = (ANL)theEObject;
        T result = caseANL(anl);
        if (result == null) result = caseLogica(anl);
        if (result == null) result = caseInstructions(anl);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Pds16asmPackage.ORL:
      {
        ORL orl = (ORL)theEObject;
        T result = caseORL(orl);
        if (result == null) result = caseLogica(orl);
        if (result == null) result = caseInstructions(orl);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Pds16asmPackage.XRL:
      {
        XRL xrl = (XRL)theEObject;
        T result = caseXRL(xrl);
        if (result == null) result = caseLogica(xrl);
        if (result == null) result = caseInstructions(xrl);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Pds16asmPackage.NOT:
      {
        NOT not = (NOT)theEObject;
        T result = caseNOT(not);
        if (result == null) result = caseLogica(not);
        if (result == null) result = caseInstructions(not);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Pds16asmPackage.SHL:
      {
        SHL shl = (SHL)theEObject;
        T result = caseSHL(shl);
        if (result == null) result = caseLogica(shl);
        if (result == null) result = caseInstructions(shl);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Pds16asmPackage.SHR:
      {
        SHR shr = (SHR)theEObject;
        T result = caseSHR(shr);
        if (result == null) result = caseLogica(shr);
        if (result == null) result = caseInstructions(shr);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Pds16asmPackage.RR:
      {
        RR rr = (RR)theEObject;
        T result = caseRR(rr);
        if (result == null) result = caseLogica(rr);
        if (result == null) result = caseInstructions(rr);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Pds16asmPackage.RC:
      {
        RC rc = (RC)theEObject;
        T result = caseRC(rc);
        if (result == null) result = caseLogica(rc);
        if (result == null) result = caseInstructions(rc);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Pds16asmPackage.JUMP_OP:
      {
        JumpOp jumpOp = (JumpOp)theEObject;
        T result = caseJumpOp(jumpOp);
        if (result == null) result = caseJump(jumpOp);
        if (result == null) result = caseInstructions(jumpOp);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Pds16asmPackage.IMMEDIATE:
      {
        Immediate immediate = (Immediate)theEObject;
        T result = caseImmediate(immediate);
        if (result == null) result = caseLdImmediate(immediate);
        if (result == null) result = caseLoad(immediate);
        if (result == null) result = caseInstructions(immediate);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Pds16asmPackage.DIRECT:
      {
        Direct direct = (Direct)theEObject;
        T result = caseDirect(direct);
        if (result == null) result = caseLdDirect(direct);
        if (result == null) result = caseStDirect(direct);
        if (result == null) result = caseLoad(direct);
        if (result == null) result = caseStore(direct);
        if (result == null) result = caseInstructions(direct);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Pds16asmPackage.INDEXED:
      {
        Indexed indexed = (Indexed)theEObject;
        T result = caseIndexed(indexed);
        if (result == null) result = caseLdIndexed(indexed);
        if (result == null) result = caseStIndexed(indexed);
        if (result == null) result = caseLoad(indexed);
        if (result == null) result = caseStore(indexed);
        if (result == null) result = caseInstructions(indexed);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Pds16asmPackage.BASED_INDEXED:
      {
        BasedIndexed basedIndexed = (BasedIndexed)theEObject;
        T result = caseBasedIndexed(basedIndexed);
        if (result == null) result = caseLdBasedIndexed(basedIndexed);
        if (result == null) result = caseStBasedIndexed(basedIndexed);
        if (result == null) result = caseLoad(basedIndexed);
        if (result == null) result = caseStore(basedIndexed);
        if (result == null) result = caseInstructions(basedIndexed);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Pds16asmPackage.HEXA_DECIMAL:
      {
        HexaDecimal hexaDecimal = (HexaDecimal)theEObject;
        T result = caseHexaDecimal(hexaDecimal);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Pds16asmPackage.OPERATION_WITH_TWO_REGISTERS:
      {
        operationWithTwoRegisters operationWithTwoRegisters = (operationWithTwoRegisters)theEObject;
        T result = caseoperationWithTwoRegisters(operationWithTwoRegisters);
        if (result == null) result = caseNOT(operationWithTwoRegisters);
        if (result == null) result = caseRC(operationWithTwoRegisters);
        if (result == null) result = caseLogica(operationWithTwoRegisters);
        if (result == null) result = caseInstructions(operationWithTwoRegisters);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Pds16asmPackage.OPERATIONS_WITH_TREE_REGISTERS:
      {
        operationsWithTreeRegisters operationsWithTreeRegisters = (operationsWithTreeRegisters)theEObject;
        T result = caseoperationsWithTreeRegisters(operationsWithTreeRegisters);
        if (result == null) result = caseAddRegisters(operationsWithTreeRegisters);
        if (result == null) result = caseSubRegisters(operationsWithTreeRegisters);
        if (result == null) result = caseANL(operationsWithTreeRegisters);
        if (result == null) result = caseORL(operationsWithTreeRegisters);
        if (result == null) result = caseXRL(operationsWithTreeRegisters);
        if (result == null) result = caseAritmetica(operationsWithTreeRegisters);
        if (result == null) result = caseLogica(operationsWithTreeRegisters);
        if (result == null) result = caseInstructions(operationsWithTreeRegisters);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Pds16asmPackage.OPERATIONS_WITH_CONSTANT:
      {
        operationsWithConstant operationsWithConstant = (operationsWithConstant)theEObject;
        T result = caseoperationsWithConstant(operationsWithConstant);
        if (result == null) result = caseAddConstant(operationsWithConstant);
        if (result == null) result = caseSubConstant(operationsWithConstant);
        if (result == null) result = caseRR(operationsWithConstant);
        if (result == null) result = caseAritmetica(operationsWithConstant);
        if (result == null) result = caseLogica(operationsWithConstant);
        if (result == null) result = caseInstructions(operationsWithConstant);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Pds16asmPackage.OPERATION_SHIFT:
      {
        operationShift operationShift = (operationShift)theEObject;
        T result = caseoperationShift(operationShift);
        if (result == null) result = caseSHL(operationShift);
        if (result == null) result = caseSHR(operationShift);
        if (result == null) result = caseLogica(operationShift);
        if (result == null) result = caseInstructions(operationShift);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Pds16asmPackage.OPERATION_WITH_OFFSET:
      {
        operationWithOffset operationWithOffset = (operationWithOffset)theEObject;
        T result = caseoperationWithOffset(operationWithOffset);
        if (result == null) result = caseJumpOp(operationWithOffset);
        if (result == null) result = caseJump(operationWithOffset);
        if (result == null) result = caseInstructions(operationWithOffset);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Pds16asmPackage.COMMENT:
      {
        Comment comment = (Comment)theEObject;
        T result = caseComment(comment);
        if (result == null) result = caseInstructions(comment);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Pds16asmPackage.REGISTERS:
      {
        Registers registers = (Registers)theEObject;
        T result = caseRegisters(registers);
        if (result == null) result = caseBasedIndexed(registers);
        if (result == null) result = caseLdBasedIndexed(registers);
        if (result == null) result = caseStBasedIndexed(registers);
        if (result == null) result = caseLoad(registers);
        if (result == null) result = caseStore(registers);
        if (result == null) result = caseInstructions(registers);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>PDS16ASM</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>PDS16ASM</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePDS16ASM(PDS16ASM object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Instructions</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Instructions</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInstructions(Instructions object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Load</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Load</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLoad(Load object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Store</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Store</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStore(Store object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Aritmetica</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Aritmetica</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAritmetica(Aritmetica object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Logica</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Logica</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLogica(Logica object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Jump</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Jump</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseJump(Jump object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Ld Immediate</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Ld Immediate</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLdImmediate(LdImmediate object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Ld Direct</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Ld Direct</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLdDirect(LdDirect object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Ld Indexed</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Ld Indexed</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLdIndexed(LdIndexed object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Ld Based Indexed</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Ld Based Indexed</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLdBasedIndexed(LdBasedIndexed object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>St Direct</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>St Direct</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStDirect(StDirect object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>St Indexed</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>St Indexed</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStIndexed(StIndexed object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>St Based Indexed</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>St Based Indexed</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStBasedIndexed(StBasedIndexed object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Add Registers</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Add Registers</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAddRegisters(AddRegisters object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Add Constant</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Add Constant</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAddConstant(AddConstant object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Sub Registers</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Sub Registers</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSubRegisters(SubRegisters object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Sub Constant</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Sub Constant</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSubConstant(SubConstant object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>ANL</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>ANL</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseANL(ANL object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>ORL</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>ORL</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseORL(ORL object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>XRL</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>XRL</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseXRL(XRL object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>NOT</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>NOT</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNOT(NOT object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>SHL</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>SHL</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSHL(SHL object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>SHR</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>SHR</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSHR(SHR object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>RR</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>RR</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRR(RR object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>RC</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>RC</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRC(RC object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Jump Op</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Jump Op</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseJumpOp(JumpOp object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Immediate</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Immediate</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseImmediate(Immediate object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Direct</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Direct</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDirect(Direct object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Indexed</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Indexed</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseIndexed(Indexed object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Based Indexed</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Based Indexed</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBasedIndexed(BasedIndexed object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Hexa Decimal</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Hexa Decimal</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseHexaDecimal(HexaDecimal object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>operation With Two Registers</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>operation With Two Registers</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseoperationWithTwoRegisters(operationWithTwoRegisters object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>operations With Tree Registers</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>operations With Tree Registers</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseoperationsWithTreeRegisters(operationsWithTreeRegisters object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>operations With Constant</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>operations With Constant</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseoperationsWithConstant(operationsWithConstant object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>operation Shift</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>operation Shift</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseoperationShift(operationShift object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>operation With Offset</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>operation With Offset</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseoperationWithOffset(operationWithOffset object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Comment</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Comment</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseComment(Comment object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Registers</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Registers</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRegisters(Registers object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} //Pds16asmSwitch
