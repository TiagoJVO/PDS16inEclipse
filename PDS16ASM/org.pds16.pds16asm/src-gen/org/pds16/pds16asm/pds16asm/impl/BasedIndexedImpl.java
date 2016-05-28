/**
 * generated by Xtext 2.10.0-SNAPSHOT
 */
package org.pds16.pds16asm.pds16asm.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.pds16.pds16asm.pds16asm.BasedIndexed;
import org.pds16.pds16asm.pds16asm.Pds16asmPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Based Indexed</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.pds16.pds16asm.pds16asm.impl.BasedIndexedImpl#getRbx <em>Rbx</em>}</li>
 *   <li>{@link org.pds16.pds16asm.pds16asm.impl.BasedIndexedImpl#getRix <em>Rix</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BasedIndexedImpl extends LdBasedIndexedImpl implements BasedIndexed
{
  /**
   * The default value of the '{@link #getRbx() <em>Rbx</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRbx()
   * @generated
   * @ordered
   */
  protected static final String RBX_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getRbx() <em>Rbx</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRbx()
   * @generated
   * @ordered
   */
  protected String rbx = RBX_EDEFAULT;

  /**
   * The default value of the '{@link #getRix() <em>Rix</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRix()
   * @generated
   * @ordered
   */
  protected static final String RIX_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getRix() <em>Rix</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRix()
   * @generated
   * @ordered
   */
  protected String rix = RIX_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected BasedIndexedImpl()
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
    return Pds16asmPackage.Literals.BASED_INDEXED;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getRbx()
  {
    return rbx;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRbx(String newRbx)
  {
    String oldRbx = rbx;
    rbx = newRbx;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Pds16asmPackage.BASED_INDEXED__RBX, oldRbx, rbx));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getRix()
  {
    return rix;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRix(String newRix)
  {
    String oldRix = rix;
    rix = newRix;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Pds16asmPackage.BASED_INDEXED__RIX, oldRix, rix));
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
      case Pds16asmPackage.BASED_INDEXED__RBX:
        return getRbx();
      case Pds16asmPackage.BASED_INDEXED__RIX:
        return getRix();
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
      case Pds16asmPackage.BASED_INDEXED__RBX:
        setRbx((String)newValue);
        return;
      case Pds16asmPackage.BASED_INDEXED__RIX:
        setRix((String)newValue);
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
      case Pds16asmPackage.BASED_INDEXED__RBX:
        setRbx(RBX_EDEFAULT);
        return;
      case Pds16asmPackage.BASED_INDEXED__RIX:
        setRix(RIX_EDEFAULT);
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
      case Pds16asmPackage.BASED_INDEXED__RBX:
        return RBX_EDEFAULT == null ? rbx != null : !RBX_EDEFAULT.equals(rbx);
      case Pds16asmPackage.BASED_INDEXED__RIX:
        return RIX_EDEFAULT == null ? rix != null : !RIX_EDEFAULT.equals(rix);
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
    result.append(" (rbx: ");
    result.append(rbx);
    result.append(", rix: ");
    result.append(rix);
    result.append(')');
    return result.toString();
  }

} //BasedIndexedImpl
