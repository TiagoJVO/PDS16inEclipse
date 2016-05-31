/**
 * generated by Xtext 2.10.0-SNAPSHOT
 */
package org.pds16.pds16asm.pds16asm.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EDataTypeEList;

import org.pds16.pds16asm.pds16asm.Expression;
import org.pds16.pds16asm.pds16asm.Pds16asmPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.pds16.pds16asm.pds16asm.impl.ExpressionImpl#getNumericValue <em>Numeric Value</em>}</li>
 *   <li>{@link org.pds16.pds16asm.pds16asm.impl.ExpressionImpl#getIdValue <em>Id Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExpressionImpl extends OrgImpl implements Expression
{
  /**
   * The cached value of the '{@link #getNumericValue() <em>Numeric Value</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNumericValue()
   * @generated
   * @ordered
   */
  protected EList<Integer> numericValue;

  /**
   * The cached value of the '{@link #getIdValue() <em>Id Value</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIdValue()
   * @generated
   * @ordered
   */
  protected EList<String> idValue;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ExpressionImpl()
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
    return Pds16asmPackage.Literals.EXPRESSION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Integer> getNumericValue()
  {
    if (numericValue == null)
    {
      numericValue = new EDataTypeEList<Integer>(Integer.class, this, Pds16asmPackage.EXPRESSION__NUMERIC_VALUE);
    }
    return numericValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getIdValue()
  {
    if (idValue == null)
    {
      idValue = new EDataTypeEList<String>(String.class, this, Pds16asmPackage.EXPRESSION__ID_VALUE);
    }
    return idValue;
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
      case Pds16asmPackage.EXPRESSION__NUMERIC_VALUE:
        return getNumericValue();
      case Pds16asmPackage.EXPRESSION__ID_VALUE:
        return getIdValue();
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
      case Pds16asmPackage.EXPRESSION__NUMERIC_VALUE:
        getNumericValue().clear();
        getNumericValue().addAll((Collection<? extends Integer>)newValue);
        return;
      case Pds16asmPackage.EXPRESSION__ID_VALUE:
        getIdValue().clear();
        getIdValue().addAll((Collection<? extends String>)newValue);
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
      case Pds16asmPackage.EXPRESSION__NUMERIC_VALUE:
        getNumericValue().clear();
        return;
      case Pds16asmPackage.EXPRESSION__ID_VALUE:
        getIdValue().clear();
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
      case Pds16asmPackage.EXPRESSION__NUMERIC_VALUE:
        return numericValue != null && !numericValue.isEmpty();
      case Pds16asmPackage.EXPRESSION__ID_VALUE:
        return idValue != null && !idValue.isEmpty();
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
    result.append(" (numericValue: ");
    result.append(numericValue);
    result.append(", idValue: ");
    result.append(idValue);
    result.append(')');
    return result.toString();
  }

} //ExpressionImpl