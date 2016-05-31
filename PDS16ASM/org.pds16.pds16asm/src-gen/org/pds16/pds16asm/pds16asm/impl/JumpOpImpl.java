/**
 * generated by Xtext 2.10.0-SNAPSHOT
 */
package org.pds16.pds16asm.pds16asm.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.pds16.pds16asm.pds16asm.JumpOp;
import org.pds16.pds16asm.pds16asm.OperationWithOffset;
import org.pds16.pds16asm.pds16asm.Pds16asmPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Jump Op</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.pds16.pds16asm.pds16asm.impl.JumpOpImpl#getTag <em>Tag</em>}</li>
 *   <li>{@link org.pds16.pds16asm.pds16asm.impl.JumpOpImpl#getOpOff <em>Op Off</em>}</li>
 *   <li>{@link org.pds16.pds16asm.pds16asm.impl.JumpOpImpl#getOpId <em>Op Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class JumpOpImpl extends JumpImpl implements JumpOp
{
  /**
   * The default value of the '{@link #getTag() <em>Tag</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTag()
   * @generated
   * @ordered
   */
  protected static final String TAG_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getTag() <em>Tag</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTag()
   * @generated
   * @ordered
   */
  protected String tag = TAG_EDEFAULT;

  /**
   * The cached value of the '{@link #getOpOff() <em>Op Off</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOpOff()
   * @generated
   * @ordered
   */
  protected OperationWithOffset opOff;

  /**
   * The default value of the '{@link #getOpId() <em>Op Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOpId()
   * @generated
   * @ordered
   */
  protected static final String OP_ID_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getOpId() <em>Op Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOpId()
   * @generated
   * @ordered
   */
  protected String opId = OP_ID_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected JumpOpImpl()
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
    return Pds16asmPackage.Literals.JUMP_OP;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getTag()
  {
    return tag;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTag(String newTag)
  {
    String oldTag = tag;
    tag = newTag;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Pds16asmPackage.JUMP_OP__TAG, oldTag, tag));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OperationWithOffset getOpOff()
  {
    return opOff;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetOpOff(OperationWithOffset newOpOff, NotificationChain msgs)
  {
    OperationWithOffset oldOpOff = opOff;
    opOff = newOpOff;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Pds16asmPackage.JUMP_OP__OP_OFF, oldOpOff, newOpOff);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOpOff(OperationWithOffset newOpOff)
  {
    if (newOpOff != opOff)
    {
      NotificationChain msgs = null;
      if (opOff != null)
        msgs = ((InternalEObject)opOff).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Pds16asmPackage.JUMP_OP__OP_OFF, null, msgs);
      if (newOpOff != null)
        msgs = ((InternalEObject)newOpOff).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Pds16asmPackage.JUMP_OP__OP_OFF, null, msgs);
      msgs = basicSetOpOff(newOpOff, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Pds16asmPackage.JUMP_OP__OP_OFF, newOpOff, newOpOff));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getOpId()
  {
    return opId;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOpId(String newOpId)
  {
    String oldOpId = opId;
    opId = newOpId;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Pds16asmPackage.JUMP_OP__OP_ID, oldOpId, opId));
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
      case Pds16asmPackage.JUMP_OP__OP_OFF:
        return basicSetOpOff(null, msgs);
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
      case Pds16asmPackage.JUMP_OP__TAG:
        return getTag();
      case Pds16asmPackage.JUMP_OP__OP_OFF:
        return getOpOff();
      case Pds16asmPackage.JUMP_OP__OP_ID:
        return getOpId();
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
      case Pds16asmPackage.JUMP_OP__TAG:
        setTag((String)newValue);
        return;
      case Pds16asmPackage.JUMP_OP__OP_OFF:
        setOpOff((OperationWithOffset)newValue);
        return;
      case Pds16asmPackage.JUMP_OP__OP_ID:
        setOpId((String)newValue);
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
      case Pds16asmPackage.JUMP_OP__TAG:
        setTag(TAG_EDEFAULT);
        return;
      case Pds16asmPackage.JUMP_OP__OP_OFF:
        setOpOff((OperationWithOffset)null);
        return;
      case Pds16asmPackage.JUMP_OP__OP_ID:
        setOpId(OP_ID_EDEFAULT);
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
      case Pds16asmPackage.JUMP_OP__TAG:
        return TAG_EDEFAULT == null ? tag != null : !TAG_EDEFAULT.equals(tag);
      case Pds16asmPackage.JUMP_OP__OP_OFF:
        return opOff != null;
      case Pds16asmPackage.JUMP_OP__OP_ID:
        return OP_ID_EDEFAULT == null ? opId != null : !OP_ID_EDEFAULT.equals(opId);
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
    result.append(" (tag: ");
    result.append(tag);
    result.append(", opId: ");
    result.append(opId);
    result.append(')');
    return result.toString();
  }

} //JumpOpImpl