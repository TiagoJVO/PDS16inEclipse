/**
 * generated by Xtext 2.10.1
 */
package org.pds16.pds16asm.pds16asm;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Space</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.pds16.pds16asm.pds16asm.Space#getSize <em>Size</em>}</li>
 *   <li>{@link org.pds16.pds16asm.pds16asm.Space#getByteValue <em>Byte Value</em>}</li>
 * </ul>
 *
 * @see org.pds16.pds16asm.pds16asm.Pds16asmPackage#getSpace()
 * @model
 * @generated
 */
public interface Space extends LabelDirective
{
  /**
   * Returns the value of the '<em><b>Size</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Size</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Size</em>' containment reference.
   * @see #setSize(org.pds16.pds16asm.pds16asm.Number)
   * @see org.pds16.pds16asm.pds16asm.Pds16asmPackage#getSpace_Size()
   * @model containment="true"
   * @generated
   */
  org.pds16.pds16asm.pds16asm.Number getSize();

  /**
   * Sets the value of the '{@link org.pds16.pds16asm.pds16asm.Space#getSize <em>Size</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Size</em>' containment reference.
   * @see #getSize()
   * @generated
   */
  void setSize(org.pds16.pds16asm.pds16asm.Number value);

  /**
   * Returns the value of the '<em><b>Byte Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Byte Value</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Byte Value</em>' containment reference.
   * @see #setByteValue(org.pds16.pds16asm.pds16asm.Number)
   * @see org.pds16.pds16asm.pds16asm.Pds16asmPackage#getSpace_ByteValue()
   * @model containment="true"
   * @generated
   */
  org.pds16.pds16asm.pds16asm.Number getByteValue();

  /**
   * Sets the value of the '{@link org.pds16.pds16asm.pds16asm.Space#getByteValue <em>Byte Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Byte Value</em>' containment reference.
   * @see #getByteValue()
   * @generated
   */
  void setByteValue(org.pds16.pds16asm.pds16asm.Number value);

} // Space
