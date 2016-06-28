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
 *   <li>{@link org.pds16.pds16asm.pds16asm.Expression#getEx <em>Ex</em>}</li>
 * </ul>
 *
 * @see org.pds16.pds16asm.pds16asm.Pds16asmPackage#getExpression()
 * @model
 * @generated
 */
public interface Expression extends Org
{
  /**
   * Returns the value of the '<em><b>Numeric Value</b></em>' containment reference list.
   * The list contents are of type {@link org.pds16.pds16asm.pds16asm.Number}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Numeric Value</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Numeric Value</em>' containment reference list.
   * @see org.pds16.pds16asm.pds16asm.Pds16asmPackage#getExpression_NumericValue()
   * @model containment="true"
   * @generated
   */
  EList<org.pds16.pds16asm.pds16asm.Number> getNumericValue();

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

  /**
   * Returns the value of the '<em><b>Ex</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ex</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ex</em>' containment reference.
   * @see #setEx(Expression)
   * @see org.pds16.pds16asm.pds16asm.Pds16asmPackage#getExpression_Ex()
   * @model containment="true"
   * @generated
   */
  Expression getEx();

  /**
   * Sets the value of the '{@link org.pds16.pds16asm.pds16asm.Expression#getEx <em>Ex</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ex</em>' containment reference.
   * @see #getEx()
   * @generated
   */
  void setEx(Expression value);

} // Expression
