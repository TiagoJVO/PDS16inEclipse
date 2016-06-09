/**
 * generated by Xtext 2.10.0
 */
package org.pds16.pds16asm.pds16asm;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operation Shift</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.pds16.pds16asm.pds16asm.OperationShift#getRd <em>Rd</em>}</li>
 *   <li>{@link org.pds16.pds16asm.pds16asm.OperationShift#getRm <em>Rm</em>}</li>
 *   <li>{@link org.pds16.pds16asm.pds16asm.OperationShift#getConst4 <em>Const4</em>}</li>
 *   <li>{@link org.pds16.pds16asm.pds16asm.OperationShift#getSin <em>Sin</em>}</li>
 * </ul>
 *
 * @see org.pds16.pds16asm.pds16asm.Pds16asmPackage#getOperationShift()
 * @model
 * @generated
 */
public interface OperationShift extends Shl, Shr
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
   * @see org.pds16.pds16asm.pds16asm.Pds16asmPackage#getOperationShift_Rd()
   * @model containment="true"
   * @generated
   */
  Register getRd();

  /**
   * Sets the value of the '{@link org.pds16.pds16asm.pds16asm.OperationShift#getRd <em>Rd</em>}' containment reference.
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
   * @see org.pds16.pds16asm.pds16asm.Pds16asmPackage#getOperationShift_Rm()
   * @model containment="true"
   * @generated
   */
  Register getRm();

  /**
   * Sets the value of the '{@link org.pds16.pds16asm.pds16asm.OperationShift#getRm <em>Rm</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Rm</em>' containment reference.
   * @see #getRm()
   * @generated
   */
  void setRm(Register value);

  /**
   * Returns the value of the '<em><b>Const4</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Const4</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Const4</em>' containment reference.
   * @see #setConst4(Const4OrLabel)
   * @see org.pds16.pds16asm.pds16asm.Pds16asmPackage#getOperationShift_Const4()
   * @model containment="true"
   * @generated
   */
  Const4OrLabel getConst4();

  /**
   * Sets the value of the '{@link org.pds16.pds16asm.pds16asm.OperationShift#getConst4 <em>Const4</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Const4</em>' containment reference.
   * @see #getConst4()
   * @generated
   */
  void setConst4(Const4OrLabel value);

  /**
   * Returns the value of the '<em><b>Sin</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Sin</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Sin</em>' attribute.
   * @see #setSin(int)
   * @see org.pds16.pds16asm.pds16asm.Pds16asmPackage#getOperationShift_Sin()
   * @model
   * @generated
   */
  int getSin();

  /**
   * Sets the value of the '{@link org.pds16.pds16asm.pds16asm.OperationShift#getSin <em>Sin</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Sin</em>' attribute.
   * @see #getSin()
   * @generated
   */
  void setSin(int value);

} // OperationShift
