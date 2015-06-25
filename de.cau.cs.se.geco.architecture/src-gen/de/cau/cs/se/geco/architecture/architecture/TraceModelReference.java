/**
 */
package de.cau.cs.se.geco.architecture.architecture;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Trace Model Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.cau.cs.se.geco.architecture.architecture.TraceModelReference#getTraceModel <em>Trace Model</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.cau.cs.se.geco.architecture.architecture.ArchitecturePackage#getTraceModelReference()
 * @model
 * @generated
 */
public interface TraceModelReference extends WriteTraceModel
{
  /**
   * Returns the value of the '<em><b>Trace Model</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Trace Model</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Trace Model</em>' reference.
   * @see #setTraceModel(TraceModel)
   * @see de.cau.cs.se.geco.architecture.architecture.ArchitecturePackage#getTraceModelReference_TraceModel()
   * @model
   * @generated
   */
  TraceModel getTraceModel();

  /**
   * Sets the value of the '{@link de.cau.cs.se.geco.architecture.architecture.TraceModelReference#getTraceModel <em>Trace Model</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Trace Model</em>' reference.
   * @see #getTraceModel()
   * @generated
   */
  void setTraceModel(TraceModel value);

} // TraceModelReference