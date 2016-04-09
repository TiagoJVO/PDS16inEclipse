/**
 * generated by Xtext 2.9.2
 */
package org.pds16.pds16asm;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operation With Two Registers</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.pds16.pds16asm.OperationWithTwoRegisters#getRd <em>Rd</em>}</li>
 *   <li>{@link org.pds16.pds16asm.OperationWithTwoRegisters#getRm <em>Rm</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.pds16.pds16asm.Pds16asmPackage#getOperationWithTwoRegisters()
 * @model
 * @generated
 */
public interface OperationWithTwoRegisters extends Not, Rc
{
  /**
   * Returns the value of the '<em><b>Rd</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Rd</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Rd</em>' containment reference.
   * @see #setRd(Registers)
   * @see org.pds16.pds16asm.Pds16asmPackage#getOperationWithTwoRegisters_Rd()
   * @model containment="true"
   * @generated
   */
  Registers getRd();

  /**
   * Sets the value of the '{@link org.pds16.pds16asm.OperationWithTwoRegisters#getRd <em>Rd</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Rd</em>' containment reference.
   * @see #getRd()
   * @generated
   */
  void setRd(Registers value);

  /**
   * Returns the value of the '<em><b>Rm</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Rm</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Rm</em>' containment reference.
   * @see #setRm(Registers)
   * @see org.pds16.pds16asm.Pds16asmPackage#getOperationWithTwoRegisters_Rm()
   * @model containment="true"
   * @generated
   */
  Registers getRm();

  /**
   * Sets the value of the '{@link org.pds16.pds16asm.OperationWithTwoRegisters#getRm <em>Rm</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Rm</em>' containment reference.
   * @see #getRm()
   * @generated
   */
  void setRm(Registers value);

} // OperationWithTwoRegisters
