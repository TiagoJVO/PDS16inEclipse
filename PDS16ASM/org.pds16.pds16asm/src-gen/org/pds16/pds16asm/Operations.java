/**
 * generated by Xtext 2.9.2
 */
package org.pds16.pds16asm;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operations</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.pds16.pds16asm.Operations#getRegister <em>Register</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.pds16.pds16asm.Pds16asmPackage#getOperations()
 * @model
 * @generated
 */
public interface Operations extends EObject
{
  /**
   * Returns the value of the '<em><b>Register</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Register</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Register</em>' containment reference.
   * @see #setRegister(Registers)
   * @see org.pds16.pds16asm.Pds16asmPackage#getOperations_Register()
   * @model containment="true"
   * @generated
   */
  Registers getRegister();

  /**
   * Sets the value of the '{@link org.pds16.pds16asm.Operations#getRegister <em>Register</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Register</em>' containment reference.
   * @see #getRegister()
   * @generated
   */
  void setRegister(Registers value);

} // Operations
