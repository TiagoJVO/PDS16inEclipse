/**
 * generated by Xtext 2.9.2
 */
package org.pds16.pds16asm;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operation With Offset</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.pds16.pds16asm.OperationWithOffset#getRbx <em>Rbx</em>}</li>
 *   <li>{@link org.pds16.pds16asm.OperationWithOffset#getOffset8 <em>Offset8</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.pds16.pds16asm.Pds16asmPackage#getOperationWithOffset()
 * @model
 * @generated
 */
public interface OperationWithOffset extends JumpOp
{
  /**
   * Returns the value of the '<em><b>Rbx</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Rbx</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Rbx</em>' containment reference.
   * @see #setRbx(Registers)
   * @see org.pds16.pds16asm.Pds16asmPackage#getOperationWithOffset_Rbx()
   * @model containment="true"
   * @generated
   */
  Registers getRbx();

  /**
   * Sets the value of the '{@link org.pds16.pds16asm.OperationWithOffset#getRbx <em>Rbx</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Rbx</em>' containment reference.
   * @see #getRbx()
   * @generated
   */
  void setRbx(Registers value);

  /**
   * Returns the value of the '<em><b>Offset8</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Offset8</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Offset8</em>' containment reference.
   * @see #setOffset8(ConstOrLabel)
   * @see org.pds16.pds16asm.Pds16asmPackage#getOperationWithOffset_Offset8()
   * @model containment="true"
   * @generated
   */
  ConstOrLabel getOffset8();

  /**
   * Sets the value of the '{@link org.pds16.pds16asm.OperationWithOffset#getOffset8 <em>Offset8</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Offset8</em>' containment reference.
   * @see #getOffset8()
   * @generated
   */
  void setOffset8(ConstOrLabel value);

} // OperationWithOffset
