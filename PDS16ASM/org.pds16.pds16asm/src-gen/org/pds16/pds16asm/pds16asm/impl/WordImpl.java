/**
 * generated by Xtext 2.10.0-SNAPSHOT
 */
package org.pds16.pds16asm.pds16asm.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EDataTypeEList;

import org.pds16.pds16asm.pds16asm.Pds16asmPackage;
import org.pds16.pds16asm.pds16asm.Word;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Word</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.pds16.pds16asm.pds16asm.impl.WordImpl#getValue <em>Value</em>}</li>
 *   <li>{@link org.pds16.pds16asm.pds16asm.impl.WordImpl#getNumber <em>Number</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WordImpl extends LabelDirectiveImpl implements Word
{
  /**
   * The cached value of the '{@link #getValue() <em>Value</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValue()
   * @generated
   * @ordered
   */
  protected EList<String> value;

  /**
   * The cached value of the '{@link #getNumber() <em>Number</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNumber()
   * @generated
   * @ordered
   */
  protected EList<Integer> number;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected WordImpl()
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
    return Pds16asmPackage.Literals.WORD;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getValue()
  {
    if (value == null)
    {
      value = new EDataTypeEList<String>(String.class, this, Pds16asmPackage.WORD__VALUE);
    }
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Integer> getNumber()
  {
    if (number == null)
    {
      number = new EDataTypeEList<Integer>(Integer.class, this, Pds16asmPackage.WORD__NUMBER);
    }
    return number;
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
      case Pds16asmPackage.WORD__VALUE:
        return getValue();
      case Pds16asmPackage.WORD__NUMBER:
        return getNumber();
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
      case Pds16asmPackage.WORD__VALUE:
        getValue().clear();
        getValue().addAll((Collection<? extends String>)newValue);
        return;
      case Pds16asmPackage.WORD__NUMBER:
        getNumber().clear();
        getNumber().addAll((Collection<? extends Integer>)newValue);
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
      case Pds16asmPackage.WORD__VALUE:
        getValue().clear();
        return;
      case Pds16asmPackage.WORD__NUMBER:
        getNumber().clear();
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
      case Pds16asmPackage.WORD__VALUE:
        return value != null && !value.isEmpty();
      case Pds16asmPackage.WORD__NUMBER:
        return number != null && !number.isEmpty();
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
    result.append(" (value: ");
    result.append(value);
    result.append(", number: ");
    result.append(number);
    result.append(')');
    return result.toString();
  }

} //WordImpl