/**
 * generated by Xtext 2.10.0
 */
package org.pds16.pds16asm.pds16asm;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Set</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.pds16.pds16asm.pds16asm.Set#getValue1 <em>Value1</em>}</li>
 *   <li>{@link org.pds16.pds16asm.pds16asm.Set#getValue2 <em>Value2</em>}</li>
 * </ul>
 *
 * @see org.pds16.pds16asm.pds16asm.Pds16asmPackage#getSet()
 * @model
 * @generated
 */
public interface Set extends EObject
{
  /**
   * Returns the value of the '<em><b>Value1</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value1</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value1</em>' attribute.
   * @see #setValue1(String)
   * @see org.pds16.pds16asm.pds16asm.Pds16asmPackage#getSet_Value1()
   * @model
   * @generated
   */
  String getValue1();

  /**
   * Sets the value of the '{@link org.pds16.pds16asm.pds16asm.Set#getValue1 <em>Value1</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value1</em>' attribute.
   * @see #getValue1()
   * @generated
   */
  void setValue1(String value);

  /**
   * Returns the value of the '<em><b>Value2</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value2</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value2</em>' containment reference.
   * @see #setValue2(Expression)
   * @see org.pds16.pds16asm.pds16asm.Pds16asmPackage#getSet_Value2()
   * @model containment="true"
   * @generated
   */
  Expression getValue2();

  /**
   * Sets the value of the '{@link org.pds16.pds16asm.pds16asm.Set#getValue2 <em>Value2</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value2</em>' containment reference.
   * @see #getValue2()
   * @generated
   */
  void setValue2(Expression value);

} // Set
