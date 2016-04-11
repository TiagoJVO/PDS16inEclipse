/**
 * generated by Xtext 2.9.2
 */
package org.pds16.pds16asm;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Label</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.pds16.pds16asm.Label#getLabelName <em>Label Name</em>}</li>
 *   <li>{@link org.pds16.pds16asm.Label#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.pds16.pds16asm.Pds16asmPackage#getLabel()
 * @model
 * @generated
 */
public interface Label extends Statement
{
  /**
   * Returns the value of the '<em><b>Label Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Label Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Label Name</em>' attribute.
   * @see #setLabelName(String)
   * @see org.pds16.pds16asm.Pds16asmPackage#getLabel_LabelName()
   * @model
   * @generated
   */
  String getLabelName();

  /**
   * Sets the value of the '{@link org.pds16.pds16asm.Label#getLabelName <em>Label Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Label Name</em>' attribute.
   * @see #getLabelName()
   * @generated
   */
  void setLabelName(String value);

  /**
   * Returns the value of the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' containment reference.
   * @see #setValue(Statement)
   * @see org.pds16.pds16asm.Pds16asmPackage#getLabel_Value()
   * @model containment="true"
   * @generated
   */
  Statement getValue();

  /**
   * Sets the value of the '{@link org.pds16.pds16asm.Label#getValue <em>Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' containment reference.
   * @see #getValue()
   * @generated
   */
  void setValue(Statement value);

} // Label
