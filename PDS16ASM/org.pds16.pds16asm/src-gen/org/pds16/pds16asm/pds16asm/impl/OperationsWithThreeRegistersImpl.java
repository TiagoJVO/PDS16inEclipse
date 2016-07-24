/**
 * generated by Xtext 2.10.1
 */
package org.pds16.pds16asm.pds16asm.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.pds16.pds16asm.pds16asm.Anl;
import org.pds16.pds16asm.pds16asm.Logica;
import org.pds16.pds16asm.pds16asm.OperationsWithThreeRegisters;
import org.pds16.pds16asm.pds16asm.Orl;
import org.pds16.pds16asm.pds16asm.Pds16asmPackage;
import org.pds16.pds16asm.pds16asm.Register;
import org.pds16.pds16asm.pds16asm.Sub;
import org.pds16.pds16asm.pds16asm.Xrl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Operations With Three Registers</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.pds16.pds16asm.pds16asm.impl.OperationsWithThreeRegistersImpl#getRd <em>Rd</em>}</li>
 *   <li>{@link org.pds16.pds16asm.pds16asm.impl.OperationsWithThreeRegistersImpl#getRm <em>Rm</em>}</li>
 *   <li>{@link org.pds16.pds16asm.pds16asm.impl.OperationsWithThreeRegistersImpl#getRn <em>Rn</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OperationsWithThreeRegistersImpl extends AddImpl implements OperationsWithThreeRegisters
{
  /**
   * The cached value of the '{@link #getRd() <em>Rd</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRd()
   * @generated
   * @ordered
   */
  protected Register rd;

  /**
   * The cached value of the '{@link #getRm() <em>Rm</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRm()
   * @generated
   * @ordered
   */
  protected Register rm;

  /**
   * The cached value of the '{@link #getRn() <em>Rn</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRn()
   * @generated
   * @ordered
   */
  protected Register rn;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected OperationsWithThreeRegistersImpl()
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
    return Pds16asmPackage.Literals.OPERATIONS_WITH_THREE_REGISTERS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Register getRd()
  {
    return rd;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRd(Register newRd, NotificationChain msgs)
  {
    Register oldRd = rd;
    rd = newRd;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Pds16asmPackage.OPERATIONS_WITH_THREE_REGISTERS__RD, oldRd, newRd);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRd(Register newRd)
  {
    if (newRd != rd)
    {
      NotificationChain msgs = null;
      if (rd != null)
        msgs = ((InternalEObject)rd).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Pds16asmPackage.OPERATIONS_WITH_THREE_REGISTERS__RD, null, msgs);
      if (newRd != null)
        msgs = ((InternalEObject)newRd).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Pds16asmPackage.OPERATIONS_WITH_THREE_REGISTERS__RD, null, msgs);
      msgs = basicSetRd(newRd, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Pds16asmPackage.OPERATIONS_WITH_THREE_REGISTERS__RD, newRd, newRd));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Register getRm()
  {
    return rm;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRm(Register newRm, NotificationChain msgs)
  {
    Register oldRm = rm;
    rm = newRm;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Pds16asmPackage.OPERATIONS_WITH_THREE_REGISTERS__RM, oldRm, newRm);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRm(Register newRm)
  {
    if (newRm != rm)
    {
      NotificationChain msgs = null;
      if (rm != null)
        msgs = ((InternalEObject)rm).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Pds16asmPackage.OPERATIONS_WITH_THREE_REGISTERS__RM, null, msgs);
      if (newRm != null)
        msgs = ((InternalEObject)newRm).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Pds16asmPackage.OPERATIONS_WITH_THREE_REGISTERS__RM, null, msgs);
      msgs = basicSetRm(newRm, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Pds16asmPackage.OPERATIONS_WITH_THREE_REGISTERS__RM, newRm, newRm));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Register getRn()
  {
    return rn;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRn(Register newRn, NotificationChain msgs)
  {
    Register oldRn = rn;
    rn = newRn;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Pds16asmPackage.OPERATIONS_WITH_THREE_REGISTERS__RN, oldRn, newRn);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRn(Register newRn)
  {
    if (newRn != rn)
    {
      NotificationChain msgs = null;
      if (rn != null)
        msgs = ((InternalEObject)rn).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Pds16asmPackage.OPERATIONS_WITH_THREE_REGISTERS__RN, null, msgs);
      if (newRn != null)
        msgs = ((InternalEObject)newRn).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Pds16asmPackage.OPERATIONS_WITH_THREE_REGISTERS__RN, null, msgs);
      msgs = basicSetRn(newRn, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Pds16asmPackage.OPERATIONS_WITH_THREE_REGISTERS__RN, newRn, newRn));
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
      case Pds16asmPackage.OPERATIONS_WITH_THREE_REGISTERS__RD:
        return basicSetRd(null, msgs);
      case Pds16asmPackage.OPERATIONS_WITH_THREE_REGISTERS__RM:
        return basicSetRm(null, msgs);
      case Pds16asmPackage.OPERATIONS_WITH_THREE_REGISTERS__RN:
        return basicSetRn(null, msgs);
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
      case Pds16asmPackage.OPERATIONS_WITH_THREE_REGISTERS__RD:
        return getRd();
      case Pds16asmPackage.OPERATIONS_WITH_THREE_REGISTERS__RM:
        return getRm();
      case Pds16asmPackage.OPERATIONS_WITH_THREE_REGISTERS__RN:
        return getRn();
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
      case Pds16asmPackage.OPERATIONS_WITH_THREE_REGISTERS__RD:
        setRd((Register)newValue);
        return;
      case Pds16asmPackage.OPERATIONS_WITH_THREE_REGISTERS__RM:
        setRm((Register)newValue);
        return;
      case Pds16asmPackage.OPERATIONS_WITH_THREE_REGISTERS__RN:
        setRn((Register)newValue);
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
      case Pds16asmPackage.OPERATIONS_WITH_THREE_REGISTERS__RD:
        setRd((Register)null);
        return;
      case Pds16asmPackage.OPERATIONS_WITH_THREE_REGISTERS__RM:
        setRm((Register)null);
        return;
      case Pds16asmPackage.OPERATIONS_WITH_THREE_REGISTERS__RN:
        setRn((Register)null);
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
      case Pds16asmPackage.OPERATIONS_WITH_THREE_REGISTERS__RD:
        return rd != null;
      case Pds16asmPackage.OPERATIONS_WITH_THREE_REGISTERS__RM:
        return rm != null;
      case Pds16asmPackage.OPERATIONS_WITH_THREE_REGISTERS__RN:
        return rn != null;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass)
  {
    if (baseClass == Sub.class)
    {
      switch (derivedFeatureID)
      {
        default: return -1;
      }
    }
    if (baseClass == Logica.class)
    {
      switch (derivedFeatureID)
      {
        default: return -1;
      }
    }
    if (baseClass == Anl.class)
    {
      switch (derivedFeatureID)
      {
        default: return -1;
      }
    }
    if (baseClass == Orl.class)
    {
      switch (derivedFeatureID)
      {
        case Pds16asmPackage.OPERATIONS_WITH_THREE_REGISTERS__RD: return Pds16asmPackage.ORL__RD;
        case Pds16asmPackage.OPERATIONS_WITH_THREE_REGISTERS__RM: return Pds16asmPackage.ORL__RM;
        default: return -1;
      }
    }
    if (baseClass == Xrl.class)
    {
      switch (derivedFeatureID)
      {
        default: return -1;
      }
    }
    return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass)
  {
    if (baseClass == Sub.class)
    {
      switch (baseFeatureID)
      {
        default: return -1;
      }
    }
    if (baseClass == Logica.class)
    {
      switch (baseFeatureID)
      {
        default: return -1;
      }
    }
    if (baseClass == Anl.class)
    {
      switch (baseFeatureID)
      {
        default: return -1;
      }
    }
    if (baseClass == Orl.class)
    {
      switch (baseFeatureID)
      {
        case Pds16asmPackage.ORL__RD: return Pds16asmPackage.OPERATIONS_WITH_THREE_REGISTERS__RD;
        case Pds16asmPackage.ORL__RM: return Pds16asmPackage.OPERATIONS_WITH_THREE_REGISTERS__RM;
        default: return -1;
      }
    }
    if (baseClass == Xrl.class)
    {
      switch (baseFeatureID)
      {
        default: return -1;
      }
    }
    return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
  }

} //OperationsWithThreeRegistersImpl