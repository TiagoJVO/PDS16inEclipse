/**
 * generated by Xtext 2.10.0
 */
package org.pds16.pds16asm.pds16asm;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.pds16.pds16asm.pds16asm.Expression#getNumericValue <em>Numeric Value</em>}</li>
 *   <li>{@link org.pds16.pds16asm.pds16asm.Expression#getIdValue <em>Id Value</em>}</li>
 * </ul>
 *
 * @see org.pds16.pds16asm.pds16asm.Pds16asmPackage#getExpression()
 * @model
 * @generated
 */
public interface Expression extends Org, Equ
{
  /**
   * Returns the value of the '<em><b>Numeric Value</b></em>' attribute list.
   * The list contents are of type {@link java.lang.Integer}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Numeric Value</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Numeric Value</em>' attribute list.
   * @see org.pds16.pds16asm.pds16asm.Pds16asmPackage#getExpression_NumericValue()
   * @model unique="false"
   * @generated
   */
  EList<Integer> getNumericValue();

  /**
   * Returns the value of the '<em><b>Id Value</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Id Value</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Id Value</em>' attribute list.
   * @see org.pds16.pds16asm.pds16asm.Pds16asmPackage#getExpression_IdValue()
   * @model unique="false"
   * @generated
   */
  EList<String> getIdValue();

} // Expression
