/**
 */
package de.cau.cs.se.geco.architecture.architecture;

import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Node Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.cau.cs.se.geco.architecture.architecture.NodeProperty#getProperty <em>Property</em>}</li>
 *   <li>{@link de.cau.cs.se.geco.architecture.architecture.NodeProperty#getSubProperty <em>Sub Property</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.cau.cs.se.geco.architecture.architecture.ArchitecturePackage#getNodeProperty()
 * @model
 * @generated
 */
public interface NodeProperty extends Operand
{
  /**
   * Returns the value of the '<em><b>Property</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Property</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Property</em>' reference.
   * @see #setProperty(EReference)
   * @see de.cau.cs.se.geco.architecture.architecture.ArchitecturePackage#getNodeProperty_Property()
   * @model
   * @generated
   */
  EReference getProperty();

  /**
   * Sets the value of the '{@link de.cau.cs.se.geco.architecture.architecture.NodeProperty#getProperty <em>Property</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Property</em>' reference.
   * @see #getProperty()
   * @generated
   */
  void setProperty(EReference value);

  /**
   * Returns the value of the '<em><b>Sub Property</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Sub Property</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Sub Property</em>' containment reference.
   * @see #setSubProperty(NodeProperty)
   * @see de.cau.cs.se.geco.architecture.architecture.ArchitecturePackage#getNodeProperty_SubProperty()
   * @model containment="true"
   * @generated
   */
  NodeProperty getSubProperty();

  /**
   * Sets the value of the '{@link de.cau.cs.se.geco.architecture.architecture.NodeProperty#getSubProperty <em>Sub Property</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Sub Property</em>' containment reference.
   * @see #getSubProperty()
   * @generated
   */
  void setSubProperty(NodeProperty value);

} // NodeProperty
