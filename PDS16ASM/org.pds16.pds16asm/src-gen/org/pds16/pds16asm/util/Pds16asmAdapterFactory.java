/**
 * generated by Xtext 2.9.2
 */
package org.pds16.pds16asm.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.pds16.pds16asm.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.pds16.pds16asm.Pds16asmPackage
 * @generated
 */
public class Pds16asmAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static Pds16asmPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Pds16asmAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = Pds16asmPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected Pds16asmSwitch<Adapter> modelSwitch =
    new Pds16asmSwitch<Adapter>()
    {
      @Override
      public Adapter casePDS16ASM(PDS16ASM object)
      {
        return createPDS16ASMAdapter();
      }
      @Override
      public Adapter caseStatement(Statement object)
      {
        return createStatementAdapter();
      }
      @Override
      public Adapter caseInstructions(Instructions object)
      {
        return createInstructionsAdapter();
      }
      @Override
      public Adapter caseComment(Comment object)
      {
        return createCommentAdapter();
      }
      @Override
      public Adapter caseLoad(Load object)
      {
        return createLoadAdapter();
      }
      @Override
      public Adapter caseStore(Store object)
      {
        return createStoreAdapter();
      }
      @Override
      public Adapter caseAritmetica(Aritmetica object)
      {
        return createAritmeticaAdapter();
      }
      @Override
      public Adapter caseLogica(Logica object)
      {
        return createLogicaAdapter();
      }
      @Override
      public Adapter caseJump(Jump object)
      {
        return createJumpAdapter();
      }
      @Override
      public Adapter caseLdImmediate(LdImmediate object)
      {
        return createLdImmediateAdapter();
      }
      @Override
      public Adapter caseLdDirect(LdDirect object)
      {
        return createLdDirectAdapter();
      }
      @Override
      public Adapter caseLdIndexed(LdIndexed object)
      {
        return createLdIndexedAdapter();
      }
      @Override
      public Adapter caseLdBasedIndexed(LdBasedIndexed object)
      {
        return createLdBasedIndexedAdapter();
      }
      @Override
      public Adapter caseStDirect(StDirect object)
      {
        return createStDirectAdapter();
      }
      @Override
      public Adapter caseStIndexed(StIndexed object)
      {
        return createStIndexedAdapter();
      }
      @Override
      public Adapter caseStBasedIndexed(StBasedIndexed object)
      {
        return createStBasedIndexedAdapter();
      }
      @Override
      public Adapter caseAdd(Add object)
      {
        return createAddAdapter();
      }
      @Override
      public Adapter caseSub(Sub object)
      {
        return createSubAdapter();
      }
      @Override
      public Adapter caseAnl(Anl object)
      {
        return createAnlAdapter();
      }
      @Override
      public Adapter caseOrl(Orl object)
      {
        return createOrlAdapter();
      }
      @Override
      public Adapter caseXrl(Xrl object)
      {
        return createXrlAdapter();
      }
      @Override
      public Adapter caseNot(Not object)
      {
        return createNotAdapter();
      }
      @Override
      public Adapter caseShl(Shl object)
      {
        return createShlAdapter();
      }
      @Override
      public Adapter caseShr(Shr object)
      {
        return createShrAdapter();
      }
      @Override
      public Adapter caseRr(Rr object)
      {
        return createRrAdapter();
      }
      @Override
      public Adapter caseRc(Rc object)
      {
        return createRcAdapter();
      }
      @Override
      public Adapter caseJumpOp(JumpOp object)
      {
        return createJumpOpAdapter();
      }
      @Override
      public Adapter caseImmediate(Immediate object)
      {
        return createImmediateAdapter();
      }
      @Override
      public Adapter caseDirect(Direct object)
      {
        return createDirectAdapter();
      }
      @Override
      public Adapter caseIndexed(Indexed object)
      {
        return createIndexedAdapter();
      }
      @Override
      public Adapter caseBasedIndexed(BasedIndexed object)
      {
        return createBasedIndexedAdapter();
      }
      @Override
      public Adapter caseIntOrHexOrString(IntOrHexOrString object)
      {
        return createIntOrHexOrStringAdapter();
      }
      @Override
      public Adapter caseOperationWithTwoRegisters(OperationWithTwoRegisters object)
      {
        return createOperationWithTwoRegistersAdapter();
      }
      @Override
      public Adapter caseOperationsWithTreeRegisters(OperationsWithTreeRegisters object)
      {
        return createOperationsWithTreeRegistersAdapter();
      }
      @Override
      public Adapter caseOperationsWithConstant(OperationsWithConstant object)
      {
        return createOperationsWithConstantAdapter();
      }
      @Override
      public Adapter caseOperationShift(OperationShift object)
      {
        return createOperationShiftAdapter();
      }
      @Override
      public Adapter caseOperationWithOffset(OperationWithOffset object)
      {
        return createOperationWithOffsetAdapter();
      }
      @Override
      public Adapter caseRegisters(Registers object)
      {
        return createRegistersAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link org.pds16.pds16asm.PDS16ASM <em>PDS16ASM</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.pds16.pds16asm.PDS16ASM
   * @generated
   */
  public Adapter createPDS16ASMAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.pds16.pds16asm.Statement <em>Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.pds16.pds16asm.Statement
   * @generated
   */
  public Adapter createStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.pds16.pds16asm.Instructions <em>Instructions</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.pds16.pds16asm.Instructions
   * @generated
   */
  public Adapter createInstructionsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.pds16.pds16asm.Comment <em>Comment</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.pds16.pds16asm.Comment
   * @generated
   */
  public Adapter createCommentAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.pds16.pds16asm.Load <em>Load</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.pds16.pds16asm.Load
   * @generated
   */
  public Adapter createLoadAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.pds16.pds16asm.Store <em>Store</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.pds16.pds16asm.Store
   * @generated
   */
  public Adapter createStoreAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.pds16.pds16asm.Aritmetica <em>Aritmetica</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.pds16.pds16asm.Aritmetica
   * @generated
   */
  public Adapter createAritmeticaAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.pds16.pds16asm.Logica <em>Logica</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.pds16.pds16asm.Logica
   * @generated
   */
  public Adapter createLogicaAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.pds16.pds16asm.Jump <em>Jump</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.pds16.pds16asm.Jump
   * @generated
   */
  public Adapter createJumpAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.pds16.pds16asm.LdImmediate <em>Ld Immediate</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.pds16.pds16asm.LdImmediate
   * @generated
   */
  public Adapter createLdImmediateAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.pds16.pds16asm.LdDirect <em>Ld Direct</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.pds16.pds16asm.LdDirect
   * @generated
   */
  public Adapter createLdDirectAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.pds16.pds16asm.LdIndexed <em>Ld Indexed</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.pds16.pds16asm.LdIndexed
   * @generated
   */
  public Adapter createLdIndexedAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.pds16.pds16asm.LdBasedIndexed <em>Ld Based Indexed</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.pds16.pds16asm.LdBasedIndexed
   * @generated
   */
  public Adapter createLdBasedIndexedAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.pds16.pds16asm.StDirect <em>St Direct</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.pds16.pds16asm.StDirect
   * @generated
   */
  public Adapter createStDirectAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.pds16.pds16asm.StIndexed <em>St Indexed</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.pds16.pds16asm.StIndexed
   * @generated
   */
  public Adapter createStIndexedAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.pds16.pds16asm.StBasedIndexed <em>St Based Indexed</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.pds16.pds16asm.StBasedIndexed
   * @generated
   */
  public Adapter createStBasedIndexedAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.pds16.pds16asm.Add <em>Add</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.pds16.pds16asm.Add
   * @generated
   */
  public Adapter createAddAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.pds16.pds16asm.Sub <em>Sub</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.pds16.pds16asm.Sub
   * @generated
   */
  public Adapter createSubAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.pds16.pds16asm.Anl <em>Anl</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.pds16.pds16asm.Anl
   * @generated
   */
  public Adapter createAnlAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.pds16.pds16asm.Orl <em>Orl</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.pds16.pds16asm.Orl
   * @generated
   */
  public Adapter createOrlAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.pds16.pds16asm.Xrl <em>Xrl</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.pds16.pds16asm.Xrl
   * @generated
   */
  public Adapter createXrlAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.pds16.pds16asm.Not <em>Not</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.pds16.pds16asm.Not
   * @generated
   */
  public Adapter createNotAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.pds16.pds16asm.Shl <em>Shl</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.pds16.pds16asm.Shl
   * @generated
   */
  public Adapter createShlAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.pds16.pds16asm.Shr <em>Shr</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.pds16.pds16asm.Shr
   * @generated
   */
  public Adapter createShrAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.pds16.pds16asm.Rr <em>Rr</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.pds16.pds16asm.Rr
   * @generated
   */
  public Adapter createRrAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.pds16.pds16asm.Rc <em>Rc</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.pds16.pds16asm.Rc
   * @generated
   */
  public Adapter createRcAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.pds16.pds16asm.JumpOp <em>Jump Op</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.pds16.pds16asm.JumpOp
   * @generated
   */
  public Adapter createJumpOpAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.pds16.pds16asm.Immediate <em>Immediate</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.pds16.pds16asm.Immediate
   * @generated
   */
  public Adapter createImmediateAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.pds16.pds16asm.Direct <em>Direct</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.pds16.pds16asm.Direct
   * @generated
   */
  public Adapter createDirectAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.pds16.pds16asm.Indexed <em>Indexed</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.pds16.pds16asm.Indexed
   * @generated
   */
  public Adapter createIndexedAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.pds16.pds16asm.BasedIndexed <em>Based Indexed</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.pds16.pds16asm.BasedIndexed
   * @generated
   */
  public Adapter createBasedIndexedAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.pds16.pds16asm.IntOrHexOrString <em>Int Or Hex Or String</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.pds16.pds16asm.IntOrHexOrString
   * @generated
   */
  public Adapter createIntOrHexOrStringAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.pds16.pds16asm.OperationWithTwoRegisters <em>Operation With Two Registers</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.pds16.pds16asm.OperationWithTwoRegisters
   * @generated
   */
  public Adapter createOperationWithTwoRegistersAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.pds16.pds16asm.OperationsWithTreeRegisters <em>Operations With Tree Registers</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.pds16.pds16asm.OperationsWithTreeRegisters
   * @generated
   */
  public Adapter createOperationsWithTreeRegistersAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.pds16.pds16asm.OperationsWithConstant <em>Operations With Constant</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.pds16.pds16asm.OperationsWithConstant
   * @generated
   */
  public Adapter createOperationsWithConstantAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.pds16.pds16asm.OperationShift <em>Operation Shift</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.pds16.pds16asm.OperationShift
   * @generated
   */
  public Adapter createOperationShiftAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.pds16.pds16asm.OperationWithOffset <em>Operation With Offset</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.pds16.pds16asm.OperationWithOffset
   * @generated
   */
  public Adapter createOperationWithOffsetAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.pds16.pds16asm.Registers <em>Registers</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.pds16.pds16asm.Registers
   * @generated
   */
  public Adapter createRegistersAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //Pds16asmAdapterFactory
