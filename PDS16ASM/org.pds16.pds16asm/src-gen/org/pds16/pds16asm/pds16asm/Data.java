/**
 * generated by Xtext 2.10.0
 */
package org.pds16.pds16asm.pds16asm;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.pds16.pds16asm.pds16asm.Data#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see org.pds16.pds16asm.pds16asm.Pds16asmPackage#getData()
 * @model
 * @generated
 */
public interface Data extends Directive
{
  /**
   * Returns the value of the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' attribute.
   * @see #setValue(String)
   * @see org.pds16.pds16asm.pds16asm.Pds16asmPackage#getData_Value()
   * @model
   * @generated
   */
  String getValue();

  /**
   * Sets the value of the '{@link org.pds16.pds16asm.pds16asm.Data#getValue <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' attribute.
   * @see #getValue()
   * @generated
   */
  void setValue(String value);

} // Data
