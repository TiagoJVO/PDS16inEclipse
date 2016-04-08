/**
 * generated by Xtext 2.9.2
 */
package org.pds16.pds16asm.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.pds16.pds16asm.Pds16asmPackage;
import org.pds16.pds16asm.Registers;
import org.pds16.pds16asm.operationWithTwoRegisters;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>operation With Two Registers</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.pds16.pds16asm.impl.operationWithTwoRegistersImpl#getRd <em>Rd</em>}</li>
 *   <li>{@link org.pds16.pds16asm.impl.operationWithTwoRegistersImpl#getRm <em>Rm</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class operationWithTwoRegistersImpl extends NOTImpl implements operationWithTwoRegisters
{
  /**
   * The cached value of the '{@link #getRd() <em>Rd</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRd()
   * @generated
   * @ordered
   */
  protected Registers rd;

  /**
   * The cached value of the '{@link #getRm() <em>Rm</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRm()
   * @generated
   * @ordered
   */
  protected Registers rm;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected operationWithTwoRegistersImpl()
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
    return Pds16asmPackage.Literals.OPERATION_WITH_TWO_REGISTERS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Registers getRd()
  {
    return rd;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRd(Registers newRd, NotificationChain msgs)
  {
    Registers oldRd = rd;
    rd = newRd;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Pds16asmPackage.OPERATION_WITH_TWO_REGISTERS__RD, oldRd, newRd);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRd(Registers newRd)
  {
    if (newRd != rd)
    {
      NotificationChain msgs = null;
      if (rd != null)
        msgs = ((InternalEObject)rd).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Pds16asmPackage.OPERATION_WITH_TWO_REGISTERS__RD, null, msgs);
      if (newRd != null)
        msgs = ((InternalEObject)newRd).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Pds16asmPackage.OPERATION_WITH_TWO_REGISTERS__RD, null, msgs);
      msgs = basicSetRd(newRd, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Pds16asmPackage.OPERATION_WITH_TWO_REGISTERS__RD, newRd, newRd));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Registers getRm()
  {
    return rm;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRm(Registers newRm, NotificationChain msgs)
  {
    Registers oldRm = rm;
    rm = newRm;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Pds16asmPackage.OPERATION_WITH_TWO_REGISTERS__RM, oldRm, newRm);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRm(Registers newRm)
  {
    if (newRm != rm)
    {
      NotificationChain msgs = null;
      if (rm != null)
        msgs = ((InternalEObject)rm).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Pds16asmPackage.OPERATION_WITH_TWO_REGISTERS__RM, null, msgs);
      if (newRm != null)
        msgs = ((InternalEObject)newRm).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Pds16asmPackage.OPERATION_WITH_TWO_REGISTERS__RM, null, msgs);
      msgs = basicSetRm(newRm, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Pds16asmPackage.OPERATION_WITH_TWO_REGISTERS__RM, newRm, newRm));
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
      case Pds16asmPackage.OPERATION_WITH_TWO_REGISTERS__RD:
        return basicSetRd(null, msgs);
      case Pds16asmPackage.OPERATION_WITH_TWO_REGISTERS__RM:
        return basicSetRm(null, msgs);
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
      case Pds16asmPackage.OPERATION_WITH_TWO_REGISTERS__RD:
        return getRd();
      case Pds16asmPackage.OPERATION_WITH_TWO_REGISTERS__RM:
        return getRm();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case Pds16asmPackage.OPERATION_WITH_TWO_REGISTERS__RD:
        setRd((Registers)newValue);
        return;
      case Pds16asmPackage.OPERATION_WITH_TWO_REGISTERS__RM:
        setRm((Registers)newValue);
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
      case Pds16asmPackage.OPERATION_WITH_TWO_REGISTERS__RD:
        setRd((Registers)null);
        return;
      case Pds16asmPackage.OPERATION_WITH_TWO_REGISTERS__RM:
        setRm((Registers)null);
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
      case Pds16asmPackage.OPERATION_WITH_TWO_REGISTERS__RD:
        return rd != null;
      case Pds16asmPackage.OPERATION_WITH_TWO_REGISTERS__RM:
        return rm != null;
    }
    return super.eIsSet(featureID);
  }

} //operationWithTwoRegistersImpl
