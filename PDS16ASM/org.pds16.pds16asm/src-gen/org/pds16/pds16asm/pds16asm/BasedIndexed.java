/**
 * generated by Xtext 2.10.1
 */
package org.pds16.pds16asm.pds16asm;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Based Indexed</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.pds16.pds16asm.pds16asm.BasedIndexed#getRbx <em>Rbx</em>}</li>
 *   <li>{@link org.pds16.pds16asm.pds16asm.BasedIndexed#getRix <em>Rix</em>}</li>
 * </ul>
 *
 * @see org.pds16.pds16asm.pds16asm.Pds16asmPackage#getBasedIndexed()
 * @model
 * @generated
 */
public interface BasedIndexed extends LdBasedIndexed, StBasedIndexed
{
  /**
   * Returns the value of the '<em><b>Rbx</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Rbx</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Rbx</em>' attribute.
   * @see #setRbx(String)
   * @see org.pds16.pds16asm.pds16asm.Pds16asmPackage#getBasedIndexed_Rbx()
   * @model
   * @generated
   */
  String getRbx();

  /**
   * Sets the value of the '{@link org.pds16.pds16asm.pds16asm.BasedIndexed#getRbx <em>Rbx</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Rbx</em>' attribute.
   * @see #getRbx()
   * @generated
   */
  void setRbx(String value);

  /**
   * Returns the value of the '<em><b>Rix</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Rix</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Rix</em>' attribute.
   * @see #setRix(String)
   * @see org.pds16.pds16asm.pds16asm.Pds16asmPackage#getBasedIndexed_Rix()
   * @model
   * @generated
   */
  String getRix();

  /**
   * Sets the value of the '{@link org.pds16.pds16asm.pds16asm.BasedIndexed#getRix <em>Rix</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Rix</em>' attribute.
   * @see #getRix()
   * @generated
   */
  void setRix(String value);

} // BasedIndexed
