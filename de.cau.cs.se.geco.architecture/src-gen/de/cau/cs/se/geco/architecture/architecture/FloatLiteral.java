/**
 */
package de.cau.cs.se.geco.architecture.architecture;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Float Literal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.cau.cs.se.geco.architecture.architecture.FloatLiteral#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.cau.cs.se.geco.architecture.architecture.ArchitecturePackage#getFloatLiteral()
 * @model
 * @generated
 */
public interface FloatLiteral extends Literal
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
   * @see #setValue(Float)
   * @see de.cau.cs.se.geco.architecture.architecture.ArchitecturePackage#getFloatLiteral_Value()
   * @model
   * @generated
   */
  Float getValue();

  /**
   * Sets the value of the '{@link de.cau.cs.se.geco.architecture.architecture.FloatLiteral#getValue <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' attribute.
   * @see #getValue()
   * @generated
   */
  void setValue(Float value);

} // FloatLiteral
