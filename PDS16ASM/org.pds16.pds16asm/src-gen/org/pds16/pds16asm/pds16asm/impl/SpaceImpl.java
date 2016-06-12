/**
 * generated by Xtext 2.10.1
 */
package org.pds16.pds16asm.pds16asm.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.pds16.pds16asm.pds16asm.Pds16asmPackage;
import org.pds16.pds16asm.pds16asm.Space;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Space</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.pds16.pds16asm.pds16asm.impl.SpaceImpl#getSize <em>Size</em>}</li>
 *   <li>{@link org.pds16.pds16asm.pds16asm.impl.SpaceImpl#getByteValue <em>Byte Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SpaceImpl extends LabelDirectiveImpl implements Space
{
  /**
   * The cached value of the '{@link #getSize() <em>Size</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSize()
   * @generated
   * @ordered
   */
  protected org.pds16.pds16asm.pds16asm.Number size;

  /**
   * The cached value of the '{@link #getByteValue() <em>Byte Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getByteValue()
   * @generated
   * @ordered
   */
  protected org.pds16.pds16asm.pds16asm.Number byteValue;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SpaceImpl()
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
    return Pds16asmPackage.Literals.SPACE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public org.pds16.pds16asm.pds16asm.Number getSize()
  {
    return size;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSize(org.pds16.pds16asm.pds16asm.Number newSize, NotificationChain msgs)
  {
    org.pds16.pds16asm.pds16asm.Number oldSize = size;
    size = newSize;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Pds16asmPackage.SPACE__SIZE, oldSize, newSize);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSize(org.pds16.pds16asm.pds16asm.Number newSize)
  {
    if (newSize != size)
    {
      NotificationChain msgs = null;
      if (size != null)
        msgs = ((InternalEObject)size).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Pds16asmPackage.SPACE__SIZE, null, msgs);
      if (newSize != null)
        msgs = ((InternalEObject)newSize).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Pds16asmPackage.SPACE__SIZE, null, msgs);
      msgs = basicSetSize(newSize, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Pds16asmPackage.SPACE__SIZE, newSize, newSize));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public org.pds16.pds16asm.pds16asm.Number getByteValue()
  {
    return byteValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetByteValue(org.pds16.pds16asm.pds16asm.Number newByteValue, NotificationChain msgs)
  {
    org.pds16.pds16asm.pds16asm.Number oldByteValue = byteValue;
    byteValue = newByteValue;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Pds16asmPackage.SPACE__BYTE_VALUE, oldByteValue, newByteValue);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setByteValue(org.pds16.pds16asm.pds16asm.Number newByteValue)
  {
    if (newByteValue != byteValue)
    {
      NotificationChain msgs = null;
      if (byteValue != null)
        msgs = ((InternalEObject)byteValue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Pds16asmPackage.SPACE__BYTE_VALUE, null, msgs);
      if (newByteValue != null)
        msgs = ((InternalEObject)newByteValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Pds16asmPackage.SPACE__BYTE_VALUE, null, msgs);
      msgs = basicSetByteValue(newByteValue, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Pds16asmPackage.SPACE__BYTE_VALUE, newByteValue, newByteValue));
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
      case Pds16asmPackage.SPACE__SIZE:
        return basicSetSize(null, msgs);
      case Pds16asmPackage.SPACE__BYTE_VALUE:
        return basicSetByteValue(null, msgs);
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
      case Pds16asmPackage.SPACE__SIZE:
        return getSize();
      case Pds16asmPackage.SPACE__BYTE_VALUE:
        return getByteValue();
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
      case Pds16asmPackage.SPACE__SIZE:
        setSize((org.pds16.pds16asm.pds16asm.Number)newValue);
        return;
      case Pds16asmPackage.SPACE__BYTE_VALUE:
        setByteValue((org.pds16.pds16asm.pds16asm.Number)newValue);
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
      case Pds16asmPackage.SPACE__SIZE:
        setSize((org.pds16.pds16asm.pds16asm.Number)null);
        return;
      case Pds16asmPackage.SPACE__BYTE_VALUE:
        setByteValue((org.pds16.pds16asm.pds16asm.Number)null);
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
      case Pds16asmPackage.SPACE__SIZE:
        return size != null;
      case Pds16asmPackage.SPACE__BYTE_VALUE:
        return byteValue != null;
    }
    return super.eIsSet(featureID);
  }

} //SpaceImpl