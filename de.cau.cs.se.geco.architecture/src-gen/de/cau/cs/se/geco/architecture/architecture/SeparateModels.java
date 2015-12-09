/**
 */
package de.cau.cs.se.geco.architecture.architecture;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Separate Models</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.cau.cs.se.geco.architecture.architecture.SeparateModels#getPointcut <em>Pointcut</em>}</li>
 *   <li>{@link de.cau.cs.se.geco.architecture.architecture.SeparateModels#getAdvice <em>Advice</em>}</li>
 * </ul>
 *
 * @see de.cau.cs.se.geco.architecture.architecture.ArchitecturePackage#getSeparateModels()
 * @model
 * @generated
 */
public interface SeparateModels extends AspectModel
{
  /**
   * Returns the value of the '<em><b>Pointcut</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Pointcut</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Pointcut</em>' containment reference.
   * @see #setPointcut(TargetModel)
   * @see de.cau.cs.se.geco.architecture.architecture.ArchitecturePackage#getSeparateModels_Pointcut()
   * @model containment="true"
   * @generated
   */
  TargetModel getPointcut();

  /**
   * Sets the value of the '{@link de.cau.cs.se.geco.architecture.architecture.SeparateModels#getPointcut <em>Pointcut</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Pointcut</em>' containment reference.
   * @see #getPointcut()
   * @generated
   */
  void setPointcut(TargetModel value);

  /**
   * Returns the value of the '<em><b>Advice</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Advice</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Advice</em>' containment reference.
   * @see #setAdvice(CombinedModel)
   * @see de.cau.cs.se.geco.architecture.architecture.ArchitecturePackage#getSeparateModels_Advice()
   * @model containment="true"
   * @generated
   */
  CombinedModel getAdvice();

  /**
   * Sets the value of the '{@link de.cau.cs.se.geco.architecture.architecture.SeparateModels#getAdvice <em>Advice</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Advice</em>' containment reference.
   * @see #getAdvice()
   * @generated
   */
  void setAdvice(CombinedModel value);

} // SeparateModels