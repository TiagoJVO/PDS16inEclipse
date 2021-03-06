/**
 * generated by Xtext 2.10.1
 */
package org.pds16.pds16asm.pds16asm.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.pds16.pds16asm.pds16asm.Pds16asmPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Byte</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.pds16.pds16asm.pds16asm.impl.ByteImpl#getValues <em>Values</em>}</li>
 *   <li>{@link org.pds16.pds16asm.pds16asm.impl.ByteImpl#getNumbers <em>Numbers</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ByteImpl extends LabelDirectiveImpl implements org.pds16.pds16asm.pds16asm.Byte
{
  /**
   * The cached value of the '{@link #getValues() <em>Values</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValues()
   * @generated
   * @ordered
   */
  protected EList<String> values;

  /**
   * The cached value of the '{@link #getNumbers() <em>Numbers</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNumbers()
   * @generated
   * @ordered
   */
  protected EList<org.pds16.pds16asm.pds16asm.Number> numbers;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ByteImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return Pds16asmPackage.Literals.BYTE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getValues()
  {
    if (values == null)
    {
      values = new EDataTypeEList<String>(String.class, this, Pds16asmPackage.BYTE__VALUES);
    }
    return values;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<org.pds16.pds16asm.pds16asm.Number> getNumbers()
  {
    if (numbers == null)
    {
      numbers = new EObjectContainmentEList<org.pds16.pds16asm.pds16asm.Number>(org.pds16.pds16asm.pds16asm.Number.class, this, Pds16asmPackage.BYTE__NUMBERS);
    }
    return numbers;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case Pds16asmPackage.BYTE__NUMBERS:
        return ((InternalEList<?>)getNumbers()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case Pds16asmPackage.BYTE__VALUES:
        return getValues();
      case Pds16asmPackage.BYTE__NUMBERS:
        return getNumbers();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case Pds16asmPackage.BYTE__VALUES:
        getValues().clear();
        getValues().addAll((Collection<? extends String>)newValue);
        return;
      case Pds16asmPackage.BYTE__NUMBERS:
        getNumbers().clear();
        getNumbers().addAll((Collection<? extends org.pds16.pds16asm.pds16asm.Number>)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case Pds16asmPackage.BYTE__VALUES:
        getValues().clear();
        return;
      case Pds16asmPackage.BYTE__NUMBERS:
        getNumbers().clear();
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case Pds16asmPackage.BYTE__VALUES:
        return values != null && !values.isEmpty();
      case Pds16asmPackage.BYTE__NUMBERS:
        return numbers != null && !numbers.isEmpty();
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (values: ");
    result.append(values);
    result.append(')');
    return result.toString();
  }

} //ByteImpl
