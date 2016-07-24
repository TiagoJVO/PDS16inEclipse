/**
 * generated by Xtext 2.10.1
 */
package org.pds16.pds16asm.pds16asm.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.pds16.pds16asm.pds16asm.Direct;
import org.pds16.pds16asm.pds16asm.DirectOrLabel;
import org.pds16.pds16asm.pds16asm.Pds16asmPackage;
import org.pds16.pds16asm.pds16asm.Register;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Direct</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.pds16.pds16asm.pds16asm.impl.DirectImpl#getRegister <em>Register</em>}</li>
 *   <li>{@link org.pds16.pds16asm.pds16asm.impl.DirectImpl#getDirect7 <em>Direct7</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DirectImpl extends LdDirectImpl implements Direct
{
  /**
   * The cached value of the '{@link #getRegister() <em>Register</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRegister()
   * @generated
   * @ordered
   */
  protected Register register;

  /**
   * The cached value of the '{@link #getDirect7() <em>Direct7</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDirect7()
   * @generated
   * @ordered
   */
  protected DirectOrLabel direct7;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DirectImpl()
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
    return Pds16asmPackage.Literals.DIRECT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Register getRegister()
  {
    return register;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRegister(Register newRegister, NotificationChain msgs)
  {
    Register oldRegister = register;
    register = newRegister;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Pds16asmPackage.DIRECT__REGISTER, oldRegister, newRegister);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRegister(Register newRegister)
  {
    if (newRegister != register)
    {
      NotificationChain msgs = null;
      if (register != null)
        msgs = ((InternalEObject)register).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Pds16asmPackage.DIRECT__REGISTER, null, msgs);
      if (newRegister != null)
        msgs = ((InternalEObject)newRegister).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Pds16asmPackage.DIRECT__REGISTER, null, msgs);
      msgs = basicSetRegister(newRegister, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Pds16asmPackage.DIRECT__REGISTER, newRegister, newRegister));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DirectOrLabel getDirect7()
  {
    return direct7;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDirect7(DirectOrLabel newDirect7, NotificationChain msgs)
  {
    DirectOrLabel oldDirect7 = direct7;
    direct7 = newDirect7;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Pds16asmPackage.DIRECT__DIRECT7, oldDirect7, newDirect7);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDirect7(DirectOrLabel newDirect7)
  {
    if (newDirect7 != direct7)
    {
      NotificationChain msgs = null;
      if (direct7 != null)
        msgs = ((InternalEObject)direct7).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Pds16asmPackage.DIRECT__DIRECT7, null, msgs);
      if (newDirect7 != null)
        msgs = ((InternalEObject)newDirect7).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Pds16asmPackage.DIRECT__DIRECT7, null, msgs);
      msgs = basicSetDirect7(newDirect7, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Pds16asmPackage.DIRECT__DIRECT7, newDirect7, newDirect7));
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
      case Pds16asmPackage.DIRECT__REGISTER:
        return basicSetRegister(null, msgs);
      case Pds16asmPackage.DIRECT__DIRECT7:
        return basicSetDirect7(null, msgs);
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
      case Pds16asmPackage.DIRECT__REGISTER:
        return getRegister();
      case Pds16asmPackage.DIRECT__DIRECT7:
        return getDirect7();
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
      case Pds16asmPackage.DIRECT__REGISTER:
        setRegister((Register)newValue);
        return;
      case Pds16asmPackage.DIRECT__DIRECT7:
        setDirect7((DirectOrLabel)newValue);
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
      case Pds16asmPackage.DIRECT__REGISTER:
        setRegister((Register)null);
        return;
      case Pds16asmPackage.DIRECT__DIRECT7:
        setDirect7((DirectOrLabel)null);
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
      case Pds16asmPackage.DIRECT__REGISTER:
        return register != null;
      case Pds16asmPackage.DIRECT__DIRECT7:
        return direct7 != null;
    }
    return super.eIsSet(featureID);
  }

} //DirectImpl
