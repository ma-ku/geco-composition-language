/**
 */
package de.cau.cs.se.geco.architecture.architecture;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Int Literal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.cau.cs.se.geco.architecture.architecture.IntLiteral#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see de.cau.cs.se.geco.architecture.architecture.ArchitecturePackage#getIntLiteral()
 * @model
 * @generated
 */
public interface IntLiteral extends Literal
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
   * @see #setValue(int)
   * @see de.cau.cs.se.geco.architecture.architecture.ArchitecturePackage#getIntLiteral_Value()
   * @model
   * @generated
   */
  int getValue();

  /**
   * Sets the value of the '{@link de.cau.cs.se.geco.architecture.architecture.IntLiteral#getValue <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' attribute.
   * @see #getValue()
   * @generated
   */
  void setValue(int value);

} // IntLiteral
