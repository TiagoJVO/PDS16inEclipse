/**
 * generated by Xtext 2.10.0
 */
package org.pds16.pds16asm.pds16asm;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Orl</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.pds16.pds16asm.pds16asm.Orl#getRd <em>Rd</em>}</li>
 *   <li>{@link org.pds16.pds16asm.pds16asm.Orl#getRm <em>Rm</em>}</li>
 * </ul>
 *
 * @see org.pds16.pds16asm.pds16asm.Pds16asmPackage#getOrl()
 * @model
 * @generated
 */
public interface Orl extends Logica
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
   * @see #setRd(Register)
   * @see org.pds16.pds16asm.pds16asm.Pds16asmPackage#getOrl_Rd()
   * @model containment="true"
   * @generated
   */
  Register getRd();

  /**
   * Sets the value of the '{@link org.pds16.pds16asm.pds16asm.Orl#getRd <em>Rd</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Rd</em>' containment reference.
   * @see #getRd()
   * @generated
   */
  void setRd(Register value);

  /**
   * Returns the value of the '<em><b>Rm</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Rm</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Rm</em>' containment reference.
   * @see #setRm(Register)
   * @see org.pds16.pds16asm.pds16asm.Pds16asmPackage#getOrl_Rm()
   * @model containment="true"
   * @generated
   */
  Register getRm();

  /**
   * Sets the value of the '{@link org.pds16.pds16asm.pds16asm.Orl#getRm <em>Rm</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Rm</em>' containment reference.
   * @see #getRm()
   * @generated
   */
  void setRm(Register value);

} // Orl
