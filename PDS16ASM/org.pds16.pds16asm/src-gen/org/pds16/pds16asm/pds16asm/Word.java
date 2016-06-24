/**
 * generated by Xtext 2.10.0
 */
package org.pds16.pds16asm.pds16asm;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Word</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.pds16.pds16asm.pds16asm.Word#getTag <em>Tag</em>}</li>
 *   <li>{@link org.pds16.pds16asm.pds16asm.Word#getValues <em>Values</em>}</li>
 *   <li>{@link org.pds16.pds16asm.pds16asm.Word#getNumbers <em>Numbers</em>}</li>
 * </ul>
 *
 * @see org.pds16.pds16asm.pds16asm.Pds16asmPackage#getWord()
 * @model
 * @generated
 */
public interface Word extends LabelDirective
{
  /**
   * Returns the value of the '<em><b>Tag</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Tag</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Tag</em>' attribute.
   * @see #setTag(String)
   * @see org.pds16.pds16asm.pds16asm.Pds16asmPackage#getWord_Tag()
   * @model
   * @generated
   */
  String getTag();

  /**
   * Sets the value of the '{@link org.pds16.pds16asm.pds16asm.Word#getTag <em>Tag</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Tag</em>' attribute.
   * @see #getTag()
   * @generated
   */
  void setTag(String value);

  /**
   * Returns the value of the '<em><b>Values</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Values</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Values</em>' attribute list.
   * @see org.pds16.pds16asm.pds16asm.Pds16asmPackage#getWord_Values()
   * @model unique="false"
   * @generated
   */
  EList<String> getValues();

  /**
   * Returns the value of the '<em><b>Numbers</b></em>' containment reference list.
   * The list contents are of type {@link org.pds16.pds16asm.pds16asm.Number}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Numbers</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Numbers</em>' containment reference list.
   * @see org.pds16.pds16asm.pds16asm.Pds16asmPackage#getWord_Numbers()
   * @model containment="true"
   * @generated
   */
  EList<org.pds16.pds16asm.pds16asm.Number> getNumbers();

} // Word
