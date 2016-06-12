/**
 * generated by Xtext 2.10.1
 */
package org.pds16.pds16asm.pds16asm.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.pds16.pds16asm.pds16asm.Offset8OrLabel;
import org.pds16.pds16asm.pds16asm.OperationWithOffset;
import org.pds16.pds16asm.pds16asm.Pds16asmPackage;
import org.pds16.pds16asm.pds16asm.Register;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Operation With Offset</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.pds16.pds16asm.pds16asm.impl.OperationWithOffsetImpl#getRbx <em>Rbx</em>}</li>
 *   <li>{@link org.pds16.pds16asm.pds16asm.impl.OperationWithOffsetImpl#getOffset8 <em>Offset8</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OperationWithOffsetImpl extends MinimalEObjectImpl.Container implements OperationWithOffset
{
  /**
   * The cached value of the '{@link #getRbx() <em>Rbx</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRbx()
   * @generated
   * @ordered
   */
  protected Register rbx;

  /**
   * The cached value of the '{@link #getOffset8() <em>Offset8</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOffset8()
   * @generated
   * @ordered
   */
  protected Offset8OrLabel offset8;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected OperationWithOffsetImpl()
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
    return Pds16asmPackage.Literals.OPERATION_WITH_OFFSET;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Register getRbx()
  {
    return rbx;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRbx(Register newRbx, NotificationChain msgs)
  {
    Register oldRbx = rbx;
    rbx = newRbx;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Pds16asmPackage.OPERATION_WITH_OFFSET__RBX, oldRbx, newRbx);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRbx(Register newRbx)
  {
    if (newRbx != rbx)
    {
      NotificationChain msgs = null;
      if (rbx != null)
        msgs = ((InternalEObject)rbx).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Pds16asmPackage.OPERATION_WITH_OFFSET__RBX, null, msgs);
      if (newRbx != null)
        msgs = ((InternalEObject)newRbx).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Pds16asmPackage.OPERATION_WITH_OFFSET__RBX, null, msgs);
      msgs = basicSetRbx(newRbx, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Pds16asmPackage.OPERATION_WITH_OFFSET__RBX, newRbx, newRbx));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Offset8OrLabel getOffset8()
  {
    return offset8;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetOffset8(Offset8OrLabel newOffset8, NotificationChain msgs)
  {
    Offset8OrLabel oldOffset8 = offset8;
    offset8 = newOffset8;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Pds16asmPackage.OPERATION_WITH_OFFSET__OFFSET8, oldOffset8, newOffset8);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOffset8(Offset8OrLabel newOffset8)
  {
    if (newOffset8 != offset8)
    {
      NotificationChain msgs = null;
      if (offset8 != null)
        msgs = ((InternalEObject)offset8).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Pds16asmPackage.OPERATION_WITH_OFFSET__OFFSET8, null, msgs);
      if (newOffset8 != null)
        msgs = ((InternalEObject)newOffset8).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Pds16asmPackage.OPERATION_WITH_OFFSET__OFFSET8, null, msgs);
      msgs = basicSetOffset8(newOffset8, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Pds16asmPackage.OPERATION_WITH_OFFSET__OFFSET8, newOffset8, newOffset8));
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
      case Pds16asmPackage.OPERATION_WITH_OFFSET__RBX:
        return basicSetRbx(null, msgs);
      case Pds16asmPackage.OPERATION_WITH_OFFSET__OFFSET8:
        return basicSetOffset8(null, msgs);
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
      case Pds16asmPackage.OPERATION_WITH_OFFSET__RBX:
        return getRbx();
      case Pds16asmPackage.OPERATION_WITH_OFFSET__OFFSET8:
        return getOffset8();
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
      case Pds16asmPackage.OPERATION_WITH_OFFSET__RBX:
        setRbx((Register)newValue);
        return;
      case Pds16asmPackage.OPERATION_WITH_OFFSET__OFFSET8:
        setOffset8((Offset8OrLabel)newValue);
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
      case Pds16asmPackage.OPERATION_WITH_OFFSET__RBX:
        setRbx((Register)null);
        return;
      case Pds16asmPackage.OPERATION_WITH_OFFSET__OFFSET8:
        setOffset8((Offset8OrLabel)null);
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
      case Pds16asmPackage.OPERATION_WITH_OFFSET__RBX:
        return rbx != null;
      case Pds16asmPackage.OPERATION_WITH_OFFSET__OFFSET8:
        return offset8 != null;
    }
    return super.eIsSet(featureID);
  }

} //OperationWithOffsetImpl