/**
 * generated by Xtext 2.9.2
 */
package org.pds16.pds16asm.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.pds16.pds16asm.IntOrHexOrString;
import org.pds16.pds16asm.OperationShift;
import org.pds16.pds16asm.Pds16asmPackage;
import org.pds16.pds16asm.Registers;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Operation Shift</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.pds16.pds16asm.impl.OperationShiftImpl#getRd <em>Rd</em>}</li>
 *   <li>{@link org.pds16.pds16asm.impl.OperationShiftImpl#getRm <em>Rm</em>}</li>
 *   <li>{@link org.pds16.pds16asm.impl.OperationShiftImpl#getConst4 <em>Const4</em>}</li>
 *   <li>{@link org.pds16.pds16asm.impl.OperationShiftImpl#getSin <em>Sin</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OperationShiftImpl extends ShlImpl implements OperationShift
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
   * The cached value of the '{@link #getConst4() <em>Const4</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getConst4()
   * @generated
   * @ordered
   */
  protected IntOrHexOrString const4;

  /**
   * The default value of the '{@link #getSin() <em>Sin</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSin()
   * @generated
   * @ordered
   */
  protected static final String SIN_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getSin() <em>Sin</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSin()
   * @generated
   * @ordered
   */
  protected String sin = SIN_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected OperationShiftImpl()
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
    return Pds16asmPackage.Literals.OPERATION_SHIFT;
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Pds16asmPackage.OPERATION_SHIFT__RD, oldRd, newRd);
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
        msgs = ((InternalEObject)rd).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Pds16asmPackage.OPERATION_SHIFT__RD, null, msgs);
      if (newRd != null)
        msgs = ((InternalEObject)newRd).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Pds16asmPackage.OPERATION_SHIFT__RD, null, msgs);
      msgs = basicSetRd(newRd, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Pds16asmPackage.OPERATION_SHIFT__RD, newRd, newRd));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Pds16asmPackage.OPERATION_SHIFT__RM, oldRm, newRm);
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
        msgs = ((InternalEObject)rm).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Pds16asmPackage.OPERATION_SHIFT__RM, null, msgs);
      if (newRm != null)
        msgs = ((InternalEObject)newRm).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Pds16asmPackage.OPERATION_SHIFT__RM, null, msgs);
      msgs = basicSetRm(newRm, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Pds16asmPackage.OPERATION_SHIFT__RM, newRm, newRm));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IntOrHexOrString getConst4()
  {
    return const4;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetConst4(IntOrHexOrString newConst4, NotificationChain msgs)
  {
    IntOrHexOrString oldConst4 = const4;
    const4 = newConst4;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Pds16asmPackage.OPERATION_SHIFT__CONST4, oldConst4, newConst4);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setConst4(IntOrHexOrString newConst4)
  {
    if (newConst4 != const4)
    {
      NotificationChain msgs = null;
      if (const4 != null)
        msgs = ((InternalEObject)const4).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Pds16asmPackage.OPERATION_SHIFT__CONST4, null, msgs);
      if (newConst4 != null)
        msgs = ((InternalEObject)newConst4).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Pds16asmPackage.OPERATION_SHIFT__CONST4, null, msgs);
      msgs = basicSetConst4(newConst4, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Pds16asmPackage.OPERATION_SHIFT__CONST4, newConst4, newConst4));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getSin()
  {
    return sin;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSin(String newSin)
  {
    String oldSin = sin;
    sin = newSin;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Pds16asmPackage.OPERATION_SHIFT__SIN, oldSin, sin));
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
      case Pds16asmPackage.OPERATION_SHIFT__RD:
        return basicSetRd(null, msgs);
      case Pds16asmPackage.OPERATION_SHIFT__RM:
        return basicSetRm(null, msgs);
      case Pds16asmPackage.OPERATION_SHIFT__CONST4:
        return basicSetConst4(null, msgs);
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
      case Pds16asmPackage.OPERATION_SHIFT__RD:
        return getRd();
      case Pds16asmPackage.OPERATION_SHIFT__RM:
        return getRm();
      case Pds16asmPackage.OPERATION_SHIFT__CONST4:
        return getConst4();
      case Pds16asmPackage.OPERATION_SHIFT__SIN:
        return getSin();
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
      case Pds16asmPackage.OPERATION_SHIFT__RD:
        setRd((Registers)newValue);
        return;
      case Pds16asmPackage.OPERATION_SHIFT__RM:
        setRm((Registers)newValue);
        return;
      case Pds16asmPackage.OPERATION_SHIFT__CONST4:
        setConst4((IntOrHexOrString)newValue);
        return;
      case Pds16asmPackage.OPERATION_SHIFT__SIN:
        setSin((String)newValue);
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
      case Pds16asmPackage.OPERATION_SHIFT__RD:
        setRd((Registers)null);
        return;
      case Pds16asmPackage.OPERATION_SHIFT__RM:
        setRm((Registers)null);
        return;
      case Pds16asmPackage.OPERATION_SHIFT__CONST4:
        setConst4((IntOrHexOrString)null);
        return;
      case Pds16asmPackage.OPERATION_SHIFT__SIN:
        setSin(SIN_EDEFAULT);
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
      case Pds16asmPackage.OPERATION_SHIFT__RD:
        return rd != null;
      case Pds16asmPackage.OPERATION_SHIFT__RM:
        return rm != null;
      case Pds16asmPackage.OPERATION_SHIFT__CONST4:
        return const4 != null;
      case Pds16asmPackage.OPERATION_SHIFT__SIN:
        return SIN_EDEFAULT == null ? sin != null : !SIN_EDEFAULT.equals(sin);
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
    result.append(" (sin: ");
    result.append(sin);
    result.append(')');
    return result.toString();
  }

} //OperationShiftImpl
