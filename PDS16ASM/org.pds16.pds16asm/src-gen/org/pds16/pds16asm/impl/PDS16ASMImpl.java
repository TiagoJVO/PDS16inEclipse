/**
 * generated by Xtext 2.9.2
 */
package org.pds16.pds16asm.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.pds16.pds16asm.PDS16ASM;
import org.pds16.pds16asm.Pds16asmPackage;
import org.pds16.pds16asm.Statement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>PDS16ASM</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.pds16.pds16asm.impl.PDS16ASMImpl#getInstuctions <em>Instuctions</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PDS16ASMImpl extends MinimalEObjectImpl.Container implements PDS16ASM
{
  /**
   * The cached value of the '{@link #getInstuctions() <em>Instuctions</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInstuctions()
   * @generated
   * @ordered
   */
  protected EList<Statement> instuctions;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PDS16ASMImpl()
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
    return Pds16asmPackage.Literals.PDS16ASM;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Statement> getInstuctions()
  {
    if (instuctions == null)
    {
      instuctions = new EObjectContainmentEList<Statement>(Statement.class, this, Pds16asmPackage.PDS16ASM__INSTUCTIONS);
    }
    return instuctions;
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
      case Pds16asmPackage.PDS16ASM__INSTUCTIONS:
        return ((InternalEList<?>)getInstuctions()).basicRemove(otherEnd, msgs);
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
      case Pds16asmPackage.PDS16ASM__INSTUCTIONS:
        return getInstuctions();
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
      case Pds16asmPackage.PDS16ASM__INSTUCTIONS:
        getInstuctions().clear();
        getInstuctions().addAll((Collection<? extends Statement>)newValue);
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
      case Pds16asmPackage.PDS16ASM__INSTUCTIONS:
        getInstuctions().clear();
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
      case Pds16asmPackage.PDS16ASM__INSTUCTIONS:
        return instuctions != null && !instuctions.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //PDS16ASMImpl
