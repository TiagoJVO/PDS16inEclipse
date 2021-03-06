/**
 * generated by Xtext 2.10.1
 */
package org.pds16.pds16asm.pds16asm.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.pds16.pds16asm.pds16asm.Idx3OrLabel;
import org.pds16.pds16asm.pds16asm.Indexed;
import org.pds16.pds16asm.pds16asm.Pds16asmPackage;
import org.pds16.pds16asm.pds16asm.Register;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Indexed</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.pds16.pds16asm.pds16asm.impl.IndexedImpl#getRd <em>Rd</em>}</li>
 *   <li>{@link org.pds16.pds16asm.pds16asm.impl.IndexedImpl#getRbx <em>Rbx</em>}</li>
 *   <li>{@link org.pds16.pds16asm.pds16asm.impl.IndexedImpl#getIdx3 <em>Idx3</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IndexedImpl extends LdIndexedImpl implements Indexed
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
   * The cached value of the '{@link #getRbx() <em>Rbx</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRbx()
   * @generated
   * @ordered
   */
  protected Register rbx;

  /**
   * The cached value of the '{@link #getIdx3() <em>Idx3</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIdx3()
   * @generated
   * @ordered
   */
  protected Idx3OrLabel idx3;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected IndexedImpl()
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
    return Pds16asmPackage.Literals.INDEXED;
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Pds16asmPackage.INDEXED__RD, oldRd, newRd);
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
        msgs = ((InternalEObject)rd).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Pds16asmPackage.INDEXED__RD, null, msgs);
      if (newRd != null)
        msgs = ((InternalEObject)newRd).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Pds16asmPackage.INDEXED__RD, null, msgs);
      msgs = basicSetRd(newRd, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Pds16asmPackage.INDEXED__RD, newRd, newRd));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Pds16asmPackage.INDEXED__RBX, oldRbx, newRbx);
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
        msgs = ((InternalEObject)rbx).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Pds16asmPackage.INDEXED__RBX, null, msgs);
      if (newRbx != null)
        msgs = ((InternalEObject)newRbx).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Pds16asmPackage.INDEXED__RBX, null, msgs);
      msgs = basicSetRbx(newRbx, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Pds16asmPackage.INDEXED__RBX, newRbx, newRbx));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Idx3OrLabel getIdx3()
  {
    return idx3;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetIdx3(Idx3OrLabel newIdx3, NotificationChain msgs)
  {
    Idx3OrLabel oldIdx3 = idx3;
    idx3 = newIdx3;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Pds16asmPackage.INDEXED__IDX3, oldIdx3, newIdx3);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIdx3(Idx3OrLabel newIdx3)
  {
    if (newIdx3 != idx3)
    {
      NotificationChain msgs = null;
      if (idx3 != null)
        msgs = ((InternalEObject)idx3).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Pds16asmPackage.INDEXED__IDX3, null, msgs);
      if (newIdx3 != null)
        msgs = ((InternalEObject)newIdx3).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Pds16asmPackage.INDEXED__IDX3, null, msgs);
      msgs = basicSetIdx3(newIdx3, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Pds16asmPackage.INDEXED__IDX3, newIdx3, newIdx3));
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
      case Pds16asmPackage.INDEXED__RD:
        return basicSetRd(null, msgs);
      case Pds16asmPackage.INDEXED__RBX:
        return basicSetRbx(null, msgs);
      case Pds16asmPackage.INDEXED__IDX3:
        return basicSetIdx3(null, msgs);
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
      case Pds16asmPackage.INDEXED__RD:
        return getRd();
      case Pds16asmPackage.INDEXED__RBX:
        return getRbx();
      case Pds16asmPackage.INDEXED__IDX3:
        return getIdx3();
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
      case Pds16asmPackage.INDEXED__RD:
        setRd((Register)newValue);
        return;
      case Pds16asmPackage.INDEXED__RBX:
        setRbx((Register)newValue);
        return;
      case Pds16asmPackage.INDEXED__IDX3:
        setIdx3((Idx3OrLabel)newValue);
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
      case Pds16asmPackage.INDEXED__RD:
        setRd((Register)null);
        return;
      case Pds16asmPackage.INDEXED__RBX:
        setRbx((Register)null);
        return;
      case Pds16asmPackage.INDEXED__IDX3:
        setIdx3((Idx3OrLabel)null);
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
      case Pds16asmPackage.INDEXED__RD:
        return rd != null;
      case Pds16asmPackage.INDEXED__RBX:
        return rbx != null;
      case Pds16asmPackage.INDEXED__IDX3:
        return idx3 != null;
    }
    return super.eIsSet(featureID);
  }

} //IndexedImpl
